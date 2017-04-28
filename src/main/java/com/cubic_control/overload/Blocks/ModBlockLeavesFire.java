package com.cubic_control.overload.Blocks;

import java.util.List;
import java.util.Random;

import com.cubic_control.overload.Classes.BlockModLeaves;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBlockLeavesFire extends BlockModLeaves{
    public static final String[][] field_150130_N = new String[][] {{"leaves_fire"}, {"leaves_fire_opaque"}};
    public static final String[] field_150131_O = new String[] {"fire"};
    
    public ModBlockLeavesFire(Material material, String name){
    	this.setBlockName(name);
    	this.setBlockTextureName(RefStrings.MODID + ":" + name);
    	GameRegistry.registerBlock(this, name);
    }
    
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(MBlocks.fire_sapling);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return (p_149741_1_ & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((p_149741_1_ & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.getRenderColor(p_149741_1_));
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        int l = p_149720_1_.getBlockMetadata(p_149720_2_, p_149720_3_, p_149720_4_);
        return (l & 3) == 1 ? ColorizerFoliage.getFoliageColorPine() : ((l & 3) == 2 ? ColorizerFoliage.getFoliageColorBirch() : super.colorMultiplier(p_149720_1_, p_149720_2_, p_149720_3_, p_149720_4_));
    }

    protected void func_150124_c(World p_150124_1_, int p_150124_2_, int p_150124_3_, int p_150124_4_, int p_150124_5_, int p_150124_6_) {
        if ((p_150124_5_ & 3) == 0 && p_150124_1_.rand.nextInt(p_150124_6_) == 0)
        {
            this.dropBlockAsItem(p_150124_1_, p_150124_2_, p_150124_3_, p_150124_4_, new ItemStack(Items.apple, 1, 0));
        }
    }

    protected int func_150123_b(int p_150123_1_) {
        int j = super.func_150123_b(p_150123_1_);

        if((p_150123_1_ & 3) == 3){
            j = 40;
        }
        return j;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2) {
        return (i2 & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : ((i2 & 3) == 3 ? this.field_150129_M[this.field_150127_b][3] : ((i2 & 3) == 2 ? this.field_150129_M[this.field_150127_b][2] : this.field_150129_M[this.field_150127_b][0]));
    }
    @Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, 0));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        for(int i = 0; i < field_150130_N.length; ++i){
            this.field_150129_M[i] = new IIcon[field_150130_N[i].length];

            for(int j = 0; j < field_150130_N[i].length; ++j){
                this.field_150129_M[i][j] = reg.registerIcon(RefStrings.MODID + ":" + field_150130_N[i][j]);
            }
        }
    }
    
    public String[] func_150125_e(){
        return field_150131_O;
    }
	@Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
    	return false;
    }
}