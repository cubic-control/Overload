package com.cubic_control.Tools;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ModItemMachete extends ItemMachete
{

	public ModItemMachete(ToolMaterial p_i45356_1_, String string, String TexName) {
		super(p_i45356_1_);
		this.setCreativeTab(MCreativeTabs.tabWeapons);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemMachete(ToolMaterial p_i45356_1_, String string) {
		super(p_i45356_1_);
		this.setCreativeTab(MCreativeTabs.tabWeapons);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
	}
	
}