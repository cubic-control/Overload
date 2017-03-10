package com.cubic_control.overload.Render;

import com.cubic_control.overload.Entity.EntityFrostedCow;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderFrostedCow extends RenderLiving
{
    private static final ResourceLocation cowTextures = new ResourceLocation(RefStrings.MODID + ":textures/mobs/ice/animals/ice_cow.png");
    private static final String __OBFID = "CL_00000984";

    public RenderFrostedCow(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityFrostedCow par1EntityCow)
    {
        return cowTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getEntityTexture((EntityFrostedCow)par1Entity);
    }
}