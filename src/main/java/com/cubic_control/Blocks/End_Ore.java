package com.cubic_control.Blocks;

import java.util.Random;

import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.Item.MItems;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class End_Ore extends Block {

	protected End_Ore(Material a, String b, float c, float d, int e, String f) {
		super(a);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setBlockTextureName(RefStrings.MODID + ":" + b);
		this.setHardness(c);
		this.setResistance(d);
		this.setHarvestLevel("pickaxe", e);
		this.setStepSound(soundTypeStone);
		this.setBlockName(f);
		GameRegistry.registerBlock(this, f);
	}
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == MBlocks.end_coal_ore ? Items.coal : (this == MBlocks.end_diamond_ore ? Items.diamond : (this == MBlocks.end_emerald_ore ? Items.emerald : (this == MBlocks.end_ruby_ore ? MItems.ruby : (this == MBlocks.end_lapis_ore ? Items.dye : Item.getItemFromBlock(this)))));
    }
	
	public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityDragon)
        {
            return this != MBlocks.end_ruby_ore && this != MBlocks.end_coal_ore && 
            	   this != MBlocks.end_gold_ore && this != MBlocks.end_iron_ore && 
            	   this != MBlocks.end_diamond_ore && this != MBlocks.end_emerald_ore &&
            	   this != MBlocks.end_lapis_ore; 
        }

        return true;
    }
	
	/**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return this == MBlocks.end_lapis_ore ? 4 + p_149745_1_.nextInt(5) : 1;
    }
    
    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }
    
    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == MBlocks.end_coal_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }
            else if (this == MBlocks.end_diamond_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == MBlocks.end_emerald_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == MBlocks.end_ruby_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            else if (this == MBlocks.end_lapis_ore)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 2, 5);
            }

            return j1;
        }
        return 0;
    }
    
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return this == MBlocks.end_lapis_ore ? 4 : 0;
    }
}
