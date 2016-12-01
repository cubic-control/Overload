package com.cubic_control.Mobs;

import com.cubic_control.Item.MItems;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityStalker extends EntityAmbientCreature{

	public EntityStalker(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	}
	
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25555555555555555D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
    }
	
	@Override
	public boolean isAIEnabled()
    {
        return true;
    }
	
	public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }
	
	protected Item getDropItem()
    {
        return Items.stick;
    }

}
