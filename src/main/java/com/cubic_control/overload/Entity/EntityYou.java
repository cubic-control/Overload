package com.cubic_control.overload.Entity;

import java.util.List;

import com.cubic_control.cubic_core.Utils.CubicUtils;
import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
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
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityYou extends EntityMob{
	EntityPlayer thePlayer;

	public EntityYou(World par1World) {
		super(par1World);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setEnterDoors(true);
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIAttackOnCollide(this, 1.0D, true));
		this.tasks.addTask(2, new EntityAIMoveIndoors(this));
		this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
		this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.3F));
		this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, true));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		this.setSize(0.6F, 1.8F);
	}
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(1.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
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
	protected int getExperiencePoints(EntityPlayer player) {
        return player.experienceTotal;
    }
	@Override
    protected Item getDropItem() {
    	if(thePlayer.getCurrentEquippedItem() != null){
    		return thePlayer.getCurrentEquippedItem().getItem();
    	}else{
    		return Items.skull;
    	}
    }
    /**
     * Get this Entity's EnumCreatureAttribute
     */
	@Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }
	@Override
    protected void dropRareDrop(int par1) {
		this.dropItem(thePlayer.inventory.getStackInSlot(par1).getItem(), 1);
    }
    @Override
    public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        
        this.setCurrentItemOrArmor(0, thePlayer.getCurrentEquippedItem());
        
        return data;
    }
    @Override
    public void onLivingUpdate() {
    	List<EntityLivingBase> list = this.worldObj.getEntitiesWithinAABB(EntityMob.class, AxisAlignedBB.getBoundingBox(this.posX - 5, this.posY - 5, this.posZ - 5, this.posX + 5, this.posY + 5, this.posZ + 5));
    	for(int i=0;i<=list.size()-1;i++){
    		EntityLivingBase entity = (EntityLivingBase)list.get(i);
    		if(entity instanceof EntityPlayer){
    			this.thePlayer = (EntityPlayer)entity;
    		}
    	}
    	super.onLivingUpdate();
    }

}