package com.cubic_control.Item;

import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemRepeater extends Item
{
    private static final String __OBFID = "CL_00000058";

    public ItemRepeater(String name)
    {
        this.setCreativeTab(MCreativeTabs.tabTech);
        this.setUnlocalizedName(name);
        this.setTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par3World.getBlock(par4, par5, par6) != Blocks.snow_layer)
        {
            if (par7 == 0)
            {
                --par5;
            }

            if (par7 == 1)
            {
                ++par5;
            }

            if (par7 == 2)
            {
                --par6;
            }

            if (par7 == 3)
            {
                ++par6;
            }

            if (par7 == 4)
            {
                --par4;
            }

            if (par7 == 5)
            {
                ++par4;
            }

            if (!par3World.isAirBlock(par4, par5, par6))
            {
                return false;
            }
        }

        if (!par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            return false;
        }
        else
        {
            if (MBlocks.unpowered_repeater.canPlaceBlockAt(par3World, par4, par5, par6))
            {
                --par1ItemStack.stackSize;
                par3World.setBlock(par4, par5, par6, MBlocks.unpowered_repeater);
            }

            return true;
        }
    }
}