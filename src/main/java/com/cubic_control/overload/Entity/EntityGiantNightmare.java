package com.cubic_control.overload.Entity;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityGiantNightmare extends EntityNightmare{

	public EntityGiantNightmare(World par1World) {
		super(par1World);
		this.yOffset *= 6.0F;
        this.setSize(this.width * 6.0F, this.height * 6.0F);
	}
	
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.34D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12.5D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200.5D);
    }
	
	@Override
	public float getBlockPathWeight(int par1, int par2, int par3) {
        return this.worldObj.getLightBrightness(par1, par2, par3) - 0.5F;
    }
	
	@Override
	protected Item getDropItem() {
        return Item.getItemFromBlock(MBlocks.light_pyramid);
    }
	
	@Override
	protected void dropRareDrop(int par1) {
		int i1 = 0;
		if (this.worldObj.difficultySetting == EnumDifficulty.HARD) {
			i1 = 75;
		}else if(this.worldObj.difficultySetting == EnumDifficulty.NORMAL) {
			i1 = 50;
		}else if (this.worldObj.difficultySetting == EnumDifficulty.EASY) {
			i1 = 25;
		}
        switch (this.rand.nextInt(3)) {
            case 0:
                this.dropItem(MItems.Nightmare_Gem, i1);
                break;
            case 1:
                this.dropItem(MItems.nightmare_iron, i1);
                break;
            case 2:
                this.dropItem(MItems.light_shard, i1);
        }
    }

}
