package com.cubic_control.overload.Main;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import net.minecraftforge.oredict.OreDictionary;

public class MOreDictionary {
	public static void reg(){
		//Items
		OreDictionary.registerOre("gemRuby", MItems.ruby);
			//Gems
		OreDictionary.registerOre("gemAmethyst", MItems.amethyst);
		OreDictionary.registerOre("gemAventurine", MItems.aventurine);
		OreDictionary.registerOre("gemBeryl", MItems.beryl);
		OreDictionary.registerOre("gemCarnelian", MItems.carnelian);
		OreDictionary.registerOre("gemJade", MItems.jade);
		OreDictionary.registerOre("gemJasper", MItems.jasper);
		OreDictionary.registerOre("gemMalachite", MItems.malachite);
		OreDictionary.registerOre("gemMoonstone", MItems.moonstone);
		OreDictionary.registerOre("gemOnyx", MItems.onyx);
		OreDictionary.registerOre("gemPeridot", MItems.peridot);
		OreDictionary.registerOre("gemSapphire", MItems.sapphire);
		OreDictionary.registerOre("gemSerendibite", MItems.serendibite);
		OreDictionary.registerOre("gemTanzanite", MItems.tanzanite);
		OreDictionary.registerOre("gemTigerEye", MItems.tiger_eye);
		OreDictionary.registerOre("gemTopaz", MItems.topaz);
		OreDictionary.registerOre("gemVermarine", MItems.vermarine);
	}

}
