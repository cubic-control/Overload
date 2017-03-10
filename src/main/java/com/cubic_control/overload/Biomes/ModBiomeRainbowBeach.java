package com.cubic_control.overload.Biomes;

import java.awt.Color;
import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Entity.EntityFrostedChicken;
import com.cubic_control.overload.Entity.EntityFrostedCow;
import com.cubic_control.overload.Entity.EntityFrostedPig;
import com.cubic_control.overload.World.Gen.WorldGenIceBigTree;
import com.cubic_control.overload.World.Gen.WorldGenIceTrees;

import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenIceSpike;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModBiomeRainbowBeach extends MBiomes{

	public ModBiomeRainbowBeach(int biomeId) {
		super(biomeId);
        this.theBiomeDecorator.deadBushPerChunk = 0;
        this.theBiomeDecorator.reedsPerChunk = 0;
        this.theBiomeDecorator.cactiPerChunk = 0;
		this.waterColorMultiplier = 0x0073cf;
		this.topBlock = MBlocks.yellow_block;
		this.fillerBlock = MBlocks.yellow_block;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
	}
}