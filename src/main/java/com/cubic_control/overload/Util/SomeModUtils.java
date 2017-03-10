package com.cubic_control.overload.Util;

import net.minecraft.world.World;

import com.cubic_control.overload.Dimensions.DimensionIDs;

public class SomeModUtils {
	
	public static boolean isValidDimension(World world){
    	if(world.provider.dimensionId == 0){
    		return true;
    	}else if(world.provider.dimensionId == DimensionIDs.Realm_of_Ice){
    		return true;
    	}else if(world.provider.dimensionId == DimensionIDs.Realm_of_Fire){
    		return true;
    	}else if(world.provider.dimensionId == DimensionIDs.Nightmare_Realm){
    		return true;
    	}else if(world.provider.dimensionId == DimensionIDs.Rainbow_Realm){
    		return true;
    	}else{
    		return false;
    	}
    }

}
