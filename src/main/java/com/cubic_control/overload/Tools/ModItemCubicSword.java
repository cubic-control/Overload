package com.cubic_control.overload.Tools;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ModItemCubicSword extends ModItemSword {

	public ModItemCubicSword(ToolMaterial p_i45356_1_, String string) {
		super(p_i45356_1_, string);
		this.isDamageable();
	}
	
	public ModItemCubicSword(ToolMaterial p_i45356_1_, String string, String TexName) {
		super(p_i45356_1_, string, TexName);
		this.isDamageable();
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(stack.getItemDamage() == 0){
			if(world != null){
				MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
				if(!world.isRemote){
					world.addWeatherEffect(new EntityLightningBolt(world, mop.blockX, mop.blockY, mop.blockZ));
					stack.damageItem(10, player);
				}
			}
		}
		
		return stack;
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if(stack.getItemDamage() < stack.getMaxDamage()){
			stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}

}