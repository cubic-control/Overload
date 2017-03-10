package com.cubic_control.overload.Armor;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class rainbow_diamond_armor extends ItemArmor{

	public rainbow_diamond_armor(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_, String name) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setUnlocalizedName(name);
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabArmor);
		GameRegistry.registerItem(this, name);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == MArmor.rainbow_diamond_helmet || stack.getItem() == MArmor.rainbow_diamond_chestplate || stack.getItem() == MArmor.rainbow_diamond_boots){
        	return RefStrings.MODID + ":textures/armor/rainbow_diamond_layer_1.png";
        }else if(stack.getItem() == MArmor.rainbow_diamond_leggings){
        	return RefStrings.MODID + ":textures/armor/rainbow_diamond_layer_2.png";
        }else{
        	return null;
        }
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		super.onArmorTick(world, player, itemStack);
		if(itemStack.getItem() == MArmor.rainbow_diamond_helmet){
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 3, 3, true));
		}else if(itemStack.getItem() == MArmor.rainbow_diamond_chestplate || itemStack.getItem() == MArmor.rainbow_diamond_leggings){
			player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3, 3, true));
		}else if(itemStack.getItem() == MArmor.rainbow_diamond_boots){
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 3, 1, true));
		}
	}
}
