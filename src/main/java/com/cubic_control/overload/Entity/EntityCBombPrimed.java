package com.cubic_control.overload.Entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityCBombPrimed extends Entity{
	/** How long the fuse is */
    public int fuse;
    private EntityLivingBase placedBy;

    public EntityCBombPrimed(World par1World) {
        super(par1World);
        this.fuse = 160;
        this.preventEntitySpawning = true;
        this.setSize(0.98F, 0.98F);
        this.yOffset = this.height / 2.0F;
    }
    
    public EntityCBombPrimed(World par1World, double par2, double par4, double par6, EntityLivingBase par8EntityLivingBase) {
        this(par1World);
        this.setPosition(par2, par4, par6);
        float f = (float)(Math.random() * Math.PI * 2.0D);
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.20000000298023224D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.fuse = 160;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
        this.placedBy = par8EntityLivingBase;
    }
    @Override
    protected void entityInit() {}
    @Override
    protected boolean canTriggerWalking() {return false;}
    @Override
    public boolean canBeCollidedWith() {return !this.isDead;}
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033D;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        this.motionZ *= 0.9800000190734863D;

        if(this.onGround){
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
            this.motionY *= -0.5D;
        }
        if(this.fuse-- <= 0){
            this.setDead();

            if(!this.worldObj.isRemote){
                this.explode();
            }
        }else{
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
        }
    }

    private void explode() {
        float f = 120.0F + this.rand.nextFloat();
        this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, f, true);
    }
    @Override
    protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
        par1NBTTagCompound.setByte("Fuse", (byte)this.fuse);
    }
    @Override
    protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
        this.fuse = par1NBTTagCompound.getByte("Fuse");
    }
    @Override
    @SideOnly(Side.CLIENT)
    public float getShadowSize() {
        return 0.0F;
    }
    
    public EntityLivingBase getPlacedBy() {
        return this.placedBy;
    }
}