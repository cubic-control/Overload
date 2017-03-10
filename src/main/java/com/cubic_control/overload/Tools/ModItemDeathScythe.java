package com.cubic_control.overload.Tools;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemDeathScythe extends ModItemScythe{

	public ModItemDeathScythe(ToolMaterial material, String name) {
		super(material, name);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
		if(world != null){
			world.addWeatherEffect(new EntityLightningBolt(world, x, y, z));
			return true;
		}else{
			return false;
		}
	}

}
