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
		EntityRegistry.registerModEntity(EntityZombieAlex.class, "Zombie-Alex", 1, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieJeb.class, "Zombie-jeb_", 2, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieNotch.class, "Zombie-Notch", 3, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieDinnerbone.class, "Zombie-Dinnerbone", 4, MainRegistry.instance, 64, 1, true);
		//TODO: Replace
		//EntityRegistry.registerModEntity(EntityZombieYoutuber.class, "Zombie DryAxe", 5, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZC.class, "Zombie-cubic_control", 6, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieSuperSonic10.class, "Zombie-super_sonic_10", 7, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityZombieCow.class, "ZombieCow", 8, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityJeffTheKiller.class, "JeffTheKiller", 9, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityInjuredSteve.class, "InjuredSteve", 10, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityMantisMan.class, "MantisMan", 11, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalker.class, "Stalker", 12, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireAssassin.class, "FireAssassin", 13, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceAssassin.class, "IceAssassin", 14, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireArcher.class, "FireArcher", 15, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceArcher.class, "IceArcher", 16, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireGuard.class, "FireGuard", 17, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceGuard.class, "IceGuard", 18, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireWarrior.class, "FireWarrior", 19, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceWarrior.class, "IceWarrior", 20, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFireVillager.class, "FireVillager", 21, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityIceVillager.class, "IceVillager", 22, MainRegistry.instance, 64, 1, true);
			//Nightmares
		EntityRegistry.registerModEntity(EntityNightmareCubic.class, "NightmareCubic", 23, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDeadAngel.class, "DeadAngel", 24, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityStalkingWarrior.class, "StalkingWarrior", 25, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityUnknown.class, "Unknown", 26, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareVillager.class, "NightmareVillager", 27, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareSteve.class, "NightmareSteve", 28, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareAlex.class, "NightmareAlex", 29, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmareHerobrine.class, "NightmareHerobrine", 30, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNull.class, "Null", 31, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPumpkin.class, "Pumpkin", 32, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityHeadless.class, "Headless", 33, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFakeHeadless.class, "FakeHeadlessHorseman", 34, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityNightmare.class, "Nightmare", 35, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityGiantNightmare.class, "GiantNightmare", 36, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDeathGuard.class, "DeathGuard", 37, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(Entity606.class, "606", 606, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityHeadlessMount.class, "HeadlessMount", 38, MainRegistry.instance, 64, 1, true);
				//Dragons
		EntityRegistry.registerModEntity(EntityDragonPhantomWhite.class, "DragonPhantomWhite", 39, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomBlue.class, "DragonPhantomBlue", 40, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomGreen.class, "DragonPhantomGreen", 41, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomLightBlue.class, "DragonPhantomLightBlue", 42, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomRed.class, "DragonPhantomRed", 43, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityDragonPhantomYellow.class, "DragonPhantomYellow", 44, MainRegistry.instance, 64, 1, true);
			//Bosses
		EntityRegistry.registerModEntity(EntityDeath.class, "Death", 45, MainRegistry.instance, 64, 1, true);
		/**Animals*/
		EntityRegistry.registerModEntity(EntityFrostedCow.class, "FrostedCow", 46, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedPig.class, "FrostedPig", 47, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedChicken.class, "FrostedChicken", 48, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityFrostedSheep.class, "FrostedSheep", 49, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPlasticCow.class, "PlasticCow", 50, MainRegistry.instance, 64, 1, true);
		EntityRegistry.registerModEntity(EntityPlasticChicken.class, "PlasticChicken", 51, MainRegistry.instance, 64, 1, true);
		/**Other**/
		EntityRegistry.registerModEntity(EntityCBombPrimed.class, "CBombPrimed", 52, MainRegistry.instance, 64, 1, true);
	}
}
