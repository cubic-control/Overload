package com.cubic_control.overload.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.Entity.EntityCBombPrimed;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.util.IIcon;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class ModBlockCBomb extends ModBlock{
    @SideOnly(Side.CLIENT)
    private IIcon field_150116_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150115_b;

    public ModBlockCBomb(String name) {
        super(Material.tnt, name, "", -1, 25F, 0F, Block.soundTypeMetal);
        this.setCreativeTab(MCreativeTabs.tabTech);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2) {
        return i1 == 0 ? this.field_150115_b : (i1 == 1 ? this.field_150116_a : this.blockIcon);
    }
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);

        if(world.isBlockIndirectlyGettingPowered(x, y, z)){
            this.onBlockDestroyedByPlayer(world, x, y, z, 1);
            world.setBlockToAir(x, y, z);
        }
    }
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if(world.isBlockIndirectlyGettingPowered(x, y, z)){
            this.onBlockDestroyedByPlayer(world, x, y, z, 1);
            world.setBlockToAir(x, y, z);
        }
    }
    @Override
    public int quantityDropped(Random rand) {return 1;}
    @Override
    public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion explosion) {
        if(!world.isRemote){
            EntityCBombPrimed entity = new EntityCBombPrimed(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), explosion.getExplosivePlacedBy());
            entity.fuse = world.rand.nextInt(entity.fuse / 4) + entity.fuse / 8;
            world.spawnEntityInWorld(entity);
        }
    }
    @Override
    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int side) {
        this.func_150114_a(world, x, y, z, side, (EntityLivingBase)null);
    }

    public void func_150114_a(World world, int x, int y, int z, int side, EntityLivingBase entityLiving) {
        if(!world.isRemote){
            if((side & 1) == 1){
            	EntityCBombPrimed entity = new EntityCBombPrimed(world, (double)((float)x + 0.5F), (double)((float)y + 0.5F), (double)((float)z + 0.5F), entityLiving);
                world.spawnEntityInWorld(entity);
                world.playSoundAtEntity(entity, "game.tnt.primed", 1.0F, 1.0F);
            }
        }
    }
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float f1, float f2, float f3) {
        if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.flint_and_steel){
            this.func_150114_a(world, x, y, z, 1, player);
            world.setBlockToAir(x, y, z);
            player.getCurrentEquippedItem().damageItem(1, player);
            return true;
        }else{
            return super.onBlockActivated(world, x, y, z, player, side, f1, f2, f3);
        }
    }
    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
        if(entity instanceof EntityArrow && !world.isRemote){
            EntityArrow entityarrow = (EntityArrow)entity;

            if(entityarrow.isBurning()){
                this.func_150114_a(world, x, y, z, 1, entityarrow.shootingEntity instanceof EntityLivingBase ? (EntityLivingBase)entityarrow.shootingEntity : null);
                world.setBlockToAir(x, y, z);
            }
        }
    }
    @Override
    public boolean canDropFromExplosion(Explosion explosion) {return false;}
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon(this.getTextureName() + "_side");
        this.field_150116_a = reg.registerIcon(this.getTextureName() + "_top");
        this.field_150115_b = reg.registerIcon(this.getTextureName() + "_bottom");
    }
}