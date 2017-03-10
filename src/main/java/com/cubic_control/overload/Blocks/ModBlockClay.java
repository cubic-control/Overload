package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockClay;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModBlockClay extends BlockClay {
	public static Item Clay;

    public ModBlockClay(Item item, String Name) {
    	this.Clay = item;
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setHardness(0.6f);
		this.setResistance(3f);
		this.setHarvestLevel("shovel", 0);
		this.setStepSound(soundTypeGravel);
		this.setBlockName(Name);
		this.setBlockTextureName(RefStrings.MODID + ":" + Name);
		GameRegistry.registerBlock(this, Name);
    }

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Clay;
    }
    
    @Override
    public int quantityDropped(Random p_149745_1_) {
        return 4;
    }
}
