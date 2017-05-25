package com.cubic_control.overload.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Main.MainRegistry;
import com.cubic_control.overload.Render.RenderModBlockIDs;
import com.cubic_control.overload.TileEntity.TileEntityFurnaceIce;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBlockFurnaceIce extends BlockContainer {
    private final Random field_149933_a = new Random();
    private final boolean field_149932_b;
    private static boolean field_149934_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_149935_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_149936_O;

    protected ModBlockFurnaceIce(boolean isOn, String name) {
        super(Material.rock);
        this.field_149932_b = isOn;
		this.setHardness(3.5f);
		this.setResistance(17.5f);
		this.setHarvestLevel("pickaxe", 0);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		
		if(isOn){
			this.setCreativeTab(null);
			this.setBlockName(name+"_lit");
			GameRegistry.registerBlock(this, name+"_lit");
		}else{
			this.setCreativeTab(MCreativeTabs.tabBlocks);
			this.setBlockName(name);
			GameRegistry.registerBlock(this, name);
		}
    }
    @Override
    public Item getItemDropped(int i1, Random rand, int i2) {
        return Item.getItemFromBlock(MBlocks.ice_furnace);
    }
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        this.func_149930_e(world, x, y, z);
    }

    private void func_149930_e(World world, int x, int y, int z) {
        if(!world.isRemote){
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            byte b0 = 3;

            if(block.func_149730_j() && !block1.func_149730_j()){
                b0 = 3;
            }
            if(block1.func_149730_j() && !block.func_149730_j()){
                b0 = 2;
            }
            if(block2.func_149730_j() && !block3.func_149730_j()){
                b0 = 5;
            }
            if(block3.func_149730_j() && !block2.func_149730_j()){
                b0 = 4;
            }
            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2) {
        return i1 == 1 ? this.field_149935_N : (i1 == 0 ? this.field_149935_N : (i1 != i2 ? this.blockIcon : this.field_149936_O));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon(this.getTextureName()+"_side");
        this.field_149936_O = reg.registerIcon(this.field_149932_b ? this.getTextureName()+"_front_on" : this.getTextureName()+"_front_off");
        this.field_149935_N = reg.registerIcon(this.getTextureName()+"_top");
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_) {
        if(world.isRemote){
            return false;
        }else{
        	TileEntityFurnaceIce tileentityfurnace = (TileEntityFurnaceIce)world.getTileEntity(x, y, z);

            if(tileentityfurnace != null){
                player.openGui(MainRegistry.instance, 4, world, x, y, z);
            	//FMLNetworkHandler.openGui(player, MainRegistry.instance, 3, world, x, y, z);
            }
            return true;
        }
    }
    
    public static void updateFurnaceBlockState(boolean p_149931_0_, World world, int x, int y, int z) {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        field_149934_M = true;

        if(p_149931_0_){
        	world.setBlock(x, y, z, MBlocks.ice_furnace_lit);
        }else{
        	world.setBlock(x, y, z, MBlocks.ice_furnace);
        }
        field_149934_M = false;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);

        if(tileentity != null){
            tileentity.validate();
            world.setTileEntity(x, y, z, tileentity);
        }
    }
    @Override
    public TileEntity createNewTileEntity(World world, int i1) {
        return new TileEntityFurnaceIce();
    }
    @Override
    public void onBlockPlacedBy(World world, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
        int l = MathHelper.floor_double((double)(p_149689_5_.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if(l == 0){
            world.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 2, 2);
        }
        if(l == 1){
            world.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 5, 2);
        }
        if(l == 2){
            world.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 3, 2);
        }
        if(l == 3){
            world.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, 4, 2);
        }
        if(p_149689_6_.hasDisplayName()){
            ((TileEntityFurnaceIce)world.getTileEntity(p_149689_2_, p_149689_3_, p_149689_4_)).func_145951_a(p_149689_6_.getDisplayName());
        }
    }
    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int p_149749_6_) {
        if(!field_149934_M){
        	TileEntityFurnaceIce tileentityfurnace = (TileEntityFurnaceIce)world.getTileEntity(x, y, z);

            if(tileentityfurnace != null){
                for(int i1 = 0; i1 < tileentityfurnace.getSizeInventory(); ++i1){
                    ItemStack itemstack = tileentityfurnace.getStackInSlot(i1);

                    if(itemstack != null){
                        float f = this.field_149933_a.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.field_149933_a.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.field_149933_a.nextFloat() * 0.8F + 0.1F;

                        while(itemstack.stackSize > 0){
                            int j1 = this.field_149933_a.nextInt(21) + 10;

                            if(j1 > itemstack.stackSize){
                                j1 = itemstack.stackSize;
                            }
                            itemstack.stackSize -= j1;
                            EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));

                            if(itemstack.hasTagCompound()){
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }
                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.field_149933_a.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.field_149933_a.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.field_149933_a.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }
                world.func_147453_f(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, p_149749_6_);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if(this.field_149932_b){
            int l = world.getBlockMetadata(x, y, z);
            float f = (float)x + 0.5F;
            float f1 = (float)y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)z + 0.5F;
            float f3 = 0.52F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;

            if(l == 4){
            	world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }else if(l == 5){
            	world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }else if(l == 2){
            	world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }else if(l == 3){
            	world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }
    @Override
    public boolean hasComparatorInputOverride() {
        return true;
    }
    @Override
    public int getComparatorInputOverride(World world, int x, int y, int z, int p_149736_5_) {
        return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(x, y, z));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.ice_furnace);
    }
    @Override
    public int getRenderType() {
        return RenderModBlockIDs.FURNACE;
    }
}