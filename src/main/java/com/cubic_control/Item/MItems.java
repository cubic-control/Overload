package com.cubic_control.Item;

import com.cubic_control.Armor.Amethyst_Armor;
import com.cubic_control.Armor.Carnelian_Armor;
import com.cubic_control.Armor.ModArmorMaterial;
import com.cubic_control.Armor.black_armor;
import com.cubic_control.Armor.blue_armor;
import com.cubic_control.Armor.cyan_armor;
import com.cubic_control.Armor.ender_rite_armor;
import com.cubic_control.Armor.green_armor;
import com.cubic_control.Armor.ruby_armor;
import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.Classes.ItemBluestone;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Food.ModFood;
import com.cubic_control.Main.MainRegistry;
import com.cubic_control.Tools.ModItemAxe;
import com.cubic_control.Tools.ModItemHoe;
import com.cubic_control.Tools.ModItemMachete;
import com.cubic_control.Tools.ModItemNightmareSword;
import com.cubic_control.Tools.ModItemPickaxe;
import com.cubic_control.Tools.ModItemSpade;
import com.cubic_control.Tools.ModItemSword;
import com.cubic_control.Tools.ModToolMaterial;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemDoor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemRedstone;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class MItems {
	public static void mainRegistry(){
		InitializeItem();
		registerItem();
	}
	public static ToolMaterial ender_rite_tools = EnumHelper.addToolMaterial("ender_rite_tools", 4, 1964, 9.0F, 4.0F, 30);
	public static ToolMaterial c_tools = EnumHelper.addToolMaterial("c_tools", 2, 350, 6.5F, 2.5F, 28);
	public static ToolMaterial nightmare_c_tools = EnumHelper.addToolMaterial("nightmare_c_tools", 3, 2009, 7.3F, 3.3F, 100);
	public static ToolMaterial ruby_tools = EnumHelper.addToolMaterial("ruby_tools", 3, 1561, 8.0F, 3.0F, 10);
		//Gem Tools
	public static ToolMaterial Aventurine_Tools = EnumHelper.addToolMaterial("Aventurine_Tools", 3, 1537, 8.37F, 3.37F, 57);
	public static ToolMaterial Amethyst_Tools = EnumHelper.addToolMaterial("Amethyst_Tools", 3, 1500, 8.5F, 3.5F, 50);
	public static ToolMaterial Beryl_Tools = EnumHelper.addToolMaterial("Beryl_Tools", 3, 2561, 8.3F, 3.3F, 50);
	public static ToolMaterial Carnelian_Tools = EnumHelper.addToolMaterial("Carnelian_Tools", 3, 1437, 8.7F, 3.7F, 37);
	public static ToolMaterial Jade_Tools = EnumHelper.addToolMaterial("Jade_Tools", 3, 1567, 8.3F, 3.3F, 67);
	public static ToolMaterial Jasper_Tools = EnumHelper.addToolMaterial("Jasper_Tools", 3, 1687, 8.2F, 3.2F, 50);
//Armor
	public static Item ruby_horse_armor;
//Tools
	public static Item ender_rite_pickaxe;
	public static Item ender_rite_axe;
	public static Item ender_rite_spade;
	public static Item ender_rite_sword;
	public static Item ender_rite_hoe;
	public static Item ender_rite_machete;
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
	//battlegear2
	public static Item ender_rite_dagger;
	public static Item ender_rite_mace;
	public static Item ender_rite_spear;
	public static Item ender_rite_waraxe;
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
//Items
	public static Item ender_rite_shard;
	public static Item bluestone;
	public static Item repeater;
	public static Item Ender_rite_bow;
	public static Item Ender_rite_elytra;
	public static Item wing_right;
	public static Item wing_left;
	public static Item ruby;
	public static Item FlintAndIce;
	public static Item flint_and_fire;
	public static Item flint_and_nightmare;
	public static Item RottenMilk;
	public static Item Blank_Part;
	public static Item Blue_Part;
	public static Item Green_Part;
	public static Item Red_Part;
	public static Item Nightmare_Gem;
	public static Item frozen_iron;
	public static Item burned_iron;
	public static Item nightmare_iron;
	public static Item brick_dark;
	public static Item brick_light;
	public static Item dark_clay_ball;
	public static Item light_clay_ball;
	public static Item ice_stick;
	public static Item fire_stick;
	public static Item light_shard;
	public static Item death_heart;
	//Mob Drops
	public static Item ice_egg;
	public static Item ice_feather;
	/**Seeds*/
	public static Item white_melon_seeds;
	public static Item blue_melon_seeds;
	public static Item purple_melon_seeds;
	public static Item red_melon_seeds;
	public static Item violet_melon_seeds;
	public static Item yellow_melon_seeds;
	//Gems
	public static Item aventurine;
	public static Item amethyst;
	public static Item beryl;
	public static Item carnelian;
	public static Item jade;
	public static Item jasper;
	public static Item malachite;
	public static Item moonstone;
	public static Item onyx;
	public static Item peridot;
	public static Item sapphire;
	public static Item serendibite;
	public static Item tanzanite;
	public static Item tiger_eye;
	public static Item topaz;
	public static Item vermarine;
	//Color shards
	public static Item rainbow_shard;
	public static Item black_shard;
	public static Item blue_shard;
	public static Item brown_shard;
	public static Item cyan_shard;
	public static Item green_shard;
	public static Item lime_shard;
	public static Item magenta_shard;
	public static Item orange_shard;
	public static Item pink_shard;
	public static Item purple_shard;
	public static Item red_shard;
	public static Item violet_shard;
	public static Item white_shard;
	public static Item yellow_shard;
		//E-l-y-t-r-a
	public static Item black_elytra;
	public static Item blue_elytra;
	public static Item brown_elytra;
	public static Item cyan_elytra;
	public static Item green_elytra;
	public static Item lime_elytra;
	public static Item magenta_elytra;
	public static Item orange_elytra;
	public static Item pink_elytra;
	public static Item purple_elytra;
	public static Item red_elytra;
	public static Item violet_elytra;
	public static Item white_elytra;
	public static Item yellow_elytra;
	//Halloween
	public static Item Pumpkin_Carver;
	public static Item Pumpkin_Face_1;
	public static Item Pumpkin_Face_2;
	public static Item Pumpkin_Face_3;
	public static Item Pumpkin_Face_4;
	public static Item Pumpkin_Face_5;
	public static Item Pumpkin_Face_6;
	public static Item Pumpkin_Face_7;
	public static Item Pumpkin_Face_8;
		//Pumpkin Seeds
	public static ItemSeeds white_pumpkin_seeds;
	public static ItemSeeds blue_pumpkin_seeds;
	//SpawnEggs
	public static Item ModSpawnEgg;
	
	public static void InitializeItem(){
	//Armor
		ruby_horse_armor = new ruby_Horse_Armor("ruby_horse_armor").setTextureName(RefStrings.MODID + ":ruby_horse_armor");
	//Tools
		ender_rite_pickaxe = new ModItemPickaxe(ender_rite_tools, "ender_rite_pickaxe", "ender_rite_pickaxe");
		ender_rite_axe = new ModItemAxe(ender_rite_tools, "ender_rite_axe", "ender_rite_axe");
		ender_rite_spade = new ModItemSpade(ender_rite_tools, "ender_rite_spade", "ender_rite_spade");
		ender_rite_sword = new ModItemSword(ender_rite_tools, "ender_rite_sword", "ender_rite_sword");
		ender_rite_hoe = new ModItemHoe(ender_rite_tools, "ender_rite_hoe", "ender_rite_hoe");
		ender_rite_machete = new ModItemMachete(ender_rite_tools, "ender_rite_machete", "ender_rite_machete");
		//Nightmare Swords
		black_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "black_nightmare_sword", "black_sword");
		blue_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "blue_nightmare_sword", "blue_sword");
		cyan_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "cyan_nightmare_sword", "cyan_sword");
		diamond_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_diamond_tools, "diamond_nightmare_sword", "diamond_sword");
		gold_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_gold_tools, "gold_nightmare_sword", "gold_sword");
		green_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "green_nightmare_sword", "green_sword");
		iron_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_iron_tools, "iron_nightmare_sword", "iron_sword");
		lime_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "lime_nightmare_sword", "lime_sword");
		magenta_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "magenta_nightmare_sword", "magenta_sword");
		orange_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "orange_nightmare_sword", "orange_sword");
		pink_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "pink_nightmare_sword", "pink_sword");
		purple_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "purple_nightmare_sword", "purple_sword");
		red_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "red_nightmare_sword", "red_sword");
		stone_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_stone_tools, "stone_nightmare_sword", "stone_sword");
		white_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "white_nightmare_sword", "white_sword");
		wooden_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_wooden_tools, "wooden_nightmare_sword", "wooden_sword");
		yellow_nightmare_sword = new ModItemNightmareSword(nightmare_c_tools, "yellow_nightmare_sword", "yellow_sword");
		ender_rite_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_ender_rite_tools, "ender_rite_nightmare_sword", "ender_rite_sword");
			//Gems
		aventurine_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_aventurine_tools, "aventurine_nightmare_sword", "aventurine_sword");
		amethyst_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_amethyst_tools, "amethyst_nightmare_sword", "amethyst_sword");
		beryl_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_beryl_tools, "beryl_nightmare_sword", "beryl_sword");
		carnelian_nightmare_sword = new ModItemNightmareSword(ModToolMaterial.nightmare_carnelian_tools, "carnelian_nightmare_sword", "carnelian_sword");
		//Gems Tools
		aventurine_pickaxe = new ModItemPickaxe(Aventurine_Tools, "aventurine_pickaxe", "gems/tools/aventurine_pickaxe");
		aventurine_axe = new ModItemAxe(Aventurine_Tools, "aventurine_axe", "gems/tools/aventurine_axe");
		aventurine_spade = new ModItemSpade(Aventurine_Tools, "aventurine_spade", "gems/tools/aventurine_spade");
		aventurine_sword = new ModItemSword(Aventurine_Tools, "aventurine_sword", "gems/tools/aventurine_sword");
		aventurine_hoe = new ModItemHoe(Aventurine_Tools, "aventurine_hoe", "gems/tools/aventurine_hoe");
		aventurine_machete = new ModItemMachete(Aventurine_Tools, "aventurine_machete", "gems/tools/aventurine_machete");
		amethyst_pickaxe = new ModItemPickaxe(Amethyst_Tools, "amethyst_pickaxe", "gems/tools/amethyst_pickaxe");
		amethyst_axe = new ModItemAxe(Amethyst_Tools, "amethyst_axe", "gems/tools/amethyst_axe");
		amethyst_spade = new ModItemSpade(Amethyst_Tools, "amethyst_spade", "gems/tools/amethyst_spade");
		amethyst_sword = new ModItemSword(Amethyst_Tools, "amethyst_sword", "gems/tools/amethyst_sword");
		amethyst_hoe = new ModItemHoe(Amethyst_Tools, "amethyst_hoe", "gems/tools/amethyst_hoe");
		amethyst_machete = new ModItemMachete(Amethyst_Tools, "amethyst_machete", "gems/tools/amethyst_machete");
		beryl_pickaxe = new ModItemPickaxe(Beryl_Tools, "beryl_pickaxe", "gems/tools/beryl_pickaxe");
		beryl_axe = new ModItemAxe(Beryl_Tools, "beryl_axe", "gems/tools/beryl_axe");
		beryl_spade = new ModItemSpade(Beryl_Tools, "beryl_spade", "gems/tools/beryl_spade");
		beryl_sword = new ModItemSword(Beryl_Tools, "beryl_sword", "gems/tools/beryl_sword");
		beryl_hoe = new ModItemHoe(Beryl_Tools, "beryl_hoe", "gems/tools/beryl_hoe");
		beryl_machete = new ModItemMachete(Beryl_Tools, "beryl_machete", "gems/tools/beryl_machete");
		carnelian_pickaxe = new ModItemPickaxe(Carnelian_Tools, "carnelian_pickaxe", "gems/tools/carnelian_pickaxe");
		carnelian_axe = new ModItemAxe(Carnelian_Tools, "carnelian_axe", "gems/tools/carnelian_axe");
		carnelian_spade = new ModItemSpade(Carnelian_Tools, "carnelian_spade", "gems/tools/carnelian_spade");
		carnelian_sword = new ModItemSword(Carnelian_Tools, "carnelian_sword", "gems/tools/carnelian_sword");
		carnelian_hoe = new ModItemHoe(Carnelian_Tools, "carnelian_hoe", "gems/tools/carnelian_hoe");
		carnelian_machete = new ModItemMachete(Carnelian_Tools, "carnelian_machete", "gems/tools/carnelian_machete");
		jade_pickaxe = new ModItemPickaxe(Jade_Tools, "jade_pickaxe", "gems/tools/jade_pickaxe");
		jade_axe = new ModItemAxe(Jade_Tools, "jade_axe", "gems/tools/jade_axe");
		jade_spade = new ModItemSpade(Jade_Tools, "jade_spade", "gems/tools/jade_spade");
		jade_sword = new ModItemSword(Jade_Tools, "jade_sword", "gems/tools/jade_sword");
		jade_hoe = new ModItemHoe(Jade_Tools, "jade_hoe", "gems/tools/jade_hoe");
		jade_machete = new ModItemMachete(Jade_Tools, "jade_machete", "gems/tools/jade_machete");
		jasper_pickaxe = new ModItemPickaxe(Jasper_Tools, "jasper_pickaxe", "gems/tools/jasper_pickaxe");
		jasper_axe = new ModItemAxe(Jasper_Tools, "jasper_axe", "gems/tools/jasper_axe");
		jasper_spade = new ModItemSpade(Jasper_Tools, "jasper_spade", "gems/tools/jasper_spade");
		jasper_sword = new ModItemSword(Jasper_Tools, "jasper_sword", "gems/tools/jasper_sword");
		jasper_hoe = new ModItemHoe(Jasper_Tools, "jasper_hoe", "gems/tools/jasper_hoe");
		jasper_machete = new ModItemMachete(Jasper_Tools, "jasper_machete", "gems/tools/jasper_machete");
	//Items
		ender_rite_shard = new ModItem("ender_rite_shard", "ender_rite_shard");
		bluestone = new ItemBluestone("bluestone").setTextureName(RefStrings.MODID + ":bluestone");
		repeater = new ItemRepeater("repeater");
		Ender_rite_bow = new ItemEnder_rite_bow("Ender_rite_bow");
		Ender_rite_elytra = new ModItemElytra(ender_rite_shard, ModArmorMaterial.ender_rite_armor, "Ender-rite_elytra");
		wing_right = new ModItem("wing_right", "wing_right");
		wing_left = new ModItem("wing_left", "wing_left");
		ruby = new ModItem("ruby", "ruby");
		FlintAndIce = new ModFlintAndSteel("FlintAndIce", "flint_and_ice", MBlocks.ice_fire);
		flint_and_fire = new ModFlintAndSteel("FlintAndFire", "flint_and_fire", MBlocks.burned_fire);
		flint_and_nightmare = new ModFlintAndSteel("FlintAndNightmare", "flint_and_nightmare", MBlocks.nightmare_fire);
		RottenMilk = new ModItemMilk("RottenMilk", new PotionEffect(Potion.confusion.id, 600, 1), new PotionEffect(Potion.hunger.id, 1200, 1), new PotionEffect(Potion.moveSpeed.id, 600, 1));
		Blank_Part = new ModItem("Blank_Part", "Blank_Part").setMaxStackSize(1);
		Blue_Part = new ModItem("Blue_Part", "Blue_Part").setMaxStackSize(1);
		Green_Part = new ModItem("Green_Part", "Green_Part").setMaxStackSize(1);
		Red_Part = new ModItem("Red_Part", "Red_Part").setMaxStackSize(1);
		Nightmare_Gem = new ModItem("Nightmare_Gem", "nightmare_gem");
		frozen_iron = new ModItem("frozen_iron", "frozen_iron");
		burned_iron = new ModItem("burned_iron", "burned_iron");
		nightmare_iron = new ModItem("nightmare_iron", "nightmare_iron");
		brick_dark = new ModItem("brick_dark", "brick_dark");
		brick_light = new ModItem("brick_light", "brick_light");
		dark_clay_ball = new ModItem("dark_clay_ball", "dark_clay_ball");
		light_clay_ball = new ModItem("light_clay_ball", "light_clay_ball");
		ice_stick = new ModItem("ice_stick");
		fire_stick = new ModItem("fire_stick");
		light_shard = new ModItem("light_shard");
		death_heart = new ModItem("d_heart");
		//Mob Drops
		ice_egg = new ModItemEgg("ice_egg");
		ice_feather = new ModItem("ice_feather", "ice_feather");
		/**SEEDS*/
		white_melon_seeds = new ModItemSeeds(MBlocks.white_melon_stem, Blocks.farmland, "seeds_white_melon");
		blue_melon_seeds = new ModItemSeeds(MBlocks.blue_melon_stem, Blocks.farmland, "seeds_blue_melon");
		purple_melon_seeds = new ModItemSeeds(MBlocks.purple_melon_stem, Blocks.farmland, "seeds_purple_melon");
		red_melon_seeds = new ModItemSeeds(MBlocks.red_melon_stem, Blocks.farmland, "seeds_red_melon");
		violet_melon_seeds = new ModItemSeeds(MBlocks.violet_melon_stem, Blocks.farmland, "seeds_violet_melon");
		yellow_melon_seeds = new ModItemSeeds(MBlocks.yellow_melon_stem, Blocks.farmland, "seeds_yellow_melon");
		//Gems
		aventurine = new ModItem("aventurine", "gems/aventurine");
		amethyst = new ModItem("amethyst", "gems/amethyst");
		beryl = new ModItem("beryl", "gems/beryl");
		carnelian = new ModItem("carnelian", "gems/carnelian");
		jade = new ModItem("jade", "gems/jade");
		jasper = new ModItem("jasper", "gems/jasper");
		malachite = new ModItem("malachite", "gems/malachite");
		moonstone = new ModItem("moonstone", "gems/moonstone");
		onyx = new ModItem("onyx", "gems/onyx");
		peridot = new ModItem("peridot", "gems/peridot");
		sapphire = new ModItem("sapphire", "gems/sapphire");
		serendibite = new ModItem("serendibite", "gems/serendibite");
		tanzanite = new ModItem("tanzanite", "gems/tanzanite");
		tiger_eye = new ModItem("tiger_eye", "gems/tiger_eye");
		topaz = new ModItem("topaz", "gems/topaz");
		vermarine = new ModItem("vermarine", "gems/vermarine");
		//Color shards
		rainbow_shard = new ModItem("rainbow_shard");
		black_shard = new ModItem("black_shard");
		blue_shard = new ModItem("blue_shard");
		brown_shard = new ModItem("brown_shard");
		cyan_shard = new ModItem("cyan_shard");
		green_shard = new ModItem("green_shard");
		lime_shard = new ModItem("lime_shard");
		magenta_shard = new ModItem("magenta_shard");
		orange_shard = new ModItem("orange_shard");
		pink_shard = new ModItem("pink_shard");
		purple_shard = new ModItem("purple_shard");
		red_shard = new ModItem("red_shard");
		violet_shard = new ModItem("violet_shard");
		white_shard = new ModItem("white_shard");
		yellow_shard = new ModItem("yellow_shard");
			//E-l-y-t-r-a
		black_elytra = new c_elytra(black_shard, "black_elytra");
		blue_elytra = new c_elytra(blue_shard, "blue_elytra");
		brown_elytra = new c_elytra(brown_shard, "brown_elytra");
		cyan_elytra = new c_elytra(cyan_shard, "cyan_elytra");
		green_elytra = new c_elytra(green_shard, "green_elytra");
		lime_elytra = new c_elytra(lime_shard, "lime_elytra");
		magenta_elytra = new c_elytra(magenta_shard, "magenta_elytra");
		orange_elytra = new c_elytra(orange_shard, "orange_elytra");
		pink_elytra = new c_elytra(pink_shard, "pink_elytra");
		purple_elytra = new c_elytra(purple_shard, "purple_elytra");
		red_elytra = new c_elytra(red_shard, "red_elytra");
		violet_elytra = new c_elytra(violet_shard, "violet_elytra");
		white_elytra = new c_elytra(white_shard, "white_elytra");
		yellow_elytra = new c_elytra(yellow_shard, "yellow_elytra");
		//Halloween
		Pumpkin_Carver = new ModItem("Pumpkin_Carver");
		Pumpkin_Face_1 = new ModItem("Pumpkin_Face_1");
		Pumpkin_Face_2 = new ModItem("Pumpkin_Face_2");
		Pumpkin_Face_3 = new ModItem("Pumpkin_Face_3");
		Pumpkin_Face_4 = new ModItem("Pumpkin_Face_4");
		Pumpkin_Face_5 = new ModItem("Pumpkin_Face_5");
		Pumpkin_Face_6 = new ModItem("Pumpkin_Face_6");
		Pumpkin_Face_7 = new ModItem("Pumpkin_Face_7");
		Pumpkin_Face_8 = new ModItem("Pumpkin_Face_8");
			//Pumpkin Seeds
		white_pumpkin_seeds = new ModItemSeeds(MBlocks.white_pumpkin_stem, Blocks.farmland, "white_pumpkin_seeds");
		blue_pumpkin_seeds = new ModItemSeeds(MBlocks.blue_pumpkin_stem, Blocks.farmland, "blue_pumpkin_seeds");
		//SpawnEggs
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie Alex", 0xFAC020, 0x34E3AF, "Zombie Alex");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie jeb_", 0x287A23, 0x34E3AF, "Zombie jeb_");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie Notch", 0xfaebd7, 0x34E3AF, "Zombie Notch");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie Dinnerbone", 0x0008FF, 0x34E3AF, "Zombie Dinnerbone");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie DryAxe", 0x575757, 0x34E3AF, "Zombie DryAxe");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie cubic_control", 0xB54CCF, 0x34E3AF, "Zombie cubic_control");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie super_sonic_10", 0x572C0E, 0x34E3AF, "Zombie super_sonic_10");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie Cow", 0xAAD490, 0x85755E, "Zombie Cow");
		ModSpawnEgg = new ModItemMonsterPlacer("Jeff The Killer", 0xFFFFFF, 0x8A0707, "Jeff The Killer");
		ModSpawnEgg = new ModItemMonsterPlacer("Injured Steve", 0xFF4000, 0x00BFFF, "Injured Steve");
		ModSpawnEgg = new ModItemMonsterPlacer("Mantis Man", 0x4AC25C, 0x73FF88, "Mantis Man");
		ModSpawnEgg = new ModItemMonsterPlacer("Stalker", 0xC70E0E, 0x000000, "Stalker");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare Cubic", 0x2E298A, 0xFFFFFF, "Nightmare Cubic");
		ModSpawnEgg = new ModItemMonsterPlacer("Dead Angel", 0x000000, 0xFFFFFF, "Dead Angel");
		ModSpawnEgg = new ModItemMonsterPlacer("Stalking Warrior", 0xB50000, 0x000000, "Stalking Warrior");
		ModSpawnEgg = new ModItemMonsterPlacer("Unknown", 0x00BFFF, 0xFFFFFF, "Unknown");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare Villager", 0xBB00FF, 0x00FFA6, "Nightmare Villager");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare Steve", 0x1105F2, 0xFFFFFF, "Nightmare Steve");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare Alex", 0x2C8A29, 0xFFFFFF, "Nightmare Alex");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare Herobrine", 0x858585, 0xFFFFFF, "Nightmare Herobrine");
		ModSpawnEgg = new ModItemMonsterPlacer("Null", 0x000000, 0x858585, "Null");
		ModSpawnEgg = new ModItemMonsterPlacer("Pumpkin", 0xDB9A00, 0x000000, "Pumpkin");
		ModSpawnEgg = new ModItemMonsterPlacer("Headless", 0xB6B7B8, 0xFFFFFF, "Headless");
		ModSpawnEgg = new ModItemMonsterPlacer("Fake Headless Horseman", 0x858585, 0x961B1B, "Fake Headless Horseman");
		ModSpawnEgg = new ModItemMonsterPlacer("Frosted Cow", 0x0015FF, 0x9000FF, "Frosted Cow");
		ModSpawnEgg = new ModItemMonsterPlacer("Frosted Pig", 0x00D0FF, 0xFF00F7, "Frosted Pig");
		ModSpawnEgg = new ModItemMonsterPlacer("Frosted Chicken", 0x00FFF2, 0x7300FF, "Frosted Chicken");
		ModSpawnEgg = new ModItemMonsterPlacer("Frosted Sheep", 0x1D20CF, 0xF2FFFD, "Frosted Sheep");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare", 0xFFFFFF, 0x000000, "Nightmare");
			//Dragons
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom White", 0xFFFFFF, 0xC4C0C0, "Dragon Phantom White");
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom Blue", 0x0000FF, 0xC4C0C0, "Dragon Phantom Blue");
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom Green", 0x00FF80, 0xC4C0C0, "Dragon Phantom Green");
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom Light Blue", 0x6BA5E8, 0xC4C0C0, "Dragon Phantom Light Blue");
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom Red", 0xFF007F, 0xC4C0C0, "Dragon Phantom Red");
		ModSpawnEgg = new ModItemMonsterPlacer("Dragon Phantom Yellow", 0xFEFF00, 0xC4C0C0, "Dragon Phantom Yellow");
			//Bosses
		ModSpawnEgg = new ModItemMonsterPlacer("Death", 0xB50000, 0xB5B5B5, "Death");
		if (MainRegistry.isOtherModLoaded) {
			//ender_rite_dagger = new ModItemDagger(ender_rite_tools, "ender_rite_dagger", 0f, 0f);
			//ender_rite_mace = new ModItemMace(ender_rite_tools, "ender_rite_mace", 0f);
			//ender_rite_spear = new ModItemSpear(ender_rite_tools, "ender_rite_spear", 0, 0f);
			//ender_rite_waraxe = new ModItemWaraxe(ender_rite_tools, "ender_rite_waraxe", 0);
			}
	}
	public static void registerItem(){
		/**REMOVED**/
	}
}
