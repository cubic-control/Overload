package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.Configuration.MConfiguration;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class VanilaBlockDropChanger {
	
	@SubscribeEvent
	public void onHarvestDropsEvent(HarvestDropsEvent event){
		if(event.harvester != null){
			if(MConfiguration.DropOverride == true){
				if(event.block == Blocks.sandstone){
					event.drops.clear();
					event.drops.add(new ItemStack(MBlocks.sandstone_cobblestone));
				}
			}
		}
	}
}
