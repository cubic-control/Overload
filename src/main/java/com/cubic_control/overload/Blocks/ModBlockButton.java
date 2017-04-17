package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockButton;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

public class ModBlockButton extends BlockButton {
	private Block block;

    protected ModBlockButton(boolean bool, Block block, float B, float C) {
        super(bool);
        this.setHardness(B);
		this.setResistance(C);
        this.setStepSound(block.stepSound);
        this.setLightOpacity(0);
        this.setBlockName(block.getUnlocalizedName() + "_button");
        this.setBlockTextureName(RefStrings.MODID + ":" + block.getUnlocalizedName());
        this.setHarvestLevel(block.getHarvestTool(0), block.getHarvestLevel(0));
        this.setCreativeTab(MCreativeTabs.tabTech);
        GameRegistry.registerBlock(this, block.getUnlocalizedName() + "_button");
        
        this.block = block;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2) {
        return block.getBlockTextureFromSide(1);
    }
}