package com.cubic_control.overload.Biomes;

import java.util.Random;

import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSnow;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.World.Gen.WorldGenIceBigTree;
import com.cubic_control.overload.World.Gen.WorldGenIceTrees;

public class ModBiomeRainbowForest extends MBiomes{
	
	 public static int treesPerChunk;
	
	public ModBiomeRainbowForest(int biomeId) {
		super(biomeId);
		ModBiomeRainbowForest.treesPerChunk = 10;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.flowersPerChunk = 1;
		this.waterColorMultiplier = 0x0073cf;
		this.topBlock = MBlocks.green_block;
		this.fillerBlock = MBlocks.brown_block;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
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
