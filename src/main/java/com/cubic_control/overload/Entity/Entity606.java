package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Entity.AI.EntityAIStalking;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Entity606 extends EntityMob{

	public Entity606(World par1World) {
		super(par1World);
		this.getNavigator().setAvoidSun(false);
		this.getNavigator().setAvoidsWater(false);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setCanSwim(true);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAIStalking(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 2.0D, false));
		this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityNightmareHerobrine.class, 5.0F, 2.0D, 3.0D));
		this.tasks.addTask(3, new EntityAILookIdle(this));
		this.tasks.addTask(4, new EntityAIMoveIndoors(this));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(6, new EntityAIMoveTowardsTarget(this, 2.0D, 10.0F));
		this.tasks.addTask(7, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(8, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(9, new EntityAISwimming(this));
		this.tasks.addTask(10, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityNightmareHerobrine.class, 15.0F));
		this.tasks.addTask(12, new EntityAIWatchClosest(this, EntityPlayer.class, 15.0F));
		this.targetTasks.addTask(0, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
		this.setSize(0.6F, 1.8F);
	}
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.27566600000000000D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.2D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(57.666D);
    }
	@Override
	public float getEyeHeight() {
		return (super.getEyeHeight() + 0.5F);
	}
	@Override
	protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(15, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(16, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(17, Byte.valueOf((byte)0));
    }
	@Override
	protected boolean isAIEnabled() {return true;}
	@Override
    protected Item getDropItem() {
        return MItems.Nightmare_Gem;
    }
	@Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }
	@Override
    protected void dropRareDrop(int i1) {
        switch(this.rand.nextInt(4)){
            case 0:
                this.dropItem(MItems.Nightmare_Gem, 1);
                break;
            case 1:
                this.dropItem(MItems.light_shard, 1);
                break;
            case 2:
                this.dropItem(MItems.nightmare_iron, 1);
                break;
            case 3:
            	this.dropItem(MTools.scythe, 1);
            	break;
        }
    }
	@Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, new ItemStack(MTools.scythe));
        
        return data;
    }

}
