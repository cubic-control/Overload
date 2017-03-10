package com.cubic_control.overload.Dimensions;

import net.minecraft.world.WorldProviderSurface;
import net.minecraftforge.common.DimensionManager;

public class Dimension {
	public static void mainRegistry(){
		registerDimensions();
		registerWorldProvider();
	}
	
	/**
	 * Register dimensions.
	 * @param register
	 */
	public static void registerDimensions(){
		DimensionManager.registerDimension(DimensionIDs.Realm_of_Ice, DimensionIDs.Realm_of_Ice);
		DimensionManager.registerDimension(DimensionIDs.Realm_of_Fire, DimensionIDs.Realm_of_Fire);
		DimensionManager.registerDimension(DimensionIDs.Nightmare_Realm, DimensionIDs.Nightmare_Realm);
		DimensionManager.registerDimension(DimensionIDs.Rainbow_Realm, DimensionIDs.Rainbow_Realm);
	}
	
	/**
	 * Regster dimension world providers with the dimension manager.
	 */
	public static void registerWorldProvider(){
		DimensionManager.registerProviderType(DimensionIDs.Realm_of_Ice, WorldProviderIce.class, true);
		DimensionManager.registerProviderType(DimensionIDs.Realm_of_Fire, WorldProviderFire.class, true);
		DimensionManager.registerProviderType(DimensionIDs.Nightmare_Realm, WorldProviderNightmare.class, true);
		DimensionManager.registerProviderType(DimensionIDs.Rainbow_Realm, WorldProviderRainbow.class, true);
	}
}