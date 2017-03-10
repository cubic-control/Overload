package com.cubic_control.overload.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockStem;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import static net.minecraftforge.common.util.ForgeDirection.*;

public class ModBlockStem extends BlockStem
{

	protected ModBlockStem(Block block, String name) {
		super(block);
		this.setBlockName(name);
        this.setBlockTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
	}
	
	protected ModBlockStem(Block block, String name, String FolderLocation) {
		super(block);
		this.setBlockName(name);
        this.setBlockTextureName(RefStrings.MODID + ":" + FolderLocation + name);
        GameRegistry.registerBlock(this, name);
	}
	
	public Item getItemDropped(int par1, Random random, int par2)
    {
        return this == MBlocks.white_melon_stem ? MItems.white_melon_seeds : (
        	   this == MBlocks.blue_melon_stem ? MItems.blue_melon_seeds : (
        	   this == MBlocks.purple_melon_stem ? MItems.purple_melon_seeds : (
        	   this == MBlocks.red_melon_stem ? MItems.red_melon_seeds : (
        	   this == MBlocks.yellow_melon_stem ? MItems.yellow_melon_seeds : (
        	   this == MBlocks.white_pumpkin_stem ? MItems.white_pumpkin_seeds : (
        	   this == MBlocks.blue_pumpkin_stem ? MItems.blue_pumpkin_seeds :Item.getItemFromBlock(this)))))));
    }
	
	public int quantityDropped(Random random)
    {
        return 1;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return -1;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        return this.getRenderColor(p_149720_1_.getBlockMetadata(p_149720_2_, p_149720_3_, p_149720_4_));
    }
	
}