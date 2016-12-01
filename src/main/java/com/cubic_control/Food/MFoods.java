package com.cubic_control.Food;

import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class MFoods {
	public static void mainRegistry(){
		InitializeFoodItem();
	}
	//Food
	public static Item bubblegum;
	public static Item ender_rite_apple;
		/*Melon*/
	public static Item black_melon;
	public static Item blue_melon;
	public static Item cyan_melon;
	public static Item green_melon;
	public static Item lime_melon;
	public static Item magenta_melon;
	public static Item orange_melon;
	public static Item pink_melon;
	public static Item purple_melon;
	public static Item red_melon;
	public static Item violet_melon;
	public static Item white_melon;
	public static Item yellow_melon;
		/*Ice Food*/
	public static Item ice_beef;
	public static Item ice_chicken;
	public static Item ice_porkchop;
		
	public static void InitializeFoodItem(){
		bubblegum = new ModMagicFood(2, 2.5f, false, "bubblegum", new PotionEffect(Potion.jump.id, 150, 1));
		ender_rite_apple = new ModItemApple(8, 2.4f, "ender_rite_apple")
			.setPotionEffect(Potion.regeneration.id, 10, 2, 2.0F).setAlwaysEdible();
		/*Melon*/
		black_melon = new ModFood(2, false, "black_melon");
		blue_melon = new ModFood(2, false, "blue_melon");
		cyan_melon = new ModFood(2, false, "cyan_melon");
		green_melon = new ModFood(2, false, "green_melon");
		lime_melon = new ModFood(2, false, "lime_melon");
		magenta_melon = new ModFood(2, false, "magenta_melon");
		orange_melon = new ModFood(2, false, "orange_melon");
		pink_melon = new ModFood(2, false, "pink_melon");
		purple_melon = new ModFood(2, false, "purple_melon");
		red_melon = new ModFood(2, false, "red_melon");
		violet_melon = new ModFood(2, false, "violet_melon");
		white_melon = new ModFood(2, false, "white_melon");
		yellow_melon = new ModFood(2, false, "yellow_melon");
		/*Ice Food*/
		ice_beef = new ModFood(3, 3.6f, true, "ice_beef");
		ice_chicken = new ModFood(2, 2.4f, true, "ice_chicken");
		ice_porkchop = new ModFood(3, 1.2f, true, "ice_porkchop");
	}

}
