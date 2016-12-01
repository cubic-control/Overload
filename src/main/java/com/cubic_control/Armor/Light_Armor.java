package com.cubic_control.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class Light_Armor extends ItemArmor{

	public Light_Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.light_helmet || stack.getItem() == MArmor.light_chestplate || stack.getItem() == MArmor.light_boots){
        	return RefStrings.MODID + ":textures/armor/light_layer_1.png";
        }else if(stack.getItem() == MArmor.light_leggings){
        	return RefStrings.MODID + ":textures/armor/light_layer_2.png";
        }else{
        	return null;
        }
    }
}