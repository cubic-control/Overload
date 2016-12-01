package com.cubic_control.Mobs;

import com.cubic_control.Food.MFoods;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class ModLivingDropsEvent {
	
    public void onEntityDrop(LivingDropsEvent event) {
    	if(event.entity instanceof EntityUnknown) {
  		  	event.entity.entityDropItem(new ItemStack(Items.dye, 1, 4), 0.0F);
  	  	}
    }
}
