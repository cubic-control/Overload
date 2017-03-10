package com.cubic_control.overload.Dimensions;

import com.cubic_control.overload.Biomes.MBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class IceGenLayerBiomes extends GenLayer {

    protected BiomeGenBase[] allowedBiomes = {
    	//Modded Biomes
        MBiomes.ICE,
        MBiomes.IceForest,
        //Vanilla Biomes
        BiomeGenBase.frozenOcean,
        BiomeGenBase.frozenRiver,
        BiomeGenBase.icePlains,
        BiomeGenBase.iceMountains,
    };
    
    public IceGenLayerBiomes(long seed) {
		super(seed);
	}
	
	public IceGenLayerBiomes(long seed, GenLayer genlayer) {
		super(seed);
		this.parent = genlayer;
	}
	
    @Override
    public int[] getInts(int x, int z, int width, int depth) {
        int[] dest = IntCache.getIntCache(width * depth);
        for (int dz = 0; dz < depth; dz++) {
            for (int dx = 0; dx < width; dx++) {
                this.initChunkSeed(dx + x, dz + z);
                dest[(dx + dz * width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
            }
        }
        return dest;
    }
}