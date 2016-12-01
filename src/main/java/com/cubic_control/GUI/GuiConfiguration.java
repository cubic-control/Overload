package com.cubic_control.GUI;

import java.util.ArrayList;
import java.util.List;

import com.cubic_control.Configuration.MConfiguration;
import com.cubic_control.Configuration.ConfigTypes;
import com.cubic_control.lib.RefStrings;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;

public class GuiConfiguration extends GuiConfig{
	
	private static String par1String = "Overload Configuration File";

	public GuiConfiguration(GuiScreen parentScreen){
		super(parentScreen, getElements(), RefStrings.MODID, false, false, par1String);
		titleLine2 = GuiConfig.getAbridgedConfigPath(MConfiguration.config.toString());
	}
	
	@SuppressWarnings({ "rawtypes" })
	private static List<IConfigElement> getElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement(MConfiguration.config.getCategory(ConfigTypes.BIOMES)));
		list.add(new ConfigElement(MConfiguration.config.getCategory(ConfigTypes.DIMENSIONS)));
		list.add(new ConfigElement(MConfiguration.config.getCategory(ConfigTypes.BOOLEANS)));
		return list;
	}

}
