package com.cubic_control.Main;

import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StringUtils;

public class CCapes {
	private static ThreadDownloadImageData downloadImageCape;
	private static ResourceLocation locationCape;
	
	public static void loadCapes(){
		if(Minecraft.getMinecraft().thePlayer.getUniqueID().equals("2d85bb3b-6eb2-47d7-8f4e-1341be384533")){
			String s = "HFRBS0F";
			locationCape = getLocationCape(s);
			downloadImageCape = getDownloadImageCape(locationCape, s);
		}
	}
	
	public ThreadDownloadImageData getTextureCape()
    {
        return this.downloadImageCape;
    }
	
	public ResourceLocation getLocationCape()
    {
        return this.locationCape;
    }
	
	public static ThreadDownloadImageData getDownloadImageCape(ResourceLocation par0ResourceLocation, String par1Str)
    {
        return getDownloadImage(par0ResourceLocation, getCapeUrl(par1Str), (ResourceLocation)null, (IImageBuffer)null);
    }
	
	private static ThreadDownloadImageData getDownloadImage(ResourceLocation par0ResourceLocation, String par1Str, ResourceLocation par2ResourceLocation, IImageBuffer par3IImageBuffer)
    {
        TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
        Object object = texturemanager.getTexture(par0ResourceLocation);

        if (object == null)
        {
            object = new ThreadDownloadImageData(par1Str, par2ResourceLocation, par3IImageBuffer);
            texturemanager.loadTexture(par0ResourceLocation, (ITextureObject)object);
        }

        return (ThreadDownloadImageData)object;
    }
	
	public static String getCapeUrl(String par0Str)
    {
        return String.format("http://imgur.com/%s.png", new Object[] {StringUtils.stripControlCodes(par0Str)});
    }
	
	public static ResourceLocation getLocationCape(String par0Str)
    {
        return new ResourceLocation("cloaks/" + StringUtils.stripControlCodes(par0Str));
    }

}
