package com.cubic_control.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.Mobs.EntityZombieYoutuber;
import com.cubic_control.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZombieYoutuber extends RenderZombie {
	
	private static ResourceLocation Texture;
	
    public RenderZombieYoutuber(ModelBase par1ModelBase, float par2, String par3String) {
            super();
            EntityZombieYoutuber.username = par3String;
            
            Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/zombie/yt/Zombie_"+ par3String +".png");
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Texture;
    }
}
