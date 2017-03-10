package com.cubic_control.overload.Biomes;

import java.awt.Color;
import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenVines;

public class ModBiomeFireForest extends MBiomes{
	
	public static int treesPerChunk;

	public ModBiomeFireForest(int biomeId) {
		super(biomeId);
		ModBiomeFireForest.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.waterColorMultiplier = 0xFF0000;
		this.topBlock = MBlocks.fire_grass;
		this.fillerBlock = MBlocks.fire_dirt;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.setDisableRain();
	}
}