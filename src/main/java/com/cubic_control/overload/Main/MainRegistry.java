package com.cubic_control.overload.Main;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Biomes.MBiomes;
import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Dimensions.Dimension;
import com.cubic_control.overload.Dimensions.DimensionIDs;
import com.cubic_control.overload.Entity.MEntities;
import com.cubic_control.overload.Entity.NewModEntities;
import com.cubic_control.overload.Events.MEventHandler;
import com.cubic_control.overload.Food.MFoods;
import com.cubic_control.overload.GUI.GuiHandler;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.TileEntity.RegTileEntities;
import com.cubic_control.overload.Tools.MTools;
import com.cubic_control.overload.World.MWorld;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.client.event.ConfigChangedEvent;
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

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION,
	guiFactory = RefStrings.GUIFACTORY, dependencies = "required-after:cubic_core")
public class MainRegistry {
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@Mod.Instance(RefStrings.MODID)
	public static MainRegistry instance;
	
	public static boolean isOtherModLoaded;
	
	@EventHandler
	public static void Preload(FMLPreInitializationEvent PreEvent){
		boolean flag = Loader.isModLoaded("cubic_core");
		if(flag){
			System.out.println("["+RefStrings.NAME+"]: CubicCore Loaded! Let The Fun Begin!");
		}else{
			System.out.println("["+RefStrings.NAME+"]: CubicCore Not Loaded! We Are About To Crash!");
		}
		MConfiguration.createConfig();
		MCreativeTabs.initialiseTabs();
		MBlocks.mainRegistry();
		RegTileEntities.RegisterTileEntites();
		MFoods.mainRegistry();
		MEntities.mainRegistry();
		MItems.mainRegistry();
		MTools.mainRegistry();
		MArmor.mainRegistry();
		MWorld.MainRegistry();
		MCraftingManager.MainRegistry();
		MBiomes.registerWithBiomeDictionary();
		NewModEntities.preinit();
		Dimension.registerWorldProvider();
		Dimension.registerDimensions();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		MEventHandler.registerEvents();
		FMLCommonHandler.instance().bus().register(instance);
	}
	@EventHandler
	public static void Postload(FMLPostInitializationEvent PostEvent){
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if(eventArgs.modID.equals(RefStrings.MODID)){
			MConfiguration.syncConfig();
		}
	}
}
