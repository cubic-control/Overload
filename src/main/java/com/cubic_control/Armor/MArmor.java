package com.cubic_control.Armor;

import com.cubic_control.Item.MItems;
import com.cubic_control.Main.MainRegistry;
import com.cubic_control.lib.RefStrings;

import net.minecraft.item.Item;

public class MArmor {
	public static void mainRegistry(){
		InitializeItem();
	}
	/**Colored Armor*/
	/*Rainbow*/
	//Iron
	public static Item rainbow_iron_helmet;
	public static Item rainbow_iron_chestplate;
	public static Item rainbow_iron_leggings;
	public static Item rainbow_iron_boots;
	//Gold
	public static Item rainbow_gold_helmet;
	public static Item rainbow_gold_chestplate;
	public static Item rainbow_gold_leggings;
	public static Item rainbow_gold_boots;
	//Diamond
	public static Item rainbow_diamond_helmet;
	public static Item rainbow_diamond_chestplate;
	public static Item rainbow_diamond_leggings;
	public static Item rainbow_diamond_boots;
	/*Black*/
	public static Item black_helmet;
	public static Item black_chestplate;
	public static Item black_leggings;
	public static Item black_boots;
	/*Blue*/
	public static Item blue_helmet;
	public static Item blue_chestplate;
	public static Item blue_leggings;
	public static Item blue_boots;
	/*Cyan*/
	public static Item cyan_helmet;
	public static Item cyan_chestplate;
	public static Item cyan_leggings;
	public static Item cyan_boots;
	/*Green*/
	public static Item green_helmet;
	public static Item green_chestplate;
	public static Item green_leggings;
	public static Item green_boots;
	/*Lime*/
	public static Item lime_helmet;
	public static Item lime_chestplate;
	public static Item lime_leggings;
	public static Item lime_boots;
	/*Magenta*/
	public static Item magenta_helmet;
	public static Item magenta_chestplate;
	public static Item magenta_leggings;
	public static Item magenta_boots;
	/*Orange*/
	public static Item orange_helmet;
	public static Item orange_chestplate;
	public static Item orange_leggings;
	public static Item orange_boots;
	/*Pink*/
	public static Item pink_helmet;
	public static Item pink_chestplate;
	public static Item pink_leggings;
	public static Item pink_boots;
	/*Purple*/
	public static Item purple_helmet;
	public static Item purple_chestplate;
	public static Item purple_leggings;
	public static Item purple_boots;
	/*Red*/
	public static Item red_helmet;
	public static Item red_chestplate;
	public static Item red_leggings;
	public static Item red_boots;
	/*Violet*/
	public static Item violet_helmet;
	public static Item violet_chestplate;
	public static Item violet_leggings;
	public static Item violet_boots;
	/*White*/
	public static Item white_helmet;
	public static Item white_chestplate;
	public static Item white_leggings;
	public static Item white_boots;
	/*Yellow*/
	public static Item yellow_helmet;
	public static Item yellow_chestplate;
	public static Item yellow_leggings;
	public static Item yellow_boots;
	/**Gem Armor*/
	/*Aventurine*/
	public static Item aventurine_helmet;
	public static Item aventurine_chestplate;
	public static Item aventurine_leggings;
	public static Item aventurine_boots;
	/*Amethyst*/
	public static Item amethyst_helmet;
	public static Item amethyst_chestplate;
	public static Item amethyst_leggings;
	public static Item amethyst_boots;
	/*Beryl*/
	public static Item beryl_helmet;
	public static Item beryl_chestplate;
	public static Item beryl_leggings;
	public static Item beryl_boots;
	/*Carnelian*/
	public static Item carnelian_helmet;
	public static Item carnelian_chestplate;
	public static Item carnelian_leggings;
	public static Item carnelian_boots;
	/*Jade*/
	public static Item jade_helmet;
	public static Item jade_chestplate;
	public static Item jade_leggings;
	public static Item jade_boots;
	/*Jasper*/
	public static Item jasper_helmet;
	public static Item jasper_chestplate;
	public static Item jasper_leggings;
	public static Item jasper_boots;
	/*Malachite*/
	public static Item malachite_helmet;
	public static Item malachite_chestplate;
	public static Item malachite_leggings;
	public static Item malachite_boots;
	/*Moonstone*/
	public static Item moonstone_helmet;
	public static Item moonstone_chestplate;
	public static Item moonstone_leggings;
	public static Item moonstone_boots;
	/*Onyx*/
	public static Item onyx_helmet;
	public static Item onyx_chestplate;
	public static Item onyx_leggings;
	public static Item onyx_boots;
	/*Peridot*/
	public static Item peridot_helmet;
	public static Item peridot_chestplate;
	public static Item peridot_leggings;
	public static Item peridot_boots;
	/*Sapphire*/
	public static Item sapphire_helmet;
	public static Item sapphire_chestplate;
	public static Item sapphire_leggings;
	public static Item sapphire_boots;
	/*Tanzanite*/
	public static Item tanzanite_helmet;
	public static Item tanzanite_chestplate;
	public static Item tanzanite_leggings;
	public static Item tanzanite_boots;
	/*Tiger_Eye*/
	public static Item tiger_eye_helmet;
	public static Item tiger_eye_chestplate;
	public static Item tiger_eye_leggings;
	public static Item tiger_eye_boots;
	/*Topaz*/
	public static Item topaz_helmet;
	public static Item topaz_chestplate;
	public static Item topaz_leggings;
	public static Item topaz_boots;
	/*Vermarine*/
	public static Item vermarine_helmet;
	public static Item vermarine_chestplate;
	public static Item vermarine_leggings;
	public static Item vermarine_boots;
	/**Misc_Armor*/
	/*Ender-rite*/
	public static Item ender_rite_helmet;
	public static Item ender_rite_chestplate;
	public static Item ender_rite_leggings;
	public static Item ender_rite_boots;
	/*Ruby*/
	public static Item ruby_helmet;
	public static Item ruby_chestplate;
	public static Item ruby_leggings;
	public static Item ruby_boots;
	/*Flight*/
	public static Item flight_boots;
	/*Light*/
	public static Item light_helmet;
	public static Item light_chestplate;
	public static Item light_leggings;
	public static Item light_boots;
	/*Death*/
	public static Item death_helmet;
	public static Item death_chestplate;
	public static Item death_leggings;
	public static Item death_boots;

	private static void InitializeItem() {
		/**Colored Armor*/
		/*Rainbow*/
		//Iron
		rainbow_iron_helmet = new rainbow_iron_armor(ModArmorMaterial.iron, MainRegistry.proxy.addArmor("iron"), 0, "rainbow_iron_helmet");
		rainbow_iron_chestplate = new rainbow_iron_armor(ModArmorMaterial.iron, MainRegistry.proxy.addArmor("iron"), 1, "rainbow_iron_chestplate");
		rainbow_iron_leggings = new rainbow_iron_armor(ModArmorMaterial.iron, MainRegistry.proxy.addArmor("iron"), 2, "rainbow_iron_leggings");
		rainbow_iron_boots = new rainbow_iron_armor(ModArmorMaterial.iron, MainRegistry.proxy.addArmor("iron"), 3, "rainbow_iron_boots");
		//Gold
		rainbow_gold_helmet = new rainbow_gold_armor(ModArmorMaterial.gold, MainRegistry.proxy.addArmor("gold"), 0, "rainbow_gold_helmet");
		rainbow_gold_chestplate = new rainbow_gold_armor(ModArmorMaterial.gold, MainRegistry.proxy.addArmor("gold"), 1, "rainbow_gold_chestplate");
		rainbow_gold_leggings = new rainbow_gold_armor(ModArmorMaterial.gold, MainRegistry.proxy.addArmor("gold"), 2, "rainbow_gold_leggings");
		rainbow_gold_boots = new rainbow_gold_armor(ModArmorMaterial.gold, MainRegistry.proxy.addArmor("gold"), 3, "rainbow_gold_boots");
		//Diamond
		rainbow_diamond_helmet = new rainbow_diamond_armor(ModArmorMaterial.diamond, MainRegistry.proxy.addArmor("diamond"), 0, "rainbow_diamond_helmet");
		rainbow_diamond_chestplate = new rainbow_diamond_armor(ModArmorMaterial.diamond, MainRegistry.proxy.addArmor("diamond"), 1, "rainbow_diamond_chestplate");
		rainbow_diamond_leggings = new rainbow_diamond_armor(ModArmorMaterial.diamond, MainRegistry.proxy.addArmor("diamond"), 2, "rainbow_diamond_leggings");
		rainbow_diamond_boots = new rainbow_diamond_armor(ModArmorMaterial.diamond, MainRegistry.proxy.addArmor("diamond"), 3, "rainbow_diamond_boots");
		/*Black*/
		black_helmet = new black_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "black_helmet");
		black_chestplate = new black_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "black_chestplate");
		black_leggings = new black_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "black_leggings");
		black_boots = new black_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "black_boots");
		/*Blue*/
		blue_helmet = new blue_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "blue_helmet");
		blue_chestplate = new blue_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "blue_chestplate");
		blue_leggings = new blue_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "blue_leggings");
		blue_boots = new blue_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "blue_boots");
		/*Cyan*/
		cyan_helmet = new cyan_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "cyan_helmet");
		cyan_chestplate = new cyan_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "cyan_chestplate");
		cyan_leggings = new cyan_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "cyan_leggings");
		cyan_boots = new cyan_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "cyan_boots");
		/*Green*/
		green_helmet = new green_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "green_helmet");
		green_chestplate = new green_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "green_chestplate");
		green_leggings = new green_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "green_leggings");
		green_boots = new green_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "green_boots");
		/*Lime*/
		lime_helmet = new lime_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "lime_helmet");
		lime_chestplate = new lime_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "lime_chestplate");
		lime_leggings = new lime_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "lime_leggings");
		lime_boots = new lime_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "lime_boots");
		/*Magenta*/
		magenta_helmet = new magenta_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "magenta_helmet");
		magenta_chestplate = new magenta_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "magenta_chestplate");
		magenta_leggings = new magenta_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "magenta_leggings");
		magenta_boots = new magenta_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "magenta_boots");
		/*Orange*/
		orange_helmet = new orange_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "orange_helmet");
		orange_chestplate = new orange_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "orange_chestplate");
		orange_leggings = new orange_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "orange_leggings");
		orange_boots = new orange_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "orange_boots");
		/*Pink*/
		pink_helmet = new pink_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "pink_helmet");
		pink_chestplate = new pink_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "pink_chestplate");
		pink_leggings = new pink_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "pink_leggings");
		pink_boots = new pink_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "pink_boots");
		/*Purple*/
		purple_helmet = new purple_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "purple_helmet");
		purple_chestplate=new purple_armor(ModArmorMaterial.c_armor,MainRegistry.proxy.addArmor("c_armor"), 1, "purple_chestplate");
		purple_leggings = new purple_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "purple_leggings");
		purple_boots = new purple_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "purple_boots");
		/*Red*/
		red_helmet = new red_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "red_helmet");
		red_chestplate = new red_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "red_chestplate");
		red_leggings = new red_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "red_leggings");
		red_boots = new red_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "red_boots");
		/*Violet*/
		violet_helmet = new violet_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "violet_helmet");
		violet_chestplate = new violet_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "violet_chestplate");
		violet_leggings = new violet_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "violet_leggings");
		violet_boots = new violet_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "violet_boots");
		/*White*/
		white_helmet = new white_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "white_helmet");
		white_chestplate = new white_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "white_chestplate");
		white_leggings = new white_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "white_leggings");
		white_boots = new white_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "white_boots");
		/*Yellow*/
		yellow_helmet = new yellow_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 0, "yellow_helmet");
		yellow_chestplate = new yellow_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 1, "yellow_chestplate");
		yellow_leggings = new yellow_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 2, "yellow_leggings");
		yellow_boots = new yellow_armor(ModArmorMaterial.c_armor, MainRegistry.proxy.addArmor("c_armor"), 3, "yellow_boots");
		/**Gem Armor*/
		/*Aventurine*/
		aventurine_helmet = new Aventurine_Armor(ModArmorMaterial.Aventurine_Armor, MainRegistry.proxy.addArmor("Aventurine_Armor"), 0, "aventurine_helmet");
		aventurine_chestplate = new Aventurine_Armor(ModArmorMaterial.Aventurine_Armor, MainRegistry.proxy.addArmor("Aventurine_Armor"), 1, "aventurine_chestplate");
		aventurine_leggings = new Aventurine_Armor(ModArmorMaterial.Aventurine_Armor, MainRegistry.proxy.addArmor("Aventurine_Armor"), 2, "aventurine_leggings");
		aventurine_boots = new Aventurine_Armor(ModArmorMaterial.Aventurine_Armor, MainRegistry.proxy.addArmor("Aventurine_Armor"), 3, "aventurine_boots");
		/*Amethyst*/
		amethyst_helmet = new Amethyst_Armor(ModArmorMaterial.Amethyst_Armor, MainRegistry.proxy.addArmor("Amethyst_Armor"), 0, "Amethyst_Helmet");
		amethyst_chestplate = new Amethyst_Armor(ModArmorMaterial.Amethyst_Armor, MainRegistry.proxy.addArmor("Amethyst_Armor"), 1, "Amethyst_Chestplate");
		amethyst_leggings = new Amethyst_Armor(ModArmorMaterial.Amethyst_Armor, MainRegistry.proxy.addArmor("Amethyst_Armor"), 2, "Amethyst_Leggings");
		amethyst_boots = new Amethyst_Armor(ModArmorMaterial.Amethyst_Armor, MainRegistry.proxy.addArmor("Amethyst_Armor"), 3, "Amethyst_Boots");
		/*Beryl*/
		beryl_helmet = new Beryl_Armor(ModArmorMaterial.Beryl_Armor, MainRegistry.proxy.addArmor("Beryl_Armor"), 0, "Beryl_Helmet");
		beryl_chestplate = new Beryl_Armor(ModArmorMaterial.Beryl_Armor, MainRegistry.proxy.addArmor("Beryl_Armor"), 1, "Beryl_Chestplate");
		beryl_leggings = new Beryl_Armor(ModArmorMaterial.Beryl_Armor, MainRegistry.proxy.addArmor("Beryl_Armor"), 2, "Beryl_Leggings");
		beryl_boots = new Beryl_Armor(ModArmorMaterial.Beryl_Armor, MainRegistry.proxy.addArmor("Beryl_Armor"), 3, "Beryl_Boots");
		/*Carnelian*/
		carnelian_helmet = new Carnelian_Armor(ModArmorMaterial.Carnelian_Armor, MainRegistry.proxy.addArmor("Carnelian_Armor"), 0, "Carnelian_Helmet");
		carnelian_chestplate = new Carnelian_Armor(ModArmorMaterial.Carnelian_Armor, MainRegistry.proxy.addArmor("Carnelian_Armor"), 1, "Carnelian_Chestplate");
		carnelian_leggings = new Carnelian_Armor(ModArmorMaterial.Carnelian_Armor, MainRegistry.proxy.addArmor("Carnelian_Armor"), 2, "Carnelian_Leggings");
		carnelian_boots = new Carnelian_Armor(ModArmorMaterial.Carnelian_Armor, MainRegistry.proxy.addArmor("Carnelian_Armor"), 3, "Carnelian_Boots");
		/*Jade*/
		jade_helmet = new Jade_Armor(ModArmorMaterial.Jade_Armor, MainRegistry.proxy.addArmor("Jade_Armor"), 0, "Jade_Helmet");
		jade_chestplate = new Jade_Armor(ModArmorMaterial.Jade_Armor, MainRegistry.proxy.addArmor("Jade_Armor"), 1, "Jade_Chestplate");
		jade_leggings = new Jade_Armor(ModArmorMaterial.Jade_Armor, MainRegistry.proxy.addArmor("Jade_Armor"), 2, "Jade_Leggings");
		jade_boots = new Jade_Armor(ModArmorMaterial.Jade_Armor, MainRegistry.proxy.addArmor("Jade_Armor"), 3, "Jade_Boots");
		/*Jasper*/
		jasper_helmet = new Jasper_Armor(ModArmorMaterial.Jasper_Armor, MainRegistry.proxy.addArmor("Jasper_Armor"), 0, "Jasper_Helmet");
		jasper_chestplate = new Jasper_Armor(ModArmorMaterial.Jasper_Armor, MainRegistry.proxy.addArmor("Jasper_Armor"), 1, "Jasper_Chestplate");
		jasper_leggings = new Jasper_Armor(ModArmorMaterial.Jasper_Armor, MainRegistry.proxy.addArmor("Jasper_Armor"), 2, "Jasper_Leggings");
		jasper_boots = new Jasper_Armor(ModArmorMaterial.Jasper_Armor, MainRegistry.proxy.addArmor("Jasper_Armor"), 3, "Jasper_Boots");
		/*Malachite*/
		malachite_helmet = new Malachite_Armor(ModArmorMaterial.Malachite_Armor, MainRegistry.proxy.addArmor("Malachite_Armor"), 0, "Malachite_Helmet");
		malachite_chestplate = new Malachite_Armor(ModArmorMaterial.Malachite_Armor, MainRegistry.proxy.addArmor("Malachite_Armor"), 1, "Malachite_Chestplate");
		malachite_leggings = new Malachite_Armor(ModArmorMaterial.Malachite_Armor, MainRegistry.proxy.addArmor("Malachite_Armor"), 2, "Malachite_Leggings");
		malachite_boots = new Malachite_Armor(ModArmorMaterial.Malachite_Armor, MainRegistry.proxy.addArmor("Malachite_Armor"), 3, "Malachite_Boots");
		/*Moonstone*/
		moonstone_helmet = new Moonstone_Armor(ModArmorMaterial.Moonstone_Armor, MainRegistry.proxy.addArmor("Moonstone_Armor"), 0, "Moonstone_Helmet");
		moonstone_chestplate = new Moonstone_Armor(ModArmorMaterial.Moonstone_Armor, MainRegistry.proxy.addArmor("Moonstone_Armor"), 1, "Moonstone_Chestplate");
		moonstone_leggings = new Moonstone_Armor(ModArmorMaterial.Moonstone_Armor, MainRegistry.proxy.addArmor("Moonstone_Armor"), 2, "Moonstone_Leggings");
		moonstone_boots = new Moonstone_Armor(ModArmorMaterial.Moonstone_Armor, MainRegistry.proxy.addArmor("Moonstone_Armor"), 3, "Moonstone_Boots");
		/*Onyx*/
		onyx_helmet = new Onyx_Armor(ModArmorMaterial.Onyx_Armor, MainRegistry.proxy.addArmor("Onyx_Armor"), 0, "Onyx_Helmet");
		onyx_chestplate = new Onyx_Armor(ModArmorMaterial.Onyx_Armor, MainRegistry.proxy.addArmor("Onyx_Armor"), 1, "Onyx_Chestplate");
		onyx_leggings = new Onyx_Armor(ModArmorMaterial.Onyx_Armor, MainRegistry.proxy.addArmor("Onyx_Armor"), 2, "Onyx_Leggings");
		onyx_boots = new Onyx_Armor(ModArmorMaterial.Onyx_Armor, MainRegistry.proxy.addArmor("Onyx_Armor"), 3, "Onyx_Boots");
		/*Peridot*/
		peridot_helmet = new Peridot_Armor(ModArmorMaterial.Peridot_Armor, MainRegistry.proxy.addArmor("Peridot_Armor"), 0, "Peridot_Helmet");
		peridot_chestplate = new Peridot_Armor(ModArmorMaterial.Peridot_Armor, MainRegistry.proxy.addArmor("Peridot_Armor"), 1, "Peridot_Chestplate");
		peridot_leggings = new Peridot_Armor(ModArmorMaterial.Peridot_Armor, MainRegistry.proxy.addArmor("Peridot_Armor"), 2, "Peridot_Leggings");
		peridot_boots = new Peridot_Armor(ModArmorMaterial.Peridot_Armor, MainRegistry.proxy.addArmor("Peridot_Armor"), 3, "Peridot_Boots");
		/*Sapphire*/
		sapphire_helmet = new Sapphire_Armor(ModArmorMaterial.Sapphire_Armor, MainRegistry.proxy.addArmor("Sapphire_Armor"), 0, "Sapphire_Helmet");
		sapphire_chestplate = new Sapphire_Armor(ModArmorMaterial.Sapphire_Armor, MainRegistry.proxy.addArmor("Sapphire_Armor"), 1, "Sapphire_Chestplate");
		sapphire_leggings = new Sapphire_Armor(ModArmorMaterial.Sapphire_Armor, MainRegistry.proxy.addArmor("Sapphire_Armor"), 2, "Sapphire_Leggings");
		sapphire_boots = new Sapphire_Armor(ModArmorMaterial.Sapphire_Armor, MainRegistry.proxy.addArmor("Sapphire_Armor"), 3, "Sapphire_Boots");
		/*Tanzanite*/
		tanzanite_helmet = new Tanzanite_Armor(ModArmorMaterial.Tanzanite_Armor, MainRegistry.proxy.addArmor("Tanzanite_Armor"), 0, "Tanzanite_Helmet");
		tanzanite_chestplate = new Tanzanite_Armor(ModArmorMaterial.Tanzanite_Armor, MainRegistry.proxy.addArmor("Tanzanite_Armor"), 1, "Tanzanite_Chestplate");
		tanzanite_leggings = new Tanzanite_Armor(ModArmorMaterial.Tanzanite_Armor, MainRegistry.proxy.addArmor("Tanzanite_Armor"), 2, "Tanzanite_Leggings");
		tanzanite_boots = new Tanzanite_Armor(ModArmorMaterial.Tanzanite_Armor, MainRegistry.proxy.addArmor("Tanzanite_Armor"), 3, "Tanzanite_Boots");
		/*Tiger_Eye*/
		tiger_eye_helmet = new Tiger_Eye_Armor(ModArmorMaterial.Tiger_Eye_Armor, MainRegistry.proxy.addArmor("Tiger_Eye_Armor"), 0, "Tiger_Eye_Helmet");
		tiger_eye_chestplate = new Tiger_Eye_Armor(ModArmorMaterial.Tiger_Eye_Armor, MainRegistry.proxy.addArmor("Tiger_Eye_Armor"), 1, "Tiger_Eye_Chestplate");
		tiger_eye_leggings = new Tiger_Eye_Armor(ModArmorMaterial.Tiger_Eye_Armor, MainRegistry.proxy.addArmor("Tiger_Eye_Armor"), 2, "Tiger_Eye_Leggings");
		tiger_eye_boots = new Tiger_Eye_Armor(ModArmorMaterial.Tiger_Eye_Armor, MainRegistry.proxy.addArmor("Tiger_Eye_Armor"), 3, "Tiger_Eye_Boots");
		/*Topaz*/
		topaz_helmet = new Topaz_Armor(ModArmorMaterial.Topaz_Armor, MainRegistry.proxy.addArmor("Topaz_Armor"), 0, "Topaz_Helmet");
		topaz_chestplate = new Topaz_Armor(ModArmorMaterial.Topaz_Armor, MainRegistry.proxy.addArmor("Topaz_Armor"), 1, "Topaz_Chestplate");
		topaz_leggings = new Topaz_Armor(ModArmorMaterial.Topaz_Armor, MainRegistry.proxy.addArmor("Topaz_Armor"), 2, "Topaz_Leggings");
		topaz_boots = new Topaz_Armor(ModArmorMaterial.Topaz_Armor, MainRegistry.proxy.addArmor("Topaz_Armor"), 3, "Topaz_Boots");
		/*Vermarine*/
		vermarine_helmet = new Vermarine_Armor(ModArmorMaterial.Vermarine_Armor, MainRegistry.proxy.addArmor("Vermarine_Armor"), 0, "Vermarine_Helmet");
		vermarine_chestplate = new Vermarine_Armor(ModArmorMaterial.Vermarine_Armor, MainRegistry.proxy.addArmor("Vermarine_Armor"), 1, "Vermarine_Chestplate");
		vermarine_leggings = new Vermarine_Armor(ModArmorMaterial.Vermarine_Armor, MainRegistry.proxy.addArmor("Vermarine_Armor"), 2, "Vermarine_Leggings");
		vermarine_boots = new Vermarine_Armor(ModArmorMaterial.Vermarine_Armor, MainRegistry.proxy.addArmor("Vermarine_Armor"), 3, "Vermarine_Boots");
		/**Misc_Armor*/
		/*Ender-rite*/
		ender_rite_helmet = new ender_rite_armor(ModArmorMaterial.ender_rite_armor, MainRegistry.proxy.addArmor("ender_rite_armor"), 0, "ender_rite_helmet");
		ender_rite_chestplate = new ender_rite_armor(ModArmorMaterial.ender_rite_armor, MainRegistry.proxy.addArmor("ender_rite_armor"), 1, "ender_rite_chestplate");
		ender_rite_leggings = new ender_rite_armor(ModArmorMaterial.ender_rite_armor, MainRegistry.proxy.addArmor("ender_rite_armor"), 2, "ender_rite_leggings");
		ender_rite_boots = new ender_rite_armor(ModArmorMaterial.ender_rite_armor, MainRegistry.proxy.addArmor("ender_rite_armor"), 3, "ender_rite_boots");
		/*Ruby*/
		ruby_helmet = new ruby_armor(ModArmorMaterial.ruby_armor, MainRegistry.proxy.addArmor("ruby_armor"), 0, "ruby_helmet");
		ruby_chestplate = new ruby_armor(ModArmorMaterial.ruby_armor, MainRegistry.proxy.addArmor("ruby_armor"), 1, "ruby_chestplate");
		ruby_leggings = new ruby_armor(ModArmorMaterial.ruby_armor, MainRegistry.proxy.addArmor("ruby_armor"), 2, "ruby_leggings");
		ruby_boots = new ruby_armor(ModArmorMaterial.ruby_armor, MainRegistry.proxy.addArmor("ruby_armor"), 3, "ruby_boots");
		/*Flight*/
		flight_boots = new Flight_Armor(ModArmorMaterial.flight_armor, MainRegistry.proxy.addArmor("flight_armor"), 3, "flight_boots");
		/*Light*/
		/*Death*/
		death_helmet = new DeathArmor(ModArmorMaterial.death_armor, MainRegistry.proxy.addArmor("death_armor"), 0, "d_helmet");
		death_chestplate = new DeathArmor(ModArmorMaterial.death_armor, MainRegistry.proxy.addArmor("death_armor"), 1, "d_chestplate");
		death_leggings = new DeathArmor(ModArmorMaterial.death_armor, MainRegistry.proxy.addArmor("death_armor"), 2, "d_leggings");
		death_boots = new DeathArmor(ModArmorMaterial.death_armor, MainRegistry.proxy.addArmor("death_armor"), 3, "d_boots");
	}
}
