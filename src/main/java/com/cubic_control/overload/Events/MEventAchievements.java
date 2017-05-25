package com.cubic_control.overload.Events;

import com.cubic_control.overload.Achievements.MAchievements;
import com.cubic_control.overload.Item.MItems;

import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MEventAchievements {
	
	@SubscribeEvent
	public void onEntityItemPickupEvent(EntityItemPickupEvent event) {
		if(event.item.getEntityItem().getItem() == MItems.black_shard || 
				event.item.getEntityItem().getItem() == MItems.blue_shard || 
				event.item.getEntityItem().getItem() == MItems.green_shard || 
				event.item.getEntityItem().getItem() == MItems.red_shard || 
				event.item.getEntityItem().getItem() == MItems.white_shard){
			event.entityPlayer.addStat(MAchievements.achievementColours, 1);
		}
		if(event.item.getEntityItem().getItem() == MItems.Nightmare_Gem){
			event.entityPlayer.addStat(MAchievements.achievementNightmare, 1);
		}
		if(event.item.getEntityItem().getItem() == MItems.rainbow_shard){
			event.entityPlayer.addStat(MAchievements.achievementColorful, 1);
		}
		if(event.item.getEntityItem().getItem() == MItems.light_shard){
			event.entityPlayer.addStat(MAchievements.achievementLight, 1);
		}
	}

}
