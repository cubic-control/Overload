package com.cubic_control.Configuration;

import java.io.File;

import com.cubic_control.Biomes.BiomeIDs;
import com.cubic_control.Dimensions.DimensionIDs;
import com.cubic_control.lib.RefStrings;

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
	public static boolean useOldTextures;

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
		BiomeIDs.ICE = config.getInt("Realm_of_Ice", ConfigTypes.BIOMES, 50, 0, 255, "Numerical ID of the Ice Biome.");
		BiomeIDs.IceForest = config.getInt("Forest_of_Ice", ConfigTypes.BIOMES, 51, 0, 255, "Numerical ID of the Ice Forest Biome.");
		BiomeIDs.FIRE = config.getInt("Realm_of_Fire", ConfigTypes.BIOMES, 52, 0, 255, "Numerical ID of the Fire Biome.");
		BiomeIDs.FireForest = config.getInt("Forest_of_Fire", ConfigTypes.BIOMES, 53, 0, 255, "Numerical ID of the Fire Forest Biome.");
		BiomeIDs.NightmarePlains = config.getInt("Nightmare_Plains", ConfigTypes.BIOMES, 54, 0, 255, "Numerical ID of the Nightmare Plains Biome.");
		BiomeIDs.NightmareForest = config.getInt("Nightmare_Forest", ConfigTypes.BIOMES, 55, 0, 255, "Numerical ID of the Nightmare Forest Biome.");
	}

	/**
	 * Add Dimension IDs to config file.
	 */
	private static void addDimensionIDs() {
		DimensionIDs.Nightmare_Realm = config.getInt("Nightmare_Realm", ConfigTypes.DIMENSIONS, 35, -100, 100, "Numerical ID of the Nightmare Realm.");
		DimensionIDs.Realm_of_Fire = config.getInt("Realm_of_Fire", ConfigTypes.DIMENSIONS, 36, -100, 100, "Numerical ID of the Fire Realm.");
		DimensionIDs.Realm_of_Ice = config.getInt("Realm_of_Ice", ConfigTypes.DIMENSIONS, 34, -100, 100, "Numerical ID of the Ice Realm.");
	}
	
	/**
	 * Add Booleans to config file.
	 */
	public static void addBooleans(){
		DropOverride = config.getBoolean("DropOverride", ConfigTypes.BOOLEANS, true, "Enable override of vanila drops.");
		TextureOverride = config.getBoolean("TextureOverride", ConfigTypes.BOOLEANS, true, "Enable override of vanila textures.");
		SpawnEndOres = config.getBoolean("SpawnEndOres", ConfigTypes.BOOLEANS, true, "Enable spawning of End ores.");
		EnableHeadlessMount = config.getBoolean("EnableHeadlessMount", ConfigTypes.BOOLEANS, true, "Enable Horse for Headless Horseman.");
		useOldTextures = config.getBoolean("useOldTextures", ConfigTypes.BOOLEANS, false, "Enable OLD overload textures. Requires Restart!");
	}
	
	public static Configuration getConfig(){
		return config;
	}

}