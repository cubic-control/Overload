package com.cubic_control.overload.Events;

import com.cubic_control.overload.Armor.Flight_Armor;
import com.cubic_control.overload.Armor.MArmor;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class MEventArmor {
	private static boolean isWearingFlightArmor = true;
	
	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		//Flight Boots
		if(event.entityLiving instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			//if(player.inventory.armorItemInSlot(0).getItem() != null){
				if(!isWearingFlightArmor){
					if(player.inventory.armorItemInSlot(0).getItem() == MArmor.flight_boots){
						this.isWearingFlightArmor = true;
					}else{
						if(player.inventory.armorItemInSlot(0).getItem() != MArmor.flight_boots){
							if(player.capabilities.isFlying && !player.capabilities.isCreativeMode){
								player.capabilities.allowFlying = false;
								player.capabilities.isFlying = false;
								this.isWearingFlightArmor = false;
							}
						}
					}
				}
			//}
		}
	}

}
