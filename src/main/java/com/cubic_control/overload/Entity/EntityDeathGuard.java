package com.cubic_control.overload.Entity;

import java.util.Random;

import com.cubic_control.overload.Armor.MArmor;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;
import com.cubic_control.overload.lib.RefStrings;

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
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityDeathGuard extends EntityMob{

	public EntityDeathGuard(World par1World) {
		super(par1World);
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
	
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25000000000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
        if(this.worldObj.difficultySetting == EnumDifficulty.EASY){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.5D);
        }else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.5D);
        }else if(this.worldObj.difficultySetting == EnumDifficulty.HARD){
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.5D);
        }
    }
	
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
	
	protected Item getDropItem() {
		return Items.bone;
	}
	/**
	* Get this Entity's EnumCreatureAttribute
	*/
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEAD;
	}
	    
	/**
	* Makes entity wear random armor based on difficulty
	*/
	protected void addRandomArmor() {
		Random rand = new Random();
		if(rand.nextInt(100) < 50){
			this.setCurrentItemOrArmor(0, new ItemStack(MTools.white_nightmare_sword));
			this.setCurrentItemOrArmor(1, new ItemStack(MArmor.white_boots));
			this.setCurrentItemOrArmor(2, new ItemStack(MArmor.white_leggings));
			this.setCurrentItemOrArmor(3, new ItemStack(MArmor.white_chestplate));
			this.setCurrentItemOrArmor(4, new ItemStack(MArmor.white_helmet));
			
			if(rand.nextInt(100) < 50){
				this.enchantEquipment();
			}
		}else{
			this.setCurrentItemOrArmor(0, new ItemStack(MTools.black_nightmare_sword));
			this.setCurrentItemOrArmor(1, new ItemStack(MArmor.black_boots));
			this.setCurrentItemOrArmor(2, new ItemStack(MArmor.black_leggings));
			this.setCurrentItemOrArmor(3, new ItemStack(MArmor.black_chestplate));
			this.setCurrentItemOrArmor(4, new ItemStack(MArmor.black_helmet));
			
			if(rand.nextInt(100) < 50){
				this.enchantEquipment();
			}
		}
	}
	@Override
	public boolean canBreatheUnderwater(){return true;}
	@Override
	public boolean canDespawn(){return true;}
	    
	protected void fall(float par1) {}
	    
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
		data = super.onSpawnWithEgg(data);
	        
		this.addRandomArmor();
	        
		return data;
	}
	
	@Override
	protected String getDeathSound() {
		//TODO: change sounds
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
	public void onUpdate() {
		super.onUpdate();
	}

}