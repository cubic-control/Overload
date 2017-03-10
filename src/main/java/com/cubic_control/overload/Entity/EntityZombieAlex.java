package com.cubic_control.overload.Entity;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntityZombieAlex extends EntityZombie{

	public EntityZombieAlex(World par1World) {
	        super(par1World);
	        this.getNavigator().setBreakDoors(true);
	        this.tasks.addTask(0, new EntityAISwimming(this));
	        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
	        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
	        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
	        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
	        this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
	        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	        this.tasks.addTask(8, new EntityAILookIdle(this));
	        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityVillager.class, 0, false));
	        this.setSize(0.6F, 1.8F);
	}

	    protected void applyEntityAttributes() {
	        super.applyEntityAttributes();
	        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
	        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
	        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	    }

	    protected void entityInit() {
	        super.entityInit();
	        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
	        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
	        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
	    }
	    
	    /**
	     * Returns true if the newer Entity AI code should be run
	     */
	    protected boolean isAIEnabled() {
	        return true;
	    }

	    protected Item getDropItem() {
	        return Items.rotten_flesh;
	    }

	    /**
	     * Get this Entity's EnumCreatureAttribute
	     */
	    public EnumCreatureAttribute getCreatureAttribute() {
	        return EnumCreatureAttribute.UNDEAD;
	    }

	    protected void dropRareDrop(int par1) {
	        switch (this.rand.nextInt(3)) {
	            case 0:
	                this.dropItem(Items.iron_ingot, 1);
	                break;
	            case 1:
	                this.dropItem(Items.carrot, 1);
	                break;
	            case 2:
	                this.dropItem(Items.potato, 1);
	        }
	    }
}
