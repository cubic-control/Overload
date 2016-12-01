package com.cubic_control.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;

public class RegTileEntities {
	public static void RegisterTileEntites(){
		GameRegistry.registerTileEntity(TileEntityLightPyramidEntity.class, "light_pyramid.TileEntity");
	}
}
