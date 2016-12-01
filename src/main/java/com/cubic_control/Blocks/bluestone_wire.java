package com.cubic_control.Blocks;

import java.util.HashSet;
import java.util.Set;

import scala.annotation.meta.field;

import com.cubic_control.Classes.BlockBluestoneWire;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class bluestone_wire extends BlockBluestoneWire
{
	private boolean field_150181_a = true;
    private Set field_150179_b = new HashSet();
    @SideOnly(Side.CLIENT)
    private IIcon field_150182_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_150183_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_150184_O;
    @SideOnly(Side.CLIENT)
    private IIcon field_150180_P;
    private static final String __OBFID = "CL_00000295";
	
	protected bluestone_wire(Material p_i45394_1_, String string) {
		super();
		this.setBlockName(string);
		this.setCreativeTab(null);
		this.setBlockTextureName(RefStrings.MODID + ":bluestone_dust");
		GameRegistry.registerBlock(this, string);
	}
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150182_M = p_149651_1_.registerIcon(this.getTextureName() + "_" + "cross");
        this.field_150183_N = p_149651_1_.registerIcon(this.getTextureName() + "_" + "line");
        this.field_150184_O = p_149651_1_.registerIcon(this.getTextureName() + "_" + "cross_overlay");
        this.field_150180_P = p_149651_1_.registerIcon(this.getTextureName() + "_" + "line_overlay");
        this.blockIcon = this.field_150182_M;
    }
}
