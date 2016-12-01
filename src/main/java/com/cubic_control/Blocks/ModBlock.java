package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Food.MFoods;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModBlock extends Block {

	protected ModBlock(Material material, String string, String tool, int a, float b, float c, SoundType soundType) {
		super(material);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(b);
		this.setResistance(c);
		this.setHarvestLevel(tool, a);
		this.setStepSound(soundType);
		this.setBlockName(string);
		this.setBlockTextureName(RefStrings.MODID + ":" + string);
		GameRegistry.registerBlock(this, string);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == MBlocks.marble ? Item.getItemFromBlock(MBlocks.marble_cobblestone) :(  
        		this == MBlocks.granite ? Item.getItemFromBlock(MBlocks.granite_cobblestone) : (
        		this == MBlocks.diorite ? Item.getItemFromBlock(MBlocks.diorite_cobblestone) : (
        		this == MBlocks.andesite ? Item.getItemFromBlock(MBlocks.andesite_cobblestone) : (
        		this == MBlocks.slate ? Item.getItemFromBlock(MBlocks.slate_cobblestone) : (
        		this == MBlocks.basalt ? Item.getItemFromBlock(MBlocks.basalt_cobblestone) : (
        		this == MBlocks.rhyolite ? Item.getItemFromBlock(MBlocks.rhyolite_cobblestone) : (
        		this == MBlocks.dacite ? Item.getItemFromBlock(MBlocks.dacite_cobblestone) : (
        		this == MBlocks.trachyte ? Item.getItemFromBlock(MBlocks.trachyte_cobblestone) : Item.getItemFromBlock(this)))))))));
    }

}
