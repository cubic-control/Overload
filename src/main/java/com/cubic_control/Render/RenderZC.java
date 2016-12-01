package com.cubic_control.Render;

import com.cubic_control.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZC extends RenderZombie {
	
	private static final ResourceLocation Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/zombie/Zombie_cubic.png");
	 
    public RenderZC(ModelBase par1ModelBase, float par2) {
            super();
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Texture;
    }
}
