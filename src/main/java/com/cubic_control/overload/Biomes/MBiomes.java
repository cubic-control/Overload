package com.cubic_control.overload.Biomes;

import java.awt.Color;
import java.util.Random;

import com.cubic_control.overload.Biomes.ModBiomeDictionary.ModType;
import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;

/**
 * TutorialBiomes.class Holds and loads all Tutorial Biomes.
 * 
 * @author Jimmy04Creeper
 */
public class MBiomes extends BiomeGenBase {

    /** The biome height */
    public static final BiomeGenBase.Height biomeHeight = new BiomeGenBase.Height(0.1F, 0.2F);

    public static BiomeGenBase ICE;
    public static BiomeGenBase IceForest;
    public static BiomeGenBase FIRE;
    public static BiomeGenBase FireForest;
    public static BiomeGenBase NightmarePlains;
    public static BiomeGenBase NightmareForest;
    public static BiomeGenBase RainbowPlains;
    public static BiomeGenBase RainbowForest;
    public static BiomeGenBase RainbowDesert;
    public static BiomeGenBase RainbowBeach;

    public MBiomes(int biomeId) {
        super(biomeId);
        this.theBiomeDecorator = new BiomeDecoratorMod();
    }

    static {
        ICE = (new ModBiomeIce(BiomeIDs.ICE).setColor(0).setHeight(height_LowPlains).setBiomeName("Realm Of Ice")).setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
        IceForest = (new ModBiomeIceForest(BiomeIDs.IceForest).setColor(0).setHeight(height_MidPlains).setBiomeName("Forest Of Ice")).setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
        FIRE = (new ModBiomeFire(BiomeIDs.FIRE).setColor(0).setHeight(biomeHeight).setBiomeName("Realm Of Fire"));
        FireForest = (new ModBiomeFire(BiomeIDs.FireForest).setColor(0).setHeight(height_MidHills).setBiomeName("Forest Of Fire"));
        NightmarePlains = (new ModBiomeNightmarePlains(BiomeIDs.NightmarePlains).setColor(0).setHeight(height_MidPlains).setBiomeName("Nightmare Plains"));
        NightmareForest = (new ModBiomeNightmareForest(BiomeIDs.NightmareForest).setColor(0).setHeight(height_MidHills).setBiomeName("Nightmare Forest"));
        RainbowPlains = (new ModBiomeRainbowPlains(BiomeIDs.RainbowPlains).setColor(0).setHeight(height_MidPlains).setBiomeName("Rainbow Plains"));
        RainbowForest = (new ModBiomeRainbowForest(BiomeIDs.RainbowForest).setColor(0).setHeight(height_LowPlains).setBiomeName("Rainbow Forest"));
        RainbowDesert = (new ModBiomeRainbowDesert(BiomeIDs.RainbowDesert).setColor(0).setHeight(height_MidPlains).setBiomeName("Rainbow Desert")).setDisableRain().setTemperatureRainfall(2.0F, 0.0F);
        RainbowBeach = (new ModBiomeRainbowBeach(BiomeIDs.RainbowBeach).setColor(0).setHeight(height_Shores).setBiomeName("Rainbow Beach")).setTemperatureRainfall(0.8F, 0.4F);
    }

    public WorldGenerator getRandomWorldGenForGrass(Random random)
    {
        if (random.nextInt(4) == 0)
            return new WorldGenTallGrass(Blocks.tallgrass, 2);
        else
            return new WorldGenTallGrass(Blocks.tallgrass, 1);
    }

    public static void registerWithBiomeDictionary()
    {
        ModBiomeDictionary.registerBiomeType(ICE, ModType.ICE);
        ModBiomeDictionary.registerBiomeType(IceForest, ModType.ICE);
        ModBiomeDictionary.registerBiomeType(FIRE, ModType.FIRE);
        ModBiomeDictionary.registerBiomeType(FireForest, ModType.FIRE);
        ModBiomeDictionary.registerBiomeType(NightmarePlains, ModType.NIGHTMARE);
        ModBiomeDictionary.registerBiomeType(NightmareForest, ModType.NIGHTMARE);
        ModBiomeDictionary.registerBiomeType(RainbowPlains, ModType.RAINBOW);
        ModBiomeDictionary.registerBiomeType(RainbowForest, ModType.RAINBOW);
        ModBiomeDictionary.registerBiomeType(RainbowDesert, ModType.RAINBOW);
        ModBiomeDictionary.registerBiomeType(RainbowBeach, ModType.RAINBOW);
    }
    
    @Override
    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_) {
        genBiomeModdedTerrain(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }

    /**
     * Replaces custom Stone to allow top/filler blocks to work in dimension.
     * 
     * @param world
     * @param random
     * @param replacableBlock
     * @param aByte
     * @param x
     * @param y
     * @param z
     */
    public void genBiomeModdedTerrain(World world, Random random, Block[] replacableBlock, byte[] aByte, int x, int y, double z)
    {
        Block block = this.topBlock;
        byte b0 = (byte) (this.field_150604_aj & 255);
        Block block1 = this.fillerBlock;
        int k = -1;
        int l = (int) (z / 3.0D + 3.0D + random.nextDouble() * 0.25D);
        int i1 = x & 15;
        int j1 = y & 15;
        int k1 = replacableBlock.length / 256;
        for (int l1 = 255; l1 >= 0; --l1)
        {
            int i2 = (j1 * 16 + i1) * k1 + l1;

            if (l1 <= 0 + random.nextInt(5))
            {
                replacableBlock[i2] = Blocks.bedrock;
            }
            else
            {
                Block block2 = replacableBlock[i2];

                if (block2 != null && block2.getMaterial() != Material.air)
                {
                    if (block2 == MBlocks.ice_stone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = MBlocks.ice_stone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte) (this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(x, l1, y) < 0.15F)
                                {
                                    block = Blocks.ice;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.water;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                replacableBlock[i2] = block;
                                aByte[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = MBlocks.ice_stone;
                                replacableBlock[i2] = Blocks.gravel;
                            }
                            else
                            {
                                replacableBlock[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            replacableBlock[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = random.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                    if (block2 == MBlocks.fire_stone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = MBlocks.fire_stone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte) (this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(x, l1, y) < 0.15F)
                                {
                                    block = Blocks.lava;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.lava;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                replacableBlock[i2] = block;
                                aByte[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = MBlocks.fire_stone;
                                replacableBlock[i2] = Blocks.gravel;
                            }
                            else
                            {
                                replacableBlock[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            replacableBlock[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = random.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                    if (block2 == MBlocks.nightmare_stone)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = MBlocks.nightmare_stone;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte) (this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(x, l1, y) < 0.15F)
                                {
                                    block = Blocks.ice;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = Blocks.water;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                replacableBlock[i2] = block;
                                aByte[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = MBlocks.nightmare_stone;
                                replacableBlock[i2] = Blocks.gravel;
                            }
                            else
                            {
                                replacableBlock[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            replacableBlock[i2] = block1;

                            if (k == 0 && block1 == Blocks.sand)
                            {
                                k = random.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = Blocks.sandstone;
                            }
                        }
                    }
                    if (block2 == MBlocks.black_block)
                    {
                        if (k == -1)
                        {
                            if (l <= 0)
                            {
                                block = null;
                                b0 = 0;
                                block1 = MBlocks.black_block;
                            }
                            else if (l1 >= 59 && l1 <= 64)
                            {
                                block = this.topBlock;
                                b0 = (byte) (this.field_150604_aj & 255);
                                block1 = this.fillerBlock;
                            }

                            if (l1 < 63 && (block == null || block.getMaterial() == Material.air))
                            {
                                if (this.getFloatTemperature(x, l1, y) < 0.15F)
                                {
                                    block = MBlocks.cyan_block;
                                    b0 = 0;
                                }
                                else
                                {
                                    block = MBlocks.blue_block;
                                    b0 = 0;
                                }
                            }

                            k = l;

                            if (l1 >= 62)
                            {
                                replacableBlock[i2] = block;
                                aByte[i2] = b0;
                            }
                            else if (l1 < 56 - l)
                            {
                                block = null;
                                block1 = MBlocks.black_block;
                                replacableBlock[i2] = Blocks.gravel;
                            }
                            else
                            {
                                replacableBlock[i2] = block1;
                            }
                        }
                        else if (k > 0)
                        {
                            --k;
                            replacableBlock[i2] = block1;

                            if (k == 0 && block1 == MBlocks.yellow_block)
                            {
                                k = random.nextInt(4) + Math.max(0, l1 - 63);
                                block1 = MBlocks.orange_block;
                            }
                        }
                    }
                }
                else
                {
                    k = -1;
                }
            }
        }
    }

}