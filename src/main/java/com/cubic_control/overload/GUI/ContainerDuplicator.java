package com.cubic_control.overload.GUI;

import com.cubic_control.overload.TileEntity.TileEntityDuplicator;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerDuplicator extends Container{
    private TileEntityDuplicator tile;
    private int lastWorkTime;
    private int lastUseTime;
    private int lastItemBurnTime;
    
    public ContainerDuplicator(InventoryPlayer player, World world, int x, int y, int z) {
        this.tile = (TileEntityDuplicator)world.getTileEntity(x, y, z);
        this.addSlotToContainer(new Slot(this.tile, 0, 56, 17));
        this.addSlotToContainer(new Slot(this.tile, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, this.tile, 2, 116, 35));
        int i;

        for(i = 0; i < 3; ++i){
            for(int j = 0; j < 9; ++j){
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (i = 0; i < 9; ++i){
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
    }
    @Override
    public void addCraftingToCrafters(ICrafting par1ICrafting) {
        super.addCraftingToCrafters(par1ICrafting);
        par1ICrafting.sendProgressBarUpdate(this, 0, this.tile.duplicatorWorkTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.tile.duplicatorUseTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.tile.currentItemBurnTime);
    }
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for(int i = 0; i < this.crafters.size(); ++i){
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if(this.lastWorkTime != this.tile.duplicatorWorkTime){
                icrafting.sendProgressBarUpdate(this, 0, this.tile.duplicatorWorkTime);
            }
            if(this.lastUseTime != this.tile.duplicatorUseTime){
                icrafting.sendProgressBarUpdate(this, 1, this.tile.duplicatorUseTime);
            }
            if(this.lastItemBurnTime != this.tile.currentItemBurnTime){
                icrafting.sendProgressBarUpdate(this, 2, this.tile.currentItemBurnTime);
            }
        }
        this.lastWorkTime = this.tile.duplicatorWorkTime;
        this.lastUseTime = this.tile.duplicatorUseTime;
        this.lastItemBurnTime = this.tile.currentItemBurnTime;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2) {
        if(par1 == 0){
            this.tile.duplicatorWorkTime = par2;
        }
        if(par1 == 1){
            this.tile.duplicatorUseTime = par2;
        }
        if(par1 == 2){
            this.tile.currentItemBurnTime = par2;
        }
    }
    @Override
    public boolean canInteractWith(EntityPlayer player) {
    	return this.tile.isUseableByPlayer(player);
    }
    @Override
    public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(par2);

        if(slot != null && slot.getHasStack()){
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if(par2 == 2){
                if(!this.mergeItemStack(itemstack1, 3, 39, true)){
                    return null;
                }
                slot.onSlotChange(itemstack1, itemstack);
            }else if(par2 != 1 && par2 != 0){
                if(FurnaceRecipes.smelting().getSmeltingResult(itemstack1) != null){
                    if(!this.mergeItemStack(itemstack1, 0, 1, false)){
                        return null;
                    }
                }else if (TileEntityDuplicator.isItemFuel(itemstack1)){
                    if(!this.mergeItemStack(itemstack1, 1, 2, false)){
                        return null;
                    }
                }else if(par2 >= 3 && par2 < 30){
                    if(!this.mergeItemStack(itemstack1, 30, 39, false)){
                        return null;
                    }
                }else if(par2 >= 30 && par2 < 39 && !this.mergeItemStack(itemstack1, 3, 30, false)){
                    return null;
                }
            }else if (!this.mergeItemStack(itemstack1, 3, 39, false)){
                return null;
            }
            if(itemstack1.stackSize == 0){
                slot.putStack((ItemStack)null);
            }else{
                slot.onSlotChanged();
            }
            if(itemstack1.stackSize == itemstack.stackSize){
                return null;
            }
            slot.onPickupFromSlot(player, itemstack1);
        }
        return itemstack;
    }
}