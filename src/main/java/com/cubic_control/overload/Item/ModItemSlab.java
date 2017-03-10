package com.cubic_control.overload.Item;

import com.cubic_control.overload.Blocks.MBlocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
public class ModItemSlab extends ItemSlab
{
	public static BlockSlab ModBlockSlab;
	public static BlockSlab ModBlockSlabDouble;
	
    public ModItemSlab(Block block)
    {
	    super(block, (BlockSlab)ModBlockSlab, (BlockSlab)ModBlockSlabDouble, false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
    }
}