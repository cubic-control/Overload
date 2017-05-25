package com.cubic_control.overload.Main;

import java.util.List;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.stats.Achievement;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.AchievementPage;

import com.cubic_control.overload.Achievements.MAchievements;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import cpw.mods.fml.common.registry.EntityRegistry;

public class ServerProxy {
	public void registerRenderInfo(){
		MAchievements.achievementInstalled.registerStat();
		//Rainbow Line
		MAchievements.achievementColours.registerStat();
		MAchievements.achievementColorful.registerStat();
		MAchievements.achievementRainbows.registerStat();
		//Ice Line
		//Fire Line
		//Nightmare Line
		MAchievements.achievementNightmare.registerStat();
		MAchievements.achievementWTYN.registerStat();
		MAchievements.achievementFearless.registerStat();
		MAchievements.achievementSlayer.registerStat();
		MAchievements.achievementLight.registerStat();
		MAchievements.achievementDeath.registerStat();
	}
	public int addArmor(String armor){
		return 0;
	}	
	 public ModelBiped getArmorModel(int id){ return null; }
}
