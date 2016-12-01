package com.cubic_control.Mobs;

import com.cubic_control.Item.MItems;
import com.cubic_control.Tools.MTools;
import com.cubic_control.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityJeff extends EntityMob{

	public EntityJeff(World par1World) {
		super(par1World);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, Entity.class, 1.0D, true));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, Entity.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, Entity.class, 0, true));
		this.setSize(0.6F, 1.8F);
	}
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        if (this.worldObj.difficultySetting == EnumDifficulty.HARD){
        	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(200.0D);
        	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.7D);
        	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.0D);
        }
        if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL){
        	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0D);
        	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        	this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
        	this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        }
        if (this.worldObj.difficultySetting == EnumDifficulty.EASY){
        	this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(90.0D);
            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
            this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(90.0D);
        }
    }
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	protected boolean isAIEnabled()
    {
        return true;
    }
	protected int getExperiencePoints(EntityPlayer par1EntityPlayer)
    {
        return super.getExperiencePoints(par1EntityPlayer);
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return RefStrings.MODID + ":Jeff.death";
    }
    protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    {
        this.playSound(RefStrings.MODID + ":Jeff.step", 0.15F, 1.0F);
    }
    protected Item getDropItem()
    {
        return Items.bone;
    }
    /**
     * Get this Entity's EnumCreatureAttribute
     */
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }
    protected void dropRareDrop(int par1)
    {
        switch (this.rand.nextInt(4))
        {
            case 0:
                this.dropItem(Items.redstone, 1);
                break;
            case 1:
                this.dropItem(Items.record_11, 1);
                break;
            case 2:
                this.dropItem(Items.spider_eye, 1);
                break;
            case 3:
            	this.dropItem(MTools.jeff_knife, 1);
        }
    }
    
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data)
    {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(MTools.jeff_knife));
        
        return data;
    }

}
