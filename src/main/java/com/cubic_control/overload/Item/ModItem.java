package com.cubic_control.overload.Item;

import com.cubic_control.overload.Achievements.MAchievements;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItem extends Item{
	public ModItem(String name, String TextureName){
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabItems);
		this.setTextureName(RefStrings.MODID + ":" + TextureName);
		GameRegistry.registerItem(this, name);
	}
	
	public ModItem(String name){
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabItems);
		this.setTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
	}

}
