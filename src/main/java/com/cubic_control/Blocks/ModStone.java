package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ModStone extends Block
{
    private static final String __OBFID = "CL_00000317";

    public ModStone(String name)
    {
        super(Material.rock);
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setBlockName(name);
        this.setBlockTextureName(RefStrings.MODID + ":" + this.getUnlocalizedName().substring(5));
        this.setHardness(1.5f);
        this.setHarvestLevel("pickaxe", 0);
        this.setResistance(30);
        GameRegistry.registerBlock(this, name);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == MBlocks.ice_stone ? Item.getItemFromBlock(MBlocks.ice_cobblestone) : (
        		this == MBlocks.fire_stone ? Item.getItemFromBlock(MBlocks.fire_cobblestone) : (
        		this == MBlocks.nightmare_ore ? Item.getItemFromBlock(MBlocks.nightmare_cobblestone) : Item.getItemFromBlock(this)));
    }
}