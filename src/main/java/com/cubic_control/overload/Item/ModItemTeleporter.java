package com.cubic_control.overload.Item;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ModItemTeleporter extends ModItem{

	public ModItemTeleporter(String name) {
		super(name);
		this.setMaxDamage(200);
		this.isDamageable();
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if(stack.getItemDamage() == 0){
			if(world != null){
				MovingObjectPosition mop = Minecraft.getMinecraft().renderViewEntity.rayTrace(200, 1.0F);
				if(!world.isRemote){
					player.setPositionAndUpdate(mop.blockX, mop.blockY+1, mop.blockZ);
					stack.damageItem(199, player);
				}
			}
		}
		
		return stack;
	}
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if(stack.getItemDamage() == 0){
			if(entity instanceof EntityLivingBase){
				if(!entity.worldObj.isRemote){
					int i = itemRand.nextInt(50);
					((EntityLivingBase)entity).setPositionAndUpdate(entity.posX+i, entity.posY+i, entity.posZ+i);
					stack.damageItem(199, player);
				}
			}
		}
		return super.onLeftClickEntity(stack, player, entity);
	}
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if(stack.getItemDamage() < stack.getMaxDamage()){
			stack.setItemDamage(stack.getItemDamage() - 1);
		}
	}

}