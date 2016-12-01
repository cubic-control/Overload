package com.cubic_control.Mobs;

import com.cubic_control.Item.MItems;

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
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityNightmareSteve extends EntityMob{

	public EntityNightmareSteve(World par1World) {
		super(par1World);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, true));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
		this.tasks.addTask(2, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.setSize(0.6F, 1.8F);
	}
	
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25000000000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.9D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.9D);
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
	
	 	protected Item getDropItem()
	    {
	        return MItems.Nightmare_Gem;
	    }
	    /**
	     * Get this Entity's EnumCreatureAttribute
	     */
	    public EnumCreatureAttribute getCreatureAttribute()
	    {
	        return EnumCreatureAttribute.UNDEFINED;
	    }
	    
	    /**
	     * Makes entity wear random armor based on difficulty
	     */
	    protected void addRandomArmor()
	    {
	        if (this.worldObj.difficultySetting == EnumDifficulty.HARD)
	        {
	                this.setCurrentItemOrArmor(0, new ItemStack(MItems.diamond_nightmare_sword));
	        }
	        
	        if (this.worldObj.difficultySetting == EnumDifficulty.NORMAL)
	        {
	                this.setCurrentItemOrArmor(0, new ItemStack(MItems.iron_nightmare_sword));
	        }
	        
	        if (this.worldObj.difficultySetting == EnumDifficulty.EASY)
	        {
	                this.setCurrentItemOrArmor(0, new ItemStack(MItems.blue_nightmare_sword));
	        }
	    }
	    
	    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data)
	    {
	        data = super.onSpawnWithEgg(data);
	        
	        this.addRandomArmor();
	        
	        return data;
	    }
	    
	    public boolean canBreatheUnderwater()
	    {
	        return true;
	    }
	    
	    protected void fall(float par1) {}

}
