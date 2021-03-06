package com.cubic_control.overload.Events;

import com.cubic_control.cubic_core.Utils.CubicUtils;
import com.cubic_control.overload.Achievements.MAchievements;
import com.cubic_control.overload.Tools.MTools;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class MEventWelcomeMessage {
	
	@SubscribeEvent
    public void onPlayerLogin(PlayerLoggedInEvent event) {
    	event.player.addChatComponentMessage(new ChatComponentText(
    		EnumChatFormatting.GREEN+"["+EnumChatFormatting.WHITE+RefStrings.NAME+
    		EnumChatFormatting.GREEN+"]:"+EnumChatFormatting.RED+" Welcome "+
    		event.player.getDisplayName()+" to "+EnumChatFormatting.GREEN+RefStrings.NAME+"!"+
    		EnumChatFormatting.WHITE+EnumChatFormatting.ITALIC+" This mod is copyright 2017 by cubic_control."));
    	event.player.addStat(MAchievements.achievementInstalled, 1);
    }

}
