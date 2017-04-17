package com.cubic_control.overload.TileEntity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
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
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;

public class TileEntityFireFurnace extends TileEntityFurnace implements ISidedInventory {
    private static final int[] slotsTop = new int[] {0};
    private static final int[] slotsBottom = new int[] {2, 1};
    private static final int[] slotsSides = new int[] {1};
    /** The ItemStacks that hold the items currently being used in the furnace */
    private ItemStack[] furnaceItemStacks = new ItemStack[3];
    /** The number of ticks that the furnace will keep burning */
    public int furnaceBurnTime;
    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
    public int currentItemBurnTime;
    /** The number of ticks that the current item has been cooking for */
    public int furnaceCookTime;
    private String field_145958_o;
    private static final String __OBFID = "CL_00000357";
    
    @Override
    public int getSizeInventory() {
        return this.furnaceItemStacks.length;
    }
    @Override
    public ItemStack getStackInSlot(int par1) {
        return this.furnaceItemStacks[par1];
    }
    @Override
    public ItemStack decrStackSize(int par1, int par2) {
        if(this.furnaceItemStacks[par1] != null){
            ItemStack itemstack;

            if(this.furnaceItemStacks[par1].stackSize <= par2){
                itemstack = this.furnaceItemStacks[par1];
                this.furnaceItemStacks[par1] = null;
                return itemstack;
            }else{
                itemstack = this.furnaceItemStacks[par1].splitStack(par2);

                if(this.furnaceItemStacks[par1].stackSize == 0){
                    this.furnaceItemStacks[par1] = null;
                }
                return itemstack;
            }
        }else{
            return null;
        }
    }
    @Override
    public ItemStack getStackInSlotOnClosing(int par1) {
        if(this.furnaceItemStacks[par1] != null){
            ItemStack itemstack = this.furnaceItemStacks[par1];
            this.furnaceItemStacks[par1] = null;
            return itemstack;
        }else{
            return null;
        }
    }
    @Override
    public void setInventorySlotContents(int par1, ItemStack stack) {
        this.furnaceItemStacks[par1] = stack;
        
        if(stack != null && stack.stackSize > this.getInventoryStackLimit()){
            stack.stackSize = this.getInventoryStackLimit();
        }
    }
    @Override
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.field_145958_o : "container.fire_furnace";
    }
    @Override
    public boolean hasCustomInventoryName() {
        return this.field_145958_o != null && this.field_145958_o.length() > 0;
    }
    @Override
    public void func_145951_a(String name) {
        this.field_145958_o = name;
    }
    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];

        for(int i = 0; i < nbttaglist.tagCount(); ++i){
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            byte b0 = nbttagcompound1.getByte("Slot");

            if(b0 >= 0 && b0 < this.furnaceItemStacks.length){
                this.furnaceItemStacks[b0] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
        this.furnaceBurnTime = compound.getShort("BurnTime");
        this.furnaceCookTime = compound.getShort("CookTime");
        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

        if(compound.hasKey("CustomName", 8)){
            this.field_145958_o = compound.getString("CustomName");
        }
    }
    @Override
    public void writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setShort("BurnTime", (short)this.furnaceBurnTime);
        compound.setShort("CookTime", (short)this.furnaceCookTime);
        NBTTagList nbttaglist = new NBTTagList();

        for(int i = 0; i < this.furnaceItemStacks.length; ++i){
            if(this.furnaceItemStacks[i] != null){
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.furnaceItemStacks[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        compound.setTag("Items", nbttaglist);

        if(this.hasCustomInventoryName()){
        	compound.setString("CustomName", this.field_145958_o);
        }
    }
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getCookProgressScaled(int p_145953_1_) {
        return this.furnaceCookTime * p_145953_1_ / 200;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public int getBurnTimeRemainingScaled(int p_145955_1_) {
        if(this.currentItemBurnTime == 0){
            this.currentItemBurnTime = 200;
        }
        return this.furnaceBurnTime * p_145955_1_ / this.currentItemBurnTime;
    }
    @Override
    public boolean isBurning() {
        return this.furnaceBurnTime > 0;
    }
    @Override
    public void updateEntity() {
        boolean flag = this.furnaceBurnTime > 0;
        boolean flag1 = false;

        if(this.furnaceBurnTime > 0){
            --this.furnaceBurnTime;
        }
        if(!this.worldObj.isRemote){
            if(this.furnaceBurnTime == 0 && this.canSmelt()){
                this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

                if(this.furnaceBurnTime > 0){
                    flag1 = true;

                    if(this.furnaceItemStacks[1] != null){
                        --this.furnaceItemStacks[1].stackSize;

                        if(this.furnaceItemStacks[1].stackSize == 0){
                            this.furnaceItemStacks[1] = furnaceItemStacks[1].getItem().getContainerItem(furnaceItemStacks[1]);
                        }
                    }
                }
            }
            if(this.isBurning() && this.canSmelt()){
                ++this.furnaceCookTime;

                if(this.furnaceCookTime == 200){
                    this.furnaceCookTime = 0;
                    this.smeltItem();
                    flag1 = true;
                }
            }else{
                this.furnaceCookTime = 0;
            }
            if(flag != this.furnaceBurnTime > 0){
                flag1 = true;
                BlockFurnace.updateFurnaceBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
            }
        }
        if(flag1){
            this.markDirty();
        }
    }
    
    private boolean canSmelt() {
        if(this.furnaceItemStacks[0] == null){
            return false;
        }else{
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);
            if (itemstack == null) return false;
            if (this.furnaceItemStacks[2] == null) return true;
            if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) return false;
            int result = furnaceItemStacks[2].stackSize + itemstack.stackSize;
            return result <= getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
        }
    }
    @Override
    public void smeltItem() {
        if(this.canSmelt()){
            ItemStack itemstack = FurnaceRecipes.smelting().getSmeltingResult(this.furnaceItemStacks[0]);

            if(this.furnaceItemStacks[2] == null){
                this.furnaceItemStacks[2] = itemstack.copy();
            }else if(this.furnaceItemStacks[2].getItem() == itemstack.getItem()){
                this.furnaceItemStacks[2].stackSize += itemstack.stackSize;
            }
            --this.furnaceItemStacks[0].stackSize;

            if(this.furnaceItemStacks[0].stackSize <= 0){
                this.furnaceItemStacks[0] = null;
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

                if(block == Blocks.wooden_slab){
                    return 150;
                }
                if(block.getMaterial() == Material.wood){
                    return 300;
                }
                if(block == Blocks.coal_block){
                    return 16000;
                }
            }
            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")){return 200;}
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")){return 200;}
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")){return 200;}
            if (item == Items.stick){return 100;}
            if (item == Items.coal){return 1600;}
            if (item == Items.lava_bucket){return 20000;}
            if (item == Item.getItemFromBlock(Blocks.sapling)){return 100;}
            if (item == Items.blaze_rod){return 2400;}
            return GameRegistry.getFuelValue(stack);
        }
    }
    
    public static boolean isItemFuel(ItemStack stack) {
        return getItemBurnTime(stack) > 0;
    }
    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
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
        return par3 != 0 || par1 != 1 || stack.getItem() == Items.bucket;
    }
}