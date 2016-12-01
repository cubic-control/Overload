package com.cubic_control.Render;

import com.cubic_control.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderNightmareHerobrine extends RenderBiped{
	
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/nightmare_herobrine.png");
	 
    public RenderNightmareHerobrine(ModelBase par1ModelBase, float par2) {
            super((ModelBiped) par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }
}
