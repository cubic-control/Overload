package com.cubic_control.overload.Blocks;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Food.MFoods;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class ModBlockOre extends BlockOre{
	private Random rand = new Random();

	protected ModBlockOre(Material material, String string, int level) {
		super();
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setBlockName(string);
		this.setBlockTextureName(RefStrings.MODID + ":" + string);
		this.setHardness(3.0F);
		this.setResistance(15.0F);
		//level:
		//0=wood
		//1=stone
		//2=iron
		//3=diamond
		this.setHarvestLevel("pickaxe", level);
		this.setStepSound(soundTypeStone);
		GameRegistry.registerBlock(this, string);
	}
	@Override
	public Item getItemDropped(int i1, Random random, int i2) {
        return this == MBlocks.nightmare_ore ? MItems.Nightmare_Gem :(
        		this == MBlocks.ender_rite_ore ? MItems.ender_rite_shard :(
        		this == MBlocks.bubblegum_ore ? MFoods.bubblegum :(
        		this == MBlocks.ice_coal_ore ? Items.coal :(
        		this == MBlocks.ice_diamond_ore ? Items.diamond :(
        		this == MBlocks.ice_gold_ore ? Items.gold_ingot : (
        		this == MBlocks.ruby_ore ? MItems.ruby :
        				Item.getItemFromBlock(this)))))));
    }
    @Override
    public int getExpDrop(IBlockAccess access, int i1, int i2) {
        if(this.getItemDropped(i1, rand, i2) != Item.getItemFromBlock(this)){
            int j1 = 0;

            if(this == MBlocks.ice_coal_ore){
                j1 = MathHelper.getRandomIntegerInRange(rand, 0, 2);
            }else if(this == MBlocks.ice_diamond_ore){
                j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
            }
            return j1;
        }
        return 0;
    }
    
}