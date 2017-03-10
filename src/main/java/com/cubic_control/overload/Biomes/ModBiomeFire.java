package com.cubic_control.overload.Biomes;

import java.awt.Color;
import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenVines;

public class ModBiomeFire extends MBiomes{

	public ModBiomeFire(int biomeId) {
		super(biomeId);
		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.waterColorMultiplier = 0xFF0000;
		this.topBlock = MBlocks.fire_grass;
		this.fillerBlock = MBlocks.fire_dirt;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.setDisableRain();
	}
}