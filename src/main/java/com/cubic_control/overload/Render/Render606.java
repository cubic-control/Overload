package com.cubic_control.overload.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class Render606 extends RenderBiped {
	
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/nightmare/606.png");
	 
    public Render606(ModelBase par1ModelBase, float par2) {
            super((ModelBiped) par1ModelBase, par2);
    }
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
            return Resource;
    }
}
