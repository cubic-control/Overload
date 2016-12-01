package com.cubic_control.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderJeff extends RenderBiped {
	
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/Jeff_The_Killer_HD.png");
	 
    public RenderJeff(ModelBase par1ModelBase, float par2) {
            super((ModelBiped) par1ModelBase, par2);
            
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }
}
