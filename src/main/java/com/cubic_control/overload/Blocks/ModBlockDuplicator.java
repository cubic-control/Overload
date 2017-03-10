package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.TileEntity.TileEntityDuplicator;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ModBlockDuplicator extends BlockContainer{
	public IIcon[] icons = new IIcon[6];
	private String texture;

	public ModBlockDuplicator(String name) {
		super(Material.iron);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabTech);
		this.setHardness(15.0f);
		this.setHarvestLevel("pickaxe", 2);
		this.setLightLevel(0.1f);
		this.setResistance(30.0f);
		this.setStepSound(soundTypeMetal);
		GameRegistry.registerBlock(this, name);
	}
	
	@Override
	public Item getItemDropped(int i1, Random rand, int i2) {
        return Item.getItemFromBlock(MBlocks.duplicator);
    }
	
	@Override
	public void onBlockAdded(World world, int i1, int i2, int i3) {
        super.onBlockAdded(world, i1, i2, i3);
        this.func_149930_e(world, i1, i2, i3);
    }
	
	private void func_149930_e(World world, int i1, int i2, int i3) {
        if (!world.isRemote) {
            Block block = world.getBlock(i1, i2, i3 - 1);
            Block block1 = world.getBlock(i1, i2, i3 + 1);
            Block block2 = world.getBlock(i1 - 1, i2, i3);
            Block block3 = world.getBlock(i1 + 1, i2, i3);
            byte b0 = 3;

            if (block.func_149730_j() && !block1.func_149730_j()) {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j()) {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j()) {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j()) {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(i1, i2, i3, b0, 2);
        }
    }
	
	@Override
	public IIcon getIcon(int side, int meta) {
	    return this.icons[side];
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
	    for (int i = 0; i < 6; i ++) {
	    	if(i == 0){
	    		texture = "bottom";
	    	}else if(i == 1){
	    		texture = "top";
	    	}else if(i == 2){
	    		texture = "front";
	    	}else if(i == 3){
	    		texture = "back";
	    	}else if(i == 4 || i == 5){
	    		texture = "side";
	    	}
	        this.icons[i] = reg.registerIcon(this.textureName + "_" + texture);
	    }
	}
	
	@Override
	public boolean onBlockActivated(World world, int i1, int i2, int i3, EntityPlayer player, int i4, float f1, float f2, float f3) {
        if (world.isRemote) {
            return true;
        }else{
            TileEntityDuplicator tileentity = (TileEntityDuplicator)world.getTileEntity(i1, i2, i3);

            if (tileentity != null) {
            	player.func_146100_a(tileentity);
            }

            return true;
        }
    }

	@Override
	public TileEntity createNewTileEntity(World world, int i1) {
		return new TileEntityDuplicator();
	}
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 1, 2);
            world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
        }

        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
            world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
        }

        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
            world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
        }

        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
            world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
        }
    }
	
	@Override
	public boolean hasComparatorInputOverride() {
        return true;
    }
	
	@Override
	public int getComparatorInputOverride(World world, int i1, int i2, int i3, int i4) {
        return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(i1, i2, i3));
    }
	
	@SideOnly(Side.CLIENT)
	@Override
    public Item getItem(World world, int i1, int i2, int i3) {
        return Item.getItemFromBlock(MBlocks.duplicator);
    }

}
