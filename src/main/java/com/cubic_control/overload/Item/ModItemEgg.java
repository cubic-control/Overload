package com.cubic_control.overload.Item;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemEgg extends ItemEgg{
	
	public ModItemEgg(String name){
		this.setTextureName(RefStrings.MODID + ":" + name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabItems);
		GameRegistry.registerItem(this, name);
	}
	
	public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par3.capabilities.isCreativeMode)
        {
            --par1.stackSize;
        }

        par2.playSoundAtEntity(par3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2.isRemote)
        {
            par2.spawnEntityInWorld(new ModEntityEgg(par2, par3));
        }

        return par1;
    }
}
