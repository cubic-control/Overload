package com.cubic_control.Blocks;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class c_stairs extends BlockStairs {

	public c_stairs(String name, Block block) {
		super(block, 0);
		this.setLightOpacity(0);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(5f);
		this.setResistance(30f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setBlockName(name + "_stairs");
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerBlock(this, name + "_stairs");
	}
	
}