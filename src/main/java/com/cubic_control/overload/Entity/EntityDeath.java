package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Achievements.MAchievements;
import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.entity.EntityList;
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
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityDeath extends EntityMob implements IBossDisplayData{
	public int timeUntilNextGuard;

	public EntityDeath(World par1World) {
		super(par1World);
		this.timeUntilNextGuard = 0;
		
		this.isImmuneToFire = true;
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.setSize(0.6F, 1.92F);
	}
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(45.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.37000000000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.5D);
        if(this.worldObj.difficultySetting == EnumDifficulty.EASY){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(250.5D);
        }else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.5D);
        }else if(this.worldObj.difficultySetting == EnumDifficulty.HARD){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(350.5D);
        }
    }
	@Override
	protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	@Override
	protected boolean isAIEnabled() {
        return true;
    }
	@Override
	protected Item getDropItem() {
		return MItems.death_heart;
	}
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}
	
	/**
	* Makes entity wear random armor based on difficulty
	*/
	protected void addRandomArmor() {
		this.setCurrentItemOrArmor(0, new ItemStack(MTools.d_scythe));
		this.setCurrentItemOrArmor(1, new ItemStack(MArmor.death_boots));
		this.setCurrentItemOrArmor(2, new ItemStack(MArmor.death_leggings));
		this.setCurrentItemOrArmor(3, new ItemStack(MArmor.death_chestplate));
		this.setCurrentItemOrArmor(4, new ItemStack(MArmor.death_helmet));
	}
	@Override
	public boolean canBreatheUnderwater(){return true;}
	@Override
	public boolean canDespawn(){return false;}
	@Override
	protected void fall(float par1) {}
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		data = super.onSpawnWithEgg(data);
	        
		this.addRandomArmor();
	        
		return data;
	}
	@Override
	protected String getDeathSound() {
		return RefStrings.MODID + ":Death.DEATH";
	}
	
	@Override
	protected String getLivingSound() {
		return RefStrings.MODID + ":Death.IDLE";
	}
	@Override
	protected String getHurtSound() {
        return RefStrings.MODID + ":Death.HURT";
    }
	@Override
	public void onLivingUpdate() {
		--this.timeUntilNextGuard;
		super.onLivingUpdate();
	}
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		EntityLiving entityToSpawn = new EntityDeathGuard(this.worldObj);
		
		if(!this.worldObj.isRemote && this.timeUntilNextGuard <= 0) {
			entityToSpawn.setLocationAndAngles(this.posX, this.posY, this.posZ, 
					MathHelper.wrapAngleTo180_float(this.worldObj.rand.nextFloat() * 360.0F), 0.0F);
			this.worldObj.spawnEntityInWorld(entityToSpawn);
			entityToSpawn.onSpawnWithEgg((IEntityLivingData)null);
			entityToSpawn.playLivingSound();
			
			this.timeUntilNextGuard = 100;
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}
	@Override
	public void onDeath(DamageSource source) {
		if(source.getSourceOfDamage() instanceof EntityPlayer){
			((EntityPlayer)source.getSourceOfDamage()).addStat(MAchievements.achievementDeath, 1);
		}
		super.onDeath(source);
	}

}
