package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class c_block extends Block {

	protected c_block(Material p_i45394_1_, String name) {
		super(p_i45394_1_);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(5f);
		this.setResistance(30f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}

}
