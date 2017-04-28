package com.cubic_control.overload.Entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Tools.MTools;

import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityFireVillager extends EntityFireBase {
	private int randomTickDivider;
	//TODO: Change to Fire Village
	Village villageObj;
	private boolean isLookingForHome;
	private int timeUntilReset;
	private boolean needsInitilization;
	private boolean isPlaying;
	private float field_82191_bN;

	public EntityFireVillager(World par1World) {
		super(par1World);
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityMob.class, 8.0F, 0.6D, 0.6D));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, true));
        this.tasks.addTask(10, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(10, new EntityAIWatchClosest2(this, EntityFireVillager.class, 5.0F, 0.02F));
        this.tasks.addTask(11, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
        this.setSize(0.6F, 1.92F);
	}
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
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
	@Override
	public IEntityLivingData onSpawnWithEgg(IEntityLivingData data) {
        data = super.onSpawnWithEgg(data);
        
        //Gender Stuff
        Random rand = new Random();
        if(rand.nextInt(10) > 5){
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
	
	//Villager Stuff
	
	@Override
    protected void updateAITick() {
        if(--this.randomTickDivider <= 0){
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if(this.villageObj == null){
                this.detachHome();
            }else{
                ChunkCoordinates chunkcoordinates = this.villageObj.getCenter();
                this.setHomeArea(chunkcoordinates.posX, chunkcoordinates.posY, chunkcoordinates.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

                if(this.isLookingForHome){
                    this.isLookingForHome = false;
                    this.villageObj.setDefaultPlayerReputation(5);
                }
            }
        }
        super.updateAITick();
    }
	
	public void setPlaying(boolean par1) {
        this.isPlaying = par1;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }
    @Override
    public void setRevengeTarget(EntityLivingBase par1EntityLivingBase) {
        super.setRevengeTarget(par1EntityLivingBase);
        
        if(this.villageObj != null && par1EntityLivingBase != null){
            this.villageObj.addOrRenewAgressor(par1EntityLivingBase);

            if(par1EntityLivingBase instanceof EntityPlayer){
                byte b0 = -1;

                if(this.isChild()){
                    b0 = -3;
                }
                this.villageObj.setReputationForPlayer(par1EntityLivingBase.getCommandSenderName(), b0);

                if(this.isEntityAlive()){
                    this.worldObj.setEntityState(this, (byte)13);
                }
            }
        }
    }
    @Override
    public void onDeath(DamageSource par1DamageSource) {
        if(this.villageObj != null){
            Entity entity = par1DamageSource.getEntity();
            
            if(entity != null){
                if(entity instanceof EntityPlayer){
                    this.villageObj.setReputationForPlayer(entity.getCommandSenderName(), -2);
                }else if(entity instanceof IMob){
                    this.villageObj.endMatingSeason();
                }
            }else if(entity == null){
                EntityPlayer entityplayer = this.worldObj.getClosestPlayerToEntity(this, 16.0D);

                if(entityplayer != null){
                    this.villageObj.endMatingSeason();
                }
            }
        }
        super.onDeath(par1DamageSource);
    }
    
    private float adjustProbability(float par1) {
        float f1 = par1 + this.field_82191_bN;
        return f1 > 0.9F ? 0.9F - (f1 - 0.9F) : f1;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte par1) {
        if(par1 == 12){
            this.generateRandomParticles("heart");
        }else if(par1 == 13){
            this.generateRandomParticles("angryVillager");
        }else if(par1 == 14){
            this.generateRandomParticles("happyVillager");
        }else{
            super.handleHealthUpdate(par1);
        }
    }
    
    @SideOnly(Side.CLIENT)
    private void generateRandomParticles(String par1Str) {
        for(int i = 0; i < 5; ++i){
            double d0 = this.rand.nextGaussian() * 0.02D;
            double d1 = this.rand.nextGaussian() * 0.02D;
            double d2 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(par1Str, this.posX + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, this.posY + 1.0D + (double)(this.rand.nextFloat() * this.height), this.posZ + (double)(this.rand.nextFloat() * this.width * 2.0F) - (double)this.width, d0, d1, d2);
        }
    }
    
    public void setLookingForHome() {
        this.isLookingForHome = true;
    }
    @Override
    public boolean allowLeashing() {return false;}

}