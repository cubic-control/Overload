package com.cubic_control.overload.Item;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Entity.ElytraModel;
import com.cubic_control.overload.Models.ModelElytra;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.EnumHelper;

public class Ender_rite_elytra extends ItemArmor {
	
	private String string;
	
	@SideOnly(Side.CLIENT)
	private IIcon broken;

	public Ender_rite_elytra(String name) {
		super(EnumHelper.addArmorMaterial("ender_rite_armor", 40, new int[]{4, 9, 7, 4}, 30), 0, 1);
		setMaxDamage(432);
		setMaxStackSize(1);
		setTextureName(RefStrings.MODID + ":" + name);
		setUnlocalizedName(name);
		setCreativeTab(MCreativeTabs.tabTransport);
		GameRegistry.registerItem(this, name);
		this.string = name;
	}
	@Override
	public boolean getIsRepairable(ItemStack stack, ItemStack material) {
		return ArmorMaterial.CLOTH.func_151685_b() == material.getItem();
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return RefStrings.MODID + ":textures/elytra/" + string + ".png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
		return new ModelElytra();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return meta >= getMaxDamage() ? broken : super.getIconFromDamage(meta);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
		super.registerIcons(reg);
		broken = reg.registerIcon(RefStrings.MODID + ":Ender-rite_elytra_broken");
	}
	
	public static boolean isBroken(ItemStack stack)
    {
        return stack.getItemDamage() < stack.getMaxDamage() - 1;
    }
}
