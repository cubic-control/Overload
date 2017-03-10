package com.cubic_control.overload.Entity;

import java.util.Random;

import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Util.EntityUtil;
import com.cubic_control.overload.Util.SpawnUtil;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
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
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.IAnimals;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityHeadless extends EntityFakeMob{
	
	private boolean firstUpdate = true;
	private boolean isMounted = false;

	private boolean spawned = false;
	private EntityLivingBase lastAttackTarget = null;

	public EntityHeadless(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setCanSwim(false);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
		EntityHitList();
		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.setSize(0.6F, 1.8F);
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
    }
	
	@Override
	public boolean isAIEnabled() {return true;}
	
	protected Item getDropItem()
    {
        return Items.iron_axe;
    }
	
	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
	
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data)
    {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(Items.iron_axe));
        
        return data;
    }
	
	public void EntityHitList(){
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityFakeHeadless.class, 0, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 0, true, false, IMob.mobSelector));
	}
	
	private float getAttackRange() {
	    if (isRiding()) {
	      return 3;
	    }
	    return 2;
	  }
	
	@Override
	  public void onLivingUpdate() {
	    super.onLivingUpdate();

	    if (firstUpdate && !worldObj.isRemote) {
	      spawnMount();
	    }

	    if (isRidingMount()) {
	      EntityLiving entLiving = ((EntityLiving) ridingEntity);
	      if (lastAttackTarget != getAttackTarget() || firstUpdate) {
	        EntityUtil.cancelCurrentTasks(entLiving);
	        lastAttackTarget = getAttackTarget();
	      }
	    }
	    firstUpdate = false;

	    if (!isMounted == isRidingMount()) {
	      getNavigator().clearPathEntity();
	      isMounted = isRidingMount();
	    }
	    if (isBurning() && isRidingMount()) {
	      ridingEntity.setFire(8);
	    }
	  }

	  private boolean isRidingMount() {
	    return isRiding() && ridingEntity.getClass() == EntityHorse.class;
	  }

	  @Override
	  protected void despawnEntity() {
	    Entity mount = ridingEntity;
	    super.despawnEntity();
	    if (isDead && mount != null) {
	      mount.setDead();
	    }
	  }

	  private void spawnMount() {
	    if (ridingEntity != null || !spawned) {
	      return;
	    }

	    EntityHorse mount = null;
	    if (MConfiguration.EnableHeadlessMount) {
	      mount = new EntityHorse(worldObj);
	      mount.setLocationAndAngles(posX, posY, posZ, rotationYaw, 0.0F);
	      mount.onSpawnWithEgg((IEntityLivingData) null);
	      //NB: don;t check for entity collisions as we know the knight will collide
	      if (!SpawnUtil.isSpaceAvailableForSpawn(worldObj, mount, false)) {
	        mount = null;
	      }
	    }
	    if (mount != null) {
	      setCanPickUpLoot(false);
	      worldObj.spawnEntityInWorld(mount);
	      mountEntity(mount);
	    }
	  }

}
