package com.cubic_control.overload.Tools;

import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemMachete extends Item{
    private float field_150934_a;
    private final Item.ToolMaterial field_150933_b;

    public ItemMachete(Item.ToolMaterial p_i45356_1_) {
        this.field_150933_b = p_i45356_1_;
        this.maxStackSize = 1;
        this.setMaxDamage(p_i45356_1_.getMaxUses());
        this.setCreativeTab(CreativeTabs.tabCombat);
        this.field_150934_a = 5.0F + p_i45356_1_.getDamageVsEntity();
    }
    
    public float func_150931_i() {
        return this.field_150933_b.getDamageVsEntity();
    }
    @Override
    public float func_150893_a(ItemStack stack, Block block) {
        if(block == Blocks.web){
            return 15.0F;
        }else{
            Material material = block.getMaterial();
            return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
        }
    }
    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase entityHit, EntityLivingBase player) {
        stack.damageItem(1, player);
        return true;
    }
    @Override
    public boolean onBlockDestroyed(ItemStack stack, World world, Block block, int x, int y, int z, EntityLivingBase player) {
        if ((double)block.getBlockHardness(world, x, y, z) != 0.0D) {
            stack.damageItem(2, player);
        }
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {return true;}
    @Override
    public EnumAction getItemUseAction(ItemStack stack) {
        return EnumAction.block;
    }
    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        return 72000;
    }
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
    @Override
    public boolean func_150897_b(Block block) {
        return block == Blocks.web;
    }
    @Override
    public int getItemEnchantability() {
        return this.field_150933_b.getEnchantability();
    }
    
    public String getToolMaterialName() {
        return this.field_150933_b.toString();
    }
    @Override
    public boolean getIsRepairable(ItemStack stack, ItemStack stack2) {
        return this.field_150933_b.func_150995_f() == stack2.getItem() ? true : super.getIsRepairable(stack, stack2);
    }
    @Override
    public Multimap getItemAttributeModifiers() {
        Multimap multimap = super.getItemAttributeModifiers();
        multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.field_150934_a, 0));
        return multimap;
    }
}