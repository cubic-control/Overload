package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;

public class ModBlockDoor extends BlockDoor{

	protected ModBlockDoor(Block block, String name, float hardness, float resistance) {
		super(block.getMaterial());
		this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		this.setHardness(hardness);
		this.setHarvestLevel(block.getHarvestTool(0), block.getHarvestLevel(0));
		this.setLightOpacity(0);
		this.setResistance(resistance);
		GameRegistry.registerBlock(this, name);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return this == MBlocks.door_ice ? MItems.ice_door : (
        		this == MBlocks.door_fire ? MItems.fire_door : Item.getItemFromBlock(this));
    }
	
	@SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return this == MBlocks.door_ice ? MItems.ice_door : (
        		this == MBlocks.door_fire ? MItems.fire_door : Item.getItemFromBlock(this));
    }

}
