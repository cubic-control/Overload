package com.cubic_control.overload.Tools;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class MTools {
	public static void mainRegistry(){
		InitializeTool();
	}

	/*Stone Tools*/
		//Ice
	public static ModItemSword ice_stone_sword;
	public static ModItemAxe ice_stone_axe;
	public static ModItemHoe ice_stone_hoe;
	public static ModItemPickaxe ice_stone_pickaxe;
	public static ModItemSpade ice_stone_spade;
	public static ModItemMachete ice_stone_machete;
		//Fire
	public static ModItemSword fire_stone_sword;
	public static ModItemAxe fire_stone_axe;
	public static ModItemHoe fire_stone_hoe;
	public static ModItemPickaxe fire_stone_pickaxe;
	public static ModItemSpade fire_stone_spade;
	public static ModItemMachete fire_stone_machete;
		//Nightmare
		//Sandstone
	public static ModItemSword sandstone_sword;
	public static ModItemAxe sandstone_axe;
	public static ModItemHoe sandstone_hoe;
	public static ModItemPickaxe sandstone_pickaxe;
	public static ModItemSpade sandstone_spade;
	public static ModItemMachete sandstone_machete;
		//Marble
	public static ModItemSword marble_sword;
	public static ModItemAxe marble_axe;
	public static ModItemHoe marble_hoe;
	public static ModItemPickaxe marble_pickaxe;
	public static ModItemSpade marble_spade;
	public static ModItemMachete marble_machete;
		//Granite
		//Diorite
		//Andesite
		//Slate
	public static ModItemSword slate_sword;
	public static ModItemAxe slate_axe;
	public static ModItemHoe slate_hoe;
	public static ModItemPickaxe slate_pickaxe;
	public static ModItemSpade slate_spade;
	public static ModItemMachete slate_machete;
		//Stone
	public static ModItemMachete stone_machete;
		//Red Sandstone
	public static ModItemSword red_sandstone_sword;
	public static ModItemAxe red_sandstone_axe;
	public static ModItemHoe red_sandstone_hoe;
	public static ModItemPickaxe red_sandstone_pickaxe;
	public static ModItemSpade red_sandstone_spade;
	public static ModItemMachete red_sandstone_machete;
		//Basalt
		//Rhyolite
	public static ModItemSword rhyolite_sword;
	public static ModItemAxe rhyolite_axe;
	public static ModItemHoe rhyolite_hoe;
	public static ModItemPickaxe rhyolite_pickaxe;
	public static ModItemSpade rhyolite_spade;
	public static ModItemMachete rhyolite_machete;
		//Dacite
		//Trachyte
	public static ModItemSword trachyte_sword;
	public static ModItemAxe trachyte_axe;
	public static ModItemHoe trachyte_hoe;
	public static ModItemPickaxe trachyte_pickaxe;
	public static ModItemSpade trachyte_spade;
	public static ModItemMachete trachyte_machete;
	/*Miscellaneous Tools*/
	public static Item jeff_knife;
	public static Item NightAxe;
	public static Item scythe;
	public static Item StalkingSpear;
	public static Item d_scythe;
	public static Item cubic_sword;
	public static Item DayAxe;
	
	public static void InitializeTool() {
		//Stone Tools
			//Ice
		ice_stone_sword = new ModItemSword(ModToolMaterial.ice_stone_tools, "ice_stone_sword");
		ice_stone_axe = new ModItemAxe(ModToolMaterial.ice_stone_tools, "ice_stone_axe");
		ice_stone_hoe = new ModItemHoe(ModToolMaterial.ice_stone_tools, "ice_stone_hoe");
		ice_stone_pickaxe = new ModItemPickaxe(ModToolMaterial.ice_stone_tools, "ice_stone_pickaxe");
		ice_stone_spade = new ModItemSpade(ModToolMaterial.ice_stone_tools, "ice_stone_spade");
		ice_stone_machete = new ModItemMachete(ModToolMaterial.ice_stone_tools, "ice_stone_machete");
			//Fire
		fire_stone_sword = new ModItemSword(ModToolMaterial.fire_stone_tools, "fire_stone_sword");
		fire_stone_axe = new ModItemAxe(ModToolMaterial.fire_stone_tools, "fire_stone_axe");
		fire_stone_hoe = new ModItemHoe(ModToolMaterial.fire_stone_tools, "fire_stone_hoe");
		fire_stone_pickaxe = new ModItemPickaxe(ModToolMaterial.fire_stone_tools, "fire_stone_pickaxe");
		fire_stone_spade = new ModItemSpade(ModToolMaterial.fire_stone_tools, "fire_stone_spade");
		fire_stone_machete = new ModItemMachete(ModToolMaterial.fire_stone_tools, "fire_stone_machete");
			//Nightmare
			//Sandstone
		sandstone_sword = new ModItemSword(ModToolMaterial.sandstone_tools, "sandstone_sword");
		sandstone_axe = new ModItemAxe(ModToolMaterial.sandstone_tools, "sandstone_axe");
		sandstone_hoe = new ModItemHoe(ModToolMaterial.sandstone_tools, "sandstone_hoe");
		sandstone_pickaxe = new ModItemPickaxe(ModToolMaterial.sandstone_tools, "sandstone_pickaxe");
		sandstone_spade = new ModItemSpade(ModToolMaterial.sandstone_tools, "sandstone_spade");
		sandstone_machete = new ModItemMachete(ModToolMaterial.sandstone_tools, "sandstone_machete");
			//Marble
		marble_sword = new ModItemSword(ModToolMaterial.marble_tools, "marble_sword");
		marble_axe = new ModItemAxe(ModToolMaterial.marble_tools, "marble_axe");
		marble_hoe = new ModItemHoe(ModToolMaterial.marble_tools, "marble_hoe");
		marble_pickaxe = new ModItemPickaxe(ModToolMaterial.marble_tools, "marble_pickaxe");
		marble_spade = new ModItemSpade(ModToolMaterial.marble_tools, "marble_spade");
		marble_machete = new ModItemMachete(ModToolMaterial.marble_tools, "marble_machete");
			//Granite
			//Diorite
			//Andesite
			//Slate
		slate_sword = new ModItemSword(ModToolMaterial.slate_tools, "slate_sword");
		slate_axe = new ModItemAxe(ModToolMaterial.slate_tools, "slate_axe");
		slate_hoe = new ModItemHoe(ModToolMaterial.slate_tools, "slate_hoe");
		slate_pickaxe = new ModItemPickaxe(ModToolMaterial.slate_tools, "slate_pickaxe");
		slate_spade = new ModItemSpade(ModToolMaterial.slate_tools, "slate_spade");
		slate_machete = new ModItemMachete(ModToolMaterial.slate_tools, "slate_machete");
			//Stone
		stone_machete = new ModItemMachete(ToolMaterial.STONE, "stone_machete");
			//Red Sandstone
		red_sandstone_sword = new ModItemSword(ModToolMaterial.red_sandstone_tools, "red_sandstone_sword");
		red_sandstone_axe = new ModItemAxe(ModToolMaterial.red_sandstone_tools, "red_sandstone_axe");
		red_sandstone_hoe = new ModItemHoe(ModToolMaterial.red_sandstone_tools, "red_sandstone_hoe");
		red_sandstone_pickaxe = new ModItemPickaxe(ModToolMaterial.red_sandstone_tools, "red_sandstone_pickaxe");
		red_sandstone_spade = new ModItemSpade(ModToolMaterial.red_sandstone_tools, "red_sandstone_spade");
		red_sandstone_machete = new ModItemMachete(ModToolMaterial.red_sandstone_tools, "red_sandstone_machete");
			//Basalt
			//Rhyolite
		rhyolite_sword = new ModItemSword(ModToolMaterial.rhyolite_tools, "rhyolite_sword");
		rhyolite_axe = new ModItemAxe(ModToolMaterial.rhyolite_tools, "rhyolite_axe");
		rhyolite_hoe = new ModItemHoe(ModToolMaterial.rhyolite_tools, "rhyolite_hoe");
		rhyolite_pickaxe = new ModItemPickaxe(ModToolMaterial.rhyolite_tools, "rhyolite_pickaxe");
		rhyolite_spade = new ModItemSpade(ModToolMaterial.rhyolite_tools, "rhyolite_spade");
		rhyolite_machete = new ModItemMachete(ModToolMaterial.rhyolite_tools, "rhyolite_machete");
			//Dacite
			//Trachyte
		trachyte_sword = new ModItemSword(ModToolMaterial.trachyte_tools, "trachyte_sword");
		trachyte_axe = new ModItemAxe(ModToolMaterial.trachyte_tools, "trachyte_axe");
		trachyte_hoe = new ModItemHoe(ModToolMaterial.trachyte_tools, "trachyte_hoe");
		trachyte_pickaxe = new ModItemPickaxe(ModToolMaterial.trachyte_tools, "trachyte_pickaxe");
		trachyte_spade = new ModItemSpade(ModToolMaterial.trachyte_tools, "trachyte_spade");
		trachyte_machete = new ModItemMachete(ModToolMaterial.trachyte_tools, "trachyte_machete");
		/*Miscellaneous Tools*/
		jeff_knife = new ModItemSword(ModToolMaterial.jeff_knifeTool, "jeff_knife").setCreativeTab(null);
		NightAxe = new ModItemTimeAxe(ToolMaterial.EMERALD, "NightAxe", 13000);
		scythe = new ModItemScythe(ToolMaterial.WOOD, "scythe");
		StalkingSpear = new ModItemSword(ToolMaterial.EMERALD, "StalkingSpear");
		d_scythe = new ModItemDeathScythe(ModToolMaterial.d_ToolMaterial, "d_scythe");
		cubic_sword = new ModItemCubicSword(ModToolMaterial.cubic_tools, "cubic_sword");
		DayAxe = new ModItemTimeAxe(ToolMaterial.EMERALD, "DayAxe", 1000);
	}
}
