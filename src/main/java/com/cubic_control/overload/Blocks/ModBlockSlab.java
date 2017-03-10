package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.ModItemSlab;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.world.World;

public class ModBlockSlab extends BlockSlab{

	public ModBlockSlab(boolean isFull, Material p_i45410_2_, String name, float A, float B, int C, String tool, SoundType sound, String Tname) {
		super(isFull, p_i45410_2_);
		this.setHardness(A);
		this.setResistance(B);
		this.setHarvestLevel(tool, C);
		this.setStepSound(sound);
		this.setBlockTextureName(RefStrings.MODID + ":" + Tname);
		if(isFull == false){
			ModItemSlab.ModBlockSlab = this;
			this.setLightOpacity(0);
			this.setCreativeTab(MCreativeTabs.tabBlocks);
			this.setBlockName(name + "_slab");
			GameRegistry.registerBlock(this, ModItemSlab.class, name + "_slab");
		}
		if(isFull == true){
			ModItemSlab.ModBlockSlabDouble = this;
			this.setBlockName(name + "_slab_double");
			GameRegistry.registerBlock(this, ModItemSlab.class, name + "_slab_double");
		}
	}

	@Override
	public String func_150002_b(int var1) {
		return this.getUnlocalizedName();
	}

	@SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block p_150003_0_)
    {
        return p_150003_0_ == MBlocks.Vermarine_Slab || p_150003_0_ == MBlocks.ender_rite_slab;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return func_150003_a(this) ? Item.getItemFromBlock(this) : (this == MBlocks.Vermarine_Slab_Double ? Item.getItemFromBlock(MBlocks.Vermarine_Slab) : (this == MBlocks.ender_rite_slab_double ? Item.getItemFromBlock(MBlocks.ender_rite_slab) : Item.getItemFromBlock(this)));
    }

}