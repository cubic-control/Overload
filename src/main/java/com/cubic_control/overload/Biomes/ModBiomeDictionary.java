package com.cubic_control.overload.Biomes;

import java.util.*;

import cpw.mods.fml.common.FMLLog;
import net.minecraft.world.biome.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.terraingen.DeferredBiomeDecorator;
import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class ModBiomeDictionary extends BiomeDictionary{
    public enum ModType
    {
        ICE,
        FIRE,
        NIGHTMARE,
        RAINBOW;
    }

    private static final int BIOME_LIST_SIZE = BiomeGenBase.getBiomeGenArray().length;
    private static BiomeInfo[] biomeList = new BiomeInfo[BIOME_LIST_SIZE];
    @SuppressWarnings("unchecked")
    private static ArrayList<BiomeGenBase>[] typeInfoList = new ArrayList[Type.values().length];

    private static class BiomeInfo
    {
        public EnumSet<ModType> typeList;

        public BiomeInfo(ModType[] types)
        {
            typeList = EnumSet.noneOf(ModType.class);
            for(ModType t : types)
            {
                typeList.add(t);
            }
        }
    }

    /**
     * Registers a biome with a specific biome type
     * 
     * @param biome the biome to be registered
     * @param type the type to register the biome as
     * @return returns true if the biome was registered successfully
     */
    public static boolean registerBiomeType(BiomeGenBase biome, ModType ... types)
    {   
        if(BiomeGenBase.getBiomeGenArray()[biome.biomeID] != null)
        {
            for(ModType type : types)
            {
                if(typeInfoList[type.ordinal()] == null)
                {
                    typeInfoList[type.ordinal()] = new ArrayList<BiomeGenBase>();
                }

                typeInfoList[type.ordinal()].add(biome);
            }

            if(biomeList[biome.biomeID] == null)
            {
                biomeList[biome.biomeID] = new BiomeInfo(types);
            }
            else
            {
                for(ModType type : types)
                {
                    biomeList[biome.biomeID].typeList.add(type);
                }
            }

            return true;
        }

        return false;
    }

    /**
     * Returns a list of biomes registered with a specific type
     * 
     * @param type the Type to look for
     * @return a list of biomes of the specified type, null if there are none
     */
    public static MBiomes[] getBiomesForType(ModType type)
    {
        if(typeInfoList[type.ordinal()] != null)
        {
            return (MBiomes[])typeInfoList[type.ordinal()].toArray(new MBiomes[0]);
        }

        return new MBiomes[0];
    }

    /**
     * Gets a list of Types that a specific biome is registered with
     * 
     * @param biome the biome to check
     * @return the list of types, null if there are none
     */
    public static Type[] getTypesForBiome(MBiomes biome)
    {
        checkRegistration(biome);

        if(biomeList[biome.biomeID] != null)
        {
            return (Type[])biomeList[biome.biomeID].typeList.toArray(new Type[0]);
        }

        return new Type[0];
    }

    /**
     * Checks to see if two biomes are registered as having the same type
     * 
     * @param biomeA
     * @param biomeB
     * @return returns true if a common type is found, false otherwise
     */
    public static boolean areBiomesEquivalent(MBiomes biomeA, MBiomes biomeB)
    {
        int a = biomeA.biomeID;
        int b = biomeB.biomeID;

        checkRegistration(biomeA);
        checkRegistration(biomeB);

        if(biomeList[a] != null && biomeList[b] != null)
        {
            for(ModType type : biomeList[a].typeList)
            {
                if(containsType(biomeList[b], type))
                {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Checks to see if the given biome is registered as being a specific type
     * 
     * @param biome the biome to be considered
     * @param type the type to check for
     * @return returns true if the biome is registered as being of type type, false otherwise
     */
    public static boolean isBiomeOfType(BiomeGenBase biome, ModType type)
    {
        checkRegistration(biome);

        if(biomeList[biome.biomeID] != null)
        {
            return containsType(biomeList[biome.biomeID], type);
        }

        return false;
    }

    /**
     * Checks to see if the given biome has been registered as being of any type
     * @param biome the biome to consider
     * @return returns true if the biome has been registered, false otherwise
     */
    public static boolean isBiomeRegistered(MBiomes biome)
    {    
        return biomeList[biome.biomeID] != null;
    }

    public static boolean isBiomeRegistered(int biomeID)
    {
        return biomeList[biomeID] != null;
    }

    public static void registerAllBiomes()
    {
        FMLLog.warning("Redundant call to BiomeDictionary.registerAllBiomes ignored");
    }
    /**
     * Loops through the biome list and automatically adds tags to any biome that does not have any
     * This is called by Forge at postinit time. It will additionally dispatch any deferred decorator
     * creation events.
     * 
     * DO NOT call this during world generation
     */
    public static void registerAllBiomesAndGenerateEvents()
    {
        for(int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++)
        {
            BiomeGenBase biome = BiomeGenBase.getBiomeGenArray()[i];

            if(biome == null)
            {
                continue;
            }

            if (biome.theBiomeDecorator instanceof DeferredBiomeDecorator)
            {
                DeferredBiomeDecorator decorator = (DeferredBiomeDecorator) biome.theBiomeDecorator;
                decorator.fireCreateEventAndReplace(biome);
            }

            checkRegistration(biome);
        }
    }

    /**
     * Automatically looks for and registers a given biome with appropriate tags
     * This method is called automatically if a biome has not been registered with any tags,
     * And another method requests information about it
     * 
     * NOTE: You can opt out of having your biome registered by registering it as type NULL
     * 
     * @param biome the biome to be considered
     */
    public static void makeBestGuess(BiomeGenBase biome)
    {    
        if(biome.theBiomeDecorator.treesPerChunk >= 3)
        {
            if(biome.isHighHumidity() && biome.temperature >= 1.0F)
            {
                ModBiomeDictionary.registerBiomeType(biome, JUNGLE);
            }
            else if(!biome.isHighHumidity())
            {
                ModBiomeDictionary.registerBiomeType(biome, FOREST);
            }
        }
        else if(biome.heightVariation <= 0.3F && biome.heightVariation >= 0.0F)
        {
            if(!biome.isHighHumidity() || biome.rootHeight >= 0.0F)
            {
                ModBiomeDictionary.registerBiomeType(biome, PLAINS);
            }
        }

        if(biome.isHighHumidity() && biome.rootHeight < 0.0F && (biome.heightVariation <= 0.3F && biome.heightVariation >= 0.0F))
        {
            ModBiomeDictionary.registerBiomeType(biome, SWAMP);
        }

        if(biome.rootHeight <= -0.5F)
        {
            ModBiomeDictionary.registerBiomeType(biome, WATER);
        }

        if(biome.heightVariation >= 1.5F)
        {
            ModBiomeDictionary.registerBiomeType(biome, MOUNTAIN);
        }
        
        if(biome.getEnableSnow() || biome.temperature < 0.2F)
        {
            ModBiomeDictionary.registerBiomeType(biome, FROZEN);
        }
        
        if(!biome.isHighHumidity() && biome.temperature >= 1.0F)
        {
            ModBiomeDictionary.registerBiomeType(biome, DESERT);
        }
    }

    //Internal implementation    
    private static void checkRegistration(BiomeGenBase biome)
    {
        if(!isBiomeRegistered(biome))
        {
            makeBestGuess(biome);
        }
    }

    private static boolean containsType(BiomeInfo info, ModType type)
    {
        return info.typeList.contains(type);
    }
}