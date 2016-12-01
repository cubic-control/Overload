package com.cubic_control.Armor;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DeathArmor extends ItemArmor{

	public DeathArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.death_helmet || stack.getItem() == MArmor.death_chestplate || stack.getItem() == MArmor.death_boots){
        	return RefStrings.MODID + ":textures/armor/d_layer_1.png";
        }else if(stack.getItem() == MArmor.death_leggings){
        	return RefStrings.MODID + ":textures/armor/d_layer_2.png";
        }else{
        	return null;
        }
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		if(itemStack.getItem() == MArmor.death_helmet){
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 3, 0, true));
		}else if(itemStack.getItem() == MArmor.death_chestplate){
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3, 1, true));
		}else if(itemStack.getItem() == MArmor.death_leggings){
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 3, 0, true));
		}else if(itemStack.getItem() == MArmor.death_boots){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 3, 2, true));
		}
	}
}