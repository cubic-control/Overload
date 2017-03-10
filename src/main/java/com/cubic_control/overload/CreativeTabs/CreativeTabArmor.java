package com.cubic_control.overload.CreativeTabs;

import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArmor extends CreativeTabs {

	public CreativeTabArmor(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MArmor.ender_rite_chestplate;
	}

}
