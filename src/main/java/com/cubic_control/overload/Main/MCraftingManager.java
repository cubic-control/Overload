package com.cubic_control.overload.Main;

import java.util.Iterator;
import java.util.List;

import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Food.MFoods;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class MCraftingManager {
	public static void MainRegistry(){
		removeCraftingRec();
		addCraftingRec();
		addSmeltingRec();
	}
	public static void addCraftingRec(){
	//Tools
		GameRegistry.addRecipe(new ItemStack(MTools.scythe), "XXY", " Y ", "Y Z", 'X', Items.iron_ingot, 'Y', Items.stick, 'Z', MItems.black_shard);
		GameRegistry.addRecipe(new ItemStack(MItems.amethyst_machete), "  X", " Y ", "Y  ", 'X', MItems.amethyst, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.aventurine_machete), "  X", " Y ", "Y  ", 'X', MItems.aventurine, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.beryl_machete), "  X", " Y ", "Y  ", 'X', MItems.beryl, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.carnelian_machete), "  X", " Y ", "Y  ", 'X', MItems.amethyst, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.jade_machete), "  X", " Y ", "Y  ", 'X', MItems.jade, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.jasper_machete), "  X", " Y ", "Y  ", 'X', MItems.jasper, 'Y', Items.stick);
		//Ender-rite
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_sword), "X", "X", "Y", 'X', MItems.ender_rite_shard, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_pickaxe), "XXX", " Y ", " Y ", 'X', MItems.ender_rite_shard, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_axe), "XX ","XY "," Y ", 'X', MItems.ender_rite_shard, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_axe), " XX"," YX"," Y ", 'X', MItems.ender_rite_shard, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_spade), "X","Y","Y",'X',MItems.ender_rite_shard,'Y',Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_hoe), "XX "," Y "," Y ",'X',MItems.ender_rite_shard,'Y',Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_hoe), " XX"," Y "," Y ",'X',MItems.ender_rite_shard,'Y',Items.stick);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_machete), "  X"," Y ","Y  ",'X',MItems.ender_rite_shard,'Y',Items.stick);
		//Nightmare Swords
		GameRegistry.addRecipe(new ItemStack(MItems.black_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.black_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.blue_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.blue_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.cyan_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.cyan_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.diamond_nightmare_sword), " X ", " X ", " Y ", 'X', Items.diamond, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.gold_nightmare_sword), " X ", " X ", " Y ", 'X', Items.gold_ingot, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.green_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.green_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.iron_nightmare_sword), " X ", " X ", " Y ", 'X', Items.iron_ingot, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.lime_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.lime_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.magenta_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.magenta_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.orange_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.orange_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.pink_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.pink_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.purple_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.green_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.red_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.red_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.stone_nightmare_sword), " X ", " X ", " Y ", 'X', Blocks.stone, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.white_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.white_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.wooden_nightmare_sword), " X ", " X ", " Y ", 'X', Blocks.planks, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.yellow_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.yellow_shard, 'Y', MItems.Nightmare_Gem);
		GameRegistry.addRecipe(new ItemStack(MItems.ender_rite_nightmare_sword), " X ", " X ", " Y ", 'X', MItems.ender_rite_shard, 'Y', MItems.Nightmare_Gem);
		//Stones
			//Ice
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_sword), "X", "X", "Y", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_axe), "XX ", "XY ", " Y ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_axe), " XX", " YX", " Y ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_hoe), " XX", " Y ", " Y ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_spade), "X", "Y", "Y", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.ice_stone_machete), "  X", " X ", "Y  ", 'X', MBlocks.ice_cobblestone, 'Y', Items.stick);
			//Fire
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_sword), "X", "X", "Y", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_axe), "XX ", "XY ", " Y ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_axe), " XX", " YX", " Y ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_hoe), " XX", " Y ", " Y ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_spade), "X", "Y", "Y", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.fire_stone_machete), "  X", " X ", "Y  ", 'X', MBlocks.fire_cobblestone, 'Y', Items.stick);
			//Nightmare
			//Sandstone
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_sword), "X", "X", "Y", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_axe), "XX ", "XY ", " Y ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_axe), " XX", " YX", " Y ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_hoe), " XX", " Y ", " Y ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_spade), "X", "Y", "Y", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.sandstone_machete), "  X", " X ", "Y  ", 'X', MBlocks.sandstone_cobblestone, 'Y', Items.stick);
			//Marble
		GameRegistry.addRecipe(new ItemStack(MTools.marble_sword), "X", "X", "Y", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_axe), "XX ", "XY ", " Y ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_axe), " XX", " YX", " Y ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_hoe), " XX", " Y ", " Y ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_spade), "X", "Y", "Y", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.marble_machete), "  X", " X ", "Y  ", 'X', MBlocks.marble_cobblestone, 'Y', Items.stick);
			//Granite
			//Diorite
			//Andesite
			//Slate
		GameRegistry.addRecipe(new ItemStack(MTools.slate_sword), "X", "X", "Y", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_axe), "XX ", "XY ", " Y ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_axe), " XX", " YX", " Y ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_hoe), " XX", " Y ", " Y ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_spade), "X", "Y", "Y", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.slate_machete), "  X", " X ", "Y  ", 'X', MBlocks.slate_cobblestone, 'Y', Items.stick);
			//Stone
		GameRegistry.addRecipe(new ItemStack(MTools.stone_machete), "  X", " X ", "Y  ", 'X', Blocks.cobblestone, 'Y', Items.stick);
			//Red Sandstone
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_sword), "X", "X", "Y", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_axe), "XX ", "XY ", " Y ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_axe), " XX", " YX", " Y ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_hoe), " XX", " Y ", " Y ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_spade), "X", "Y", "Y", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.red_sandstone_machete), "  X", " X ", "Y  ", 'X', MBlocks.red_sandstone_cobblestone, 'Y', Items.stick);
			//Basalt
			//Rhyolite
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_sword), "X", "X", "Y", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_axe), "XX ", "XY ", " Y ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_axe), " XX", " YX", " Y ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_hoe), " XX", " Y ", " Y ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_spade), "X", "Y", "Y", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.rhyolite_machete), "  X", " X ", "Y  ", 'X', MBlocks.rhyolite_cobblestone, 'Y', Items.stick);
			//Dacite
			//Trachyte
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_sword), "X", "X", "Y", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_axe), "XX ", "XY ", " Y ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_axe), " XX", " YX", " Y ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_hoe), "XX ", " Y ", " Y ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_hoe), " XX", " Y ", " Y ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_pickaxe), "XXX", " Y ", " Y ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_spade), "X", "Y", "Y", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
		GameRegistry.addRecipe(new ItemStack(MTools.trachyte_machete), "  X", " X ", "Y  ", 'X', MBlocks.trachyte_cobblestone, 'Y', Items.stick);
	//Armor
		//Ender-rite
		GameRegistry.addRecipe(new ItemStack(MArmor.ender_rite_helmet), "XXX", "X X", 'X', MItems.ender_rite_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.ender_rite_chestplate), "X X", "XXX", "XXX", 'X', MItems.ender_rite_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.ender_rite_leggings), "XXX", "X X", "X X", 'X', MItems.ender_rite_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.ender_rite_boots), "X X", "X X", 'X', MItems.ender_rite_shard);
		//Color Armor
			//Rainbow
				//Iron
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_iron_helmet), "XYX", "X X", 'X', Items.iron_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_iron_chestplate), "X X", "XYX", "XXX", 'X', Items.iron_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_iron_leggings), "XYX", "X X", "X X", 'X', Items.iron_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_iron_boots), " Y ", "X X", "X X", 'X', Items.iron_ingot, 'Y', MItems.rainbow_shard);
				//Gold
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_gold_helmet), "XYX", "X X", 'X', Items.gold_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_gold_chestplate), "X X", "XYX", "XXX", 'X', Items.gold_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_gold_leggings), "XYX", "X X", "X X", 'X', Items.gold_ingot, 'Y', MItems.rainbow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.rainbow_gold_boots), " Y ", "X X", "X X", 'X', Items.gold_ingot, 'Y', MItems.rainbow_shard);
			//black
		GameRegistry.addRecipe(new ItemStack(MArmor.black_helmet), "XXX", "X X", 'X', MItems.black_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.black_chestplate), "X X", "XXX", "XXX", 'X', MItems.black_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.black_leggings), "XXX", "X X", "X X", 'X', MItems.black_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.black_boots), "X X", "X X", 'X', MItems.black_shard);
			//blue
		GameRegistry.addRecipe(new ItemStack(MArmor.blue_helmet), "XXX", "X X", 'X', MItems.blue_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.blue_chestplate), "X X", "XXX", "XXX", 'X', MItems.blue_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.blue_leggings), "XXX", "X X", "X X", 'X', MItems.blue_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.blue_boots), "X X", "X X", 'X', MItems.blue_shard);
			//cyan
		GameRegistry.addRecipe(new ItemStack(MArmor.cyan_helmet), "XXX", "X X", 'X', MItems.cyan_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.cyan_chestplate), "X X", "XXX", "XXX", 'X', MItems.cyan_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.cyan_leggings), "XXX", "X X", "X X", 'X', MItems.cyan_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.cyan_boots), "X X", "X X", 'X', MItems.cyan_shard);
			//green
		GameRegistry.addRecipe(new ItemStack(MArmor.green_helmet), "XXX", "X X", 'X', MItems.green_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.green_chestplate), "X X", "XXX", "XXX", 'X', MItems.green_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.green_leggings), "XXX", "X X", "X X", 'X', MItems.green_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.green_boots), "X X", "X X", 'X', MItems.green_shard);
			//lime
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_helmet), "XXX", "X X", "   ", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_helmet), "   ", "XXX", "X X", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_chestplate), "X X", "XXX", "XXX", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_leggings), "XXX", "X X", "X X", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_boots), "X X", "X X", "   ", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.lime_boots), "   ", "X X", "X X", 'X', MItems.lime_shard);
			//magenta
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_helmet), "XXX", "X X", "   ", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_helmet), "   ", "XXX", "X X", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_chestplate), "X X", "XXX", "XXX", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_leggings), "XXX", "X X", "X X", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_boots), "X X", "X X", "   ", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.magenta_boots), "   ", "X X", "X X", 'X', MItems.magenta_shard);
			//orange
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_helmet), "XXX", "X X", "   ", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_helmet), "   ", "XXX", "X X", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_chestplate), "X X", "XXX", "XXX", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_leggings), "XXX", "X X", "X X", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_boots), "X X", "X X", "   ", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.orange_boots), "   ", "X X", "X X", 'X', MItems.orange_shard);
			//pink
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_helmet), "XXX", "X X", "   ", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_helmet), "   ", "XXX", "X X", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_chestplate), "X X", "XXX", "XXX", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_leggings), "XXX", "X X", "X X", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_boots), "X X", "X X", "   ", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.pink_boots), "   ", "X X", "X X", 'X', MItems.pink_shard);
			//purple
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_helmet), "XXX", "X X", "   ", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_helmet), "   ", "XXX", "X X", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_chestplate), "X X", "XXX", "XXX", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_leggings), "XXX", "X X", "X X", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_boots), "X X", "X X", "   ", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.purple_boots), "   ", "X X", "X X", 'X', MItems.purple_shard);
			//red
		GameRegistry.addRecipe(new ItemStack(MArmor.red_helmet), "XXX", "X X", "   ", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.red_helmet), "   ", "XXX", "X X", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.red_chestplate), "X X", "XXX", "XXX", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.red_leggings), "XXX", "X X", "X X", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.red_boots), "X X", "X X", "   ", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.red_boots), "   ", "X X", "X X", 'X', MItems.red_shard);
			//white
		GameRegistry.addRecipe(new ItemStack(MArmor.white_helmet), "XXX", "X X", "   ", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.white_helmet), "   ", "XXX", "X X", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.white_chestplate), "X X", "XXX", "XXX", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.white_leggings), "XXX", "X X", "X X", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.white_boots), "X X", "X X", "   ", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.white_boots), "   ", "X X", "X X", 'X', MItems.white_shard);
			//yellow
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_helmet), "XXX", "X X", "   ", 'X', MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_helmet), "   ", "XXX", "X X", 'X', MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_chestplate), "X X", "XXX", "XXX", 'X', MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_leggings), "XXX", "X X", "X X", 'X', MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_boots), "X X", "X X", "   ", 'X', MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MArmor.yellow_boots), "   ", "X X", "X X", 'X', MItems.yellow_shard);
		//Gem Armor
			//Amethyst_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_helmet), "XXX", "X X", "   ", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_helmet), "   ", "XXX", "X X", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_chestplate), "X X", "XXX", "XXX", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_leggings), "XXX", "X X", "X X", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_boots), "X X", "X X", "   ", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MArmor.amethyst_boots), "   ", "X X", "X X", 'X', MItems.amethyst);
			//Carnelian_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_helmet), "XXX", "X X", "   ", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_helmet), "   ", "XXX", "X X", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_chestplate), "X X", "XXX", "XXX", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_leggings), "XXX", "X X", "X X", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_boots), "X X", "X X", "   ", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MArmor.carnelian_boots), "   ", "X X", "X X", 'X', MItems.carnelian);
			//Jade_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_helmet), "XXX", "X X", "   ", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_helmet), "   ", "XXX", "X X", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_chestplate), "X X", "XXX", "XXX", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_leggings), "XXX", "X X", "X X", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_boots), "X X", "X X", "   ", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MArmor.jade_boots), "   ", "X X", "X X", 'X', MItems.jade);
			//Jasper_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_helmet), "XXX", "X X", "   ", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_helmet), "   ", "XXX", "X X", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_chestplate), "X X", "XXX", "XXX", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_leggings), "XXX", "X X", "X X", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_boots), "X X", "X X", "   ", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MArmor.jasper_boots), "   ", "X X", "X X", 'X', MItems.jasper);
			//Malachite_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_helmet), "XXX", "X X", "   ", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_helmet), "   ", "XXX", "X X", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_chestplate), "X X", "XXX", "XXX", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_leggings), "XXX", "X X", "X X", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_boots), "X X", "X X", "   ", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MArmor.malachite_boots), "   ", "X X", "X X", 'X', MItems.malachite);
			//Moonstone_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_helmet), "XXX", "X X", "   ", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_helmet), "   ", "XXX", "X X", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_chestplate), "X X", "XXX", "XXX", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_leggings), "XXX", "X X", "X X", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_boots), "X X", "X X", "   ", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MArmor.moonstone_boots), "   ", "X X", "X X", 'X', MItems.moonstone);
			//Onyx_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_helmet), "XXX", "X X", "   ", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_helmet), "   ", "XXX", "X X", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_chestplate), "X X", "XXX", "XXX", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_leggings), "XXX", "X X", "X X", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_boots), "X X", "X X", "   ", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MArmor.onyx_boots), "   ", "X X", "X X", 'X', MItems.onyx);
			//Peridot_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_helmet), "XXX", "X X", "   ", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_helmet), "   ", "XXX", "X X", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_chestplate), "X X", "XXX", "XXX", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_leggings), "XXX", "X X", "X X", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_boots), "X X", "X X", "   ", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MArmor.peridot_boots), "   ", "X X", "X X", 'X', MItems.peridot);
			//Sapphire_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_helmet), "XXX", "X X", "   ", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_helmet), "   ", "XXX", "X X", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_chestplate), "X X", "XXX", "XXX", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_leggings), "XXX", "X X", "X X", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_boots), "X X", "X X", "   ", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MArmor.sapphire_boots), "   ", "X X", "X X", 'X', MItems.sapphire);
			//Tanzanite_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_helmet), "XXX", "X X", "   ", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_helmet), "   ", "XXX", "X X", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_chestplate), "X X", "XXX", "XXX", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_leggings), "XXX", "X X", "X X", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_boots), "X X", "X X", "   ", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MArmor.tanzanite_boots), "   ", "X X", "X X", 'X', MItems.tanzanite);
			//Tiger_Eye_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_helmet), "XXX", "X X", "   ", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_helmet), "   ", "XXX", "X X", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_chestplate), "X X", "XXX", "XXX", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_leggings), "XXX", "X X", "X X", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_boots), "X X", "X X", "   ", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MArmor.tiger_eye_boots), "   ", "X X", "X X", 'X', MItems.tiger_eye);
			//Topaz_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_helmet), "XXX", "X X", "   ", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_helmet), "   ", "XXX", "X X", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_chestplate), "X X", "XXX", "XXX", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_leggings), "XXX", "X X", "X X", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_boots), "X X", "X X", "   ", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MArmor.topaz_boots), "   ", "X X", "X X", 'X', MItems.topaz);
			//Vermarine_Armor
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_helmet), "XXX", "X X", "   ", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_helmet), "   ", "XXX", "X X", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_chestplate), "X X", "XXX", "XXX", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_leggings), "XXX", "X X", "X X", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_boots), "X X", "X X", "   ", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MArmor.vermarine_boots), "   ", "X X", "X X", 'X', MItems.vermarine);
	//Items
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.bluestone_torch), Items.stick, MItems.bluestone);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.ender_pearl), MItems.ender_rite_shard, Items.gunpowder);
		GameRegistry.addShapedRecipe(new ItemStack(MItems.wing_right), " BB", "YYY", "   ", 'B', Blocks.wool, 'Y', Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.Ender_rite_elytra), MItems.wing_right, MItems.wing_left, MArmor.ender_rite_chestplate);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.frozen_iron), Items.iron_ingot, Blocks.ice);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.FlintAndIce), Items.flint, MItems.frozen_iron);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.burned_iron), Items.iron_ingot, Blocks.netherrack);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.flint_and_fire), Items.flint, MItems.burned_iron);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.nightmare_iron), Items.iron_ingot, MItems.Nightmare_Gem);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.flint_and_nightmare), Items.flint, MItems.nightmare_iron);
		GameRegistry.addRecipe(new ItemStack(MItems.Ender_rite_bow), " XY", "X Y", " XY", 'X', MItems.ender_rite_shard, 'Y', Items.string);
		GameRegistry.addShapedRecipe(new ItemStack(MItems.wing_left), "   ", "AA ", "YYY", 'A', Blocks.wool, 'Y', Items.iron_ingot);
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.fire, 5), MItems.rainbow_shard, Items.flint_and_steel.setContainerItem(Items.flint_and_steel));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.ice_fire), MItems.rainbow_shard, MItems.FlintAndIce.setContainerItem(MItems.FlintAndIce));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.burned_fire), MItems.rainbow_shard, MItems.flint_and_fire.setContainerItem(MItems.flint_and_fire));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.nightmare_fire), MItems.rainbow_shard, MItems.flint_and_nightmare.setContainerItem(MItems.flint_and_nightmare));
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.rainbow_shard), MItems.black_shard, MItems.blue_shard, MItems.cyan_shard, MItems.green_shard, MItems.lime_shard, MItems.magenta_shard, MItems.orange_shard, MItems.pink_shard, MItems.purple_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MFoods.blue_melon), Items.melon, MItems.blue_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MFoods.purple_melon), Items.melon, MItems.purple_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MFoods.red_melon), Items.melon, MItems.red_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MFoods.white_melon), Items.melon, MItems.white_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MFoods.yellow_melon), Items.melon, MItems.yellow_shard);
		GameRegistry.addRecipe(new ItemStack(MItems.ice_stick, 4), "X", "X", 'X', MBlocks.ice_planks);
		GameRegistry.addRecipe(new ItemStack(MItems.fire_stick, 4), "X", "X", 'X', MBlocks.fire_planks);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.stick), MItems.ice_stick, Blocks.fire);
		GameRegistry.addShapelessRecipe(new ItemStack(Items.stick), MItems.fire_stick, Blocks.ice);
		GameRegistry.addRecipe(new ItemStack(MItems.super_slime_ball, 8), "XXX", "XYX", "XXX", 'X', Items.slime_ball, 'Y', MItems.Nightmare_Gem);
		//Colors
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.cyan_shard), MItems.blue_shard, MItems.green_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.green_shard), MItems.blue_shard, MItems.yellow_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.lime_shard), MItems.green_shard, MItems.yellow_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.magenta_shard), MItems.blue_shard, MItems.red_shard, MItems.red_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.orange_shard), MItems.red_shard, MItems.yellow_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.pink_shard), MItems.red_shard, MItems.white_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.purple_shard), MItems.blue_shard, MItems.blue_shard, MItems.red_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.violet_shard), MItems.blue_shard, MItems.red_shard);
		//PARTS 4 MECH
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.Blue_Part), MItems.Blank_Part, MItems.blue_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.Green_Part), MItems.Blank_Part, MItems.green_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.Red_Part), MItems.Blank_Part, MItems.red_shard);
		GameRegistry.addShapedRecipe(new ItemStack(MItems.Blank_Part), " X ", "AYA", " X ", 'Y', MItems.black_shard, 'X', Items.redstone, 'A', MItems.bluestone);
	//Blocks
		GameRegistry.addRecipe(new ItemStack(MBlocks.ender_rite_block), "XXX", "XXX", "XXX", 'X', MItems.ender_rite_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ender_rite_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.ender_rite_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ender_rite_slab, 6), "XXX", 'X', MBlocks.ender_rite_block);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.ice_planks, 4), MBlocks.ice_log);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.fire_planks, 4), MBlocks.fire_log);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_cobblestone, 2), "XY", "YX", 'X', Blocks.cobblestone, 'Y', Blocks.ice);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_cobblestone, 2), "XY", "YX", 'X', Blocks.cobblestone, 'Y', Blocks.fire);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_crafting_table), "XX", "XX", 'X', MBlocks.ice_planks);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_crafting_table), "XX", "XX", 'X', MBlocks.fire_planks);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_fence), "XXX", "XXX", 'X', MItems.ice_stick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_fence), "XXX", "XXX", 'X', MItems.fire_stick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.aged_brick_side, 2), "X", "X", 'X', MBlocks.aged_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.mixed_brick_side, 2), "X", "X", 'X', MBlocks.mixed_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.light_brick_side, 2), "X", "X", 'X', MBlocks.light_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.dark_brick_side, 2), "X", "X", 'X', MBlocks.dark_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.aged_brick, 2), "X", "X", 'X', MBlocks.aged_brick_side);
		GameRegistry.addRecipe(new ItemStack(MBlocks.mixed_brick, 2), "X", "X", 'X', MBlocks.mixed_brick_side);
		GameRegistry.addRecipe(new ItemStack(MBlocks.light_brick, 2), "X", "X", 'X', MBlocks.light_brick_side);
		GameRegistry.addRecipe(new ItemStack(MBlocks.dark_brick, 2), "X", "X", 'X', MBlocks.dark_brick_side);
		GameRegistry.addShapedRecipe(new ItemStack(MBlocks.light_pyramid), " X ", "X X", "XXX", 'X', MItems.light_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.super_slime), "XXX", "XXX", "XXX", 'X', MItems.super_slime_ball);
		//Ice
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_stonebrick, 4), "XX", "XX", 'X', MBlocks.ice_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_stone_polished, 2), "X", "X", 'X', MBlocks.ice_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_stone_pillar, 2), "X", "X", 'X', MBlocks.ice_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_stone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.ice_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_stonebrick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.ice_stonebrick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.ice_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.ice_cobblestone);
		//Fire
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_stonebrick, 4), "XX", "XX", 'X', MBlocks.fire_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_stone_polished, 2), "X", "X", 'X', MBlocks.fire_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_stone_pillar, 2), "X", "X", 'X', MBlocks.fire_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_stone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.fire_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_stonebrick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.fire_stonebrick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.fire_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.fire_cobblestone);
		//Nightmare
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_stonebrick, 4), "XX", "XX", 'X', MBlocks.nightmare_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_stone_polished, 2), "X", "X", 'X', MBlocks.nightmare_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_stone_pillar, 2), "X", "X", 'X', MBlocks.nightmare_stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_stone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.nightmare_stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_stonebrick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.nightmare_stonebrick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.nightmare_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.nightmare_cobblestone);
		//Sandstone
		GameRegistry.addRecipe(new ItemStack(MBlocks.sandstone_brick, 4), "XX", "XX", 'X', MBlocks.sandstone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.sandstone_polished, 2), "X", "X", 'X', Blocks.sandstone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.sandstone_pillar, 2), "X", "X", 'X', MBlocks.sandstone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.sandstone_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.sandstone_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.sandstone_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.sandstone_cobblestone);
		//Marble
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_brick, 4), "XX", "XX", 'X', MBlocks.marble_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_polished, 2), "X", "X", 'X', MBlocks.marble);
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_pillar, 2), "X", "X", 'X', MBlocks.marble_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.marble);
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.marble_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.marble_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.marble_cobblestone);
		//Granite
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_brick, 4), "XX", "XX", 'X', MBlocks.granite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_polished, 2), "X", "X", 'X', MBlocks.granite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_pillar, 2), "X", "X", 'X', MBlocks.granite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.granite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.granite_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.granite_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.granite_cobblestone);
		//Diorite
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_brick, 4), "XX", "XX", 'X', MBlocks.diorite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_polished, 2), "X", "X", 'X', MBlocks.diorite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_pillar, 2), "X", "X", 'X', MBlocks.diorite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.diorite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.diorite_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.diorite_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.diorite_cobblestone);
		//Andesite
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_brick, 4), "XX", "XX", 'X', MBlocks.andesite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_polished, 2), "X", "X", 'X', MBlocks.andesite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_pillar, 2), "X", "X", 'X', MBlocks.andesite_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.andesite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.andesite_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.andesite_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.andesite_cobblestone);
		//Slate
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_brick, 4), "XX", "XX", 'X', MBlocks.slate_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_polished, 2), "X", "X", 'X', MBlocks.slate);
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_pillar, 2), "X", "X", 'X', MBlocks.slate_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.slate);
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.slate_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.slate_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.slate_cobblestone);
		//Stone
		GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick, 4), "XX", "XX", 'X', MBlocks.stone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.stone_polished, 2), "X", "X", 'X', Blocks.stone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.stone_pillar, 2), "X", "X", 'X', MBlocks.stone_polished);
		//Red Sandstone
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone, 4), "XX", "XX", 'X', new ItemStack(Blocks.sand, 1, 1));
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_brick, 4), "XX", "XX", 'X', MBlocks.red_sandstone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_polished, 2), "X", "X", 'X', MBlocks.red_sandstone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_pillar, 2), "X", "X", 'X', MBlocks.red_sandstone_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.red_sandstone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.red_sandstone_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_sandstone_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.red_sandstone_cobblestone);
		//Basalt
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_brick, 4), "XX", "XX", 'X', MBlocks.basalt_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_polished, 2), "X", "X", 'X', MBlocks.basalt);
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_pillar, 2), "X", "X", 'X', MBlocks.basalt_polished);
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.basalt);
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_brick_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.basalt_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.basalt_cobblestone_stairs, 4), "X  ", "XX ", "XXX", 'X', MBlocks.basalt_cobblestone);
		//Color blocks
		GameRegistry.addRecipe(new ItemStack(MBlocks.black_block), "XXX", "XXX", "XXX", 'X', MItems.black_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.blue_block), "XXX", "XXX", "XXX", 'X', MItems.blue_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.cyan_block), "XXX", "XXX", "XXX", 'X', MItems.cyan_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.green_block), "XXX", "XXX", "XXX", 'X', MItems.green_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.lime_block), "XXX", "XXX", "XXX", 'X', MItems.lime_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.magenta_block), "XXX", "XXX", "XXX", 'X', MItems.magenta_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.orange_block), "XXX", "XXX", "XXX", 'X', MItems.orange_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.pink_block), "XXX", "XXX", "XXX", 'X', MItems.pink_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.purple_block), "XXX", "XXX", "XXX", 'X', MItems.purple_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_block), "XXX", "XXX", "XXX", 'X', MItems.red_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.white_block), "XXX", "XXX", "XXX", 'X', MItems.white_shard);
		GameRegistry.addRecipe(new ItemStack(MBlocks.yellow_block), "XXX", "XXX", "XXX", 'X', MItems.yellow_shard);
			//Bricks
		GameRegistry.addRecipe(new ItemStack(MBlocks.black_brick, 4), " XX", " XX", 'X', MBlocks.black_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.blue_brick, 4), " XX", " XX", 'X', MBlocks.blue_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.cyan_brick, 4), " XX", " XX", 'X', MBlocks.cyan_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.green_brick, 4), " XX", " XX", 'X', MBlocks.green_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.lime_brick, 4), " XX", " XX", 'X', MBlocks.lime_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.magenta_brick, 4), " XX", " XX", 'X', MBlocks.magenta_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.orange_brick, 4), " XX", " XX", 'X', MBlocks.orange_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.pink_brick, 4), " XX", " XX", 'X', MBlocks.pink_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.purple_brick, 4), " XX", " XX", 'X', MBlocks.purple_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_brick, 4), " XX", " XX", 'X', MBlocks.red_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.white_brick, 4), " XX", " XX", 'X', MBlocks.white_block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.yellow_brick, 4), " XX", " XX", 'X', MBlocks.yellow_block);
				//Stairs
		GameRegistry.addRecipe(new ItemStack(MBlocks.black_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.black_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.blue_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.blue_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.cyan_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.cyan_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.green_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.green_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.lime_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.lime_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.magenta_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.magenta_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.orange_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.orange_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.pink_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.pink_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.purple_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.purple_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.red_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.white_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.white_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.yellow_brick_stairs, 4), "  X", " XX", "XXX", 'X', MBlocks.yellow_brick);
				//Slabs
		GameRegistry.addRecipe(new ItemStack(MBlocks.black_brick_slab, 6), "XXX", 'X', MBlocks.black_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.blue_brick_slab, 6), "XXX", 'X', MBlocks.blue_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.cyan_brick_slab, 6), "XXX", 'X', MBlocks.cyan_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.green_brick_slab, 6), "XXX", 'X', MBlocks.green_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.lime_brick_slab, 6), "XXX", 'X', MBlocks.lime_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.magenta_brick_slab, 6), "XXX", 'X', MBlocks.magenta_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.orange_brick_slab, 6), "XXX", 'X', MBlocks.orange_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.pink_brick_slab, 6), "XXX", 'X', MBlocks.pink_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.purple_brick_slab, 6), "XXX", 'X', MBlocks.purple_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.red_brick_slab, 6), "XXX", 'X', MBlocks.red_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.white_brick_slab, 6), "XXX", 'X', MBlocks.white_brick);
		GameRegistry.addRecipe(new ItemStack(MBlocks.yellow_brick_slab, 6), "XXX", 'X', MBlocks.yellow_brick);
		//Gem Blocks
		GameRegistry.addRecipe(new ItemStack(MBlocks.Amethyst_Block), "XXX", "XXX", "XXX", 'X', MItems.amethyst);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Carnelian_Block), "XXX", "XXX", "XXX", 'X', MItems.carnelian);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Jade_Block), "XXX", "XXX", "XXX", 'X', MItems.jade);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Jasper_Block), "XXX", "XXX", "XXX", 'X', MItems.jasper);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Malachite_Block), "XXX", "XXX", "XXX", 'X', MItems.malachite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Moonstone_Block), "XXX", "XXX", "XXX", 'X', MItems.moonstone);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Onyx_Block), "XXX", "XXX", "XXX", 'X', MItems.onyx);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Peridot_Block), "XXX", "XXX", "XXX", 'X', MItems.peridot);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Sapphire_Block), "XXX", "XXX", "XXX", 'X', MItems.sapphire);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Tanzanite_Block), "XXX", "XXX", "XXX", 'X', MItems.tanzanite);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Tiger_eye_Block), "XXX", "XXX", "XXX", 'X', MItems.tiger_eye);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Topaz_Block), "XXX", "XXX", "XXX", 'X', MItems.topaz);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Vermarine_Block), "XXX", "XXX", "XXX", 'X', MItems.vermarine);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Vermarine_Slab, 6), "XXX", 'X', MBlocks.Vermarine_Block);
		GameRegistry.addRecipe(new ItemStack(MBlocks.Vermarine_Block), "XX", 'X', MBlocks.Vermarine_Slab);
		//Halloween
		GameRegistry.addRecipe(new ItemStack(MItems.Pumpkin_Carver), " Y ", "X  ", 'X', MItems.orange_shard, 'Y', Items.iron_ingot);
			//White
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_1), MBlocks.white_pumpkin, MItems.Pumpkin_Face_1, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_1_lit), MBlocks.white_pumpkin_1, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_2), MBlocks.white_pumpkin, MItems.Pumpkin_Face_2, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_2_lit), MBlocks.white_pumpkin_2, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_3), MBlocks.white_pumpkin, MItems.Pumpkin_Face_3, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_3_lit), MBlocks.white_pumpkin_3, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_4), MBlocks.white_pumpkin, MItems.Pumpkin_Face_4, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_4_lit), MBlocks.white_pumpkin_4, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_5), MBlocks.white_pumpkin, MItems.Pumpkin_Face_5, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_5_lit), MBlocks.white_pumpkin_5, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_6), MBlocks.white_pumpkin, MItems.Pumpkin_Face_6, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_6_lit), MBlocks.white_pumpkin_6, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_7), MBlocks.white_pumpkin, MItems.Pumpkin_Face_7, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_7_lit), MBlocks.white_pumpkin_7, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_8), MBlocks.white_pumpkin, MItems.Pumpkin_Face_8, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.white_pumpkin_8_lit), MBlocks.white_pumpkin_8, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.white_pumpkin_seeds), Items.pumpkin_seeds, MItems.white_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.white_pumpkin_seeds), MBlocks.white_pumpkin);
			//Blue
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_1), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_1, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_1_lit), MBlocks.blue_pumpkin_1, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_2), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_2, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_2_lit), MBlocks.blue_pumpkin_2, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_3), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_3, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_3_lit), MBlocks.blue_pumpkin_3, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_4), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_4, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_4_lit), MBlocks.blue_pumpkin_4, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_5), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_5, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_5_lit), MBlocks.blue_pumpkin_5, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_6), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_6, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_6_lit), MBlocks.blue_pumpkin_6, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_7), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_7, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_7_lit), MBlocks.blue_pumpkin_7, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_8), MBlocks.blue_pumpkin, MItems.Pumpkin_Face_8, MItems.Pumpkin_Carver.setContainerItem(MItems.Pumpkin_Carver));
		GameRegistry.addShapelessRecipe(new ItemStack(MBlocks.blue_pumpkin_8_lit), MBlocks.blue_pumpkin_8, Blocks.torch);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.blue_pumpkin_seeds), Items.pumpkin_seeds, MItems.blue_shard);
		GameRegistry.addShapelessRecipe(new ItemStack(MItems.blue_pumpkin_seeds), MBlocks.blue_pumpkin);
	}
	public static void addSmeltingRec(){
		GameRegistry.addSmelting(MBlocks.ender_rite_ore, new ItemStack(MItems.ender_rite_shard), 1.1f);
		GameRegistry.addSmelting(MBlocks.end_iron_ore, new ItemStack(Items.iron_ingot), 0.7f);
		GameRegistry.addSmelting(MBlocks.end_coal_ore, new ItemStack(Items.coal), 0.1f);
		GameRegistry.addSmelting(MBlocks.end_gold_ore, new ItemStack(Items.gold_ingot), 1.0f);
		GameRegistry.addSmelting(MBlocks.end_diamond_ore, new ItemStack(Items.diamond), 1.0f);
		GameRegistry.addSmelting(MBlocks.end_emerald_ore, new ItemStack(Items.emerald), 1.0f);
		GameRegistry.addSmelting(MBlocks.end_ruby_ore, new ItemStack(MItems.ruby), 1.0f);
		GameRegistry.addSmelting(MBlocks.end_lapis_ore, new ItemStack(Items.dye, 1, 4), 0.2f);
		GameRegistry.addSmelting(MBlocks.ice_cobblestone, new ItemStack(MBlocks.ice_stone), 0.5f);
		GameRegistry.addSmelting(MBlocks.fire_cobblestone, new ItemStack(MBlocks.fire_stone), 0.5f);
		GameRegistry.addSmelting(MBlocks.nightmare_cobblestone, new ItemStack(MBlocks.nightmare_stone), 0.5f);
		GameRegistry.addSmelting(MBlocks.andesite_cobblestone, new ItemStack(MBlocks.andesite), 0.5f);
		GameRegistry.addSmelting(MBlocks.diorite_cobblestone, new ItemStack(MBlocks.diorite), 0.5f);
		GameRegistry.addSmelting(MBlocks.granite_cobblestone, new ItemStack(MBlocks.granite), 0.5f);
		GameRegistry.addSmelting(MBlocks.marble_cobblestone, new ItemStack(MBlocks.marble), 0.5f);
		GameRegistry.addSmelting(MBlocks.sandstone_cobblestone, new ItemStack(Blocks.sandstone), 0.5f);
		GameRegistry.addSmelting(MBlocks.slate_cobblestone, new ItemStack(MBlocks.slate), 0.5f);
		GameRegistry.addSmelting(MBlocks.red_sandstone_cobblestone, new ItemStack(MBlocks.red_sandstone), 0.5f);
		GameRegistry.addSmelting(MBlocks.basalt_cobblestone, new ItemStack(MBlocks.basalt), 0.5f);
		//Color ores
		GameRegistry.addSmelting(MBlocks.black_ore, new ItemStack(MItems.black_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.blue_ore, new ItemStack(MItems.blue_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.cyan_ore, new ItemStack(MItems.cyan_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.green_ore, new ItemStack(MItems.green_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.lime_ore, new ItemStack(MItems.lime_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.magenta_ore, new ItemStack(MItems.magenta_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.orange_ore, new ItemStack(MItems.orange_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.pink_ore, new ItemStack(MItems.pink_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.purple_ore, new ItemStack(MItems.purple_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.red_ore, new ItemStack(MItems.red_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.white_ore, new ItemStack(MItems.white_shard), 0.7f);
		GameRegistry.addSmelting(MBlocks.yellow_ore, new ItemStack(MItems.yellow_shard), 0.7f);
	}
	
	public static void removeCraftingRec(){
		List<IRecipe> recipes = CraftingManager.getInstance().getRecipeList();
		
		Iterator<IRecipe> Leash = recipes.iterator();
		
			while (Leash.hasNext()) {
				ItemStack is = Leash.next().getRecipeOutput();
				if (is != null && is.getItem() == Item.getItemFromBlock(Blocks.stonebrick))
					Leash.remove();
			};
	}
}
