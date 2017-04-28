package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Main.MainRegistry;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class ModBlockWorkbenchFire extends BlockWorkbench{
	
	@SideOnly(Side.CLIENT)
    private IIcon field_150035_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150034_b;
	
	public static Block BLOCK = MBlocks.fire_planks;
	public static int ID = 2;
	
	protected ModBlockWorkbenchFire(String name, float f1, float f2){
		this.setHardness(f1);
		this.setResistance(f2);
		this.setHarvestLevel("axe", 0);
		this.setStepSound(soundTypeWood);
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2){
        return i1 == 1 ? this.field_150035_a : (i1 == 0 ? BLOCK.getBlockTextureFromSide(i1) : (i1 != 2 && i1 != 4 ? this.blockIcon : this.field_150034_b));
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_){
        this.blockIcon = p_149651_1_.registerIcon(this.getTextureName() + "_side");
        this.field_150035_a = p_149651_1_.registerIcon(this.getTextureName() + "_top");
        this.field_150034_b = p_149651_1_.registerIcon(this.getTextureName() + "_front");
    }
	
	@Override
	public boolean onBlockActivated(World parWorld, int i2, int i3, int i4, EntityPlayer parEntityPlayer, int i6, float f7, float f8, float f9)
    {
        if (parWorld.isRemote)
        {
            return true;
        }
        else
        {
        	parEntityPlayer.openGui(MainRegistry.instance, ID, parWorld, i2, i3, i4);
            return true;
        }
    }
	@Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
    	return false;
    }

}
