package com.cubic_control.overload.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegTileEntities {
	public static void RegisterTileEntites(){
		GameRegistry.registerTileEntity(TileEntityLightPyramidEntity.class, "light_pyramid.TileEntity");
		GameRegistry.registerTileEntity(TileEntityDuplicator.class, "duplicator.TileEntity");
		GameRegistry.registerTileEntity(TileEntityFurnaceFire.class, "fire_furnace.TileEntity");
		GameRegistry.registerTileEntity(TileEntityFurnaceIce.class, "ice_furnace.TileEntity");
	}
}
