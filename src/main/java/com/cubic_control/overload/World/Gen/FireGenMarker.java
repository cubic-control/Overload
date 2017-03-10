/*
*** MADE BY MRPONYCAPTAIN'S .SCHEMATIC TO .JAVA CONVERTING TOOL v2.0 ***
*/

package com.cubic_control.overload.World.Gen;

import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class FireGenMarker extends WorldGenerator{
	
	public FireGenMarker(boolean b1) {
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
		this.setBlock(world, i + 0, j + 0, k + 0, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 0, j + 0, k + 1, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 0, j + 0, k + 2, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 0, j + 1, k + 1, MBlocks.fire_stonebrick_stairs, 0);
		this.setBlock(world, i + 0, j + 4, k + 1, MBlocks.fire_stonebrick_stairs, 4);
		this.setBlock(world, i + 0, j + 5, k + 1, MBlocks.fire_stonebrick_stairs, 1);
		this.setBlock(world, i + 1, j + 0, k + 0, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 1, j + 0, k + 1, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 1, j + 0, k + 2, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 1, j + 1, k + 0, MBlocks.fire_stonebrick_stairs, 2);
		this.setBlock(world, i + 1, j + 1, k + 1, MBlocks.fire_stone_pillar, 3);
		this.setBlock(world, i + 1, j + 1, k + 2, MBlocks.fire_stonebrick_stairs, 3);
		this.setBlock(world, i + 1, j + 2, k + 1, MBlocks.fire_stone_pillar, 3);
		this.setBlock(world, i + 1, j + 3, k + 1, MBlocks.fire_stone_pillar, 3);
		this.setBlock(world, i + 1, j + 4, k + 0, MBlocks.fire_stonebrick_stairs, 6);
		this.setBlock(world, i + 1, j + 4, k + 1, MBlocks.fire_stone_pillar, 3);
		this.setBlock(world, i + 1, j + 4, k + 2, MBlocks.fire_stonebrick_stairs, 7);
		this.setBlock(world, i + 1, j + 5, k + 0, MBlocks.fire_stonebrick_stairs, 3);
		this.setBlock(world, i + 1, j + 5, k + 1, Blocks.netherrack, 0);
		this.setBlock(world, i + 1, j + 5, k + 2, MBlocks.fire_stonebrick_stairs, 2);
		this.setBlock(world, i + 1, j + 6, k + 1, MBlocks.burned_fire, 14);
		this.setBlock(world, i + 2, j + 0, k + 0, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 2, j + 0, k + 2, MBlocks.fire_stone_polished, 0);
		this.setBlock(world, i + 2, j + 1, k + 1, MBlocks.fire_stonebrick_stairs, 1);
		this.setBlock(world, i + 2, j + 4, k + 1, MBlocks.fire_stonebrick_stairs, 5);
		this.setBlock(world, i + 2, j + 5, k + 1, MBlocks.fire_stonebrick_stairs, 0);

		return true;
	}
}