package com.cubic_control.overload.Events;

import net.minecraftforge.common.MinecraftForge;

public class MEventHandler {
	public static void registerEvents(){
		MinecraftForge.EVENT_BUS.register(new MEntityJoinWorldEvent());
	}

}
