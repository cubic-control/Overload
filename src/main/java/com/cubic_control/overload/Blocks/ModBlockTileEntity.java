package com.cubic_control.overload.Blocks;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Food.MFoods;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.TileEntity.TileEntityLightPyramidEntity;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockTileEntity extends BlockContainer{
	
	protected ModBlockTileEntity(Material material, String string, String tool, int a, float b, float c, SoundType soundType) {
		super(material);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(b);
		this.setResistance(c);
		this.setHarvestLevel(tool, a);
		this.setStepSound(soundType);
		this.setBlockName(string);
		this.setBlockTextureName(RefStrings.MODID + ":" + string);
		GameRegistry.registerBlock(this, string);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		if(this == MBlocks.light_pyramid){
			return new TileEntityLightPyramidEntity();
		}
		return null;
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if(this == MBlocks.light_pyramid){
			drops.add(new ItemStack(MItems.light_shard, 6));
		}
		return drops;
	}
	
	@Override
	public int getRenderType(){
		return -1;
	}
	    
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	public boolean renderAsNormalBlock(){
		return false;
	}
}
