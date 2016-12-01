package com.cubic_control.Armor;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Tanzanite_Armor extends ItemArmor{

	public Tanzanite_Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":gems/armor/" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.tanzanite_helmet || stack.getItem() == MArmor.tanzanite_chestplate || stack.getItem() == MArmor.tanzanite_boots){
        	return RefStrings.MODID + ":textures/armor/gems/tanzanite_layer_1.png";
        }else if(stack.getItem() == MArmor.tanzanite_leggings){
        	return RefStrings.MODID + ":textures/armor/gems/tanzanite_layer_2.png";
        }else{
        	return null;
        }
    }
}