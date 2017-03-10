package com.cubic_control.overload.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.lib.RefStrings;

public class RenderZC extends RenderZombie {
	
	private static final ResourceLocation Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/zombie/zombie_cubic_control.png");
	 
    public RenderZC(ModelBase par1ModelBase, float par2) {
            super();
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
    	GL11.glEnable(GL11.GL_BLEND);
    	GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        return Texture;
    }
}
