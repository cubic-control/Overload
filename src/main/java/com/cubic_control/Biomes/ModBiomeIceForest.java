package com.cubic_control.Biomes;

import java.util.Random;

import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.World.Gen.WorldGenIceBigTree;
import com.cubic_control.World.Gen.WorldGenIceTrees;

public class ModBiomeIceForest extends MBiomes{
	
	 public static int treesPerChunk;
	
	public ModBiomeIceForest(int biomeId) {
		super(biomeId);
		ModBiomeIceForest.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.waterColorMultiplier = 0x0073cf;
		this.topBlock = MBlocks.ice_grass;
		this.fillerBlock = MBlocks.ice_dirt;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntitySnowman.class, 8, 4, 4));
	}
	
	/**
     * Creates a mutated version of the biome and places it into the biomeList with an index equal to the original plus
     * 128
     */
    public BiomeGenBase createMutation()
    {
        BiomeGenBase biomegenbase = (new BiomeGenSnow(this.biomeID + 128, true)).func_150557_a(13828095, true).setBiomeName(this.biomeName + " Spikes").setEnableSnow().setTemperatureRainfall(0.0F, 0.5F).setHeight(new BiomeGenBase.Height(this.rootHeight + 0.1F, this.heightVariation + 0.1F));
        biomegenbase.rootHeight = this.rootHeight + 0.3F;
        biomegenbase.heightVariation = this.heightVariation + 0.4F;
        return biomegenbase;
    }

}
