package com.cubic_control.overload.GUI;

import com.cubic_control.overload.TileEntity.TileEntityFurnaceFire;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ContainerFurnaceFire extends Container{
    private TileEntityFurnaceFire tileFurnace;
    private int lastCookTime;
    private int lastBurnTime;
    private int lastItemBurnTime;
    
    public ContainerFurnaceFire(InventoryPlayer player, TileEntityFurnaceFire furnace) {
        this.tileFurnace = furnace;
        this.addSlotToContainer(new Slot(furnace, 0, 56, 17));
        this.addSlotToContainer(new Slot(furnace, 1, 56, 53));
        this.addSlotToContainer(new SlotFurnace(player.player, furnace, 2, 116, 35));
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
        par1ICrafting.sendProgressBarUpdate(this, 0, this.tileFurnace.furnaceCookTime);
        par1ICrafting.sendProgressBarUpdate(this, 1, this.tileFurnace.furnaceBurnTime);
        par1ICrafting.sendProgressBarUpdate(this, 2, this.tileFurnace.currentItemBurnTime);
    }
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();

        for(int i = 0; i < this.crafters.size(); ++i){
            ICrafting icrafting = (ICrafting)this.crafters.get(i);

            if(this.lastCookTime != this.tileFurnace.furnaceCookTime){
                icrafting.sendProgressBarUpdate(this, 0, this.tileFurnace.furnaceCookTime);
            }
            if(this.lastBurnTime != this.tileFurnace.furnaceBurnTime){
                icrafting.sendProgressBarUpdate(this, 1, this.tileFurnace.furnaceBurnTime);
            }
            if(this.lastItemBurnTime != this.tileFurnace.currentItemBurnTime){
                icrafting.sendProgressBarUpdate(this, 2, this.tileFurnace.currentItemBurnTime);
            }
        }
        this.lastCookTime = this.tileFurnace.furnaceCookTime;
        this.lastBurnTime = this.tileFurnace.furnaceBurnTime;
        this.lastItemBurnTime = this.tileFurnace.currentItemBurnTime;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void updateProgressBar(int par1, int par2) {
        if(par1 == 0){
            this.tileFurnace.furnaceCookTime = par2;
        }
        if(par1 == 1){
            this.tileFurnace.furnaceBurnTime = par2;
        }
        if(par1 == 2){
            this.tileFurnace.currentItemBurnTime = par2;
        }
    }
    @Override
    public boolean canInteractWith(EntityPlayer player) {
    	return this.tileFurnace.isUseableByPlayer(player);
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
                }else if (TileEntityFurnaceFire.isItemFuel(itemstack1)){
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