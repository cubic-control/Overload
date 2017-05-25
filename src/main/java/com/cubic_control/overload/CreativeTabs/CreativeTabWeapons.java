package com.cubic_control.overload.CreativeTabs;

import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabWeapons extends CreativeTabs {

	public CreativeTabWeapons(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return MTools.ender_rite_machete;
	}

}
