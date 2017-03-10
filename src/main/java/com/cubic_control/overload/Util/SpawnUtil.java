package com.cubic_control.overload.Util;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class SpawnUtil {
	public static boolean isSpaceAvailableForSpawn(World worldObj, EntityLiving entity, EntityCreature asCreature, boolean checkEntityCollisions,
		      boolean canSpawnInLiquid) {
		    int i = MathHelper.floor_double(entity.posX);
		    int j = MathHelper.floor_double(entity.boundingBox.minY);
		    int k = MathHelper.floor_double(entity.posZ);

		    if (asCreature != null && asCreature.getBlockPathWeight(i, j, k) < 0) {
		        return false;
		      }
		    if(checkEntityCollisions && !worldObj.checkNoEntityCollision(entity.boundingBox)) {
		      return false;
		    }
		    if(!worldObj.getCollidingBoundingBoxes(entity, entity.boundingBox).isEmpty()) {
		      return false;
		    }
		    if(!canSpawnInLiquid && worldObj.isAnyLiquid(entity.boundingBox)) {
		      return false;
		    }
		    return true;
		  }
	
	public static boolean isSpaceAvailableForSpawn(World worldObj, EntityCreature entity, boolean checkEntityCollisions) {
	    return isSpaceAvailableForSpawn(worldObj, entity, entity, checkEntityCollisions, false);
	  }

	  public static boolean isSpaceAvailableForSpawn(World worldObj, EntityLiving entity, boolean checkEntityCollisions) {
	    return isSpaceAvailableForSpawn(worldObj, entity, null, checkEntityCollisions, false);
	  }
}
