package com.cubic_control.overload.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.cubic_control.overload.Util.EntityUtil;

public class EntityHeadless extends EntityFakeMob{
	private boolean firstUpdate = true;
	private boolean isMounted = false;
	
	private EntityLivingBase lastAttackTarget = null;

	public EntityHeadless(World par1World) {
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
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFakeHeadless.class, 0, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, IMob.mobSelector));
		this.setSize(0.6F, 1.8F);
	}
	@Override
	protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }
	@Override
	public boolean isAIEnabled() {return true;}
	@Override
	protected Item getDropItem() {
        return Items.iron_axe;
    }
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_axe));
        
        return data;
    }
	
	private float getAttackRange() {
		if(isRiding()){
			return 3;
		}
		return 2;
	}
	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();
		
		if(this.firstUpdate && !this.worldObj.isRemote){
			this.spawnMount();
		}
		if(this.isRidingMount()){
			EntityLiving entity = ((EntityLiving)this.ridingEntity);
			if(this.lastAttackTarget != this.getAttackTarget() || this.firstUpdate){
				EntityUtil.cancelCurrentTasks(entity);
				this.lastAttackTarget = this.getAttackTarget();
			}
		}
		this.firstUpdate = false;
		
		if(!this.isMounted == this.isRidingMount()){
			this.getNavigator().clearPathEntity();
			this.isMounted = this.isRidingMount();
		}
		if(this.isBurning() && this.isRidingMount()){
	    	this.ridingEntity.setFire(8);
		}
	}
	//TODO: replace when CubicCore v1.0.3 is released
	private boolean isRidingMount() {
		return this.isRiding() && ridingEntity.getClass() == EntityHeadlessMount.class;
	}
	@Override
	protected void despawnEntity() {
		Entity mount = ridingEntity;
		super.despawnEntity();
		if(this.isDead && mount != null){
			mount.setDead();
		}
	}

	private void spawnMount() {
		if(this.ridingEntity != null){
			return;
		}
		EntityHeadlessMount mount = null;
		mount = new EntityHeadlessMount(worldObj);
		mount.setHorseSaddled(true);
		mount.setAttackTarget(getAttackTarget());
		mount.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
		mount.onSpawnWithEgg((IEntityLivingData) null);
		if(mount != null){
			this.setCanPickUpLoot(false);
			this.worldObj.spawnEntityInWorld(mount);
			this.mountEntity(mount);
		}
	}
}
