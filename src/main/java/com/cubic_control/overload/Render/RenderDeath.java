package com.cubic_control.overload.Render;

import com.cubic_control.overload.Entity.EntityDeath;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

public class RenderDeath extends RenderBiped{
	
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/death_base.png");
	 
    public RenderDeath(ModelBase par1ModelBase, float par2) {
            super((ModelBiped) par1ModelBase, par2);
           
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }
    
    public void doRender(EntityDeath par1Entity, double par2, double par4, double par6, float par8, float par9){
        BossStatus.setBossStatus(par1Entity, true);
        super.doRender((EntityLiving)par1Entity, par2, par4, par6, par8, par9);
    }
    
    @Override
    public void doRender(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9){
        this.doRender((EntityDeath)par1EntityLiving, par2, par4, par6, par8, par9);
    }
    
    @Override
    public void doRender(EntityLivingBase par1Entity, double par2, double par4, double par6, float par8, float par9){
        this.doRender((EntityDeath)par1Entity, par2, par4, par6, par8, par9);
    }
    
    @Override
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9){
        this.doRender((EntityDeath)par1Entity, par2, par4, par6, par8, par9);
    }
}
