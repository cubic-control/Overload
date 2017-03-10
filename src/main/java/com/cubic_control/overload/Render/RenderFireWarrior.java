package com.cubic_control.overload.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.Entity.EntityFireWarrior;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderFireWarrior extends RenderBiped {
	
	private static final ResourceLocation ResourceA = new ResourceLocation(RefStrings.MODID + ":textures/mobs/fire/warrior_fire_b.png");
	private static final ResourceLocation ResourceB = new ResourceLocation(RefStrings.MODID + ":textures/mobs/fire/warrior_fire_g.png");
	 
    public RenderFireWarrior(ModelBase par1ModelBase, float par2) {
    	super((ModelBiped) par1ModelBase, par2);
    }
    
    protected ResourceLocation getEntityTexture(EntityFireWarrior var1) {
    	return var1.getGender() == 1 ? ResourceB : ResourceA;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
    	return this.getEntityTexture((EntityFireWarrior)var1);
    }
}
