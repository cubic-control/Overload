package com.cubic_control.Food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModMagicFood extends ItemFood{
	
	private PotionEffect[] effects;

	public ModMagicFood(int p_i45340_1_, boolean DogFood, String name, PotionEffect... effects) {
		super(p_i45340_1_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        
        this.effects = effects;
	}
	
	public ModMagicFood(int p_i45339_1_, float p_i45339_2_, boolean DogFood, String name, PotionEffect... effects){
		super(p_i45339_1_, p_i45339_2_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
        
        this.effects = effects;
	}
	
	public ModMagicFood(int p_i45340_1_, boolean DogFood, String name, String tex, PotionEffect... effects) {
		super(p_i45340_1_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + tex);
        GameRegistry.registerItem(this, name);
        
        this.effects = effects;
	}
	
	public ModMagicFood(int p_i45339_1_, float p_i45339_2_, boolean DogFood, String name, String tex, PotionEffect... effects){
		super(p_i45339_1_, p_i45339_2_, DogFood);
		this.setCreativeTab(MCreativeTabs.tabFood);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + tex);
        GameRegistry.registerItem(this, name);
        
        this.effects = effects;
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
	    super.onFoodEaten(stack, world, player);
	        
	    for (int i = 0; i < effects.length; i ++) {
	        if (!world.isRemote && effects[i] != null && effects[i].getPotionID() > 0)
	            player.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
	    }
	}
	
}