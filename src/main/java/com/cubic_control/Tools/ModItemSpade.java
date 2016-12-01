package com.cubic_control.Tools;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;

public class ModItemSpade extends ItemSpade
{

	public ModItemSpade(ToolMaterial p_i45353_1_, String string, String TexName) {
		super(p_i45353_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemSpade(ToolMaterial p_i45353_1_, String string) {
		super(p_i45353_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
	}
	
}