package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Food.MFoods;
import com.cubic_control.overload.Item.MItems;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityPlasticChicken extends EntityChicken{

	public EntityPlasticChicken(World par1World) {
		super(par1World);
		
	}
	
	@Override
	 protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(6.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.245D);
    }
	
	@Override
	public EntityPlasticChicken createChild(EntityAgeable par1EntityAgeable) {
        return new EntityPlasticChicken(this.worldObj);
    }

}
