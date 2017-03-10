package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Item.MItems;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityFakeHeadless extends EntityMob{

	public EntityFakeHeadless(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setCanSwim(false);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.setSize(0.6F, 1.8F);
		EntityHitList();
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }
	
	@Override
	public boolean isAIEnabled() {return true;}
	
	protected Item getDropItem()
    {
        return Items.iron_sword;
    }
	
	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
	
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data)
    {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_sword));
        
        return data;
    }
	
	public void EntityHitList(){
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityHeadless.class, 0, true));
	}
	
	@Override
	public void updateRidden() {
		super.updateRidden();
		
		if (this.ridingEntity instanceof EntityHorse)
        {
			EntityHorse parEntityHorse = (EntityHorse)this.ridingEntity;
            this.renderYawOffset = parEntityHorse.renderYawOffset;
        }
	}
}
