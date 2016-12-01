package com.cubic_control.Blocks;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ruby_block extends Block{

	protected ruby_block(Material p_i45394_1_, String name) {
		super(p_i45394_1_);
		this.setBlockName(name);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setBlockTextureName(RefStrings.MODID + ":ruby_block");
		this.setHardness(5f);
		this.setResistance(30f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		GameRegistry.registerBlock(this, name);
	}

}
