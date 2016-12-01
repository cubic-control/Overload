package com.cubic_control.Main;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.model.ModelSheep1;
import net.minecraft.client.model.ModelSheep2;

import com.cubic_control.Mobs.EntityDeadAngel;
import com.cubic_control.Mobs.EntityDeath;
import com.cubic_control.Mobs.EntityDragonPhantomBlue;
import com.cubic_control.Mobs.EntityDragonPhantomGreen;
import com.cubic_control.Mobs.EntityDragonPhantomLightBlue;
import com.cubic_control.Mobs.EntityDragonPhantomRed;
import com.cubic_control.Mobs.EntityDragonPhantomWhite;
import com.cubic_control.Mobs.EntityDragonPhantomYellow;
import com.cubic_control.Mobs.EntityFakeHeadless;
import com.cubic_control.Mobs.EntityFrostedChicken;
import com.cubic_control.Mobs.EntityFrostedCow;
import com.cubic_control.Mobs.EntityFrostedPig;
import com.cubic_control.Mobs.EntityFrostedSheep;
import com.cubic_control.Mobs.EntityHeadless;
import com.cubic_control.Mobs.EntityInjuredSteve;
import com.cubic_control.Mobs.EntityJeff;
import com.cubic_control.Mobs.EntityMantisMan;
import com.cubic_control.Mobs.EntityNightmare;
import com.cubic_control.Mobs.EntityNightmareAlex;
import com.cubic_control.Mobs.EntityNightmareCubic;
import com.cubic_control.Mobs.EntityNightmareHerobrine;
import com.cubic_control.Mobs.EntityNightmareSteve;
import com.cubic_control.Mobs.EntityNightmareVillager;
import com.cubic_control.Mobs.EntityNull;
import com.cubic_control.Mobs.EntityPumpkin;
import com.cubic_control.Mobs.EntityStalker;
import com.cubic_control.Mobs.EntityStalkingWarrior;
import com.cubic_control.Mobs.EntityUnknown;
import com.cubic_control.Mobs.EntityZC;
import com.cubic_control.Mobs.EntityZombieAlex;
import com.cubic_control.Mobs.EntityZombieCow;
import com.cubic_control.Mobs.EntityZombieDinnerbone;
import com.cubic_control.Mobs.EntityZombieJeb;
import com.cubic_control.Mobs.EntityZombieNotch;
import com.cubic_control.Mobs.EntityZombieSuperSonic10;
import com.cubic_control.Mobs.EntityZombieYoutuber;
import com.cubic_control.Models.ModelAngel;
import com.cubic_control.Models.ModelBiped64x64;
import com.cubic_control.Models.ModelBipedSlim64x64;
import com.cubic_control.Models.ModelJeff;
import com.cubic_control.Models.ModelNewBiped;
import com.cubic_control.Models.ModelZombieBiped;
import com.cubic_control.Models.ModelZombieSlim;
import com.cubic_control.Models.ModelZombie_Cow;
import com.cubic_control.Render.RenderDeadAngel;
import com.cubic_control.Render.RenderDeath;
import com.cubic_control.Render.RenderDragonPhantomBlue;
import com.cubic_control.Render.RenderDragonPhantomGreen;
import com.cubic_control.Render.RenderDragonPhantomLightBlue;
import com.cubic_control.Render.RenderDragonPhantomRed;
import com.cubic_control.Render.RenderDragonPhantomWhite;
import com.cubic_control.Render.RenderDragonPhantomYellow;
import com.cubic_control.Render.RenderFakeHeadless;
import com.cubic_control.Render.RenderFrostedChicken;
import com.cubic_control.Render.RenderFrostedCow;
import com.cubic_control.Render.RenderFrostedPig;
import com.cubic_control.Render.RenderFrostedSheep;
import com.cubic_control.Render.RenderHeadless;
import com.cubic_control.Render.RenderInjuredSteve;
import com.cubic_control.Render.RenderJeff;
import com.cubic_control.Render.RenderMantisMan;
import com.cubic_control.Render.RenderNightmare;
import com.cubic_control.Render.RenderNightmareAlex;
import com.cubic_control.Render.RenderNightmareCubic;
import com.cubic_control.Render.RenderNightmareHerobrine;
import com.cubic_control.Render.RenderNightmareSteve;
import com.cubic_control.Render.RenderNightmareVillager;
import com.cubic_control.Render.RenderNull;
import com.cubic_control.Render.RenderPumpkin;
import com.cubic_control.Render.RenderStalker;
import com.cubic_control.Render.RenderStalkingWarrior;
import com.cubic_control.Render.RenderUnknown;
import com.cubic_control.Render.RenderZC;
import com.cubic_control.Render.RenderZombieAlex;
import com.cubic_control.Render.RenderZombieJeb;
import com.cubic_control.Render.RenderZombieNotch;
import com.cubic_control.Render.RenderZombieSuperSonic10;
import com.cubic_control.Render.RenderZombieYoutuber;
import com.cubic_control.Render.RenderZombie_Cow;
import com.cubic_control.Render.RenderZombie_Dinnerbone;
import com.cubic_control.TileEntity.TileEntityLightPyramidEntity;
import com.cubic_control.TileEntity.TileEntityLightPyramidRenderer;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieYoutuber.class, new RenderZombieYoutuber(new ModelZombieBiped(), 0.5f, "DryAxe"));
		RenderingRegistry.registerEntityRenderingHandler(EntityZC.class, new RenderZC(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieSuperSonic10.class, new RenderZombieSuperSonic10(new ModelZombieBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityJeff.class, new RenderJeff(new ModelJeff(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityZombieCow.class, new RenderZombie_Cow(new ModelZombie_Cow(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityInjuredSteve.class, new RenderInjuredSteve(new ModelNewBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMantisMan.class, new RenderMantisMan(new ModelBiped(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityStalker.class, new RenderStalker(new ModelBiped(), 0.5f));
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
	}
	public ModelBiped getArmorModel(int id){ return null; }
	
	public void registerRenders() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityLightPyramidEntity.class, new TileEntityLightPyramidRenderer());
	}
}
