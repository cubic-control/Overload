package com.cubic_control.overload.Events;

import com.cubic_control.overload.Potions.MPotions;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class MEventPotions {
	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent event){
		//FrostBite
		if(event.entityLiving.isPotionActive(MPotions.frostbite)){
			int i = event.entityLiving.getActivePotionEffect(MPotions.frostbite).getAmplifier();
			if(event.entityLiving.worldObj.rand.nextInt(100 / (i+1)) == 0){
				event.entityLiving.attackEntityFrom(DamageSource.generic, 1);
			}
			if(event.entityLiving.getActivePotionEffect(MPotions.frostbite).getDuration()<=0){
				event.entityLiving.removePotionEffect(MPotions.frostbite.getId());
			}
		}
	}

}
