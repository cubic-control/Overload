package com.cubic_control.overload.Entity;

import net.minecraftforge.common.MinecraftForge;

import com.cubic_control.overload.Blocks.VanilaBlockDropChanger;
import com.cubic_control.overload.Blocks.VanilaBlockTextureChanger;
import com.cubic_control.overload.Main.MainRegistry;

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
		//EntityRegistry.registerModEntity(EntityZombieYoutuber.class, "Zombie DryAxe", 5, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZC.class, "Zombie cubic_control", 6, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieSuperSonic10.class, "Zombie super_sonic_10", 7, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieCow.class, "Zombie Cow", 8, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityJeffTheKiller.class, "Jeff The Killer", 9, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityInjuredSteve.class, "Injured Steve", 10, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityMantisMan.class, "Mantis Man", 11, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalker.class, "Stalker", 12, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireAssassin.class, "Fire Assassin", 13, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceAssassin.class, "Ice Assassin", 14, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireArcher.class, "Fire Archer", 15, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceArcher.class, "Ice Archer", 16, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireGuard.class, "Fire Guard", 17, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceGuard.class, "Ice Guard", 18, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireWarrior.class, "Fire Warrior", 19, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceWarrior.class, "Ice Warrior", 20, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireVillager.class, "Fire Villager", 21, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceVillager.class, "Ice Villager", 22, MainRegistry.instance, 64, 1, true);
			//Nightmares
		EntityRegistry.registerModEntity(EntityNightmareCubic.class, "Nightmare Cubic", 23, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDeadAngel.class, "Dead Angel", 24, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalkingWarrior.class, "Stalking Warrior", 25, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityUnknown.class, "Unknown", 26, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareVillager.class, "Nightmare Villager", 27, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareSteve.class, "Nightmare Steve", 28, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareAlex.class, "Nightmare Alex", 29, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareHerobrine.class, "Nightmare Herobrine", 30, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNull.class, "Null", 31, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPumpkin.class, "Pumpkin", 32, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityHeadless.class, "Headless", 33, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFakeHeadless.class, "Fake Headless Horseman", 34, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmare.class, "Nightmare", 35, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityGiantNightmare.class, "Giant Nightmare", 36, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDeathGuard.class, "Death Guard", 37, MainRegistry.instance, 64, 1, true);
				//Dragons
		EntityRegistry.registerModEntity(EntityDragonPhantomWhite.class, "Dragon Phantom White", 38, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomBlue.class, "Dragon Phantom Blue", 39, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomGreen.class, "Dragon Phantom Green", 40, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomLightBlue.class, "Dragon Phantom Light Blue", 41, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomRed.class, "Dragon Phantom Red", 42, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomYellow.class, "Dragon Phantom Yellow", 43, MainRegistry.instance, 64, 1, true);
			//Bosses
		EntityRegistry.registerModEntity(EntityDeath.class, "Death", 44, MainRegistry.instance, 64, 1, true);
		/**Animals*/
		EntityRegistry.registerModEntity(EntityFrostedCow.class, "Frosted Cow", 45, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedPig.class, "Frosted Pig", 46, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedChicken.class, "Frosted Chicken", 47, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedSheep.class, "Frosted Sheep", 48, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPlasticCow.class, "Plastic Cow", 49, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPlasticChicken.class, "Plastic Chicken", 50, MainRegistry.instance, 64, 1, true);
	}
}
