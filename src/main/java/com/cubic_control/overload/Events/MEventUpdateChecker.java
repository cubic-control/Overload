package com.cubic_control.overload.Events;

import com.cubic_control.overload.Main.MainRegistry;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.event.ClickEvent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatStyle;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class MEventUpdateChecker {
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	public void onPlayerTickEvent(PlayerTickEvent event) {
		if(!MainRegistry.haveWarnedVersionOutOfDate && event.player.worldObj.isRemote && !MainRegistry.versionChecker.isLatestVersion()) {
			ClickEvent versionCheckChatClickEvent = new ClickEvent(ClickEvent.Action.OPEN_URL, "http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-mods/2595317");
	        ChatStyle clickableChatStyle = new ChatStyle().setChatClickEvent(versionCheckChatClickEvent);
	        ChatComponentText versionWarningChatComponent = new ChatComponentText(EnumChatFormatting.GREEN+"["+EnumChatFormatting.WHITE+RefStrings.NAME+EnumChatFormatting.GREEN+"]:"+EnumChatFormatting.RED+" You are running an outdated version of Overload! Click here to update.");
	        versionWarningChatComponent.setChatStyle(clickableChatStyle);
	        event.player.addChatMessage(versionWarningChatComponent);
	        MainRegistry.haveWarnedVersionOutOfDate = true;
	    }
	  
	}

}
