package com.cubic_control.overload.Tools;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;

public class MTools {
	public static void mainRegistry(){
		InitializeTool();
	}

	/**Nightmare**/
		//Nightmare Swords
	public static Item black_nightmare_sword;
	public static Item blue_nightmare_sword;
	public static Item cyan_nightmare_sword;
	public static Item diamond_nightmare_sword;
	public static Item gold_nightmare_sword;
	public static Item green_nightmare_sword;
	public static Item iron_nightmare_sword;
	public static Item lime_nightmare_sword;
	public static Item magenta_nightmare_sword;
	public static Item orange_nightmare_sword;
	public static Item pink_nightmare_sword;
	public static Item purple_nightmare_sword;
	public static Item red_nightmare_sword;
	public static Item stone_nightmare_sword;
	public static Item white_nightmare_sword;
	public static Item wooden_nightmare_sword;
	public static Item yellow_nightmare_sword;
	public static Item ender_rite_nightmare_sword;
			//Gems
	public static Item aventurine_nightmare_sword;
	public static Item amethyst_nightmare_sword;
	public static Item beryl_nightmare_sword;
	public static Item carnelian_nightmare_sword;
	public static Item jade_nightmare_sword;
	public static Item jasper_nightmare_sword;
	/**Normal**/
	public static Item ender_rite_pickaxe;
	public static Item ender_rite_axe;
	public static Item ender_rite_spade;
	public static Item ender_rite_sword;
	public static Item ender_rite_hoe;
	public static Item ender_rite_machete;
	//Gem Tools
	public static Item aventurine_pickaxe;
	public static Item aventurine_axe;
	public static Item aventurine_spade;
	public static Item aventurine_sword;
	public static Item aventurine_hoe;
	public static Item aventurine_machete;
	public static Item amethyst_pickaxe;
	public static Item amethyst_axe;
	public static Item amethyst_spade;
	public static Item amethyst_sword;
	public static Item amethyst_hoe;
	public static Item amethyst_machete;
	public static Item beryl_pickaxe;
	public static Item beryl_axe;
	public static Item beryl_spade;
	public static Item beryl_sword;
	public static Item beryl_hoe;
	public static Item beryl_machete;
	public static Item carnelian_pickaxe;
	public static Item carnelian_axe;
	public static Item carnelian_spade;
	public static Item carnelian_sword;
	public static Item carnelian_hoe;
	public static Item carnelian_machete;
	public static Item jade_pickaxe;
	public static Item jade_axe;
	public static Item jade_spade;
	public static Item jade_sword;
	public static Item jade_hoe;
	public static Item jade_machete;
	public static Item jasper_pickaxe;
	public static Item jasper_axe;
	public static Item jasper_spade;
	public static Item jasper_sword;
	public static Item jasper_hoe;
	public static Item jasper_machete;
	public static Item malachite_pickaxe;
	public static Item malachite_axe;
	public static Item malachite_spade;
	public static Item malachite_sword;
	public static Item malachite_hoe;
	public static Item malachite_machete;
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
		/**Nightmare**/
		//Nightmare Swords
		black_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "black_nightmare_sword", "black_sword", new ItemStack(MItems.black_shard));
		blue_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "blue_nightmare_sword", "blue_sword", new ItemStack(MItems.blue_shard));
		cyan_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "cyan_nightmare_sword", "cyan_sword", new ItemStack(MItems.cyan_shard));
		diamond_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_diamond_tools, "diamond_nightmare_sword", "diamond_sword", new ItemStack(Items.diamond));
		gold_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_gold_tools, "gold_nightmare_sword", "gold_sword", new ItemStack(Items.gold_ingot));
		green_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "green_nightmare_sword", "green_sword", new ItemStack(MItems.green_shard));
		iron_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_iron_tools, "iron_nightmare_sword", "iron_sword", new ItemStack(Items.iron_ingot));
		lime_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "lime_nightmare_sword", "lime_sword", new ItemStack(MItems.lime_shard));
		magenta_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "magenta_nightmare_sword", "magenta_sword", new ItemStack(MItems.magenta_shard));
		orange_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "orange_nightmare_sword", "orange_sword", new ItemStack(MItems.orange_shard));
		pink_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "pink_nightmare_sword", "pink_sword", new ItemStack(MItems.pink_shard));
		purple_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "purple_nightmare_sword", "purple_sword", new ItemStack(MItems.purple_shard));
		red_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "red_nightmare_sword", "red_sword", new ItemStack(MItems.red_shard));
		stone_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_stone_tools, "stone_nightmare_sword", "stone_sword", new ItemStack(Blocks.stone));
		white_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "white_nightmare_sword", "white_sword", new ItemStack(MItems.white_shard));
		wooden_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_wooden_tools, "wooden_nightmare_sword", "wooden_sword", new ItemStack(Blocks.planks));
		yellow_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_c_tools, "yellow_nightmare_sword", "yellow_sword", new ItemStack(MItems.yellow_shard));
		ender_rite_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_ender_rite_tools, "ender_rite_nightmare_sword", "ender_rite_sword", new ItemStack(MItems.ender_rite_shard));
			//Gems
		aventurine_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_aventurine_tools, "aventurine_nightmare_sword", "aventurine_sword", new ItemStack(MItems.aventurine));
		amethyst_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_amethyst_tools, "amethyst_nightmare_sword", "amethyst_sword", new ItemStack(MItems.amethyst));
		beryl_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_beryl_tools, "beryl_nightmare_sword", "beryl_sword", new ItemStack(MItems.beryl));
		carnelian_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_carnelian_tools, "carnelian_nightmare_sword", "carnelian_sword", new ItemStack(MItems.carnelian));
		/**Normal**/
		ender_rite_pickaxe = new ModItemPickaxe(ModToolMaterial.ender_rite_tools, "ender_rite_pickaxe", "ender_rite_pickaxe", new ItemStack(MItems.ender_rite_shard));
		ender_rite_axe = new ModItemAxe(ModToolMaterial.ender_rite_tools, "ender_rite_axe", "ender_rite_axe", new ItemStack(MItems.ender_rite_shard));
		ender_rite_spade = new ModItemSpade(ModToolMaterial.ender_rite_tools, "ender_rite_spade", "ender_rite_spade", new ItemStack(MItems.ender_rite_shard));
		ender_rite_sword = new ModItemSword(ModToolMaterial.ender_rite_tools, "ender_rite_sword", "ender_rite_sword", new ItemStack(MItems.ender_rite_shard));
		ender_rite_hoe = new ModItemHoe(ModToolMaterial.ender_rite_tools, "ender_rite_hoe", "ender_rite_hoe", new ItemStack(MItems.ender_rite_shard));
		ender_rite_machete = new ModItemMachete(ModToolMaterial.ender_rite_tools, "ender_rite_machete", "ender_rite_machete", new ItemStack(MItems.ender_rite_shard));
		//Gems Tools
		aventurine_pickaxe = new ModItemPickaxe(ModToolMaterial.Aventurine_Tools, "aventurine_pickaxe", "gems/tools/aventurine_pickaxe", new ItemStack(MItems.aventurine));
		aventurine_axe = new ModItemAxe(ModToolMaterial.Aventurine_Tools, "aventurine_axe", "gems/tools/aventurine_axe", new ItemStack(MItems.aventurine));
		aventurine_spade = new ModItemSpade(ModToolMaterial.Aventurine_Tools, "aventurine_spade", "gems/tools/aventurine_spade", new ItemStack(MItems.aventurine));
		aventurine_sword = new ModItemSword(ModToolMaterial.Aventurine_Tools, "aventurine_sword", "gems/tools/aventurine_sword", new ItemStack(MItems.aventurine));
		aventurine_hoe = new ModItemHoe(ModToolMaterial.Aventurine_Tools, "aventurine_hoe", "gems/tools/aventurine_hoe", new ItemStack(MItems.aventurine));
		aventurine_machete = new ModItemMachete(ModToolMaterial.Aventurine_Tools, "aventurine_machete", "gems/tools/aventurine_machete", new ItemStack(MItems.aventurine));
		amethyst_pickaxe = new ModItemPickaxe(ModToolMaterial.Amethyst_Tools, "amethyst_pickaxe", "gems/tools/amethyst_pickaxe", new ItemStack(MItems.amethyst));
		amethyst_axe = new ModItemAxe(ModToolMaterial.Amethyst_Tools, "amethyst_axe", "gems/tools/amethyst_axe", new ItemStack(MItems.amethyst));
		amethyst_spade = new ModItemSpade(ModToolMaterial.Amethyst_Tools, "amethyst_spade", "gems/tools/amethyst_spade", new ItemStack(MItems.amethyst));
		amethyst_sword = new ModItemSword(ModToolMaterial.Amethyst_Tools, "amethyst_sword", "gems/tools/amethyst_sword", new ItemStack(MItems.amethyst));
		amethyst_hoe = new ModItemHoe(ModToolMaterial.Amethyst_Tools, "amethyst_hoe", "gems/tools/amethyst_hoe", new ItemStack(MItems.amethyst));
		amethyst_machete = new ModItemMachete(ModToolMaterial.Amethyst_Tools, "amethyst_machete", "gems/tools/amethyst_machete", new ItemStack(MItems.amethyst));
		beryl_pickaxe = new ModItemPickaxe(ModToolMaterial.Beryl_Tools, "beryl_pickaxe", "gems/tools/beryl_pickaxe", new ItemStack(MItems.beryl));
		beryl_axe = new ModItemAxe(ModToolMaterial.Beryl_Tools, "beryl_axe", "gems/tools/beryl_axe", new ItemStack(MItems.beryl));
		beryl_spade = new ModItemSpade(ModToolMaterial.Beryl_Tools, "beryl_spade", "gems/tools/beryl_spade", new ItemStack(MItems.beryl));
		beryl_sword = new ModItemSword(ModToolMaterial.Beryl_Tools, "beryl_sword", "gems/tools/beryl_sword", new ItemStack(MItems.beryl));
		beryl_hoe = new ModItemHoe(ModToolMaterial.Beryl_Tools, "beryl_hoe", "gems/tools/beryl_hoe", new ItemStack(MItems.beryl));
		beryl_machete = new ModItemMachete(ModToolMaterial.Beryl_Tools, "beryl_machete", "gems/tools/beryl_machete", new ItemStack(MItems.beryl));
		carnelian_pickaxe = new ModItemPickaxe(ModToolMaterial.Carnelian_Tools, "carnelian_pickaxe", "gems/tools/carnelian_pickaxe", new ItemStack(MItems.carnelian));
		carnelian_axe = new ModItemAxe(ModToolMaterial.Carnelian_Tools, "carnelian_axe", "gems/tools/carnelian_axe", new ItemStack(MItems.carnelian));
		carnelian_spade = new ModItemSpade(ModToolMaterial.Carnelian_Tools, "carnelian_spade", "gems/tools/carnelian_spade", new ItemStack(MItems.carnelian));
		carnelian_sword = new ModItemSword(ModToolMaterial.Carnelian_Tools, "carnelian_sword", "gems/tools/carnelian_sword", new ItemStack(MItems.carnelian));
		carnelian_hoe = new ModItemHoe(ModToolMaterial.Carnelian_Tools, "carnelian_hoe", "gems/tools/carnelian_hoe", new ItemStack(MItems.carnelian));
		carnelian_machete = new ModItemMachete(ModToolMaterial.Carnelian_Tools, "carnelian_machete", "gems/tools/carnelian_machete", new ItemStack(MItems.carnelian));
		jade_pickaxe = new ModItemPickaxe(ModToolMaterial.Jade_Tools, "jade_pickaxe", "gems/tools/jade_pickaxe", new ItemStack(MItems.jade));
		jade_axe = new ModItemAxe(ModToolMaterial.Jade_Tools, "jade_axe", "gems/tools/jade_axe", new ItemStack(MItems.jade));
		jade_spade = new ModItemSpade(ModToolMaterial.Jade_Tools, "jade_spade", "gems/tools/jade_spade", new ItemStack(MItems.jade));
		jade_sword = new ModItemSword(ModToolMaterial.Jade_Tools, "jade_sword", "gems/tools/jade_sword", new ItemStack(MItems.jade));
		jade_hoe = new ModItemHoe(ModToolMaterial.Jade_Tools, "jade_hoe", "gems/tools/jade_hoe", new ItemStack(MItems.jade));
		jade_machete = new ModItemMachete(ModToolMaterial.Jade_Tools, "jade_machete", "gems/tools/jade_machete", new ItemStack(MItems.jade));
		jasper_pickaxe = new ModItemPickaxe(ModToolMaterial.Jasper_Tools, "jasper_pickaxe", "gems/tools/jasper_pickaxe", new ItemStack(MItems.jasper));
		jasper_axe = new ModItemAxe(ModToolMaterial.Jasper_Tools, "jasper_axe", "gems/tools/jasper_axe", new ItemStack(MItems.jasper));
		jasper_spade = new ModItemSpade(ModToolMaterial.Jasper_Tools, "jasper_spade", "gems/tools/jasper_spade", new ItemStack(MItems.jasper));
		jasper_sword = new ModItemSword(ModToolMaterial.Jasper_Tools, "jasper_sword", "gems/tools/jasper_sword", new ItemStack(MItems.jasper));
		jasper_hoe = new ModItemHoe(ModToolMaterial.Jasper_Tools, "jasper_hoe", "gems/tools/jasper_hoe", new ItemStack(MItems.jasper));
		jasper_machete = new ModItemMachete(ModToolMaterial.Jasper_Tools, "jasper_machete", "gems/tools/jasper_machete", new ItemStack(MItems.jasper));
		malachite_pickaxe = new ModItemPickaxe(ModToolMaterial.MalachiteTools, "malachite_pickaxe", "gems/tools/malachite_pickaxe", new ItemStack(MItems.malachite));
		malachite_axe = new ModItemAxe(ModToolMaterial.MalachiteTools, "malachite_axe", "gems/tools/malachite_axe", new ItemStack(MItems.malachite));
		malachite_spade = new ModItemSpade(ModToolMaterial.MalachiteTools, "malachite_spade", "gems/tools/malachite_spade", new ItemStack(MItems.malachite));
		malachite_sword = new ModItemSword(ModToolMaterial.MalachiteTools, "malachite_sword", "gems/tools/malachite_sword", new ItemStack(MItems.malachite));
		malachite_hoe = new ModItemHoe(ModToolMaterial.MalachiteTools, "malachite_hoe", "gems/tools/malachite_hoe", new ItemStack(MItems.malachite));
		malachite_machete = new ModItemMachete(ModToolMaterial.MalachiteTools, "malachite_machete", "gems/tools/malachite_machete", new ItemStack(MItems.malachite));
		//Stone Tools
			//Ice
		ice_stone_sword = new ModItemSword(ModToolMaterial.ice_stone_tools, "ice_stone_sword", new ItemStack(MBlocks.ice_cobblestone));
		ice_stone_axe = new ModItemAxe(ModToolMaterial.ice_stone_tools, "ice_stone_axe", new ItemStack(MBlocks.ice_cobblestone));
		ice_stone_hoe = new ModItemHoe(ModToolMaterial.ice_stone_tools, "ice_stone_hoe", new ItemStack(MBlocks.ice_cobblestone));
		ice_stone_pickaxe = new ModItemPickaxe(ModToolMaterial.ice_stone_tools, "ice_stone_pickaxe", new ItemStack(MBlocks.ice_cobblestone));
		ice_stone_spade = new ModItemSpade(ModToolMaterial.ice_stone_tools, "ice_stone_spade", new ItemStack(MBlocks.ice_cobblestone));
		ice_stone_machete = new ModItemMachete(ModToolMaterial.ice_stone_tools, "ice_stone_machete", new ItemStack(MBlocks.ice_cobblestone));
			//Fire
		fire_stone_sword = new ModItemSword(ModToolMaterial.fire_stone_tools, "fire_stone_sword", new ItemStack(MBlocks.fire_cobblestone));
		fire_stone_axe = new ModItemAxe(ModToolMaterial.fire_stone_tools, "fire_stone_axe", new ItemStack(MBlocks.fire_cobblestone));
		fire_stone_hoe = new ModItemHoe(ModToolMaterial.fire_stone_tools, "fire_stone_hoe", new ItemStack(MBlocks.fire_cobblestone));
		fire_stone_pickaxe = new ModItemPickaxe(ModToolMaterial.fire_stone_tools, "fire_stone_pickaxe", new ItemStack(MBlocks.fire_cobblestone));
		fire_stone_spade = new ModItemSpade(ModToolMaterial.fire_stone_tools, "fire_stone_spade", new ItemStack(MBlocks.fire_cobblestone));
		fire_stone_machete = new ModItemMachete(ModToolMaterial.fire_stone_tools, "fire_stone_machete", new ItemStack(MBlocks.fire_cobblestone));
			//Nightmare
			//Sandstone
		sandstone_sword = new ModItemSword(ModToolMaterial.sandstone_tools, "sandstone_sword", new ItemStack(MBlocks.sandstone_cobblestone));
		sandstone_axe = new ModItemAxe(ModToolMaterial.sandstone_tools, "sandstone_axe", new ItemStack(MBlocks.sandstone_cobblestone));
		sandstone_hoe = new ModItemHoe(ModToolMaterial.sandstone_tools, "sandstone_hoe", new ItemStack(MBlocks.sandstone_cobblestone));
		sandstone_pickaxe = new ModItemPickaxe(ModToolMaterial.sandstone_tools, "sandstone_pickaxe", new ItemStack(MBlocks.sandstone_cobblestone));
		sandstone_spade = new ModItemSpade(ModToolMaterial.sandstone_tools, "sandstone_spade", new ItemStack(MBlocks.sandstone_cobblestone));
		sandstone_machete = new ModItemMachete(ModToolMaterial.sandstone_tools, "sandstone_machete", new ItemStack(MBlocks.sandstone_cobblestone));
			//Marble
		marble_sword = new ModItemSword(ModToolMaterial.marble_tools, "marble_sword", new ItemStack(MBlocks.marble_cobblestone));
		marble_axe = new ModItemAxe(ModToolMaterial.marble_tools, "marble_axe", new ItemStack(MBlocks.marble_cobblestone));
		marble_hoe = new ModItemHoe(ModToolMaterial.marble_tools, "marble_hoe", new ItemStack(MBlocks.marble_cobblestone));
		marble_pickaxe = new ModItemPickaxe(ModToolMaterial.marble_tools, "marble_pickaxe", new ItemStack(MBlocks.marble_cobblestone));
		marble_spade = new ModItemSpade(ModToolMaterial.marble_tools, "marble_spade", new ItemStack(MBlocks.marble_cobblestone));
		marble_machete = new ModItemMachete(ModToolMaterial.marble_tools, "marble_machete", new ItemStack(MBlocks.marble_cobblestone));
			//Granite
			//Diorite
			//Andesite
			//Slate
		slate_sword = new ModItemSword(ModToolMaterial.slate_tools, "slate_sword", new ItemStack(MBlocks.slate_cobblestone));
		slate_axe = new ModItemAxe(ModToolMaterial.slate_tools, "slate_axe", new ItemStack(MBlocks.slate_cobblestone));
		slate_hoe = new ModItemHoe(ModToolMaterial.slate_tools, "slate_hoe", new ItemStack(MBlocks.slate_cobblestone));
		slate_pickaxe = new ModItemPickaxe(ModToolMaterial.slate_tools, "slate_pickaxe", new ItemStack(MBlocks.slate_cobblestone));
		slate_spade = new ModItemSpade(ModToolMaterial.slate_tools, "slate_spade", new ItemStack(MBlocks.slate_cobblestone));
		slate_machete = new ModItemMachete(ModToolMaterial.slate_tools, "slate_machete", new ItemStack(MBlocks.slate_cobblestone));
			//Stone
		stone_machete = new ModItemMachete(ToolMaterial.STONE, "stone_machete", new ItemStack(Blocks.cobblestone));
			//Red Sandstone
		red_sandstone_sword = new ModItemSword(ModToolMaterial.red_sandstone_tools, "red_sandstone_sword", new ItemStack(MBlocks.red_sandstone_cobblestone));
		red_sandstone_axe = new ModItemAxe(ModToolMaterial.red_sandstone_tools, "red_sandstone_axe", new ItemStack(MBlocks.red_sandstone_cobblestone));
		red_sandstone_hoe = new ModItemHoe(ModToolMaterial.red_sandstone_tools, "red_sandstone_hoe", new ItemStack(MBlocks.red_sandstone_cobblestone));
		red_sandstone_pickaxe = new ModItemPickaxe(ModToolMaterial.red_sandstone_tools, "red_sandstone_pickaxe", new ItemStack(MBlocks.red_sandstone_cobblestone));
		red_sandstone_spade = new ModItemSpade(ModToolMaterial.red_sandstone_tools, "red_sandstone_spade", new ItemStack(MBlocks.red_sandstone_cobblestone));
		red_sandstone_machete = new ModItemMachete(ModToolMaterial.red_sandstone_tools, "red_sandstone_machete", new ItemStack(MBlocks.red_sandstone_cobblestone));
			//Basalt
			//Rhyolite
		rhyolite_sword = new ModItemSword(ModToolMaterial.rhyolite_tools, "rhyolite_sword", new ItemStack(MBlocks.rhyolite_cobblestone));
		rhyolite_axe = new ModItemAxe(ModToolMaterial.rhyolite_tools, "rhyolite_axe", new ItemStack(MBlocks.rhyolite_cobblestone));
		rhyolite_hoe = new ModItemHoe(ModToolMaterial.rhyolite_tools, "rhyolite_hoe", new ItemStack(MBlocks.rhyolite_cobblestone));
		rhyolite_pickaxe = new ModItemPickaxe(ModToolMaterial.rhyolite_tools, "rhyolite_pickaxe", new ItemStack(MBlocks.rhyolite_cobblestone));
		rhyolite_spade = new ModItemSpade(ModToolMaterial.rhyolite_tools, "rhyolite_spade", new ItemStack(MBlocks.rhyolite_cobblestone));
		rhyolite_machete = new ModItemMachete(ModToolMaterial.rhyolite_tools, "rhyolite_machete", new ItemStack(MBlocks.rhyolite_cobblestone));
			//Dacite
			//Trachyte
		trachyte_sword = new ModItemSword(ModToolMaterial.trachyte_tools, "trachyte_sword", new ItemStack(MBlocks.trachyte_cobblestone));
		trachyte_axe = new ModItemAxe(ModToolMaterial.trachyte_tools, "trachyte_axe", new ItemStack(MBlocks.trachyte_cobblestone));
		trachyte_hoe = new ModItemHoe(ModToolMaterial.trachyte_tools, "trachyte_hoe", new ItemStack(MBlocks.trachyte_cobblestone));
		trachyte_pickaxe = new ModItemPickaxe(ModToolMaterial.trachyte_tools, "trachyte_pickaxe", new ItemStack(MBlocks.trachyte_cobblestone));
		trachyte_spade = new ModItemSpade(ModToolMaterial.trachyte_tools, "trachyte_spade", new ItemStack(MBlocks.trachyte_cobblestone));
		trachyte_machete = new ModItemMachete(ModToolMaterial.trachyte_tools, "trachyte_machete", new ItemStack(MBlocks.trachyte_cobblestone));
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
