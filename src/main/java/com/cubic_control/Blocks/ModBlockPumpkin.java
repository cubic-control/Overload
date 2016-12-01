package com.cubic_control.Blocks;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ModBlockPumpkin extends BlockPumpkin{
	
	private boolean isCarved;
	private boolean isLit;
	
	private int faceNumber;
	
	@SideOnly(Side.CLIENT)
    private IIcon field_149984_b;
    @SideOnly(Side.CLIENT)
    private IIcon field_149986_M;

	protected ModBlockPumpkin(boolean isLit, boolean isCarved, String name, int FN) {
		super(isLit);
		this.isLit = isLit;
		this.isCarved = isCarved;
		this.faceNumber = FN;
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(1f);
		this.setResistance(5f);
		this.setHarvestLevel("axe", 0);
		this.setStepSound(soundTypeWood);
		if(isLit){
			this.setLightLevel(1.0f);
			this.setBlockName(name + "_lit_" + FN);
			GameRegistry.registerBlock(this, name + "_lit_" + FN);
		}else{
			this.setBlockName(name + "_" + FN);
			GameRegistry.registerBlock(this, name + "_" + FN);
		}
		this.setBlockTextureName(RefStrings.MODID + ":/pumpkin/" + name);
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_149984_b : (p_149691_1_ == 0 ? this.field_149984_b : (p_149691_2_ == 2 && p_149691_1_ == 2 ? this.field_149986_M : (p_149691_2_ == 3 && p_149691_1_ == 5 ? this.field_149986_M : (p_149691_2_ == 0 && p_149691_1_ == 3 ? this.field_149986_M : (p_149691_2_ == 1 && p_149691_1_ == 4 ? this.field_149986_M : this.blockIcon)))));
    }
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_){
		if(isCarved && faceNumber == 1){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_1_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 2){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_2_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 3){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_3_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 4){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_4_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 5){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_5_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 6){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_6_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 7){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_7_" + (this.isLit ? "on" : "off"));
		}else if(isCarved && faceNumber == 8){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_face_8_" + (this.isLit ? "on" : "off"));
		}else if(!isCarved){
			this.field_149986_M = p_149651_1_.registerIcon(this.getTextureName() + "_side");
		}
		
		this.field_149984_b = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
    }

}
