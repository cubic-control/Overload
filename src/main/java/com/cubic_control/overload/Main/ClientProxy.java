package com.cubic_control.overload.Main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelSheep2;

import com.cubic_control.overload.Entity.EntityDeadAngel;
import com.cubic_control.overload.Entity.EntityDeath;
import com.cubic_control.overload.Entity.EntityDeathGuard;
import com.cubic_control.overload.Entity.EntityDragonPhantomBlue;
import com.cubic_control.overload.Entity.EntityDragonPhantomGreen;
import com.cubic_control.overload.Entity.EntityDragonPhantomLightBlue;
import com.cubic_control.overload.Entity.EntityDragonPhantomRed;
import com.cubic_control.overload.Entity.EntityDragonPhantomWhite;
import com.cubic_control.overload.Entity.EntityDragonPhantomYellow;
import com.cubic_control.overload.Entity.EntityFakeHeadless;
import com.cubic_control.overload.Entity.EntityFireArcher;
import com.cubic_control.overload.Entity.EntityFireAssassin;
import com.cubic_control.overload.Entity.EntityFireGuard;
import com.cubic_control.overload.Entity.EntityFireVillager;
import com.cubic_control.overload.Entity.EntityFireWarrior;
import com.cubic_control.overload.Entity.EntityFrostedChicken;
import com.cubic_control.overload.Entity.EntityFrostedCow;
import com.cubic_control.overload.Entity.EntityFrostedPig;
import com.cubic_control.overload.Entity.EntityFrostedSheep;
import com.cubic_control.overload.Entity.EntityGiantNightmare;
import com.cubic_control.overload.Entity.EntityHeadless;
import com.cubic_control.overload.Entity.EntityIceArcher;
import com.cubic_control.overload.Entity.EntityIceAssassin;
import com.cubic_control.overload.Entity.EntityIceGuard;
import com.cubic_control.overload.Entity.EntityIceVillager;
import com.cubic_control.overload.Entity.EntityIceWarrior;
import com.cubic_control.overload.Entity.EntityInjuredSteve;
import com.cubic_control.overload.Entity.EntityJeffTheKiller;
import com.cubic_control.overload.Entity.EntityMantisMan;
import com.cubic_control.overload.Entity.EntityNightmare;
import com.cubic_control.overload.Entity.EntityNightmareAlex;
import com.cubic_control.overload.Entity.EntityNightmareCubic;
import com.cubic_control.overload.Entity.EntityNightmareHerobrine;
import com.cubic_control.overload.Entity.EntityNightmareSteve;
import com.cubic_control.overload.Entity.EntityNightmareVillager;
import com.cubic_control.overload.Entity.EntityNull;
import com.cubic_control.overload.Entity.EntityPlasticChicken;
import com.cubic_control.overload.Entity.EntityPlasticCow;
import com.cubic_control.overload.Entity.EntityPumpkin;
import com.cubic_control.overload.Entity.EntityStalker;
import com.cubic_control.overload.Entity.EntityStalkingWarrior;
import com.cubic_control.overload.Entity.EntityUnknown;
import com.cubic_control.overload.Entity.EntityZC;
import com.cubic_control.overload.Entity.EntityZombieAlex;
import com.cubic_control.overload.Entity.EntityZombieCow;
import com.cubic_control.overload.Entity.EntityZombieDinnerbone;
import com.cubic_control.overload.Entity.EntityZombieJeb;
import com.cubic_control.overload.Entity.EntityZombieNotch;
import com.cubic_control.overload.Entity.EntityZombieSuperSonic10;
import com.cubic_control.overload.Models.ModelAngel;
import com.cubic_control.overload.Models.ModelBiped64x64;
import com.cubic_control.overload.Models.ModelBipedSlim64x64;
import com.cubic_control.overload.Models.ModelJeff;
import com.cubic_control.overload.Models.ModelNewBiped;
import com.cubic_control.overload.Models.ModelZombieBiped;
import com.cubic_control.overload.Models.ModelZombieSlim;
import com.cubic_control.overload.Models.ModelZombie_Cow;
import com.cubic_control.overload.Render.RenderDeadAngel;
import com.cubic_control.overload.Render.RenderDeath;
import com.cubic_control.overload.Render.RenderDeathGuard;
import com.cubic_control.overload.Render.RenderDragonPhantomBlue;
import com.cubic_control.overload.Render.RenderDragonPhantomGreen;
import com.cubic_control.overload.Render.RenderDragonPhantomLightBlue;
import com.cubic_control.overload.Render.RenderDragonPhantomRed;
import com.cubic_control.overload.Render.RenderDragonPhantomWhite;
import com.cubic_control.overload.Render.RenderDragonPhantomYellow;
import com.cubic_control.overload.Render.RenderFakeHeadless;
import com.cubic_control.overload.Render.RenderFireArcher;
import com.cubic_control.overload.Render.RenderFireAssassin;
import com.cubic_control.overload.Render.RenderFireGuard;
import com.cubic_control.overload.Render.RenderFireVillager;
import com.cubic_control.overload.Render.RenderFireWarrior;
import com.cubic_control.overload.Render.RenderFrostedChicken;
import com.cubic_control.overload.Render.RenderFrostedCow;
import com.cubic_control.overload.Render.RenderFrostedPig;
import com.cubic_control.overload.Render.RenderFrostedSheep;
import com.cubic_control.overload.Render.RenderGiantNightmare;
import com.cubic_control.overload.Render.RenderHeadless;
import com.cubic_control.overload.Render.RenderIceArcher;
import com.cubic_control.overload.Render.RenderIceAssassin;
import com.cubic_control.overload.Render.RenderIceGuard;
import com.cubic_control.overload.Render.RenderIceVillager;
import com.cubic_control.overload.Render.RenderIceWarrior;
import com.cubic_control.overload.Render.RenderInjuredSteve;
import com.cubic_control.overload.Render.RenderJeff;
import com.cubic_control.overload.Render.RenderMantisMan;
import com.cubic_control.overload.Render.RenderModBlockBluestoneWire;
import com.cubic_control.overload.Render.RenderNightmare;
import com.cubic_control.overload.Render.RenderNightmareAlex;
import com.cubic_control.overload.Render.RenderNightmareCubic;
import com.cubic_control.overload.Render.RenderNightmareHerobrine;
import com.cubic_control.overload.Render.RenderNightmareSteve;
import com.cubic_control.overload.Render.RenderNightmareVillager;
import com.cubic_control.overload.Render.RenderNull;
import com.cubic_control.overload.Render.RenderPlasticChicken;
import com.cubic_control.overload.Render.RenderPlasticCow;
import com.cubic_control.overload.Render.RenderPumpkin;
import com.cubic_control.overload.Render.RenderStalker;
import com.cubic_control.overload.Render.RenderStalkingWarrior;
import com.cubic_control.overload.Render.RenderUnknown;
import com.cubic_control.overload.Render.RenderZC;
import com.cubic_control.overload.Render.RenderZombieAlex;
import com.cubic_control.overload.Render.RenderZombieJeb;
import com.cubic_control.overload.Render.RenderZombieNotch;
import com.cubic_control.overload.Render.RenderZombieSuperSonic10;
import com.cubic_control.overload.Render.RenderZombie_Cow;
import com.cubic_control.overload.Render.RenderZombie_Dinnerbone;
import com.cubic_control.overload.TileEntity.TileEntityLightPyramidEntity;
import com.cubic_control.overload.TileEntity.TileEntityLightPyramidRenderer;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		registerEntity();
		registerRenders();
	}
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	@SuppressWarnings("unchecked")
	private void registerEntity() {
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieAlex.class, new RenderZombieAlex(new ModelZombieSlim(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieJeb.class, new RenderZombieJeb(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieNotch.class, new RenderZombieNotch(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieDinnerbone.class, new RenderZombie_Dinnerbone(new ModelZombieBiped(), 0.5f));
		//TODO: Replace
		RenderingRegistry.registerEntityRenderingHandler(EntityZC.class, new RenderZC(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieSuperSonic10.class, new RenderZombieSuperSonic10(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityJeffTheKiller.class, new RenderJeff(new ModelJeff(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieCow.class, new RenderZombie_Cow(new ModelZombie_Cow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityInjuredSteve.class, new RenderInjuredSteve(new ModelNewBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMantisMan.class, new RenderMantisMan(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireAssassin.class, new RenderFireAssassin(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceAssassin.class, new RenderIceAssassin(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireArcher.class, new RenderFireArcher(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceArcher.class, new RenderIceArcher(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireGuard.class, new RenderFireGuard(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceGuard.class, new RenderIceGuard(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireWarrior.class, new RenderFireWarrior(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceWarrior.class, new RenderIceWarrior(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFireVillager.class, new RenderFireVillager(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityIceVillager.class, new RenderIceVillager(new ModelBiped(), 0.5f));
		//Nightmares
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareCubic.class, new RenderNightmareCubic(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeadAngel.class, new RenderDeadAngel(new ModelAngel(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalkingWarrior.class, new RenderStalkingWarrior(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnknown.class, new RenderUnknown(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareVillager.class, new RenderNightmareVillager());
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareSteve.class, new RenderNightmareSteve(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareAlex.class, new RenderNightmareAlex(new ModelBipedSlim64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmareHerobrine.class, new RenderNightmareHerobrine(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNull.class, new RenderNull(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPumpkin.class, new RenderPumpkin(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityHeadless.class, new RenderHeadless(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFakeHeadless.class, new RenderFakeHeadless(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityNightmare.class, new RenderNightmare(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityGiantNightmare.class, new RenderGiantNightmare(new ModelBiped(), 0.5f, 5.0f));
		RenderingRegistry.registerEntityRenderingHandler(EntityDeathGuard.class, new RenderDeathGuard(new ModelBiped64x64(), 0.5f));
				//Dragons
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomWhite.class, new RenderDragonPhantomWhite());
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomBlue.class, new RenderDragonPhantomBlue());
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomGreen.class, new RenderDragonPhantomGreen());
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomLightBlue.class, new RenderDragonPhantomLightBlue());
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomRed.class, new RenderDragonPhantomRed());
		RenderingRegistry.registerEntityRenderingHandler(EntityDragonPhantomYellow.class, new RenderDragonPhantomYellow());
				//Bosses
		RenderingRegistry.registerEntityRenderingHandler(EntityDeath.class, new RenderDeath(new ModelBiped64x64(), 0.5f));
		//Ice Animals
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostedCow.class, new RenderFrostedCow(new ModelCow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostedPig.class, new RenderFrostedPig(new ModelPig(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostedChicken.class, new RenderFrostedChicken(new ModelChicken(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityFrostedSheep.class, new RenderFrostedSheep(new ModelSheep2(), new ModelSheep1(), 0.5f));
		//Plastic Animals
		RenderingRegistry.registerEntityRenderingHandler(EntityPlasticCow.class, new RenderPlasticCow(new ModelCow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPlasticChicken.class, new RenderPlasticChicken(new ModelChicken(), 0.5f));
	}
	public ModelBiped getArmorModel(int id){ return null; }
	
	public void registerRenders() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightPyramidEntity.class, new TileEntityLightPyramidRenderer());
		RenderingRegistry.registerBlockHandler(new RenderModBlockBluestoneWire());
	}
}
