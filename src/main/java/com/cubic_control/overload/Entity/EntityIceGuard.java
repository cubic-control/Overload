package com.cubic_control.overload.Entity;

import java.util.Random;

import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

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
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityIceGuard extends EntityIceBase{

	public EntityIceGuard(World par1World) {
		super(par1World);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityFireGuard.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.setSize(0.6F, 1.8F);
	}
	
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(23.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.28D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.7D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
    }
	
	protected void entityInit()
    {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(18, new Byte((byte)0));
    }
	
	protected Item getDropItem()
	{
		return MItems.ice_stick;
	}
	    
	/**
	* Makes entity wear random armor based on difficulty
	*/
	protected void addRandomArmor()
	{
		this.setCurrentItemOrArmor(0, new ItemStack(MTools.ice_stone_sword));
	}
	
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data)
    {
        data = super.onSpawnWithEgg(data);
        
        addRandomArmor();
        //Gender Stuff
        Random rand = new Random();
        if(rand.nextInt() > 5){
        	this.setGender(1);
        }
        
        return data;
	}
	
	//Gender Stuff
	
	public int getGender() {
		return this.dataWatcher.getWatchableObjectByte(18);
	}
		
	public void setGender(int par1) {
		this.dataWatcher.updateObject(18, Byte.valueOf((byte)par1));
	}
		
	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);

		if (par1NBTTagCompound.hasKey("Gender", 99)) {
			byte b0 = par1NBTTagCompound.getByte("Gender");
			this.setGender(b0);
		}
	}
		
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setByte("Gender", (byte)this.getGender());
	}

}