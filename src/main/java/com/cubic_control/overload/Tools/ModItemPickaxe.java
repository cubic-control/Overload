package com.cubic_control.overload.Tools;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;
import com.google.common.collect.Sets;

import cpw.mods.fml.common.registry.GameRegistry;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ModItemPickaxe extends ItemPickaxe
{

	public ModItemPickaxe(ToolMaterial p_i45347_1_, String string, String TexName) {
		super(p_i45347_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemPickaxe(ToolMaterial p_i45347_1_, String string) {
		super(p_i45347_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemPickaxe(ToolMaterial p_i45347_1_, String string, String TexName, ItemStack stack) {
		super(p_i45347_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
        GameRegistry.addRecipe(new ItemStack(this), "XXX", " Y ", " Y ", 'X', stack, 'Y', Items.stick);
	}
	
	public ModItemPickaxe(ToolMaterial p_i45347_1_, String string, ItemStack stack) {
		super(p_i45347_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
        GameRegistry.addRecipe(new ItemStack(this), "XXX", " Y ", " Y ", 'X', stack, 'Y', Items.stick);
	}
	
}