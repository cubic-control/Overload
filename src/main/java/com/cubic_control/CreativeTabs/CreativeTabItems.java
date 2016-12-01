package com.cubic_control.CreativeTabs;

import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.Item.MItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs {

	public CreativeTabItems(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MItems.ender_rite_shard;
	}

}
