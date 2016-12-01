package com.cubic_control.Food;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ModFood extends ItemFood{

	public ModFood(int p_i45340_1_, boolean DogFood, String name) {
		super(p_i45340_1_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
	}
	
	public ModFood(int p_i45339_1_, float p_i45339_2_, boolean DogFood, String name){
		super(p_i45339_1_, p_i45339_2_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
	}
	
}