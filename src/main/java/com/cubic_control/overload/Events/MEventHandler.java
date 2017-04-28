package com.cubic_control.overload.Events;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;

public class MEventHandler {
	public static void registerEvents(){
		FMLCommonHandler.instance().bus().register(new MEventWelcomeMessage());
		FMLCommonHandler.instance().bus().register(new MEventUpdateChecker());
		MinecraftForge.EVENT_BUS.register(new MEventArmor());
	}

}
