package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block.SoundType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.IBlockAccess;

public class ModBlockStairs extends BlockStairs {

	public ModBlockStairs(String name, Block block, int C, String tool, String Tname) {
		super(block, 0);
		this.setLightOpacity(0);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		//this.setHardness(A);
		//this.setResistance(B);
		this.setHarvestLevel(tool, C);
		//this.setStepSound(sound);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + Tname);
		GameRegistry.registerBlock(this, name);
	}
	
}