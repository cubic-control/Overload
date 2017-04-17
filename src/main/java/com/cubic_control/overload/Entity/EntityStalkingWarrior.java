package com.cubic_control.overload.Entity;

import com.cubic_control.cubic_core.Utils.CubicUtils;
import com.cubic_control.overload.Entity.AI.EntityAIStalking;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityStalkingWarrior extends EntityMob{

	public EntityStalkingWarrior(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAIStalking(this));
		this.tasks.addTask(1, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(2, new EntityAIWander(this, 0.8D));
		this.tasks.addTask(3, new EntityAIPanic(this, 2.6D));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, false));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
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
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25666666666666666D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
    }
	@Override
	public boolean isAIEnabled() {
        return true;
    }
	@Override
	public boolean doesEntityNotTriggerPressurePlate() {
        return true;
    }
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(MTools.StalkingSpear));
        
        return data;
    }
	@Override
	protected Item getDropItem() {
        return MTools.StalkingSpear;
    }
	@Override
	protected void dropRareDrop(int par1) {
		Item item = CubicUtils.getRandomItem();
		if(item != null && item != new ItemStack(Blocks.air).getItem()){
			this.dropItem(item, 1);
		}else{
			this.dropItem(MItems.Nightmare_Gem, 1);
		}
	}

}
