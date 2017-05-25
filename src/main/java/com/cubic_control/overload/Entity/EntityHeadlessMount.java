package com.cubic_control.overload.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityHeadlessMount extends EntityHorse{
	private boolean wasRidden = false;
	private EntityAIAttackOnCollide attackAI;

	public EntityHeadlessMount(World par1World) {
		super(par1World);
		this.setGrowingAge(0);
		this.setHorseSaddled(true);
		this.setHorseType(4);
		this.tasks.taskEntries.clear();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityLiving.class, 6.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		attackAI = new EntityAIAttackOnCollide(this, 2.0D, false);
		updateAttackAI();
	}
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.21567000D);
		this.getAttributeMap().getAttributeInstanceByName("horse.jumpStrength").setBaseValue(0.51476D);
	}
	@Override
	protected boolean isMovementBlocked() {return this.isRearing();}
	@Override
	protected boolean canDespawn() {return true;}
	@Override
	public boolean canMateWith(EntityAnimal entity) {return false;}
	@Override
	public boolean allowLeashing() {return false;}
	@Override
	public boolean isBreedingItem(ItemStack stack) {return false;}
	@Override
	public boolean isCreatureType(EnumCreatureType type, boolean forSpawnCount) {
		if(type == EnumCreatureType.monster){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		this.setHealth(this.getMaxHealth());
		return data;
	}
	@Override
	public void onUpdate() {
		super.onUpdate();
		
		if(!worldObj.isRemote && worldObj.difficultySetting == EnumDifficulty.PEACEFUL){
			this.setDead();
		}
	}
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		this.setEating(false);
		
		if(this.wasRidden != isRidden()){
			updateAttackAI();
			this.wasRidden = isRidden();
		}
	}
	
	protected boolean isRidden() {
		return riddenByEntity != null;
	}
	
	private void updateAttackAI() {
		tasks.removeTask(attackAI);
		if(!isRidden()){
			tasks.addTask(4, attackAI);
		}
	}
	@Override
	public void moveEntityWithHeading(float strafe, float forward) {
		Entity entity = riddenByEntity;
		riddenByEntity = null;
		super.moveEntityWithHeading(strafe, forward);
		riddenByEntity = entity;
	}
	@Override
	public boolean attackEntityAsMob(Entity target) {
		if(isRidden() || isDead){
			return false;
		}
		super.attackEntityAsMob(target);
		
		if(!isRearing()){
			this.makeHorseRearWithSound();
		}
		float damage = (float)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
		return target.attackEntityFrom(DamageSource.causeMobDamage(this), damage);
	}

}
