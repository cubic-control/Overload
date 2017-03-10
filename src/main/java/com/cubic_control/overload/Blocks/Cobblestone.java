package com.cubic_control.overload.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class Cobblestone extends Block{

	protected Cobblestone(Material p_i45394_1_, String name) {
		super(p_i45394_1_);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setBlockName(name);
        this.setBlockTextureName(RefStrings.MODID + ":" + name);
        this.setHardness(2);
        this.setHarvestLevel("pickaxe", 0);
        this.setResistance(30);
        GameRegistry.registerBlock(this, name);
	}

}
