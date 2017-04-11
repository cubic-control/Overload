package com.cubic_control.overload.Armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.cubic_control.cubic_core.Utils.CubicUtils;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class LightArmor extends ItemArmor{

	public LightArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.light_helmet || stack.getItem() == MArmor.light_chestplate || stack.getItem() == MArmor.light_boots){
        	return RefStrings.MODID + ":textures/armor/light_layer_1.png";
        }else if(stack.getItem() == MArmor.light_leggings){
        	return RefStrings.MODID + ":textures/armor/light_layer_2.png";
        }else{
        	return null;
        }
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		if(itemStack.getItem() instanceof LightArmor){
			if(world.isRemote){
				CubicUtils.addLightToEntity(world, player);
			}
		}
		if(itemStack.getItem() == MArmor.light_boots){
			player.fallDistance = 0.0F;
		}
	}
	
	
}