package com.cubic_control.Blocks;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Gem_Blocks extends Block {

	protected Gem_Blocks(Material p_i45394_1_, String name) {
		super(p_i45394_1_);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(5f);
		this.setResistance(30f);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeMetal);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":gems/blocks/" + name);
		GameRegistry.registerBlock(this, name);
	}

}
