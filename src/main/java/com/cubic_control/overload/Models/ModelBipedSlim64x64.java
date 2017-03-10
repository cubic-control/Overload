package com.cubic_control.overload.Models;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

@SideOnly(Side.CLIENT)
public class ModelBipedSlim64x64 extends ModelPlayerSlim
{
    private static final String __OBFID = "CL_00000869";

    public ModelBipedSlim64x64()
    {
        this(0.0F, false);
    }

    protected ModelBipedSlim64x64(float par1, float par2, int par3, int par4)
    {
        super(par1, par2, par3, par4);
    }

    public ModelBipedSlim64x64(float par1, boolean par2)
    {
        super(par1, 0.0F, 64, par2 ? 32 : 64);
    }
}