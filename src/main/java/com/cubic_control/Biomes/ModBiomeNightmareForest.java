package com.cubic_control.Biomes;

import java.awt.Color;
import java.util.Random;

import com.cubic_control.Blocks.MBlocks;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenVines;

public class ModBiomeNightmareForest extends MBiomes{
	
	public static int treesPerChunk;

	public ModBiomeNightmareForest(int biomeId) {
		super(biomeId);
		ModBiomeNightmareForest.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.waterColorMultiplier = 0x00B58B;
		this.topBlock = MBlocks.nightmare_grass;
		this.fillerBlock = MBlocks.nightmare_dirt;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
	}
}