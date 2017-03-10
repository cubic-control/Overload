package com.cubic_control.overload.Armor;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmorMaterial {
	//("NAME", maxDamageFactor, new int []{damageReductionAmountArray}, enchantability);
		/*Gems*/
	public static ArmorMaterial Aventurine_Armor = EnumHelper.addArmorMaterial("Aventurine_Armor", 65, new int[]{5, 8, 7, 4}, 89);
	public static ArmorMaterial Amethyst_Armor = EnumHelper.addArmorMaterial("Amethyst_Armor", 45, new int[]{3, 8, 6, 3}, 50);
	public static ArmorMaterial Beryl_Armor = EnumHelper.addArmorMaterial("Beryl_Armor", 44, new int[]{3, 9, 6, 3}, 50);
	public static ArmorMaterial Carnelian_Armor = EnumHelper.addArmorMaterial("Carnelian_Armor", 38, new int[]{3, 8, 6, 3}, 37);
	public static ArmorMaterial Jade_Armor = EnumHelper.addArmorMaterial("Jade_Armor", 47, new int[]{3, 8, 7, 2}, 50);
	public static ArmorMaterial Jasper_Armor = EnumHelper.addArmorMaterial("Jasper_Armor", 36, new int[]{3, 8, 6, 2}, 50);
	public static ArmorMaterial Malachite_Armor = EnumHelper.addArmorMaterial("Malachite_Armor", 55, new int[]{3, 8, 6, 4}, 50);
	public static ArmorMaterial Moonstone_Armor = EnumHelper.addArmorMaterial("Moonstone_Armor", 42, new int[]{2, 9, 6, 2}, 50);
	public static ArmorMaterial Onyx_Armor = EnumHelper.addArmorMaterial("Onyx_Armor", 57, new int[]{4, 8, 6, 4}, 50);
	public static ArmorMaterial Peridot_Armor = EnumHelper.addArmorMaterial("Peridot_Armor", 34, new int[]{4, 8, 6, 4}, 50);
	public static ArmorMaterial Sapphire_Armor = EnumHelper.addArmorMaterial("Sapphire_Armor", 48, new int[]{4, 8, 5, 3}, 50);
	public static ArmorMaterial Tanzanite_Armor = EnumHelper.addArmorMaterial("Tanzanite_Armor", 39, new int[]{4, 8, 5, 3}, 50);
	public static ArmorMaterial Tiger_Eye_Armor = EnumHelper.addArmorMaterial("Tiger_Eye_Armor", 51, new int[]{3, 8, 6, 4}, 50);
	public static ArmorMaterial Topaz_Armor = EnumHelper.addArmorMaterial("Topaz_Armor", 45, new int[]{3, 8, 7, 3}, 50);
	public static ArmorMaterial Vermarine_Armor = EnumHelper.addArmorMaterial("Vermarine_Armor", 60, new int[]{4, 8, 7, 4}, 79);
		/*Color*/
	public static ArmorMaterial c_armor = EnumHelper.addArmorMaterial("c_armor", 15, new int[]{3, 6, 5, 2}, 9);
		/*Rainbow*/
	public static ArmorMaterial iron = EnumHelper.addArmorMaterial("iron", 16, new int[]{3, 7, 6, 3}, 10);
	public static ArmorMaterial gold = EnumHelper.addArmorMaterial("gold", 8, new int[]{3, 6, 4, 2}, 26);
	public static ArmorMaterial diamond = EnumHelper.addArmorMaterial("diamond", 34, new int[]{4, 9, 7, 4}, 11);
	/**Misc_Armor*/
	public static ArmorMaterial ender_rite_armor = EnumHelper.addArmorMaterial("ender_rite_armor", 40, new int[]{4, 9, 7, 4}, 30);
	public static ArmorMaterial ruby_armor = EnumHelper.addArmorMaterial("ruby_armor", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial flight_armor = EnumHelper.addArmorMaterial("flight_armor", 25, new int[]{0, 0, 0, 5}, 20);
	public static ArmorMaterial light_armor = EnumHelper.addArmorMaterial("light_armor", 85, new int[]{4, 7, 6, 3}, 95);
	public static ArmorMaterial death_armor = EnumHelper.addArmorMaterial("death_armor", 70, new int[]{5, 8, 7, 4}, 65);
}
