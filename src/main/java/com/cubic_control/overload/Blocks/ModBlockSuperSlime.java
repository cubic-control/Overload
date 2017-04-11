package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBlockSuperSlime extends BlockBreakable{
	private boolean bounce=false;
	private double howHigh=0.0;
	
	public ModBlockSuperSlime(String par1){
		super(RefStrings.MODID + ":" + par1, Material.clay, false);
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.slipperiness = 0.8F;
        this.stepSound = new SlimeSoundType("mob.slime.big", 1.0F, 1.0F);
        this.setBlockName(par1);
        GameRegistry.registerBlock(this, par1);
	}
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_){
        return this.blockIcon; 
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass(){
        return 1;
    }
    @Override
    protected boolean canSilkHarvest(){
        return true;
    }
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world_, int x, int y, int z){
         return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)(x + 1), (double)((float)(y + 1) - 0.0625F), (double)(z + 1));
    }
    @Override
    public void onFallenUpon(World world, int X, int Y, int Z, Entity entity, float entityFallDistance){
    	if(entity.isSneaking()){
    		entity.fallDistance=0.0F;
    		super.onFallenUpon(world, X, Y, Z, entity, entityFallDistance);
    	}else{
    		entity.fallDistance=0.0F;
    		bounce=true;
    		howHigh=-entity.motionY*2;
    	}
    }
    @Override
    public void onEntityCollidedWithBlock(World world, int X, int Y, int Z, Entity entity){
		if(!entity.isSneaking()){
			if(bounce){
				entity.motionY=howHigh;
				bounce=false;
			}else if(Math.abs(entity.motionY) < 0.1D){
	            double d0 = 0.4D + Math.abs(entity.motionY) * 0.2D;
	            entity.motionX *= d0;
	            entity.motionZ *= d0;
	        }
		}
        super.onEntityCollidedWithBlock(world, X, Y, Z, entity);
    }
    
    public static class SlimeSoundType extends Block.SoundType{
		public final String soundName;
        public final float volume;
        public final float frequency;
        public SlimeSoundType(String soundName, float volume, float frequency) {
        	super(soundName, volume, frequency);
        	this.soundName = soundName;
        	this.volume = volume;
        	this.frequency = frequency;
		}

        public String getBreakSound(){
            return "mob.slime.big";
        }

        public String getStepResourcePath(){
        	return "mob.slime.big";
        }

        public String func_150496_b(){
            return this.getBreakSound();
        }
    }

}