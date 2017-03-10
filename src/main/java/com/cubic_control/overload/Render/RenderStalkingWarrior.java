package com.cubic_control.overload.Render;

import com.cubic_control.overload.Entity.EntityStalkingWarrior;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderStalkingWarrior extends RenderBiped {
	
	private static final ResourceLocation Texture = new ResourceLocation(RefStrings.MODID + ":textures/mobs/StalkingWarrior.png");
	 
    public RenderStalkingWarrior(ModelBase par1ModelBase, float par2) {
    	super((ModelBiped) par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Texture;
    }
    
    protected void renderEquippedItems(EntityStalkingWarrior par1Entity, float par2)
    {
        super.renderEquippedItems((EntityLiving)par1Entity, par2);
    }
    
    protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2)
    {
        this.renderEquippedItems((EntityStalkingWarrior)par1EntityLiving, par2);
    }
    
    protected void renderEquippedItems(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.renderEquippedItems((EntityStalkingWarrior)par1EntityLivingBase, par2);
    }
}
