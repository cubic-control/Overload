package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.Classes.BlockBluestoneOre;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class lit_bluestone_ore extends BlockBluestoneOre {

	protected lit_bluestone_ore(Material p_i45394_1_, String name, String string) {
		super(true);
		this.setBlockTextureName(RefStrings.MODID + ":" + string);
		this.setBlockName(name);
		this.setHardness(3f);
		this.setResistance(15f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(0.9f);
		GameRegistry.registerBlock(this, name);
	}
	//If the block's drop is an item.
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return MItems.bluestone;
    }
}
