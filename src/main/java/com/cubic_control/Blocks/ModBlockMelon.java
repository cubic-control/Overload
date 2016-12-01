package com.cubic_control.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Food.MFoods;
import com.cubic_control.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class ModBlockMelon extends BlockMelon
{

    protected ModBlockMelon(String name, String OtherName)
    {
        super();
        this.setStepSound(soundTypeWood);
        this.setHardness(1f);
        this.setResistance(5f);
        this.setHarvestLevel("axe", 0);
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setBlockName(OtherName);
        this.setBlockTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerBlock(this, OtherName);
    }
    
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	return this == MBlocks.melon_white ? MFoods.white_melon : (this == MBlocks.melon_blue ? MFoods.blue_melon : (this == MBlocks.melon_purple ? MFoods.purple_melon : (this == MBlocks.melon_red ? MFoods.red_melon : (this == MBlocks.melon_yellow ? MFoods.yellow_melon : Item.getItemFromBlock(this)))));
    }
    
}