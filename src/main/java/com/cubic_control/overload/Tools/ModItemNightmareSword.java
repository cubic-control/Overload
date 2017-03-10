package com.cubic_control.overload.Tools;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;
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
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ModItemNightmareSword extends ItemSword
{

	public ModItemNightmareSword(ToolMaterial p_i45356_1_, String string, String texture) {
		super(p_i45356_1_);
		this.setCreativeTab(MCreativeTabs.tabWeapons);
        this.setUnlocalizedName(string);
        this.setTextureName(RefStrings.MODID + ":nightmare/" + texture);
        GameRegistry.registerItem(this, string);
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
    {
		par2EntityLivingBase.setFire(4);
        par1ItemStack.damageItem(1, par3EntityLivingBase);
        return true;
    }
	
}