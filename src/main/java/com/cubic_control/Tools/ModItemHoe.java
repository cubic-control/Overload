package com.cubic_control.Tools;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class ModItemHoe extends ItemHoe
{

	public ModItemHoe(ToolMaterial p_i45343_1_, String string, String TexName) {
		super(p_i45343_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + TexName);
        GameRegistry.registerItem(this, string);
	}
	
	public ModItemHoe(ToolMaterial p_i45343_1_, String string) {
		super(p_i45343_1_);
		this.setCreativeTab(MCreativeTabs.tabTools);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":" + string);
        GameRegistry.registerItem(this, string);
	}
	
}