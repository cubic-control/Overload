package com.cubic_control.overload.GUI;

import com.cubic_control.overload.Blocks.MBlocks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.world.World;

public class ContainerWorkbenchFire extends ContainerWorkbench{
	
	public World worldObj;
    public int posX;
    public int posY;
    public int posZ;

	public ContainerWorkbenchFire(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
		super(par1InventoryPlayer, par2World, par3, par4, par5);
		this.worldObj = par2World;
        this.posX = par3;
        this.posY = par4;
        this.posZ = par5;
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer par1EntityPlayer){
        return this.worldObj.getBlock(this.posX, this.posY, this.posZ) != MBlocks.fire_crafting_table ? false : par1EntityPlayer.getDistanceSq((double)this.posX + 0.5D, (double)this.posY + 0.5D, (double)this.posZ + 0.5D) <= 64.0D;
    }

}
