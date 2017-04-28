package com.cubic_control.overload.Armor;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class SuperSlime_Armor extends ItemArmor{
	private boolean bounce=false;
	private double howHigh=0.0;

	public SuperSlime_Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if(stack.getItem() == MArmor.super_slime_helmet || stack.getItem() == MArmor.super_slime_chestplate || stack.getItem() == MArmor.super_slime_boots){
        	return RefStrings.MODID + ":textures/armor/gems/super_slime_layer_1.png";
        }else if(stack.getItem() == MArmor.super_slime_leggings){
        	return RefStrings.MODID + ":textures/armor/gems/super_slime_layer_2.png";
        }else{
        	return null;
        }
    }
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		Item itemHelmet = player.getEquipmentInSlot(4).getItem();
		Item itemChestplate = player.getEquipmentInSlot(3).getItem();
		Item itemLeggings = player.getEquipmentInSlot(2).getItem();
		Item itemBoots = player.getEquipmentInSlot(1).getItem();
		
		if(itemBoots == MArmor.super_slime_boots){
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 3, 20, true));
		}
		if(itemLeggings == MArmor.super_slime_leggings){
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 3, 35, true));
		}
		if(itemChestplate == MArmor.super_slime_chestplate){
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 3, 40, true));
		}
		if(itemHelmet == MArmor.super_slime_helmet){
			player.addPotionEffect(new PotionEffect(Potion.jump.id, 3, 25, true));
		}
    }
}