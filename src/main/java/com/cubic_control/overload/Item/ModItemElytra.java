package com.cubic_control.overload.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.cubic_control.overload.Classes.ItemElytra;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItemElytra extends ItemElytra{
	
	public ModItemElytra(Item item, ArmorMaterial armor, String name, String TextureName){
		super(item, armor, name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabTransport);
		this.setTextureName(RefStrings.MODID + ":" + TextureName);
		GameRegistry.registerItem(this, name);
	}
	
	public ModItemElytra(Item item, ArmorMaterial armor, String name){
		super(item, armor, name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabTransport);
		this.setTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
	}

}
