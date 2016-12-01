package com.cubic_control.Armor;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class Flight_Armor extends ItemArmor{

	public Flight_Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.flight_boots){
        	return RefStrings.MODID + ":textures/armor/flight_boots.png";
        }else{
        	return null;
        }
    }
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
		if(player.inventory.armorItemInSlot(0).getItem() == MArmor.flight_boots){
			if(player.capabilities.allowFlying == false && player.capabilities.isCreativeMode == false){
	            player.capabilities.allowFlying=true;
	            player.fallDistance = 0.0f;
	        }
		}
		
		if(player.inventory.armorItemInSlot(0) == null || !player.getCurrentArmor(0).getItem().equals(MArmor.flight_boots)){
			if(player.capabilities.isFlying == true && player.capabilities.isCreativeMode == false){
	            player.capabilities.allowFlying=false;
	        }
		}
    }
}