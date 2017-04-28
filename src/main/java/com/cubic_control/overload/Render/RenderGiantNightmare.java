package com.cubic_control.overload.Render;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.Entity.EntityGiantNightmare;
import com.cubic_control.overload.lib.RefStrings;

@SideOnly(Side.CLIENT)
public class RenderGiantNightmare extends RenderBiped{
	private static final ResourceLocation Resource = new ResourceLocation(RefStrings.MODID + ":textures/mobs/nightmare/nightmare.png");
    /** Scale of the model to use */
    private float scale;
    private static final String __OBFID = "CL_00000998";

    public RenderGiantNightmare(ModelBase par1ModelBase, float par2, float par3) {
        super((ModelBiped) par1ModelBase, par2 * par3);
        this.scale = par3;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityGiantNightmare par1Entity, float par2) {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {        
            return Resource;
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    @Override
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
        this.preRenderCallback((EntityGiantNightmare)par1EntityLivingBase, par2);
    }
}