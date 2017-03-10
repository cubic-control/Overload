package com.cubic_control.overload.Entity;

import java.util.Random;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityUnknown extends EntityEnderman{

	public EntityUnknown(World par1World) {
		super(par1World);
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.50000000000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
    }
	@Override
	protected boolean isAIEnabled()
    {
        return true;
    }
	@Override
	protected String getLivingSound()
    {
        return this.isScreaming() ? "Unknown.SCREAM" : "Unknown.IDLE";
    }
	/**
     * Returns the sound this mob makes when it is hurt.
     */
	@Override
    protected String getHurtSound()
    {
        return RefStrings.MODID + ":Unknown.HURT";
    }
    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return RefStrings.MODID + ":Unknown.DEATH";
    }
    @Override
    public boolean canBreatheUnderwater()
    {
        return true;
    }
    @Override
    public boolean isWet() {
        return false;
    }
    
    protected Item getDropItem() {
    	ItemStack stack = new ItemStack(Items.dye, 1, 4);
    	return stack.getItem();
    }
}
