package com.cubic_control.overload.Item;

import com.cubic_control.cubic_core.Utils.CubicUtils;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFireball;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ModItemScepterIce extends ModItem{
	private PotionEffect[] effects;

	public ModItemScepterIce(String name, PotionEffect... effects) {
		super(name);
		this.effects = effects;
	}
	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entityHit, EntityLivingBase player) {
		for(int i = 0; i < effects.length; i ++){
	        if(!player.worldObj.isRemote && effects[i] != null && effects[i].getPotionID() > 0){
	        	entityHit.addPotionEffect(new PotionEffect(this.effects[i].getPotionID(), this.effects[i].getDuration(), this.effects[i].getAmplifier(), this.effects[i].getIsAmbient()));
	        }
	    }
        return true;
    }
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		if(!world.isRemote){
			if(!entity.isAirBorne){
				Block block = world.getBlock(entity.chunkCoordX, entity.chunkCoordY, entity.chunkCoordZ);
				if(block.getMaterial() == Material.water){
					CubicUtils.replaceBlocksAroundPoint(world, entity.chunkCoordX, entity.chunkCoordY-1, entity.chunkCoordZ, block, Blocks.ice);
				}
			}
		}
		super.onUpdate(stack, world, entity, par4, par5);
	}

}
