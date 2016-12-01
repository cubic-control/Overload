package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Gem_Ores extends BlockOre{

	protected Gem_Ores(Material p_i45394_1_, String name) {
		super();
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setHardness(3f);
		this.setResistance(15f);
		this.setHarvestLevel("pickaxe", 3);
		this.setStepSound(soundTypeStone);
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":gems/" + name);
		GameRegistry.registerBlock(this, name);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == MBlocks.Amethyst_Ore ? MItems.amethyst : (
        		this == MBlocks.Beryl_Ore ? MItems.beryl : (
        		this == MBlocks.Carnelian_Ore ? MItems.carnelian : (
        		this == MBlocks.Jade_Ore ? MItems.jade : (
        		this == MBlocks.Jasper_Ore ? MItems.jasper : (
        		this == MBlocks.Malachite_Ore ? MItems.malachite : (
        		this == MBlocks.Moonstone_Ore ? MItems.moonstone : (
        		this == MBlocks.Onyx_Ore ? MItems.onyx : (
        		this == MBlocks.Peridot_Ore ? MItems.peridot : (
        		this == MBlocks.Sapphire_Ore ? MItems.sapphire : (
        		this == MBlocks.Serendibite_Ore ? MItems.serendibite : (
        		this == MBlocks.Tanzanite_Ore ? MItems.tanzanite : (
        		this == MBlocks.Tiger_eye_Ore ? MItems.tiger_eye : (
        		this == MBlocks.Topaz_Ore ? MItems.topaz : (
        		this == MBlocks.Vermarine_Ore ? MItems.vermarine : Item.getItemFromBlock(this)))))))))))))));
    }
	
	@Override
	public void dropXpOnBlockBreak(World p_149657_1_, int p_149657_2_,
			int p_149657_3_, int p_149657_4_, int p_149657_5_) {
		this.dropXpOnBlockBreak(p_149657_1_, 0, 0, 0, 0);
	}
}
