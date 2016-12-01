package com.cubic_control.Classes;

import com.cubic_control.Models.ModelElytra;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockDispenser;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants.NBT;
import net.minecraftforge.common.util.EnumHelper;

public class ItemElytra extends ItemArmor {
	
	private Item repairItem;
	private String texture;
	
	public ItemElytra(Item item, ArmorMaterial armor, String string){
		super(armor, 0, 1);
		repairItem = item;
		maxStackSize = 1;
		setCreativeTab(CreativeTabs.tabTransport);
		BlockDispenser.dispenseBehaviorRegistry.putObject(this, BlockDispenser.dispenseBehaviorRegistry.getObject(Items.iron_chestplate));
		
		texture = string;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair){
		return repair.getItem() == repairItem;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
		int entityequipmentslot = 3;
		ItemStack itemstack = playerIn.getEquipmentInSlot(entityequipmentslot);

		if (itemstack == null){
			playerIn.setCurrentItemOrArmor(entityequipmentslot, itemStackIn.copy());
			itemStackIn.stackSize = 0;
			return itemStackIn;
		} else {
			return itemStackIn;
		}
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
		return armorType == 1;
	}
	
	//Looks\\
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return RefStrings.MODID + ":textures/elytra/" + texture + ".png";
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
		return new ModelElytra();
	}
}