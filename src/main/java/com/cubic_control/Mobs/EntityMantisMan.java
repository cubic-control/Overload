package com.cubic_control.Mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityMantisMan extends EntityMob{

	public EntityMantisMan(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(2, new EntityAILeapAtTarget(this, 0.4F));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityBat.class, 1.0D, true));
		this.tasks.addTask(5, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
		this.tasks.addTask(6, new EntityAIAttackOnCollide(this, EntityCaveSpider.class, 1.0D, true));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityBat.class, 8.0F));
		this.tasks.addTask(9, new EntityAIWatchClosest(this, EntitySpider.class, 8.0F));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityCaveSpider.class, 8.0F));
		this.tasks.addTask(11, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(12, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityBat.class, 0, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
		this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityCaveSpider.class, 0, true));
	}
	
	protected void fall(float par1) {}
	
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25333330000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(13.5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
    }
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	@Override
	protected boolean isAIEnabled()
    {
        return true;
    }
	protected int getExperiencePoints(EntityPlayer par1EntityPlayer)
    {
        return super.getExperiencePoints(par1EntityPlayer);
    }
	
	public boolean canBreatheUnderwater()
    {
        return false;
    }
	
	@Override
	public boolean attackEntityAsMob(Entity entity) {
	    boolean success = super.attackEntityAsMob(entity);
	    if (entity instanceof EntityLiving) {
	        ((EntityLiving)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 3));
	        success = true;
	    }
	    if(entity instanceof EntityPlayer){
	    	((EntityPlayer)entity).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600, 3));
	        success = true;
	    }
	    return success;
	}
	
	@Override
	protected void attackEntity(Entity par1Entity, float par2)
    {
        if (this.attackTime <= 0 && par2 < 2.0F && par1Entity.boundingBox.maxY > this.boundingBox.minY && par1Entity.boundingBox.minY < this.boundingBox.maxY)
        {
            this.attackTime = 20;
            this.attackEntityAsMob(par1Entity);
        }
    }

}
