package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.Classes.BlockBluestoneOre;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class bluestone_ore extends BlockBluestoneOre {

	protected bluestone_ore(Material p_i45394_1_, String name) {
		super(false);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(3f);
		this.setResistance(15f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		GameRegistry.registerBlock(this, name);
	}
	//If the block's drop is an item.
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return MItems.bluestone;
    }
}
