package com.cubic_control.overload.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

public class RenderZombieSuperSonic10 extends RenderZombie {
	
	private static final ResourceLocation Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/zombie/zombie_super_sonic_10.png");
	 
    public RenderZombieSuperSonic10(ModelBiped par1ModelBase, float par2) {
            super();
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
    	GL11.glEnable(GL11.GL_BLEND);
    	GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        return Texture;
    }
}
