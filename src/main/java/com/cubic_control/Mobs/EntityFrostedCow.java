package com.cubic_control.Mobs;

import com.cubic_control.Food.MFoods;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityFrostedCow extends EntityCow{

	public EntityFrostedCow(World par1World) {
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
	public EntityFrostedCow createChild(EntityAgeable par1EntityAgeable)
    {
        return new EntityFrostedCow(this.worldObj);
    }
	@Override
	protected Item getDropItem()
    {
        return Items.leather;
    }
	@Override
	protected void dropFewItems(boolean par1, int par2)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + par2);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Items.leather, 1);
        }

        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_beef, 1);
            }
            else
            {
                this.dropItem(MFoods.ice_beef, 1);
            }
        }
    }

}
