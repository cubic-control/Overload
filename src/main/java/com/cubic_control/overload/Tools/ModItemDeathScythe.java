package com.cubic_control.overload.Tools;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ModItemDeathScythe extends ModItemScythe{

	public ModItemDeathScythe(ToolMaterial material, String name) {
		super(material, name);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(world != null){
			MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
			if(!world.isRemote){
				world.addWeatherEffect(new EntityLightningBolt(world, mop.blockX, mop.blockY, mop.blockZ));
			}
		}
		
		return stack;
	}

}
