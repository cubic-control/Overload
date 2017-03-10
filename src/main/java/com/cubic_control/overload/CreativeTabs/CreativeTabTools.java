package com.cubic_control.overload.CreativeTabs;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTools extends CreativeTabs {

	public CreativeTabTools(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.FlintAndIce;
	}

}
