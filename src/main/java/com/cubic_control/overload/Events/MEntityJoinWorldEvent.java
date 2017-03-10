package com.cubic_control.overload.Events;

import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class MEntityJoinWorldEvent {
	
	@SubscribeEvent
    public void onEntityJoinWorldEvent(EntityJoinWorldEvent event) {
		Entity entity = event.entity;
		Minecraft mc = Minecraft.getMinecraft();
		
		if(entity instanceof EntityPlayer){
			System.out.println(RefStrings.MODID + ":[TESTING]: player has joined world.");
		}
	}

}
