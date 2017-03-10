package com.cubic_control.overload.CreativeTabs;

import com.cubic_control.overload.Main.MainRegistry;

import net.minecraft.creativetab.CreativeTabs;

public class MCreativeTabs {
	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabItems;
	public static CreativeTabs tabTech;
	public static CreativeTabs tabTransport;
	public static CreativeTabs tabMisc;
	public static CreativeTabs tabTools;
	public static CreativeTabs tabWeapons;
	public static CreativeTabs tabFood;
	public static CreativeTabs tabArmor;
	public static void initialiseTabs(){
		tabBlocks = new CreativeTabBlocks("tabBlocks");
		tabItems = new CreativeTabItems("tabItems");
		tabTech = new CreativeTabTech("tabTech");
		tabTransport = new CreativeTabTransport("tabTransport");
		tabMisc = new CreativeTabMisc("tabMisc");
		tabFood = new CreativeTabFood("tabFood");
		tabTools = new CreativeTabTools("tabTools");
		tabWeapons = new CreativeTabWeapons("tabWeapons");
		tabArmor = new CreativeTabArmor("tabArmor");
	}
}
