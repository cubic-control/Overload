package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class ModBlockDynamicLiquid extends BlockDynamicLiquid{

	protected ModBlockDynamicLiquid(Material material, String name) {
		super(material);
		this.setCreativeTab(null);
		this.setHardness(100.0F);
		this.setBlockName(name);
		this.disableStats();
		this.setBlockTextureName(name);
		GameRegistry.registerBlock(this, name);
	}
	
	private void func_149811_n(World world, int x, int y, int z, Block block) {
        int l = world.getBlockMetadata(x, y, z);
        world.setBlock(x, y, z, block, l, 2);
    }
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
		super.updateTick(world, x, y, z, rand);
		//TODO: Mess with code from super.
	}

}
