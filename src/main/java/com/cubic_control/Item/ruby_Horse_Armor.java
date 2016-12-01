package com.cubic_control.Item;

import com.cubic_control.Classes.ItemHorseArmor;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ruby_Horse_Armor extends ItemHorseArmor {
	
	public ruby_Horse_Armor(String name){
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabMisc);
		GameRegistry.registerItem(this, name);
	}

	@Override
	public int getArmorValue(EntityHorse horse, ItemStack stack) {
		// TODO Auto-generated method stub
		return 11;
	}

	@Override
	public String getArmorTexture(EntityHorse horse, ItemStack stack) {
		// TODO Auto-generated method stub
		return RefStrings.MODID + ":textures/mobs/horse/armor/horse_armor_ruby.png";
	}

}
