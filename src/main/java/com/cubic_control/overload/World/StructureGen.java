package com.cubic_control.overload.World;

import java.util.Random;

import com.cubic_control.overload.Dimensions.DimensionIDs;
import com.cubic_control.overload.World.Gen.FireGenMarker2;
import com.cubic_control.overload.World.Gen.IceGenMarker2;
import com.cubic_control.overload.lib.RefStrings;

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
			int x = chunkX + random.nextInt(16);
			int z = chunkZ + random.nextInt(16);
			int y = world.getHeightValue(x, z);
			
			if(random.nextBoolean() == true){
				gen.generate(world, random, x, y, z);
			}
			//DEBUG
			//System.out.println("["+RefStrings.NAME+"]:"+this.getClass().getCanonicalName()+":addStructure:"+gen.toString());
		}
	}

	private void generateICE(Random random, int chunkX, int chunkZ, World world) {
		addStructure(new IceGenMarker2(), random, chunkX, chunkZ, world, 5);
	}
	
	private void generateFIRE(Random random, int chunkX, int chunkZ, World world) {
		addStructure(new FireGenMarker2(), random, chunkX, chunkZ, world, 5);
	}
	
	private void generateNIGHTMARE(Random random, int chunkX, int chunkZ, World world) {
		
	}

}
