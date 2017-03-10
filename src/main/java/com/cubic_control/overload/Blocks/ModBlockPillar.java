package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class ModBlockPillar extends BlockRotatedPillar{

	protected ModBlockPillar(Block block, float A, float B, String name) {
		super(block.getMaterial());
		this.setHardness(A);
        this.setResistance(B);
        this.setStepSound(block.stepSound);
        this.setLightOpacity(block.getLightOpacity());
        this.setHarvestLevel(block.getHarvestTool(0), block.getHarvestLevel(0));
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setBlockName(name);
        this.setBlockTextureName(RefStrings.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	protected IIcon getSideIcon(int side) {
		return blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		super.registerBlockIcons(reg);
		field_150164_N = reg.registerIcon(getTextureName() + "_top");
	}

}
