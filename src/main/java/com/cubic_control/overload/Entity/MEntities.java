package com.cubic_control.overload.Entity;

import net.minecraft.entity.Entity;
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
		registerEntity(EntityZombieAlex.class, "Zombie-Alex");
		registerEntity(EntityZombieJeb.class, "Zombie-jeb_");
		registerEntity(EntityZombieNotch.class, "Zombie-Notch");
		registerEntity(EntityZombieDinnerbone.class, "Zombie-Dinnerbone");
		//TODO: Replace
		//EntityRegistry.registerModEntity(EntityZombieYoutuber.class, "Zombie DryAxe", 5, MainRegistry.instance, 64, 1, true);
		registerEntity(EntityZC.class, "Zombie-cubic_control");
		registerEntity(EntityZombieSuperSonic10.class, "Zombie-super_sonic_10");
		registerEntity(EntityZombieCow.class, "ZombieCow");
		registerEntity(EntityJeffTheKiller.class, "JeffTheKiller");
		registerEntity(EntityInjuredSteve.class, "InjuredSteve");
		registerEntity(EntityMantisMan.class, "MantisMan");
		registerEntity(EntityStalker.class, "Stalker");
		registerEntity(EntityFireAssassin.class, "FireAssassin");
		registerEntity(EntityIceAssassin.class, "IceAssassin");
		registerEntity(EntityFireArcher.class, "FireArcher");
		registerEntity(EntityIceArcher.class, "IceArcher");
		registerEntity(EntityFireGuard.class, "FireGuard");
		registerEntity(EntityIceGuard.class, "IceGuard");
		registerEntity(EntityFireWarrior.class, "FireWarrior");
		registerEntity(EntityIceWarrior.class, "IceWarrior");
		registerEntity(EntityFireVillager.class, "FireVillager");
		registerEntity(EntityIceVillager.class, "IceVillager");
			//Nightmares
		registerEntity(EntityNightmareCubic.class, "NightmareCubic");
		registerEntity(EntityDeadAngel.class, "DeadAngel");
		registerEntity(EntityStalkingWarrior.class, "StalkingWarrior");
		registerEntity(EntityUnknown.class, "Unknown");
		registerEntity(EntityNightmareVillager.class, "NightmareVillager");
		registerEntity(EntityNightmareSteve.class, "NightmareSteve");
		registerEntity(EntityNightmareAlex.class, "NightmareAlex");
		registerEntity(EntityNightmareHerobrine.class, "NightmareHerobrine");
		registerEntity(EntityNull.class, "Null");
		registerEntity(EntityPumpkin.class, "Pumpkin");
		registerEntity(EntityHeadless.class, "Headless");
		registerEntity(EntityFakeHeadless.class, "FakeHeadlessHorseman");
		registerEntity(EntityNightmare.class, "Nightmare");
		registerEntity(EntityGiantNightmare.class, "GiantNightmare");
		registerEntity(EntityDeathGuard.class, "DeathGuard");
		registerEntity(Entity606.class, "606");
		registerEntity(EntityHeadlessMount.class, "HeadlessMount");
				//Dragons
		registerEntity(EntityDragonPhantomWhite.class, "DragonPhantomWhite");
		registerEntity(EntityDragonPhantomBlue.class, "DragonPhantomBlue");
		registerEntity(EntityDragonPhantomGreen.class, "DragonPhantomGreen");
		registerEntity(EntityDragonPhantomLightBlue.class, "DragonPhantomLightBlue");
		registerEntity(EntityDragonPhantomRed.class, "DragonPhantomRed");
		registerEntity(EntityDragonPhantomYellow.class, "DragonPhantomYellow");
			//Bosses
		registerEntity(EntityDeath.class, "Death");
		/**Animals*/
		registerEntity(EntityFrostedCow.class, "FrostedCow");
		registerEntity(EntityFrostedPig.class, "FrostedPig");
		registerEntity(EntityFrostedChicken.class, "FrostedChicken");
		registerEntity(EntityFrostedSheep.class, "FrostedSheep");
		registerEntity(EntityPlasticCow.class, "PlasticCow");
		registerEntity(EntityPlasticChicken.class, "PlasticChicken");
		/**Other**/
		registerEntity(EntityCBombPrimed.class, "CBombPrimed");
	}
	
	private static int nextId = 0;
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName){
		EntityRegistry.registerModEntity(entityClass, entityName, nextId, MainRegistry.instance, 64, 1, true);
		nextId++;
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates){
		EntityRegistry.registerModEntity(entityClass, entityName, nextId, MainRegistry.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		nextId++;
	}
}
