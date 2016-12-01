package com.cubic_control.Mobs;

import net.minecraftforge.common.MinecraftForge;

import com.cubic_control.Blocks.VanilaBlockDropChanger;
import com.cubic_control.Blocks.VanilaBlockTextureChanger;
import com.cubic_control.Main.MainRegistry;

import cpw.mods.fml.common.registry.EntityRegistry;

public class MEntities {
	public static void mainRegistry(){
		LoadModdedEntities();
	}
	
	public static void LoadModdedEntities(){
		/**Monsters*/
		EntityRegistry.registerModEntity(EntityZombieAlex.class, "Zombie Alex", 1, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieJeb.class, "Zombie jeb_", 2, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieNotch.class, "Zombie Notch", 3, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieDinnerbone.class, "Zombie Dinnerbone", 4, MainRegistry.instance, 64, 1, true);
		//TODO: Replace
		EntityRegistry.registerModEntity(EntityZombieYoutuber.class, "Zombie DryAxe", 5, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZC.class, "Zombie cubic_control", 6, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieSuperSonic10.class, "Zombie super_sonic_10", 7, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieCow.class, "Zombie Cow", 8, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityJeff.class, "Jeff The Killer", 9, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityInjuredSteve.class, "Injured Steve", 10, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityMantisMan.class, "Mantis Man", 11, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalker.class, "Stalker", 12, MainRegistry.instance, 64, 1, true);
			//Nightmares
		EntityRegistry.registerModEntity(EntityNightmareCubic.class, "Nightmare Cubic", 13, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDeadAngel.class, "Dead Angel", 14, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalkingWarrior.class, "Stalking Warrior", 15, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityUnknown.class, "Unknown", 16, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareVillager.class, "Nightmare Villager", 17, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareSteve.class, "Nightmare Steve", 18, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareAlex.class, "Nightmare Alex", 19, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareHerobrine.class, "Nightmare Herobrine", 20, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNull.class, "Null", 21, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPumpkin.class, "Pumpkin", 22, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityHeadless.class, "Headless", 23, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFakeHeadless.class, "Fake Headless Horseman", 24, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmare.class, "Nightmare", 25, MainRegistry.instance, 64, 1, true);
				//Dragons
		EntityRegistry.registerModEntity(EntityDragonPhantomWhite.class, "Dragon Phantom White", 26, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomBlue.class, "Dragon Phantom Blue", 27, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomGreen.class, "Dragon Phantom Green", 28, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomLightBlue.class, "Dragon Phantom Light Blue", 29, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomRed.class, "Dragon Phantom Red", 30, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomYellow.class, "Dragon Phantom Yellow", 31, MainRegistry.instance, 64, 1, true);
			//Bosses
		EntityRegistry.registerModEntity(EntityDeath.class, "Death", 32, MainRegistry.instance, 64, 1, true);
		/**Animals*/
		EntityRegistry.registerModEntity(EntityFrostedCow.class, "Frosted Cow", 32, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedPig.class, "Frosted Pig", 33, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedChicken.class, "Frosted Chicken", 34, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedSheep.class, "Frosted Sheep", 35, MainRegistry.instance, 64, 1, true);
	}
}
