package com.cubic_control.overload.Achievements;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class MAchievements {
	public static Achievement achievementInstalled;
	//Rainbow Line
	public static Achievement achievementColours;
	public static Achievement achievementColorful;
	public static Achievement achievementRainbows;
	//Ice Line
	//Fire Line
	//Nightmare Line
	public static Achievement achievementNightmare;
	public static Achievement achievementWTYN;
	public static Achievement achievementFearless;
	public static Achievement achievementSlayer;
	public static Achievement achievementLight;
	public static Achievement achievementDeath;
	
	public static void createAchievements(){
		achievementInstalled = new Achievement("achievement.installed", "installed", 0, -4, MItems.cubic_head, null);
		//Rainbow Line
		achievementColours = new Achievement("achievement.colours", "colours", -2, 0, MItems.blue_shard, achievementInstalled);
		achievementColorful = new Achievement("achievement.colorful", "colorful", -2, 2, MItems.rainbow_shard, achievementColours);
		achievementRainbows = new Achievement("achievement.rainbows", "rainbows", -2, 4, MBlocks.rainbow_portal, achievementColorful);
		//Ice Line
		//Fire Line
		//Nightmare Line
		achievementNightmare = new Achievement("achievement.nightmare", "nightmare", 2, 0, MItems.Nightmare_Gem, achievementInstalled);
		achievementWTYN = new Achievement("achievement.wtyn", "wtyn", 2, 2, Item.getItemFromBlock(MBlocks.nightmare_portal), achievementNightmare);
		achievementFearless = new Achievement("achievement.fearless", "fearless", 3, 4, MTools.black_nightmare_sword, achievementWTYN);
		achievementSlayer = new Achievement("achievement.slayer", "slayer", 1, 4, MTools.white_nightmare_sword, achievementWTYN);
		achievementLight = new Achievement("achievement.light", "light", 3, 6, MItems.light_shard, achievementFearless);
		achievementDeath = new Achievement("achievement.death", "death", 2, 10, MItems.death_heart, achievementWTYN);
		
		AchievementPage.registerAchievementPage(new AchievementPage("Overload Achievements", new Achievement[]{
				achievementInstalled,
				//Rainbow Line
				achievementColours,
				achievementColorful,
				achievementRainbows,
				//Ice Line
				//Fire Line
				//Nightmare Line
				achievementNightmare,
				achievementWTYN,
				achievementFearless,
				achievementSlayer,
				achievementLight,
				achievementDeath,
		}));
	}

}
