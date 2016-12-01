package com.cubic_control.World;

import java.util.Random;

import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.Dimensions.DimensionIDs;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class DimensionControlOre implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if(world.provider.dimensionId == DimensionIDs.Realm_of_Ice){
			generateICE(random, chunkX * 16, chunkZ * 16, world);
		}
		if(world.provider.dimensionId == DimensionIDs.Realm_of_Fire){
			generateFIRE(random, chunkX * 16, chunkZ * 16, world);
		}
		if(world.provider.dimensionId == DimensionIDs.Nightmare_Realm){
			generateNightmare(random, chunkX * 16, chunkZ * 16, world);
		}
	}
	
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVien, int maxVien, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVien + random.nextInt(maxVien - minVien)), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
	}
	//addOre(MinHeight,MaxHeight,MinVien,MaxVien,SpawnChance)
	private void generateICE(Random random, int chunkX, int chunkZ, World world) {
		addOre(MBlocks.ice_coal_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 1, 84, 5, 10, 88);
		addOre(MBlocks.ice_diamond_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 1, 16, 1, 10, 33);
		addOre(MBlocks.ice_emerald_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 4, 32, 1, 8, 22);
		addOre(MBlocks.ice_gold_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 2, 29, 4, 8, 44);
		addOre(MBlocks.ice_iron_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 1, 83, 4, 10, 77);
		addOre(MBlocks.ice_lapis_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 1, 31, 1, 8, 36);
		addOre(MBlocks.ice_ruby_ore, MBlocks.ice_stone, random, world, chunkX, chunkZ, 4, 32, 1, 8, 22);
	}
	
	private void generateFIRE(Random random, int chunkX, int chunkZ, World world) {
	}
	
	private void generateNightmare(Random random, int chunkX, int chunkZ, World world) {
	}
	
}
