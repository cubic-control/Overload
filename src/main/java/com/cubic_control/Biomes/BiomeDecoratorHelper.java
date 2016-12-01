package com.cubic_control.Biomes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;

public class BiomeDecoratorHelper {

    public BiomeDecoratorHelper(){
    }

    protected static void decorateBiome(BiomeGenBase biome) {
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, BiomeDecoratorMod.chunk_X, BiomeDecoratorMod.chunk_Z));

        if(biome == MBiomes.ICE){
            int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
        }
        if(biome == MBiomes.FIRE){
        	int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
        }
        if(biome == MBiomes.NightmarePlains){
        	int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
        }
        if(biome == MBiomes.IceForest){
            BiomeDecoratorMod.howMenyTrees = ModBiomeIceForest.treesPerChunk;
            int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
            /** Generates Small tree **/
            for(int a = 0; a < i; ++a){
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(8)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.ice){
                        if(blockA != Blocks.air || blockA != Blocks.ice){
                            BiomeDecoratorMod.SmallIceTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
                /** Generates Big tree **/
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(15)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.ice){
                        if(blockA != Blocks.air || blockA != Blocks.ice){
                            BiomeDecoratorMod.BigIceTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
            }
        }
        if(biome == MBiomes.FireForest){
            BiomeDecoratorMod.howMenyTrees = ModBiomeFireForest.treesPerChunk;
            int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
            /** Generates Small tree **/
            for(int a = 0; a < i; ++a){
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(8)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.lava){
                        if(blockA != Blocks.air || blockA != Blocks.lava){
                            BiomeDecoratorMod.SmallFireTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
                /** Generates Big tree **/
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(15)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.lava){
                        if(blockA != Blocks.air || blockA != Blocks.lava){
                            BiomeDecoratorMod.BigFireTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
            }
        }
        if(biome == MBiomes.NightmareForest){
            BiomeDecoratorMod.howMenyTrees = ModBiomeFireForest.treesPerChunk;
            int i = BiomeDecoratorMod.howMenyTrees;
            /** Chunk Postions **/
            int chunkX;
            int chunkZ;
            int y;
            /** get blocks at the given locations **/
            Block block;
            Block blockA;
            /** Generates Small tree **/
            for(int a = 0; a < i; ++a){
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(8)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.water){
                        if(blockA != Blocks.air || blockA != Blocks.water){
                            BiomeDecoratorMod.SmallDeadTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
                /** Generates Big tree **/
                if(i == BiomeDecoratorMod.randomGenerator.nextInt(15)){
                    chunkX = BiomeDecoratorMod.chunk_X + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    chunkZ = BiomeDecoratorMod.chunk_Z + BiomeDecoratorMod.randomGenerator.nextInt(16) + 8;
                    y = BiomeDecoratorMod.currentWorld.getTopSolidOrLiquidBlock(chunkX, chunkZ);
                    block = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y, chunkZ);
                    blockA = BiomeDecoratorMod.currentWorld.getBlock(chunkX, y - 1, chunkZ);
                    if(block != Blocks.air || block != Blocks.water){
                        if(blockA != Blocks.air || blockA != Blocks.water){
                            BiomeDecoratorMod.BigDeadTree.generate(BiomeDecoratorMod.currentWorld, BiomeDecoratorMod.randomGenerator, chunkX, y, chunkZ);
                        }
                    }
                }
            }
        }
    }
}