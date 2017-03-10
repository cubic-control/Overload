package com.cubic_control.overload.Tools;

import net.minecraft.item.Item.ToolMaterial;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItemScythe extends ItemScythe{

	public ModItemScythe(ToolMaterial p_i45353_1_, String string, String TexName) {
		super(p_i45353_1_);
		this.setCreativeTab(MCreativeTabs.tabWeapons);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemScythe(ToolMaterial p_i45353_1_, String string) {
		super(p_i45353_1_);
		this.setCreativeTab(MCreativeTabs.tabWeapons);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
	}

}
