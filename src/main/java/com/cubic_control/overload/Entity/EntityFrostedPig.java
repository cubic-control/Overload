package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Food.MFoods;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityFrostedPig extends EntityPig{

	public EntityFrostedPig(World par1World) {
		super(par1World);
		
	}
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25555555555555555D);
    }
	
	@Override
	public EntityFrostedPig createChild(EntityAgeable par1EntityAgeable)
    {
        return new EntityFrostedPig(this.worldObj);
    }
	@Override
	protected Item getDropItem()
    {
        return this.isBurning() ? Items.cooked_porkchop : MFoods.ice_porkchop;
    }
	@Override
	protected void dropFewItems(boolean par1, int par2)
	{
	int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

	for (int k = 0; k < j; ++k)
	{
	if (this.isBurning())
	{
		this.dropItem(Items.cooked_porkchop, 1);
	}
	else
	{
		this.dropItem(MFoods.ice_porkchop, 1);
	}
	}

	if (this.getSaddled())
	{
	this.dropItem(Items.saddle, 1);
	}
	}

}
