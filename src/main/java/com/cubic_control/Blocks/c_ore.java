package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class c_ore extends BlockOre{

	protected c_ore(Material p_i45394_1_, String name) {
		super();
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(3f);
		this.setResistance(15f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == MBlocks.black_ore ? MItems.black_shard : (
        		this == MBlocks.blue_ore ? MItems.blue_shard : (
        		this == MBlocks.brown_ore ? MItems.brown_shard : (
        		this == MBlocks.cyan_ore ? MItems.cyan_shard : (
        		this == MBlocks.green_ore ? MItems.green_shard : (
        		this == MBlocks.lime_ore ? MItems.lime_shard : (
        		this == MBlocks.magenta_ore ? MItems.magenta_shard : (
        		this == MBlocks.orange_ore ? MItems.orange_shard : (
        		this == MBlocks.pink_ore ? MItems.pink_shard : (
        		this == MBlocks.purple_ore ? MItems.purple_shard : (
        		this == MBlocks.red_ore ? MItems.red_shard : (
        		this == MBlocks.white_ore ? MItems.white_shard : (
        		this == MBlocks.yellow_ore ? MItems.yellow_shard : Item.getItemFromBlock(this)))))))))))));
    }
}
