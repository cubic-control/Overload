package com.cubic_control.overload.Render;

import org.lwjgl.opengl.GL11;

import com.cubic_control.cubic_core.Utils.CubicUtils;
import com.cubic_control.overload.Entity.EntityYou;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderYou extends RenderBiped{
	
	private static ResourceLocation Resource;
	 
    public RenderYou(ModelBase par1ModelBase, EntityYou entity, float par2) {
            super((ModelBiped) par1ModelBase, par2);
            Resource = CubicUtils.getSkinTexture(entity.getCommandSenderName());
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {
           
            return Resource;
    }
}
