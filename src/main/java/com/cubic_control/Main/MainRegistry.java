package com.cubic_control.Main;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.cubic_control.Armor.MArmor;
import com.cubic_control.Biomes.MBiomes;
import com.cubic_control.Blocks.MBlocks;
import com.cubic_control.Configuration.MConfiguration;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Dimensions.Dimension;
import com.cubic_control.Dimensions.DimensionIDs;
import com.cubic_control.Food.MFoods;
import com.cubic_control.GUI.GuiHandler;
import com.cubic_control.Item.MItems;
import com.cubic_control.Mobs.MEntities;
import com.cubic_control.Mobs.ModLivingDropsEvent;
import com.cubic_control.Mobs.NewModEntities;
import com.cubic_control.TileEntity.RegTileEntities;
import com.cubic_control.Tools.MTools;
import com.cubic_control.World.MWorld;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION, guiFactory = RefStrings.GUIFACTORY)
public class MainRegistry {
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Mod.Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	public static boolean isOtherModLoaded;
	
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent){
		MConfiguration.createConfig();
		isOtherModLoaded = Loader.isModLoaded("battlegear2");
		MCreativeTabs.initialiseTabs();
		MBlocks.mainRegistry();
		RegTileEntities.RegisterTileEntites();
		MFoods.mainRegistry();
		MEntities.mainRegistry();
		MItems.mainRegistry();
		MTools.mainRegistry();
		MArmor.mainRegistry();
		MWorld.MainRegistry();
		CraftingManager.MainRegistry();
		MBiomes.registerWithBiomeDictionary();
		NewModEntities.preinit();
		Dimension.registerWorldProvider();
		Dimension.registerDimensions();
		MinecraftForge.EVENT_BUS.register(new ModLivingDropsEvent());
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		NewModEntities.init();
		FMLCommonHandler.instance().bus().register(instance);
	}
	@EventHandler
	public static void Postload(FMLPostInitializationEvent PostEvent){
	}
}
