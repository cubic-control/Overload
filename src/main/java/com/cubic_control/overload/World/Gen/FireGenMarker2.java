//Schematic to java Structure by jajo_11 | inspired by "MITHION'S .SCHEMATIC TO JAVA CONVERTINGTOOL"

package com.cubic_control.overload.World.Gen;

import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FireGenMarker2 extends WorldGenerator{
	protected Block[] GetValidSpawnBlocks() {
		return new Block[]{
			MBlocks.fire_grass,
			MBlocks.fire_stone,
			MBlocks.fire_dirt
		};
	}

	public boolean LocationIsValidSpawn(World world, int x, int y, int z) {
		Block checkBlock = world.getBlock(x, y - 1, z);
		Block blockAbove = world.getBlock(x, y , z);
		Block blockBelow = world.getBlock(x, y - 2, z);

		for(Block i : GetValidSpawnBlocks()){
			if(blockAbove != Blocks.air){
				return false;
			}
			if(checkBlock == i){
				return true;
			}else if(checkBlock == Blocks.snow_layer && blockBelow == i){
				return true;
			}else if(checkBlock.getMaterial() == Material.plants && blockBelow == i){
				return true;
			}
		}
		return false;
	}

	public boolean generate(World world, Random rand, int x, int y, int z) {
		int i = rand.nextInt(1);

		if(i == 0){
		    generate_r0(world, rand, x, y, z);
		}
       return true;
	}

	public boolean generate_r0(World world, Random rand, int x, int y, int z) {
		if(!LocationIsValidSpawn(world, x + 0, y, z +0) ||
			!LocationIsValidSpawn(world, x + 1, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +0) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +1) ||
		    !LocationIsValidSpawn(world, x + 0, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 1, y, z +2) ||
		    !LocationIsValidSpawn(world, x + 2, y, z +2)){
		}else{
			world.setBlock(x + 0, y + -1, z + 0, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 1, y + -1, z + 0, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 2, y + -1, z + 0, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 0, y + -1, z + 1, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 1, y + -1, z + 1, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 2, y + -1, z + 1, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 0, y + -1, z + 2, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 1, y + -1, z + 2, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 2, y + -1, z + 2, MBlocks.fire_stone_polished, 0, 3);
			world.setBlock(x + 1, y + 0, z + 0, MBlocks.fire_stonebrick_stairs, 2, 3);
			world.setBlock(x + 0, y + 0, z + 1, MBlocks.fire_stonebrick_stairs, 0, 3);
			world.setBlock(x + 1, y + 0, z + 1, MBlocks.fire_stonebrick, 3, 3);
			world.setBlock(x + 2, y + 0, z + 1, MBlocks.fire_stonebrick_stairs, 1, 3);
			world.setBlock(x + 1, y + 0, z + 2, MBlocks.fire_stonebrick_stairs, 3, 3);
			world.setBlock(x + 1, y + 1, z + 1, MBlocks.fire_stonebrick, 3, 3);
			world.setBlock(x + 1, y + 2, z + 1, MBlocks.fire_stonebrick, 3, 3);
			world.setBlock(x + 1, y + 3, z + 0, MBlocks.fire_stonebrick_stairs, 6, 3);
			world.setBlock(x + 0, y + 3, z + 1, MBlocks.fire_stonebrick_stairs, 4, 3);
			world.setBlock(x + 1, y + 3, z + 1, MBlocks.fire_stonebrick, 3, 3);
			world.setBlock(x + 2, y + 3, z + 1, MBlocks.fire_stonebrick_stairs, 5, 3);
			world.setBlock(x + 1, y + 3, z + 2, MBlocks.fire_stonebrick_stairs, 7, 3);
			world.setBlock(x + 1, y + 4, z + 0, MBlocks.fire_stonebrick_stairs, 3, 3);
			world.setBlock(x + 0, y + 4, z + 1, MBlocks.fire_stonebrick_stairs, 1, 3);
			world.setBlock(x + 1, y + 4, z + 1, Blocks.netherrack, 0, 3);
			world.setBlock(x + 2, y + 4, z + 1, MBlocks.fire_stonebrick_stairs, 0, 3);
			world.setBlock(x + 1, y + 4, z + 2, MBlocks.fire_stonebrick_stairs, 2, 3);
			world.setBlock(x + 1, y + 5, z + 1, MBlocks.burned_fire, 15, 3);
			//DEBUG
			//System.out.println("["+RefStrings.NAME+"]:"+this.getClass().getCanonicalName()+":generate_r0:Structure Generated At_"+x+"_"+y+"_"+z);
		}
		return true;
	}

}