package com.cubic_control.overload.Armor;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Sapphire_Armor extends ItemArmor{

	public Sapphire_Armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":gems/armor/" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.sapphire_helmet || stack.getItem() == MArmor.sapphire_chestplate || stack.getItem() == MArmor.sapphire_boots){
        	return RefStrings.MODID + ":textures/armor/gems/sapphire_layer_1.png";
        }else if(stack.getItem() == MArmor.sapphire_leggings){
        	return RefStrings.MODID + ":textures/armor/gems/sapphire_layer_2.png";
        }else{
        	return null;
        }
    }
}