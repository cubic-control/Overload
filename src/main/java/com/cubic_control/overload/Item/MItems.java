package com.cubic_control.overload.Item;

import com.cubic_control.overload.Armor.Amethyst_Armor;
import com.cubic_control.overload.Armor.Carnelian_Armor;
import com.cubic_control.overload.Armor.ModArmorMaterial;
import com.cubic_control.overload.Armor.black_armor;
import com.cubic_control.overload.Armor.blue_armor;
import com.cubic_control.overload.Armor.cyan_armor;
import com.cubic_control.overload.Armor.ender_rite_armor;
import com.cubic_control.overload.Armor.green_armor;
import com.cubic_control.overload.Armor.ruby_armor;
import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Classes.ItemBluestone;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Food.ModFood;
import com.cubic_control.overload.Main.MainRegistry;
import com.cubic_control.overload.Tools.ModItemAxe;
import com.cubic_control.overload.Tools.ModItemHoe;
import com.cubic_control.overload.Tools.ModItemMachete;
import com.cubic_control.overload.Tools.ModItemNightmareSword;
import com.cubic_control.overload.Tools.ModItemPickaxe;
import com.cubic_control.overload.Tools.ModItemSpade;
import com.cubic_control.overload.Tools.ModItemSword;
import com.cubic_control.overload.Tools.ModToolMaterial;
import com.cubic_control.overload.lib.RefStrings;

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
	
//Armor
	public static Item ruby_horse_armor;
//Tools
	//battlegear2
	public static Item ender_rite_dagger;
	public static Item ender_rite_mace;
	public static Item ender_rite_spear;
	public static Item ender_rite_waraxe;
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
	public static Item flint_and_rainbow;
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
	public static Item ice_door;
	public static Item fire_door;
	public static Item super_slime_ball;
	public static Item teleporter;
	public static Item cubic_head;
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
	//Items
		ender_rite_shard = new ModItem("ender_rite_shard", "ender_rite_shard");
		bluestone = new ItemBluestone("bluestone").setTextureName(RefStrings.MODID + ":bluestone");
		//repeater = new ItemRepeater("repeater");
		Ender_rite_bow = new ItemEnder_rite_bow("Ender_rite_bow");
		Ender_rite_elytra = new ModItemElytra(ender_rite_shard, ModArmorMaterial.ender_rite_armor, "Ender-rite_elytra");
		wing_right = new ModItem("wing_right", "wing_right");
		wing_left = new ModItem("wing_left", "wing_left");
		ruby = new ModItem("ruby", "ruby");
		FlintAndIce = new ModFlintAndSteel("FlintAndIce", "flint_and_ice", MBlocks.ice_fire);
		flint_and_fire = new ModFlintAndSteel("FlintAndFire", "flint_and_fire", MBlocks.burned_fire);
		flint_and_nightmare = new ModFlintAndSteel("FlintAndNightmare", "flint_and_nightmare", MBlocks.nightmare_fire);
		flint_and_rainbow = new ModFlintAndSteel("FlintAndRainbow", "flint_and_rainbow", MBlocks.rainbow_fire);
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
		ice_door = new ModItemDoor("ice_door", "door_ice");
		fire_door = new ModItemDoor("fire_door", "door_fire");
		super_slime_ball = new ModItem("super_slimeball");
		teleporter = new ModItemTeleporter("teleporter");
		cubic_head = new ModItem("nohelm").setCreativeTab(null);
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
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-Alex", 0xFAC020, 0x34E3AF, "Zombie-Alex");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-jeb_", 0x287A23, 0x34E3AF, "Zombie-jeb_");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-Notch", 0xfaebd7, 0x34E3AF, "Zombie-Notch");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-Dinnerbone", 0x0008FF, 0x34E3AF, "Zombie-Dinnerbone");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-cubic_control", 0xB54CCF, 0x34E3AF, "Zombie-cubic_control");
		ModSpawnEgg = new ModItemMonsterPlacer("Zombie-super_sonic_10", 0x572C0E, 0x34E3AF, "Zombie-super_sonic_10");
		ModSpawnEgg = new ModItemMonsterPlacer("ZombieCow", 0xAAD490, 0x85755E, "ZombieCow");
		ModSpawnEgg = new ModItemMonsterPlacer("JeffTheKiller", 0xFFFFFF, 0x8A0707, "JeffTheKiller");
		ModSpawnEgg = new ModItemMonsterPlacer("InjuredSteve", 0xFF4000, 0x00BFFF, "InjuredSteve");
		ModSpawnEgg = new ModItemMonsterPlacer("MantisMan", 0x4AC25C, 0x73FF88, "MantisMan");
		ModSpawnEgg = new ModItemMonsterPlacer("Stalker", 0xC70E0E, 0x000000, "Stalker");
		ModSpawnEgg = new ModItemMonsterPlacer("FrostedCow", 0x0015FF, 0x9000FF, "FrostedCow");
		ModSpawnEgg = new ModItemMonsterPlacer("FrostedPig", 0x00D0FF, 0xFF00F7, "FrostedPig");
		ModSpawnEgg = new ModItemMonsterPlacer("FrostedChicken", 0x00FFF2, 0x7300FF, "FrostedChicken");
		ModSpawnEgg = new ModItemMonsterPlacer("FrostedSheep", 0x1D20CF, 0xF2FFFD, "FrostedSheep");
		ModSpawnEgg = new ModItemMonsterPlacer("FireAssassin", 0xFF744A, 0x7D8F7C, "FireAssassin");
		ModSpawnEgg = new ModItemMonsterPlacer("IceAssassin", 0x4AD5FF, 0x7D8F7C, "IceAssassin");
		ModSpawnEgg = new ModItemMonsterPlacer("FireArcher", 0xF07160, 0xCFCFCF, "FireArcher");
		ModSpawnEgg = new ModItemMonsterPlacer("IceArcher", 0x60DFF0, 0xCFCFCF, "IceArcher");
		ModSpawnEgg = new ModItemMonsterPlacer("FireGuard", 0xBF0300, 0x828282, "FireGuard");
		ModSpawnEgg = new ModItemMonsterPlacer("IceGuard", 0x00BCBF, 0x828282, "IceGuard");
		ModSpawnEgg = new ModItemMonsterPlacer("FireWarrior", 0xFF455B, 0x666666, "FireWarrior");
		ModSpawnEgg = new ModItemMonsterPlacer("IceWarrior", 0x45FFE9, 0x666666, "IceWarrior");
		ModSpawnEgg = new ModItemMonsterPlacer("PlasticCow", 0x806547, 0x949494, "PlasticCow");
		ModSpawnEgg = new ModItemMonsterPlacer("PlasticChicken", 0xEDEDED, 0xFF6E6E, "PlasticChicken");
		ModSpawnEgg = new ModItemMonsterPlacer("FireVillager", 0xD60019, 0xDEDEDE, "FireVillager");
		ModSpawnEgg = new ModItemMonsterPlacer("IceVillager", 0x00D6BD, 0xDEDEDE, "IceVillager");
			//Nightmares
		ModSpawnEgg = new ModItemMonsterPlacer("NightmareCubic", 0x2E298A, 0xFFFFFF, "NightmareCubic");
		ModSpawnEgg = new ModItemMonsterPlacer("DeadAngel", 0x000000, 0xFFFFFF, "DeadAngel");
		ModSpawnEgg = new ModItemMonsterPlacer("StalkingWarrior", 0xB50000, 0x000000, "StalkingWarrior");
		ModSpawnEgg = new ModItemMonsterPlacer("Unknown", 0x00BFFF, 0xFFFFFF, "Unknown");
		ModSpawnEgg = new ModItemMonsterPlacer("NightmareVillager", 0xBB00FF, 0x00FFA6, "NightmareVillager");
		ModSpawnEgg = new ModItemMonsterPlacer("NightmareSteve", 0x1105F2, 0xFFFFFF, "NightmareSteve");
		ModSpawnEgg = new ModItemMonsterPlacer("NightmareAlex", 0x2C8A29, 0xFFFFFF, "NightmareAlex");
		ModSpawnEgg = new ModItemMonsterPlacer("NightmareHerobrine", 0x858585, 0xFFFFFF, "NightmareHerobrine");
		ModSpawnEgg = new ModItemMonsterPlacer("Null", 0x000000, 0x858585, "Null");
		ModSpawnEgg = new ModItemMonsterPlacer("Pumpkin", 0xDB9A00, 0x000000, "Pumpkin");
		ModSpawnEgg = new ModItemMonsterPlacer("Headless", 0xB6B7B8, 0xFFFFFF, "Headless");
		ModSpawnEgg = new ModItemMonsterPlacer("FakeHeadlessHorseman", 0x858585, 0x961B1B, "FakeHeadlessHorseman");
		ModSpawnEgg = new ModItemMonsterPlacer("Nightmare", 0xFFFFFF, 0x000000, "Nightmare");
		ModSpawnEgg = new ModItemMonsterPlacer("GiantNightmare", 0xdcd9cd, 0x1A1A1A, "GiantNightmare");
		ModSpawnEgg = new ModItemMonsterPlacer("DeathGuard", 0x00B5B5, 0xB5B5B5, "DeathGuard");
		ModSpawnEgg = new ModItemMonsterPlacer("606", 0x606060, 0x060606, "606");
			//Dragons
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomWhite", 0xFFFFFF, 0xC4C0C0, "DragonPhantomWhite");
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomBlue", 0x0000FF, 0xC4C0C0, "DragonPhantomBlue");
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomGreen", 0x00FF80, 0xC4C0C0, "DragonPhantomGreen");
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomLightBlue", 0x6BA5E8, 0xC4C0C0, "DragonPhantomLightBlue");
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomRed", 0xFF007F, 0xC4C0C0, "DragonPhantomRed");
		ModSpawnEgg = new ModItemMonsterPlacer("DragonPhantomYellow", 0xFEFF00, 0xC4C0C0, "DragonPhantomYellow");
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
