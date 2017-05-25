package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VanilaBlockTextureChanger {
	
	public static void start(){
		if(MConfiguration.TextureOverride){
			//Blocks.sandstone.setBlockTextureName(RefStrings.MODID + ":" + "sandstone");
		}
	}
}
