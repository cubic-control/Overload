package com.cubic_control.overload.World;

import java.util.Random;

import com.cubic_control.overload.Dimensions.DimensionIDs;
import com.cubic_control.overload.World.Gen.FireGenIcePortal;
import com.cubic_control.overload.World.Gen.FireGenMarker;
import com.cubic_control.overload.World.Gen.IceGenFirePortal;
import com.cubic_control.overload.World.Gen.IceGenMarker;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class StructureGen implements IWorldGenerator{

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
			generateNIGHTMARE(random, chunkX * 16, chunkZ * 16, world);
		}
	}
	
	private void addStructure(WorldGenerator gen, Random random, int chunkX, int chunkZ, World world, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int i1 = chunkX + random.nextInt(16);
			int i2 = chunkZ + random.nextInt(16);
			int i3 = world.getHeightValue(i1, i2);
			
			gen.generate(world, random, i1, i2, i3);
		}
	}

	private void generateICE(Random random, int chunkX, int chunkZ, World world) {
		addStructure(new IceGenMarker(true), random, chunkX, chunkZ, world, 15);
		addStructure(new IceGenFirePortal(true), random, chunkX, chunkZ, world, 5);
	}
	
	private void generateFIRE(Random random, int chunkX, int chunkZ, World world) {
		addStructure(new FireGenMarker(true), random, chunkX, chunkZ, world, 15);
		addStructure(new FireGenIcePortal(true), random, chunkX, chunkZ, world, 5);
	}
	
	private void generateNIGHTMARE(Random random, int chunkX, int chunkZ, World world) {
		
	}

}
