package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Food.MFoods;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.world.World;

public class EntityFrostedSheep extends EntitySheep{
	
	public final InventoryCrafting field_90016_e = new InventoryCrafting(new Container()
    {
        public static final String __OBFID = "CL_00001649";
        public boolean canInteractWith(EntityPlayer par1EntityPlayer)
        {
            return false;
        }
    }, 2, 1);

	public EntityFrostedSheep(World par1World) {
		super(par1World);
		
	}
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25555555555555555D);
    }
	
	@Override
	public EntityFrostedSheep createChild(EntityAgeable par1EntityAgeable)
    {
		EntityFrostedSheep entitysheep = (EntityFrostedSheep)par1EntityAgeable;
		EntityFrostedSheep entitysheep1 = new EntityFrostedSheep(this.worldObj);
        int i = this.func_90014_a(this, entitysheep);
        entitysheep1.setFleeceColor(15 - i);
        return entitysheep1;
    }
	
	public int func_90014_a(EntityAnimal par1EntityAnimal, EntityAnimal par2EntityAnimal)
    {
        int i = this.func_90013_b(par1EntityAnimal);
        int j = this.func_90013_b(par2EntityAnimal);
        this.field_90016_e.getStackInSlot(0).setItemDamage(i);
        this.field_90016_e.getStackInSlot(1).setItemDamage(j);
        ItemStack itemstack = CraftingManager.getInstance().findMatchingRecipe(this.field_90016_e, ((EntitySheep)par1EntityAnimal).worldObj);
        int k;

        if (itemstack != null && itemstack.getItem() == Items.dye)
        {
            k = itemstack.getItemDamage();
        }
        else
        {
            k = this.worldObj.rand.nextBoolean() ? i : j;
        }

        return k;
    }
	
	public int func_90013_b(EntityAnimal par1EntityAnimal)
    {
        return 15 - ((EntitySheep)par1EntityAnimal).getFleeceColor();
    }

}
