package com.cubic_control.Item;

import net.minecraft.item.Item;

import com.cubic_control.Armor.ModArmorMaterial;
import com.cubic_control.Classes.ItemElytra;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

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
