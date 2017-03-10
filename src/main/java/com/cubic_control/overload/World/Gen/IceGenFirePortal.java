/*
*** MADE BY MRPONYCAPTAIN'S .SCHEMATIC TO .JAVA CONVERTING TOOL v2.0 ***
*/

package com.cubic_control.overload.World.Gen;

import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class IceGenFirePortal extends WorldGenerator{
	
	public IceGenFirePortal(boolean b1) {
		super(b1);
	}

	public void setBlock(World world, int x, int y, int z, Block block, int metadata) {
		Block b1 = world.getBlock(x, y, z);

		if(b1.isAir(world, x, y, z) || b1.isLeaves(world, x, y, z)) {
			world.setBlock(x, y, z, block, metadata, 2);
		}
	}
	@Override
	public boolean generate(World world, Random rand, int i, int j, int k) {
		this.setBlock(world, i + 0, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 0, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 0, j + 0, k + 2, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 1, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 1, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 1, j + 0, k + 2, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 1, j + 1, k + 1, MBlocks.ice_stonebrick, 0);
		this.setBlock(world, i + 1, j + 2, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 1, j + 3, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 1, j + 4, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 1, j + 5, k + 1, MBlocks.ice_stonebrick, 0);
		this.setBlock(world, i + 2, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 2, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 2, j + 0, k + 2, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 2, j + 1, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 2, j + 2, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 2, j + 3, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 2, j + 4, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 2, j + 5, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 3, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 3, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 3, j + 0, k + 2, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 3, j + 1, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 3, j + 2, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 3, j + 3, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 3, j + 4, k + 1, MBlocks.fire_portal, 1);
		this.setBlock(world, i + 3, j + 5, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 4, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 4, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 4, j + 0, k + 2, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 4, j + 1, k + 1, MBlocks.ice_stonebrick, 0);
		this.setBlock(world, i + 4, j + 2, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 4, j + 3, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 4, j + 4, k + 1, MBlocks.fire_stonebrick, 0);
		this.setBlock(world, i + 4, j + 5, k + 1, MBlocks.ice_stonebrick, 0);
		this.setBlock(world, i + 5, j + 0, k + 0, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 5, j + 0, k + 1, MBlocks.ice_stone_polished, 0);
		this.setBlock(world, i + 5, j + 0, k + 2, MBlocks.ice_stone_polished, 0);

		return true;
	}
}