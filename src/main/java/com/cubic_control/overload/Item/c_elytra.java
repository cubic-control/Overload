package com.cubic_control.overload.Item;

import net.minecraft.item.Item;

import com.cubic_control.overload.Armor.ModArmorMaterial;
import com.cubic_control.overload.Classes.ItemElytra;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class c_elytra extends ItemElytra{

	public c_elytra(Item item, String texture) {
		super(item, ModArmorMaterial.c_armor, texture);
		this.setCreativeTab(MCreativeTabs.tabTransport);
		this.setTextureName(RefStrings.MODID + ":" + texture);
		this.setUnlocalizedName(texture);
		GameRegistry.registerItem(this, texture);
	}

}
