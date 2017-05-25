package com.cubic_control.overload.TileEntity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Item.MItems;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityDuplicator extends TileEntity implements ISidedInventory {
    private static final int[] slotsTop = new int[] {0};
    private static final int[] slotsBottom = new int[] {2, 1};
    private static final int[] slotsSides = new int[] {1};
    /** The ItemStacks that hold the items currently being used in the duplicator */
    private ItemStack[] duplicatorItemStacks = new ItemStack[3];
    /** The number of ticks that the duplicator will keep burning */
    public int duplicatorUseTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the duplicator burning for */
    public int currentItemBurnTime;
    /** The number of ticks that the current item has been cooking for */
    public int duplicatorWorkTime;
    private String localizedName;
    
    public int duplicatorSpeed = 50; //Speed at which the duplicator works.
    
    @Override
    public int getSizeInventory() {
        return this.duplicatorItemStacks.length;
    }
    @Override
    public ItemStack getStackInSlot(int par1) {
        return this.duplicatorItemStacks[par1];
    }
    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if(this.duplicatorItemStacks[par1] != null){
            ItemStack itemstack;

            if(this.duplicatorItemStacks[par1].stackSize <= par2){
                itemstack = this.duplicatorItemStacks[par1];
                this.duplicatorItemStacks[par1] = null;
                return itemstack;
            }else{
                itemstack = this.duplicatorItemStacks[par1].splitStack(par2);

                if(this.duplicatorItemStacks[par1].stackSize == 0){
                    this.duplicatorItemStacks[par1] = null;
                }
                return itemstack;
            }
        }else{
            return null;
        }
    }
    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if(this.duplicatorItemStacks[par1] != null){
            ItemStack itemstack = this.duplicatorItemStacks[par1];
            this.duplicatorItemStacks[par1] = null;
            return itemstack;
        }else{
            return null;
        }
    }
    @Override
    public void setInventorySlotContents(int par1, ItemStack stack) {
        this.duplicatorItemStacks[par1] = stack;
        
        if(stack != null && stack.stackSize > this.getInventoryStackLimit()){
            stack.stackSize = this.getInventoryStackLimit();
        }
    }
    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.localizedName : "container.duplicator";
    }
    @Override
    public boolean hasCustomInventoryName() {
        return this.localizedName != null && this.localizedName.length() > 0;
    }
    
    public void func_145951_a(String name) {
        this.localizedName = name;
    }
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.duplicatorItemStacks = new ItemStack[this.getSizeInventory()];

        for(int i = 0; i < nbttaglist.tagCount(); i++){
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if(b0 >= 0 && b0 < this.duplicatorItemStacks.length){
                this.duplicatorItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
        this.duplicatorUseTime = compound.getShort("UseTime");
        this.duplicatorWorkTime = compound.getShort("WorkTime");
        this.currentItemBurnTime = (int)compound.getShort("CurrentItemBurnTime");

        if(compound.hasKey("CustomName", 8)){
            this.localizedName = compound.getString("CustomName");
        }
    }
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("UseTime", (short)this.duplicatorUseTime);
        compound.setShort("WorkTime", (short)this.duplicatorWorkTime);
        compound.setShort("CurrentItemBurnTime", (short) this.currentItemBurnTime);
        NBTTagList nbttaglist = new NBTTagList();

        for(int i = 0; i < this.duplicatorItemStacks.length; i++){
            if(this.duplicatorItemStacks[i] != null){
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.duplicatorItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        compound.setTag("Items", nbttaglist);

        if(this.hasCustomInventoryName()){
        	compound.setString("CustomName", this.localizedName);
        }
    }
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int p_145953_1_) {
        return this.duplicatorWorkTime * p_145953_1_ / this.duplicatorSpeed;
    }
    
    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int p_145955_1_) {
        if(this.currentItemBurnTime == 0){
            this.currentItemBurnTime = this.duplicatorSpeed;
        }
        return this.duplicatorUseTime * p_145955_1_ / this.currentItemBurnTime;
    }
    
    public boolean isUsing() {
        return this.duplicatorUseTime > 0;
    }
    @Override
    public void updateEntity() {
        boolean flag = this.duplicatorUseTime > 0;
        boolean flag1 = false;

        if(this.duplicatorUseTime > 0){
            --this.duplicatorUseTime;
        }
        if(!this.worldObj.isRemote){
            if(this.duplicatorUseTime == 0 && this.canDuplicate()){
                this.currentItemBurnTime = this.duplicatorUseTime = getItemBurnTime(this.duplicatorItemStacks[1]);

                if(this.duplicatorUseTime > 0){
                    flag1 = true;

                    if(this.duplicatorItemStacks[1] != null){
                        --this.duplicatorItemStacks[1].stackSize;

                        if(this.duplicatorItemStacks[1].stackSize == 0){
                            this.duplicatorItemStacks[1] = duplicatorItemStacks[1].getItem().getContainerItem(duplicatorItemStacks[1]);
                        }
                    }
                }
            }
            if(this.isUsing() && this.canDuplicate()){
                ++this.duplicatorWorkTime;

                if(this.duplicatorWorkTime == this.duplicatorSpeed){
                    this.duplicatorWorkTime = 0;
                    this.duplicateItem();
                    flag1 = true;
                }
            }else{
                this.duplicatorWorkTime = 0;
            }
            if(flag != this.duplicatorUseTime > 0){
                flag1 = true;
                //ModBlockduplicatorFire.updateduplicatorBlockState(this.duplicatorBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if(flag1){
            this.markDirty();
        }
    }
    
    private boolean canDuplicate() {
        if(this.duplicatorItemStacks[0] == null){
            return false;
        }else{
            ItemStack itemstack = this.duplicatorItemStacks[0];
            if (itemstack == null) return false;
            if (this.duplicatorItemStacks[2] == null) return true;
            if (!this.duplicatorItemStacks[2].isItemEqual(itemstack)) return false;
            int result = duplicatorItemStacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.duplicatorItemStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }
    
    public void duplicateItem() {
        if(this.canDuplicate()){
            ItemStack itemstack = this.duplicatorItemStacks[0];

            if(this.duplicatorItemStacks[2] == null){
                this.duplicatorItemStacks[2] = itemstack.copy();
            }else if(this.duplicatorItemStacks[2].getItem() == itemstack.getItem()){
                this.duplicatorItemStacks[2].stackSize += itemstack.stackSize;
            }
            //--this.duplicatorItemStacks[0].stackSize;

            if(this.duplicatorItemStacks[0].stackSize <= 0){
                this.duplicatorItemStacks[0] = null;
            }
        }
    }
    
    public static int getItemBurnTime(ItemStack stack) {
        if(stack == null){
            return 0;
        }else{
            Item item = stack.getItem();

            if(item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air){
                Block block = Block.getBlockFromItem(item);

                if(block == MBlocks.light_pyramid){
                    return 16000;
                }
            }
            if (item == MItems.light_shard){return 400;}
            return GameRegistry.getFuelValue(stack);
        }
    }
    
    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }
    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
    	return true;
    }
    @Override
    public void openInventory() {}
    @Override
    public void closeInventory() {}
    @Override
    public boolean isItemValidForSlot(int par1, ItemStack stack) {
        return par1 == 2 ? false : (par1 == 1 ? isItemFuel(stack) : true);
    }
    @Override
    public int[] getAccessibleSlotsFromSide(int par1) {
        return par1 == 0 ? slotsBottom : (par1 == 1 ? slotsTop : slotsSides);
    }
    @Override
    public boolean canInsertItem(int par1, ItemStack stack, int par3) {
        return this.isItemValidForSlot(par1, stack);
    }
    @Override
    public boolean canExtractItem(int par1, ItemStack stack, int par3) {
        return par3 != 0 || par1 != 1;
    }
}