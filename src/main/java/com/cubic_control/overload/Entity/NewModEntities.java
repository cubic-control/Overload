package com.cubic_control.overload.Entity;

import org.apache.commons.lang3.ArrayUtils;

import com.cubic_control.overload.Biomes.MBiomes;
import com.cubic_control.overload.Biomes.ModBiomeDictionary;
import com.cubic_control.overload.Biomes.ModBiomeDictionary.ModType;
import com.cubic_control.overload.Main.MainRegistry;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.EntityRegistry;

public class NewModEntities {
	
	public static void preinit(){
		BiomeGenBase[] zombieSpawnBiomes = new BiomeGenBase[0];
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.BEACH));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.DESERT));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.FOREST));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.FROZEN));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.HILLS));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.JUNGLE));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.MAGICAL));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.PLAINS));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.SWAMP));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.WASTELAND));
		zombieSpawnBiomes = ArrayUtils.addAll(zombieSpawnBiomes, BiomeDictionary.getBiomesForType(Type.WATER));
		MBiomes[] iceSpawnBiomes = new MBiomes[0];
		iceSpawnBiomes = ArrayUtils.addAll(iceSpawnBiomes, ModBiomeDictionary.getBiomesForType(ModType.ICE));
		MBiomes[] fireSpawnBiomes = new MBiomes[0];
		fireSpawnBiomes = ArrayUtils.addAll(fireSpawnBiomes, ModBiomeDictionary.getBiomesForType(ModType.FIRE));
		MBiomes[] nightmareSpawnBiomes = new MBiomes[0];
		nightmareSpawnBiomes = ArrayUtils.addAll(nightmareSpawnBiomes, ModBiomeDictionary.getBiomesForType(ModType.NIGHTMARE));
		MBiomes[] plasticSpawnBiomes = new MBiomes[0];
		plasticSpawnBiomes = ArrayUtils.addAll(plasticSpawnBiomes, ModBiomeDictionary.getBiomesForType(ModType.RAINBOW));
		
		for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
	    {
			if (BiomeGenBase.getBiomeGenArray()[i] != null)
			{
				EntityRegistry.addSpawn(EntityZombieAlex.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZombieJeb.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZombieNotch.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZombieDinnerbone.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZC.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZombieSuperSonic10.class, 50, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityJeffTheKiller.class, 5, 1, 2, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityZombieCow.class, 15, 1, 8, EnumCreatureType.monster, zombieSpawnBiomes);
				EntityRegistry.addSpawn(EntityMantisMan.class, 15, 5, 25, EnumCreatureType.monster, BiomeGenBase.forest);
				EntityRegistry.addSpawn(EntityStalker.class, 5, 1, 2, EnumCreatureType.monster, BiomeGenBase.getBiomeGenArray()[i]);
				EntityRegistry.addSpawn(EntityFireAssassin.class, 5, 1, 5, EnumCreatureType.monster, fireSpawnBiomes);
				EntityRegistry.addSpawn(EntityIceAssassin.class, 5, 1, 5, EnumCreatureType.monster, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFireArcher.class, 5, 1, 5, EnumCreatureType.monster, fireSpawnBiomes);
				EntityRegistry.addSpawn(EntityIceArcher.class, 5, 1, 5, EnumCreatureType.monster, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFireGuard.class, 5, 1, 5, EnumCreatureType.monster, fireSpawnBiomes);
				EntityRegistry.addSpawn(EntityIceGuard.class, 5, 1, 5, EnumCreatureType.monster, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFireWarrior.class, 5, 1, 5, EnumCreatureType.monster, fireSpawnBiomes);
				EntityRegistry.addSpawn(EntityIceWarrior.class, 5, 1, 5, EnumCreatureType.monster, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFireVillager.class, 5, 1, 5, EnumCreatureType.monster, fireSpawnBiomes);
				EntityRegistry.addSpawn(EntityIceVillager.class, 5, 1, 5, EnumCreatureType.monster, iceSpawnBiomes);
				//NIGHTMARES
				EntityRegistry.addSpawn(EntityNightmareCubic.class, 25, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDeadAngel.class, 25, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityStalkingWarrior.class, 5, 1, 3, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityUnknown.class, 5, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityNightmareVillager.class, 25, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityNightmareSteve.class, 25, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityNightmareAlex.class, 25, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityNightmareHerobrine.class, 25, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityNull.class, 25, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityPumpkin.class, 5, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityHeadless.class, 5, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityFakeHeadless.class, 10, 1, 5, EnumCreatureType.monster, MBiomes.NightmareForest, BiomeGenBase.forest);
				EntityRegistry.addSpawn(EntityNightmare.class, 15, 1, 25, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityGiantNightmare.class, 5, 1, 5, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomWhite.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomBlue.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomGreen.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomLightBlue.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomRed.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				EntityRegistry.addSpawn(EntityDragonPhantomYellow.class, 5, 1, 2, EnumCreatureType.monster, nightmareSpawnBiomes);
				/**Animals*/
				EntityRegistry.addSpawn(EntityFrostedCow.class, 50, 1, 5, EnumCreatureType.creature, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFrostedPig.class, 50, 1, 5, EnumCreatureType.creature, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFrostedChicken.class, 50, 1, 5, EnumCreatureType.creature, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityFrostedSheep.class, 50, 1, 5, EnumCreatureType.creature, iceSpawnBiomes);
				EntityRegistry.addSpawn(EntityPlasticCow.class, 50, 1, 5, EnumCreatureType.creature, plasticSpawnBiomes);
				EntityRegistry.addSpawn(EntityPlasticChicken.class, 50, 1, 5, EnumCreatureType.creature, plasticSpawnBiomes);
	        }
	    }
	}
}