package com.cubic_control.overload.Render;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderInjuredSteve extends RenderLiving {
	
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/InjuredSteve.png");
	 
    public RenderInjuredSteve(ModelBase par1ModelBase, float par2) {
            super(par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }
}
