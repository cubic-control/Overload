package com.cubic_control.overload.Entity;

import java.util.Random;

import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityFireArcher extends EntityFireBase implements IRangedAttackMob{

	public EntityFireArcher(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAIArrowAttack(this, 1.0D, 20, 60, 15.0F));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityIceArcher.class, 8.0F));
		this.setSize(0.6F, 1.92F);
	}
	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase var1, float var2) {
		EntityArrow entityarrow = new EntityArrow(this.worldObj, this, var1, 1.6F, (float)(14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
        int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
        int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
        entityarrow.setDamage((double)(var2 * 2.0F) + this.rand.nextGaussian() * 0.25D + (double)((float)this.worldObj.difficultySetting.getDifficultyId() * 0.11F));

        if(i > 0){
            entityarrow.setDamage(entityarrow.getDamage() + (double)i * 0.5D + 0.5D);
        }
        if(j > 0){
            entityarrow.setKnockbackStrength(j);
        }
        if(EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem()) > 0){
            entityarrow.setFire(100);
        }
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityarrow);
	}
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(25.0D);
    }
	@Override
	protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
        this.dataWatcher.addObject(18, new Byte((byte)0));
    }
	@Override
	protected Item getDropItem() {
		return MItems.fire_stick;
	}
	    
	/**
	* Makes entity wear random armor based on difficulty
	*/
	protected void addRandomArmor() {
		this.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
	}
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
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

        if(par1NBTTagCompound.hasKey("Gender", 99)){
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
