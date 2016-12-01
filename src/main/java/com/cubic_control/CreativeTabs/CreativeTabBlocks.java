package com.cubic_control.CreativeTabs;

import com.cubic_control.Blocks.MBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks extends CreativeTabs {

	public CreativeTabBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MBlocks.ender_rite_ore);
	}

}
