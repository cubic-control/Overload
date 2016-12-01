package com.cubic_control.Render;

import com.cubic_control.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZombie_Cow extends RenderCow {
	
	private static final ResourceLocation Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/Zombie_Cow.png");
	 
    public RenderZombie_Cow(ModelBase par1ModelBase, float par2) {
            super(par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Texture;
    }
}
