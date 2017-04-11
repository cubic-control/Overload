package com.cubic_control.overload.Events;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;

import com.cubic_control.overload.Armor.SuperSlime_Armor;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class MEventSuperSilmeArmor {
	private double howHigh=0.0;
	
	@SubscribeEvent
    public void onLivingFallEvent(LivingFallEvent event) {
		if(event.entityLiving instanceof EntityPlayer) {
			for(int i1 = 0; i1 < 4; i1++) {
				if(((EntityPlayer)event.entityLiving).inventory.armorItemInSlot(i1) != null){
					ItemStack stack = ((EntityPlayer)event.entityLiving).inventory.armorItemInSlot(i1);
					if(stack.getItem() instanceof SuperSlime_Armor){
						event.entityLiving.fallDistance=0.0F;
					}
				}
			}
		}
	}

}
