package com.cubic_control.overload.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Dimensions.DimensionIDs;
import com.cubic_control.overload.Util.Fire_Realm_Teleporter;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockPortalFire extends BlockBreakable {
	public static final int[][] field_150001_a = new int[][] {new int[0], {3, 1}, {2, 0}};

	public ModBlockPortalFire(String name) {
		super(RefStrings.MODID + ":" + name, Material.portal, false);
		this.setTickRandomly(true);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		GameRegistry.registerBlock(this, name);
	}

	/**
	 * Ticks the block if it's been scheduled
	 */
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		if(world.provider.isSurfaceWorld() && world.getGameRules().getGameRuleBooleanValue("doMobSpawning") && rand.nextInt(2000) < world.difficultySetting.getDifficultyId()){
			int l;
			for(l = y; !World.doesBlockHaveSolidTopSurface(world, x, l, z) && l > 0; --l){
				;
			}
			if(l > 0 && !world.getBlock(x, l + 1, z).isNormalCube()){
				Entity entity = ItemMonsterPlacer.spawnCreature(world, 57, (double)x + 0.5D, (double)l + 1.1D, (double)z + 0.5D);
				if(entity != null){
					entity.timeUntilPortal = entity.getPortalCooldown();
				}
			}
		}
	}

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 */
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
		return null;
	}

	/**
	 * Updates the blocks bounds based on its current state. Args: world, x, y, z
	 */
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess blockaccess, int x, int y, int z) {
		int l = func_149999_b(blockaccess.getBlockMetadata(x, y, z));
		if(l == 0){
			if(blockaccess.getBlock(x - 1, y, z) != this && blockaccess.getBlock(x + 1, y, z) != this){
				l = 2;
			}else{
				l = 1;
			}
			if(blockaccess instanceof World && !((World)blockaccess).isRemote){
				((World)blockaccess).setBlockMetadataWithNotify(x, y, z, l, 2);
			}
		}
		float f = 0.125F;
		float f1 = 0.125F;
		if(l == 1){
			f = 0.5F;
		}
		if(l == 2){
			f1 = 0.5F;
		}
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	
	public static boolean getPortalSize(World world, int x, int y, int z) {
		ModBlockPortalFire.Size size = new ModBlockPortalFire.Size(world, x, y, z, 1);
		ModBlockPortalFire.Size size1 = new ModBlockPortalFire.Size(world, x, y, z, 2);
		if(size.func_150860_b() && size.field_150864_e == 0){
			size.func_150859_c();
			return true;
		}else if(size1.func_150860_b() && size1.field_150864_e == 0){
			size1.func_150859_c();
			return true;
		}else{
			return false;
		}
	}

	/**
	 * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	 * their own) Args: x, y, z, neighbor Block
	 */
	@Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        int l = func_149999_b(world.getBlockMetadata(x, y, z));
        ModBlockPortalFire.Size size = new ModBlockPortalFire.Size(world, x, y, z, 1);
        ModBlockPortalFire.Size size1 = new ModBlockPortalFire.Size(world, x, y, z, 2);
        if(l == 1 && (!size.func_150860_b() || size.field_150864_e < size.field_150868_h * size.field_150862_g)){
            world.setBlock(x, y, z, Blocks.air);
        }else if(l == 2 && (!size1.func_150860_b() || size1.field_150864_e < size1.field_150868_h * size1.field_150862_g)){
            world.setBlock(x, y, z, Blocks.air);
        }else if(l == 0 && !size.func_150860_b() && !size1.func_150860_b()){
            world.setBlock(x, y, z, Blocks.air);
        }
    }

	/**
	 * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
	 * coordinates.  Args: blockAccess, x, y, z, side
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int side) {
		int i1 = 0;
		
		if(blockAccess.getBlock(x, y, z) == this){
			i1 = func_149999_b(blockAccess.getBlockMetadata(x, y, z));
			
			if(i1 == 0){
				return false;
			}
			if(i1 == 2 && side != 5 && side != 4){
				return false;
			}
			if(i1 == 1 && side != 3 && side != 2){
				return false;
			}
		}

		boolean flag = blockAccess.getBlock(x - 1, y, z) == this && blockAccess.getBlock(x - 2, y, z) != this;
		boolean flag1 = blockAccess.getBlock(x + 1, y, z) == this && blockAccess.getBlock(x + 2, y, z) != this;
		boolean flag2 = blockAccess.getBlock(x, y, z - 1) == this && blockAccess.getBlock(x, y, z - 2) != this;
		boolean flag3 = blockAccess.getBlock(x, y, z + 1) == this && blockAccess.getBlock(x, y, z + 2) != this;
		boolean flag4 = flag || flag1 || i1 == 1;
		boolean flag5 = flag2 || flag3 || i1 == 2;
		return flag4 && side == 4 ? true : (flag4 && side == 5 ? true : (flag5 && side == 2 ? true : flag5 && side == 3));
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random rand) {
		return 0;
	}

	/**
	 * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
	 */
	@Override
	//TODO: Re-Check this for other entities..
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
		if((entity.ridingEntity == null) && (entity.riddenByEntity == null) && ((entity instanceof EntityPlayerMP))){
			EntityPlayerMP thePlayer = (EntityPlayerMP)entity;
			if(thePlayer.timeUntilPortal > 0){
				thePlayer.timeUntilPortal = 10;
			}else if(thePlayer.dimension != DimensionIDs.Realm_of_Fire){
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionIDs.Realm_of_Fire, new Fire_Realm_Teleporter(thePlayer.mcServer.worldServerForDimension(DimensionIDs.Realm_of_Fire)));
			}else{
				thePlayer.timeUntilPortal = 10;
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new Fire_Realm_Teleporter(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
	}

	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}

	/**
	 * A randomly called display update to be able to add particles or other items for display
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if(rand.nextInt(100) == 0){
			world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "portal.portal", 0.5F, rand.nextFloat() * 0.4F + 0.8F, false);
		}
		for(int l = 0; l < 4; ++l){
			double d0 = (double)((float)x + rand.nextFloat());
			double d1 = (double)((float)y + rand.nextFloat());
			double d2 = (double)((float)z + rand.nextFloat());
			double d3 = 0.0D;
			double d4 = 0.0D;
			double d5 = 0.0D;
			int i1 = rand.nextInt(2) * 2 - 1;
			d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
			d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
			d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
			if(world.getBlock(x - 1, y, z) != this && world.getBlock(x + 1, y, z) != this){
				d0 = (double)x + 0.5D + 0.25D * (double)i1;
				d3 = (double)(rand.nextFloat() * 2.0F * (float)i1);
			}else{
				d2 = (double)z + 0.5D + 0.25D * (double)i1;
				d5 = (double)(rand.nextFloat() * 2.0F * (float)i1);
			}
			world.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
		}
	}
	
	public static int func_149999_b(int p_149999_0_) {
		return p_149999_0_ & 3;
	}

	/**
	 * Gets an item for the block being called on. Args: world, x, y, z
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World world, int x, int y, int z) {
		return Item.getItemById(0);
	}

	public static class Size {
		private final World worldObj;
		private final int field_150865_b;
		private final int field_150866_c;
		private final int field_150863_d;
		private int field_150864_e = 0;
		private ChunkCoordinates field_150861_f;
		private int field_150862_g;
		private int field_150868_h;

		public Size(World world, int x, int y, int z, int side) {
			this.worldObj = world;
			this.field_150865_b = side;
			this.field_150863_d = ModBlockPortalFire.field_150001_a[side][0];
			this.field_150866_c = ModBlockPortalFire.field_150001_a[side][1];

			for(int i1 = y; y > i1 - 21 && y > 0 && this.getBlockMaterial(world.getBlock(x, y - 1, z)); --y){
				;
			}
			int j1 = this.func_150853_a(x, y, z, this.field_150863_d) - 1;
			
			if(j1 >= 0){
				this.field_150861_f = new ChunkCoordinates(x + j1 * Direction.offsetX[this.field_150863_d], y, z + j1 * Direction.offsetZ[this.field_150863_d]);
				this.field_150868_h = this.func_150853_a(this.field_150861_f.posX, this.field_150861_f.posY, this.field_150861_f.posZ, this.field_150866_c);
				
				if(this.field_150868_h < 2 || this.field_150868_h > 21){
					this.field_150861_f = null;
					this.field_150868_h = 0;
				}
			}
			if(this.field_150861_f != null){
				this.field_150862_g = this.func_150858_a();
			}
		}

		protected int func_150853_a(int x, int y, int z, int side) {
			int j1 = Direction.offsetX[side];
			int k1 = Direction.offsetZ[side];
			int i1;
			Block block;

			for(i1 = 0; i1 < 22; ++i1){
				block = this.worldObj.getBlock(x + j1 * i1, y, z + k1 * i1);

				if(!this.getBlockMaterial(block)){
					break;
				}
				Block block1 = this.worldObj.getBlock(x + j1 * i1, y - 1, z + k1 * i1);
				
				if(block1 != MBlocks.fire_stonebrick){
					break;
				}
			}
			
			block = this.worldObj.getBlock(x + j1 * i1, y, z + k1 * i1);
			return block == MBlocks.fire_stonebrick ? i1 : 0;
		}

		protected int func_150858_a() {
			int i;
			int j;
			int k;
			int l;
			label56:
				for(this.field_150862_g = 0; this.field_150862_g < 21; ++this.field_150862_g){
					i = this.field_150861_f.posY + this.field_150862_g;
					
					for(j = 0; j < this.field_150868_h; ++j){
						k = this.field_150861_f.posX + j * Direction.offsetX[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]];
						l = this.field_150861_f.posZ + j * Direction.offsetZ[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]];
						Block block = this.worldObj.getBlock(k, i, l);

						if(!this.getBlockMaterial(block)){
							break label56;
						}
						if(block == MBlocks.fire_portal){
							++this.field_150864_e;
						}
						if(j == 0){
							block = this.worldObj.getBlock(k + Direction.offsetX[ModBlockPortalFire.field_150001_a[this.field_150865_b][0]], i, l + Direction.offsetZ[ModBlockPortalFire.field_150001_a[this.field_150865_b][0]]);
							
							if(block != MBlocks.fire_stonebrick){
								break label56;
							}
						}else if (j == this.field_150868_h - 1){
							block = this.worldObj.getBlock(k + Direction.offsetX[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]], i, l + Direction.offsetZ[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]]);
							
							if(block != MBlocks.fire_stonebrick){
								break label56;
							}
						}
					}
				}

			for(i = 0; i < this.field_150868_h; ++i){
				j = this.field_150861_f.posX + i * Direction.offsetX[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]];
				k = this.field_150861_f.posY + this.field_150862_g;
				l = this.field_150861_f.posZ + i * Direction.offsetZ[ModBlockPortalFire.field_150001_a[this.field_150865_b][1]];

				if(this.worldObj.getBlock(j, k, l) != MBlocks.fire_stonebrick){
					this.field_150862_g = 0;
					break;
				}
			}

			if(this.field_150862_g <= 21 && this.field_150862_g >= 3){
				return this.field_150862_g;
			}else{
				this.field_150861_f = null;
				this.field_150868_h = 0;
				this.field_150862_g = 0;
				return 0;
			}
		}
		
		protected boolean getBlockMaterial(Block block) {
			return block.getMaterial() == Material.air || block == MBlocks.burned_fire || block == MBlocks.fire_portal;
		}

		public boolean func_150860_b() {
			return this.field_150861_f != null && this.field_150868_h >= 2 && this.field_150868_h <= 21 && this.field_150862_g >= 3 && this.field_150862_g <= 21;
		}

		public void func_150859_c() {
			for(int i = 0; i < this.field_150868_h; ++i){
				int j = this.field_150861_f.posX + Direction.offsetX[this.field_150866_c] * i;
				int k = this.field_150861_f.posZ + Direction.offsetZ[this.field_150866_c] * i;

				for(int l = 0; l < this.field_150862_g; ++l){
					int i1 = this.field_150861_f.posY + l;
					this.worldObj.setBlock(j, i1, k, MBlocks.fire_portal, this.field_150865_b, 2);
				}
			}
		}
	}
}