package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Item.ModItemSlab;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.world.World;

public class c_slabs extends BlockSlab{

	public c_slabs(boolean isFull, Material p_i45410_2_, String name) {
		super(isFull, p_i45410_2_);
		this.setHardness(5f);
		this.setResistance(30f);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeMetal);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
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
        return p_150003_0_ == MBlocks.black_brick_slab || p_150003_0_ == MBlocks.blue_brick_slab || p_150003_0_ == MBlocks.cyan_brick_slab || p_150003_0_ == MBlocks.green_brick_slab || p_150003_0_ == MBlocks.lime_brick_slab || p_150003_0_ == MBlocks.magenta_brick_slab || p_150003_0_ == MBlocks.orange_brick_slab || p_150003_0_ == MBlocks.pink_brick_slab || p_150003_0_ == MBlocks.purple_brick_slab || p_150003_0_ == MBlocks.red_brick_slab || p_150003_0_ == MBlocks.white_brick_slab || p_150003_0_ == MBlocks.yellow_brick_slab;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return func_150003_a(this) ? Item.getItemFromBlock(this) : (this == MBlocks.black_brick_slab_double ? Item.getItemFromBlock(MBlocks.black_brick_slab) : (this == MBlocks.blue_brick_slab_double ? Item.getItemFromBlock(MBlocks.blue_brick_slab) : this == MBlocks.cyan_brick_slab_double ? Item.getItemFromBlock(MBlocks.cyan_brick_slab) : (this == MBlocks.green_brick_slab_double ? Item.getItemFromBlock(MBlocks.green_brick_slab) : (this == MBlocks.lime_brick_slab_double ? Item.getItemFromBlock(MBlocks.lime_brick_slab) : (this == MBlocks.magenta_brick_slab_double ? Item.getItemFromBlock(MBlocks.magenta_brick_slab) : this == MBlocks.orange_brick_slab_double ? Item.getItemFromBlock(MBlocks.orange_brick_slab) : (this == MBlocks.pink_brick_slab_double ? Item.getItemFromBlock(MBlocks.pink_brick_slab) : (this == MBlocks.purple_brick_slab_double ? Item.getItemFromBlock(MBlocks.purple_brick_slab) : (this == MBlocks.red_brick_slab_double ? Item.getItemFromBlock(MBlocks.red_brick_slab) : this == MBlocks.white_brick_slab_double ? Item.getItemFromBlock(MBlocks.white_brick_slab) : (this == MBlocks.yellow_brick_slab_double ? Item.getItemFromBlock(MBlocks.yellow_brick_slab) : Item.getItemFromBlock(this))))))))));
    }

}
