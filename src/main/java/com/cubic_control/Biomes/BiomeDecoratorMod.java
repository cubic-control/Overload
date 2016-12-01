package com.cubic_control.Biomes;

import java.util.Random;

import com.cubic_control.World.Gen.WorldGenDeadBigTree;
import com.cubic_control.World.Gen.WorldGenDeadTrees;
import com.cubic_control.World.Gen.WorldGenFireBigTree;
import com.cubic_control.World.Gen.WorldGenFireTrees;
import com.cubic_control.World.Gen.WorldGenIceBigTree;
import com.cubic_control.World.Gen.WorldGenIceTrees;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeDecoratorMod extends BiomeDecorator
{
	/** The world the BiomeDecorator is currently decorating */
	public static World currentWorld;
	/** The Biome Decorator's random number generator. */
	public static Random randomGenerator;
	/** The X-coordinate of the chunk currently being decorated */
	public static int chunk_X;
	/** The Z-coordinate of the chunk currently being decorated */
	public static int chunk_Z;
	/** True if decorator should generate surface lava & water */
	public static boolean generateLakes;
	/** How meny trees per chunk, set in each biome class **/
	public static int howMenyTrees;

	/** Dimension Trees **/
	public static WorldGenIceTrees SmallIceTree;
	public static WorldGenIceBigTree BigIceTree;
	public static WorldGenFireTrees SmallFireTree;
	public static WorldGenFireBigTree BigFireTree;
	public static WorldGenDeadTrees SmallDeadTree;
	public static WorldGenDeadBigTree BigDeadTree;
	
	private static final String __OBFID = "CL_00000164";

	public BiomeDecoratorMod() {

		// TREES
		SmallIceTree = new WorldGenIceTrees(true);
		BigIceTree = new WorldGenIceBigTree(true, 10, 1, 5);
		SmallFireTree = new WorldGenFireTrees(true);
		BigFireTree = new WorldGenFireBigTree(true, 10, 1, 5);
		SmallDeadTree = new WorldGenDeadTrees(true);
		BigDeadTree = new WorldGenDeadBigTree(true, 10, 1, 5);

		// generates lakes and lava lakes in dimension.
		generateLakes = true;
	}

	public void decorateChunk(World world, Random random, BiomeGenBase biomeGenBase, int chunkX, int chunkZ) {
		if (currentWorld != null) {
			throw new RuntimeException("Already decorating!!");
		} else {
			currentWorld = world;
			randomGenerator = random;
			chunk_X = chunkX;
			chunk_Z = chunkZ;
			genDecorationsForBiome(biomeGenBase);
			currentWorld = null;
			randomGenerator = null;
		}
	}

	/**
	 * Decorate's biome.
	 * 
	 * @param biome
	 */
	protected void genDecorationsForBiome(BiomeGenBase biome) {
		BiomeDecoratorHelper.decorateBiome(biome);
	}
}