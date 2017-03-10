package com.cubic_control.overload.Configuration;

import java.io.File;

import com.cubic_control.overload.Biomes.BiomeIDs;
import com.cubic_control.overload.Dimensions.DimensionIDs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

public class MConfiguration extends Configuration{
	
	private static String PATH;

	public static Configuration config;
	
	public static boolean DropOverride;
	public static boolean TextureOverride;
	public static boolean SpawnEndOres;
	public static boolean EnableHeadlessMount;
	public static boolean canJeffOpenDoors;

	/**
	 * Creates Config file in custom folder in .minecraft folder.
	 */
	public static void createConfig(){
		PATH = "config/cubic_control/overload/";
		File file = new File(PATH + "OverloadConfigurationFile.cfg");
		config = new Configuration(file);
		config.load();
		syncConfig();
	}
	
	public static void syncConfig() {
		addDimensionIDs();
		addBiomeIDs();
		addBooleans();

	    if(config.hasChanged()){
	    	config.save();
	    }
	  }
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(RefStrings.MODID)){
			syncConfig();
		}
	}

	/**
	 * Add Biome IDs to config file.
	 */
	private static void addBiomeIDs() {
		config.getCategory(ConfigTypes.BIOMES);
		BiomeIDs.ICE = config.getInt("Realm_of_Ice", ConfigTypes.BIOMES, 50, 0, 255, "Numerical ID of the Ice Biome.");
		BiomeIDs.IceForest = config.getInt("Forest_of_Ice", ConfigTypes.BIOMES, 51, 0, 255, "Numerical ID of the Ice Forest Biome.");
		BiomeIDs.FIRE = config.getInt("Realm_of_Fire", ConfigTypes.BIOMES, 52, 0, 255, "Numerical ID of the Fire Biome.");
		BiomeIDs.FireForest = config.getInt("Forest_of_Fire", ConfigTypes.BIOMES, 53, 0, 255, "Numerical ID of the Fire Forest Biome.");
		BiomeIDs.NightmarePlains = config.getInt("Nightmare_Plains", ConfigTypes.BIOMES, 54, 0, 255, "Numerical ID of the Nightmare Plains Biome.");
		BiomeIDs.NightmareForest = config.getInt("Nightmare_Forest", ConfigTypes.BIOMES, 55, 0, 255, "Numerical ID of the Nightmare Forest Biome.");
		BiomeIDs.RainbowPlains = config.getInt("Rainbow_Plains", ConfigTypes.BIOMES, 56, 0, 255, "Numerical ID of the Rainbow Plains Biome.");
		BiomeIDs.RainbowForest = config.getInt("Rainbow_Forest", ConfigTypes.BIOMES, 57, 0, 255, "Numerical ID of the Rainbow Forest Biome.");
		BiomeIDs.RainbowDesert = config.getInt("Rainbow_Desert", ConfigTypes.BIOMES, 58, 0, 255, "Numerical ID of the Rainbow Desert Biome.");
		BiomeIDs.RainbowBeach = config.getInt("Rainbow_Beach", ConfigTypes.BIOMES, 59, 0, 255, "Numerical ID of the Rainbow Beach Biome.");
	}

	/**
	 * Add Dimension IDs to config file.
	 */
	private static void addDimensionIDs() {
		config.getCategory(ConfigTypes.DIMENSIONS);
		DimensionIDs.Nightmare_Realm = config.getInt("Nightmare_Realm", ConfigTypes.DIMENSIONS, 35, -100, 100, "Numerical ID of the Nightmare Realm.");
		DimensionIDs.Realm_of_Fire = config.getInt("Realm_of_Fire", ConfigTypes.DIMENSIONS, 36, -100, 100, "Numerical ID of the Fire Realm.");
		DimensionIDs.Realm_of_Ice = config.getInt("Realm_of_Ice", ConfigTypes.DIMENSIONS, 34, -100, 100, "Numerical ID of the Ice Realm.");
		DimensionIDs.Rainbow_Realm = config.getInt("Rainbow_Realm", ConfigTypes.DIMENSIONS, 37, -100, 100, "Numerical ID of the Rainbow Realm.");
	}
	
	/**
	 * Add Booleans to config file.
	 */
	public static void addBooleans(){
		config.getCategory(ConfigTypes.BOOLEANS);
		DropOverride = config.getBoolean("DropOverride", ConfigTypes.BOOLEANS, true, "Enable override of vanila drops.");
		TextureOverride = config.getBoolean("TextureOverride", ConfigTypes.BOOLEANS, true, "Enable override of vanila textures.");
		SpawnEndOres = config.getBoolean("SpawnEndOres", ConfigTypes.BOOLEANS, true, "Enable spawning of End ores.");
		EnableHeadlessMount = config.getBoolean("EnableHeadlessMount", ConfigTypes.BOOLEANS, true, "Enable Horse for Headless Horseman.");
		canJeffOpenDoors = config.getBoolean("canJeffOpenDoors", ConfigTypes.BOOLEANS, true, "Lets Jeff The Killer open your doors!");
	}
	
	public static Configuration getConfig(){
		return config;
	}

}