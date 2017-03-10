package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Food.MFoods;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityPlasticCow extends EntityCow{

	public EntityPlasticCow(World par1World) {
		super(par1World);
	}
	
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(13.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.245D);
    }
	
	@Override
	public EntityPlasticCow createChild(EntityAgeable par1EntityAgeable)
    {
        return new EntityPlasticCow(this.worldObj);
    }

}