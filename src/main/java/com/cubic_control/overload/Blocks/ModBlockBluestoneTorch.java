package com.cubic_control.overload.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockBluestoneTorch extends BlockTorch {
	private boolean field_150113_a;
	private static Map field_150112_b = new HashMap();
	
	public ModBlockBluestoneTorch(boolean p_i45423_1_, String name, String texName) {
		this.field_150113_a = p_i45423_1_;
		this.setTickRandomly(true);
		this.setBlockTextureName(RefStrings.MODID + ":" + texName);
        this.setBlockName(name);
        if(p_i45423_1_){
			this.setCreativeTab(MCreativeTabs.tabTech);
			this.setLightLevel(0.5f);
		}else{
			this.setCreativeTab((CreativeTabs)null);
		}
        GameRegistry.registerBlock(this, name);
	}

	private boolean func_150111_a(World world, int x, int y, int z, boolean p_150111_5_) {
		if(!field_150112_b.containsKey(world)){
			field_150112_b.put(world, new ArrayList());
		}
		List list = (List)field_150112_b.get(world);

		if(p_150111_5_){
			list.add(new ModBlockBluestoneTorch.Toggle(x, y, z, world.getTotalWorldTime()));
		}
		int l = 0;

		for(int i1 = 0; i1 < list.size(); ++i1){
			ModBlockBluestoneTorch.Toggle toggle = (ModBlockBluestoneTorch.Toggle)list.get(i1);

			if(toggle.field_150847_a == x && toggle.field_150845_b == y && toggle.field_150846_c == z){
				++l;

				if(l >= 8){
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int tickRate(World world) {
		return 2;
	}
	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		if(world.getBlockMetadata(x, y, z) == 0){
			super.onBlockAdded(world, x, y, z);
		}
		if(this.field_150113_a){
			world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
			world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
			world.notifyBlocksOfNeighborChange(x - 1, y, z, this);
			world.notifyBlocksOfNeighborChange(x + 1, y, z, this);
			world.notifyBlocksOfNeighborChange(x, y, z - 1, this);
			world.notifyBlocksOfNeighborChange(x, y, z + 1, this);
		}
	}
	@Override
	public void breakBlock(World world, int x, int y, int z, Block block, int p_149749_6_) {
		if(this.field_150113_a){
			world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
			world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
			world.notifyBlocksOfNeighborChange(x - 1, y, z, this);
			world.notifyBlocksOfNeighborChange(x + 1, y, z, this);
			world.notifyBlocksOfNeighborChange(x, y, z - 1, this);
			world.notifyBlocksOfNeighborChange(x, y, z + 1, this);
		}
	}
	@Override
	public int isProvidingWeakPower(IBlockAccess access, int x, int y, int z, int side) {
		if(!this.field_150113_a){
			return 0;
		}else{
			int i1 = access.getBlockMetadata(x, y, z);
			return i1 == 5 && side == 1 ? 0 : (i1 == 3 && side == 3 ? 0 : (i1 == 4 && side == 2 ? 0 : (i1 == 1 && side == 5 ? 0 : (i1 == 2 && side == 4 ? 0 : 15))));
		}
	}
	
	private boolean func_150110_m(World world, int x, int y, int z) {
		int l = world.getBlockMetadata(x, y, z);
		return l == 5 && world.getIndirectPowerOutput(x, y - 1, z, 0) ? true : (l == 3 && world.getIndirectPowerOutput(x, y, z - 1, 2) ? true : (l == 4 && world.getIndirectPowerOutput(x, y, z + 1, 3) ? true : (l == 1 && world.getIndirectPowerOutput(x - 1, y, z, 4) ? true : l == 2 && world.getIndirectPowerOutput(x + 1, y, z, 5))));
	}
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		boolean flag = this.func_150110_m(world, x, y, z);
		List list = (List)field_150112_b.get(world);

		while(list != null && !list.isEmpty() && world.getTotalWorldTime() - ((ModBlockBluestoneTorch.Toggle)list.get(0)).field_150844_d > 60L){
			list.remove(0);
		}
		
		if(this.field_150113_a){
			if(flag){
				world.setBlock(x, y, z, MBlocks.unlit_bluestone_torch, world.getBlockMetadata(x, y, z), 3);
				
				if(this.func_150111_a(world, x, y, z, true)){
					world.playSoundEffect((double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), "random.fizz", 0.5F, 2.6F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.8F);

					for(int l = 0; l < 5; ++l){
						double d0 = (double)x + rand.nextDouble() * 0.6D + 0.2D;
						double d1 = (double)y + rand.nextDouble() * 0.6D + 0.2D;
						double d2 = (double)z + rand.nextDouble() * 0.6D + 0.2D;
						world.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
					}
				}
			}
		}else if(!flag && !this.func_150111_a(world, x, y, z, false)){
			world.setBlock(x, y, z, MBlocks.bluestone_torch, world.getBlockMetadata(x, y, z), 3);
		}
	}
	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
		if(!this.func_150108_b(world, x, y, z, block)){
			boolean flag = this.func_150110_m(world, x, y, z);

			if(this.field_150113_a && flag || !this.field_150113_a && !flag){
				world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
			}
		}
	}

	    public int isProvidingStrongPower(IBlockAccess p_149748_1_, int p_149748_2_, int p_149748_3_, int p_149748_4_, int p_149748_5_)
	    {
	        return p_149748_5_ == 0 ? this.isProvidingWeakPower(p_149748_1_, p_149748_2_, p_149748_3_, p_149748_4_, p_149748_5_) : 0;
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Item.getItemFromBlock(MBlocks.bluestone_torch);
	    }

	    /**
	     * Can this block provide power. Only wire currently seems to have this change based on its state.
	     */
	    public boolean canProvidePower()
	    {
	        return true;
	    }

	    /**
	     * A randomly called display update to be able to add particles or other items for display
	     */
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	    {
	        if (this.field_150113_a)
	        {
	            int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
	            double d0 = (double)((float)p_149734_2_ + 0.5F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
	            double d1 = (double)((float)p_149734_3_ + 0.7F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
	            double d2 = (double)((float)p_149734_4_ + 0.5F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
	            double d3 = 0.2199999988079071D;
	            double d4 = 0.27000001072883606D;

	            if (l == 1)
	            {
	                p_149734_1_.spawnParticle("reddust", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 2)
	            {
	                p_149734_1_.spawnParticle("reddust", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 3)
	            {
	                p_149734_1_.spawnParticle("reddust", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	            }
	            else if (l == 4)
	            {
	                p_149734_1_.spawnParticle("reddust", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            }
	            else
	            {
	                p_149734_1_.spawnParticle("reddust", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	            }
	        }
	    }

	    /**
	     * Gets an item for the block being called on. Args: world, x, y, z
	     */
	    @SideOnly(Side.CLIENT)
	    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	    {
	        return Item.getItemFromBlock(MBlocks.bluestone_torch);
	    }

	    public boolean isAssociatedBlock(Block p_149667_1_)
	    {
	        return p_149667_1_ == MBlocks.unlit_bluestone_torch || p_149667_1_ == MBlocks.bluestone_torch;
	    }

	    static class Toggle
	        {
	            int field_150847_a;
	            int field_150845_b;
	            int field_150846_c;
	            long field_150844_d;
	            private static final String __OBFID = "CL_00000299";

	            public Toggle(int p_i45422_1_, int p_i45422_2_, int p_i45422_3_, long p_i45422_4_)
	            {
	                this.field_150847_a = p_i45422_1_;
	                this.field_150845_b = p_i45422_2_;
	                this.field_150846_c = p_i45422_3_;
	                this.field_150844_d = p_i45422_4_;
	            }
	        }

}
