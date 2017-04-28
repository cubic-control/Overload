package com.cubic_control.overload.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ModBlockFireFarmland extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon field_149824_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_149823_b;

    protected ModBlockFireFarmland(String name, Block block) {
        super(Material.ground);
        this.setTickRandomly(true);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
        this.setLightOpacity(255);
        this.setCreativeTab(MCreativeTabs.tabBlocks);
        this.setHardness(0.6f);
      	this.setResistance(3f);
        this.setHarvestLevel(block.getHarvestTool(0), block.getHarvestLevel(0));
        this.setBlockName(name);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
    }
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return AxisAlignedBB.getBoundingBox((double)(x + 0), (double)(y + 0), (double)(z + 0), (double)(x + 1), (double)(y + 1), (double)(z + 1));
    }
    @Override
    public boolean isOpaqueCube() {return false;}
    @Override
    public boolean renderAsNormalBlock() {return false;}
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i1, int i2) {
        return i1 == 1 ? (i2 > 0 ? this.field_149824_a : this.field_149823_b) : MBlocks.fire_dirt.getBlockTextureFromSide(i1);
    }
    @Override
    public void updateTick(World world, int x, int y, int z, Random rand) {
        if(!this.func_149821_m(world, x, y, z) && !world.canLightningStrikeAt(x, y + 1, z)){
            int l = world.getBlockMetadata(x, y, z);

            if(l > 0){
                world.setBlockMetadataWithNotify(x, y, z, l - 1, 2);
            }else if(!this.func_149822_e(world, x, y, z)){
                world.setBlock(x, y, z, MBlocks.fire_dirt);
            }
        }else{
            world.setBlockMetadataWithNotify(x, y, z, 7, 2);
        }
    }
    @Override
    public void onFallenUpon(World world, int x, int y, int z, Entity entity, float distance) {
        if(!world.isRemote && world.rand.nextFloat() < distance - 0.5F){
            if(!(entity instanceof EntityPlayer) && !world.getGameRules().getGameRuleBooleanValue("mobGriefing")){
                return;
            }
            world.setBlock(x, y, z, MBlocks.fire_dirt);
        }
    }
    
    private boolean func_149822_e(World world, int x, int y, int z) {
        byte b0 = 0;

        for(int l = x - b0; l <= x + b0; ++l){
            for(int i1 = z - b0; i1 <= z + b0; ++i1){
                Block block = world.getBlock(l, y + 1, i1);

                if(block instanceof IPlantable && canSustainPlant(world, x, y, z, ForgeDirection.UP, (IPlantable)block)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean func_149821_m(World world, int x, int y, int z) {
        for(int l = x - 4; l <= x + 4; ++l){
            for(int i1 = y; i1 <= y + 1; ++i1){
                for(int j1 = z - 4; j1 <= z + 4; ++j1){
                    if(world.getBlock(l, i1, j1).getMaterial() == Material.water){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        super.onNeighborBlockChange(world, x, y, z, block);
        Material material = world.getBlock(x, y + 1, z).getMaterial();

        if(material.isSolid()){
            world.setBlock(x, y, z, MBlocks.fire_dirt);
        }
    }
    @Override
    public Item getItemDropped(int p_149650_1_, Random rand, int p_149650_3_) {
        return MBlocks.fire_dirt.getItemDropped(0, rand, p_149650_3_);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z) {
        return Item.getItemFromBlock(MBlocks.fire_dirt);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.field_149824_a = reg.registerIcon(this.getTextureName() + "_wet");
        this.field_149823_b = reg.registerIcon(this.getTextureName() + "_dry");
    }
    @Override
    public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
    	return false;
    }
}