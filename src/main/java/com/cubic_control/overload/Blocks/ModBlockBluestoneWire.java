package com.cubic_control.overload.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Render.RenderModBlockIDs;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ModBlockBluestoneWire extends Block {
	private boolean field_150181_a = true;
    private Set field_150179_b = new HashSet();
    @SideOnly(Side.CLIENT)
    private static IIcon field_150182_M;
    @SideOnly(Side.CLIENT)
    private static IIcon field_150183_N;
    @SideOnly(Side.CLIENT)
    private static IIcon field_150184_O;
    @SideOnly(Side.CLIENT)
    private static IIcon field_150180_P;

    public ModBlockBluestoneWire(String string) {
        super(Material.circuits);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
        this.setBlockName(string);
		this.setCreativeTab(null);
		this.setBlockTextureName(RefStrings.MODID + ":bluestone_dust");
		GameRegistry.registerBlock(this, string);
    }
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
        return null;
    }
    @Override
    public boolean isOpaqueCube() {
        return false;
    }
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
    @Override
    public int getRenderType() {
        return RenderModBlockIDs.BLUESTONE_WIRE;
    }
	@Override
	@SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_) {
        return 0;
    }
    @Override
    public boolean canPlaceBlockAt(World world, int x, int y, int z) {
        return world.doesBlockHaveSolidTopSurface(world, x, y - 1, z) || world.getBlock(x, y - 1, z) == Blocks.glowstone;
    }
    
    private void func_150177_e(World world, int x, int y, int z) {
        this.func_150175_a(world, x, y, z, x, y, z);
        ArrayList arraylist = new ArrayList(this.field_150179_b);
        this.field_150179_b.clear();

        for(int l = 0; l < arraylist.size(); ++l){
            ChunkPosition chunkposition = (ChunkPosition)arraylist.get(l);
            world.notifyBlocksOfNeighborChange(chunkposition.chunkPosX, chunkposition.chunkPosY, chunkposition.chunkPosZ, this);
        }
    }

    private void func_150175_a(World world, int x, int y, int z, int p_150175_5_, int p_150175_6_, int p_150175_7_) {
        int k1 = world.getBlockMetadata(x, y, z);
        byte b0 = 0;
        int i3 = this.func_150178_a(world, p_150175_5_, p_150175_6_, p_150175_7_, b0);
        this.field_150181_a = false;
        int l1 = world.getStrongestIndirectPower(x, y, z);
        this.field_150181_a = true;

        if(l1 > 0 && l1 > i3 - 1){
            i3 = l1;
        }
        int i2 = 0;
        
        for(int j2 = 0; j2 < 4; ++j2){
            int k2 = x;
            int l2 = z;

            if(j2 == 0){
                k2 = x - 1;
            }
            if(j2 == 1){
                ++k2;
            }
            if(j2 == 2){
                l2 = z - 1;
            }
            if(j2 == 3){
                ++l2;
            }
            if(k2 != p_150175_5_ || l2 != p_150175_7_){
                i2 = this.func_150178_a(world, k2, y, l2, i2);
            }
            if(world.getBlock(k2, y, l2).isNormalCube() && !world.getBlock(x, y + 1, z).isNormalCube()){
                if((k2 != p_150175_5_ || l2 != p_150175_7_) && y >= p_150175_6_){
                    i2 = this.func_150178_a(world, k2, y + 1, l2, i2);
                }
            }else if(!world.getBlock(k2, y, l2).isNormalCube() && (k2 != p_150175_5_ || l2 != p_150175_7_) && y <= p_150175_6_){
                i2 = this.func_150178_a(world, k2, y - 1, l2, i2);
            }
        }
        
        if(i2 > i3){
            i3 = i2 - 1;
        }else if(i3 > 0){
            --i3;
        }else{
            i3 = 0;
        }
        if(l1 > i3 - 1){
            i3 = l1;
        }
        if(k1 != i3){
            world.setBlockMetadataWithNotify(x, y, z, i3, 2);
            this.field_150179_b.add(new ChunkPosition(x, y, z));
            this.field_150179_b.add(new ChunkPosition(x - 1, y, z));
            this.field_150179_b.add(new ChunkPosition(x + 1, y, z));
            this.field_150179_b.add(new ChunkPosition(x, y - 1, z));
            this.field_150179_b.add(new ChunkPosition(x, y + 1, z));
            this.field_150179_b.add(new ChunkPosition(x, y, z - 1));
            this.field_150179_b.add(new ChunkPosition(x, y, z + 1));
        }
    }

    private void func_150172_m(World world, int x, int y, int z) {
        if(world.getBlock(x, y, z) == this){
            world.notifyBlocksOfNeighborChange(x, y, z, this);
            world.notifyBlocksOfNeighborChange(x - 1, y, z, this);
            world.notifyBlocksOfNeighborChange(x + 1, y, z, this);
            world.notifyBlocksOfNeighborChange(x, y, z - 1, this);
            world.notifyBlocksOfNeighborChange(x, y, z + 1, this);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
            world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
        }
    }
    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        super.onBlockAdded(world, x, y, z);
        
        if(!world.isRemote){
            this.func_150177_e(world, x, y, z);
            world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
            this.func_150172_m(world, x - 1, y, z);
            this.func_150172_m(world, x + 1, y, z);
            this.func_150172_m(world, x, y, z - 1);
            this.func_150172_m(world, x, y, z + 1);
            
            if(world.getBlock(x - 1, y, z).isNormalCube()){
                this.func_150172_m(world, x - 1, y + 1, z);
            }else{
                this.func_150172_m(world, x - 1, y - 1, z);
            }
            if(world.getBlock(x + 1, y, z).isNormalCube()){
                this.func_150172_m(world, x + 1, y + 1, z);
            }else{
                this.func_150172_m(world, x + 1, y - 1, z);
            }
            if(world.getBlock(x, y, z - 1).isNormalCube()){
                this.func_150172_m(world, x, y + 1, z - 1);
            }else{
                this.func_150172_m(world, x, y - 1, z - 1);
            }if (world.getBlock(x, y, z + 1).isNormalCube()){
                this.func_150172_m(world, x, y + 1, z + 1);
            }else{
                this.func_150172_m(world, x, y - 1, z + 1);
            }
        }
    }
    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int p_149749_6_) {
        super.breakBlock(world, x, y, z, block, p_149749_6_);

        if(!world.isRemote){
        	world.notifyBlocksOfNeighborChange(x, y + 1, z, this);
        	world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
        	world.notifyBlocksOfNeighborChange(x + 1, y, z, this);
        	world.notifyBlocksOfNeighborChange(x - 1, y, z, this);
        	world.notifyBlocksOfNeighborChange(x, y, z + 1, this);
        	world.notifyBlocksOfNeighborChange(x, y, z - 1, this);
            this.func_150177_e(world, x, y, z);
            this.func_150172_m(world, x - 1, y, z);
            this.func_150172_m(world, x + 1, y, z);
            this.func_150172_m(world, x, y, z - 1);
            this.func_150172_m(world, x, y, z + 1);

            if(world.getBlock(x - 1, y, z).isNormalCube()){
                this.func_150172_m(world, x - 1, y + 1, z);
            }else{
                this.func_150172_m(world, x - 1, y - 1, z);
            }
            if(world.getBlock(x + 1, y, z).isNormalCube()){
                this.func_150172_m(world, x + 1, y + 1, z);
            }else{
                this.func_150172_m(world, x + 1, y - 1, z);
            }
            if(world.getBlock(x, y, z - 1).isNormalCube()){
                this.func_150172_m(world, x, y + 1, z - 1);
            }else{
                this.func_150172_m(world, x, y - 1, z - 1);
            }
            if(world.getBlock(x, y, z + 1).isNormalCube()){
                this.func_150172_m(world, x, y + 1, z + 1);
            }else{
                this.func_150172_m(world, x, y - 1, z + 1);
            }
        }
    }
    
    private int func_150178_a(World world, int x, int y, int z, int p_150178_5_) {
        if(world.getBlock(x, y, z) != this){
            return p_150178_5_;
        }else{
            int i1 = world.getBlockMetadata(x, y, z);
            return i1 > p_150178_5_ ? i1 : p_150178_5_;
        }
    }
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        if(!world.isRemote){
            boolean flag = this.canPlaceBlockAt(world, x, y, z);

            if(flag){
                this.func_150177_e(world, x, y, z);
            }else{
                this.dropBlockAsItem(world, x, y, z, 0, 0);
                world.setBlockToAir(x, y, z);
            }
            
            super.onNeighborBlockChange(world, x, y, z, block);
        }
    }
    @Override
    public Item getItemDropped(int i1, Random rand, int i2) {
        return MItems.bluestone;
    }
    @Override
    public int isProvidingStrongPower(IBlockAccess access, int x, int y, int z, int side) {
        return !this.field_150181_a ? 0 : this.isProvidingWeakPower(access, x, y, z, side);
    }
    @Override
    public int isProvidingWeakPower(IBlockAccess access, int x, int y, int z, int p_149709_5_) {
        if(!this.field_150181_a){
            return 0;
        }else{
            int i1 = access.getBlockMetadata(x, y, z);

            if(i1 == 0){
                return 0;
            }else if(p_149709_5_ == 1){
                return i1;
            }else{
                boolean flag = func_150176_g(access, x - 1, y, z, 1) || !access.getBlock(x - 1, y, z).isNormalCube() && func_150176_g(access, x - 1, y - 1, z, -1);
                boolean flag1 = func_150176_g(access, x + 1, y, z, 3) || !access.getBlock(x + 1, y, z).isNormalCube() && func_150176_g(access, x + 1, y - 1, z, -1);
                boolean flag2 = func_150176_g(access, x, y, z - 1, 2) || !access.getBlock(x, y, z - 1).isNormalCube() && func_150176_g(access, x, y - 1, z - 1, -1);
                boolean flag3 = func_150176_g(access, x, y, z + 1, 0) || !access.getBlock(x, y, z + 1).isNormalCube() && func_150176_g(access, x, y - 1, z + 1, -1);

                if(!access.getBlock(x, y + 1, z).isNormalCube()){
                    if(access.getBlock(x - 1, y, z).isNormalCube() && func_150176_g(access, x - 1, y + 1, z, -1)){
                        flag = true;
                    }
                    if(access.getBlock(x + 1, y, z).isNormalCube() && func_150176_g(access, x + 1, y + 1, z, -1)){
                        flag1 = true;
                    }
                    if(access.getBlock(x, y, z - 1).isNormalCube() && func_150176_g(access, x, y + 1, z - 1, -1)){
                        flag2 = true;
                    }
                    if(access.getBlock(x, y, z + 1).isNormalCube() && func_150176_g(access, x, y + 1, z + 1, -1)){
                        flag3 = true;
                    }
                }

                return !flag2 && !flag1 && !flag && !flag3 && p_149709_5_ >= 2 && p_149709_5_ <= 5 ? i1 : (p_149709_5_ == 2 && flag2 && !flag && !flag1 ? i1 : (p_149709_5_ == 3 && flag3 && !flag && !flag1 ? i1 : (p_149709_5_ == 4 && flag && !flag2 && !flag3 ? i1 : (p_149709_5_ == 5 && flag1 && !flag2 && !flag3 ? i1 : 0))));
            }
        }
    }
    @Override
    public boolean canProvidePower() {
        return this.field_150181_a;
    }
    
    public static boolean isPowerProviderOrWire(IBlockAccess access, int x, int y, int z, int side) {
        Block block = access.getBlock(x, y, z);

        if(block == MBlocks.bluestone_wire){
            return true;
        }else if(!Blocks.unpowered_repeater.func_149907_e(block)){
            return block.canConnectRedstone(access, x, y, z, side);
        }else{
            int i1 = access.getBlockMetadata(x, y, z);
            return side == (i1 & 3) || side == Direction.rotateOpposite[i1 & 3];
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        int l = world.getBlockMetadata(x, y, z);

        if(l > 0){
            double d0 = (double)x + 0.5D + ((double)rand.nextFloat() - 0.5D) * 0.2D;
            double d1 = (double)((float)y + 0.0625F);
            double d2 = (double)z + 0.5D + ((double)rand.nextFloat() - 0.5D) * 0.2D;
            float f = (float)l / 15.0F;
            float f1 = f * 0.6F + 0.4F;

            if(l == 0){
                f1 = 0.0F;
            }
            float f2 = f * f * 0.7F - 0.5F;
            float f3 = f * f * 0.6F - 0.7F;

            if(f2 < 0.0F){
                f2 = 0.0F;
            }
            if(f3 < 0.0F){
                f3 = 0.0F;
            }
            world.spawnParticle("reddust", d0, d1, d2, (double)f1, (double)f2, (double)f3);
        }
    }
    
    public static boolean func_150176_g(IBlockAccess access, int x, int y, int z, int side) {
        if(isPowerProviderOrWire(access, x, y, z, side)){
            return true;
        }else if(access.getBlock(x, y, z) == Blocks.powered_repeater){
            int i1 = access.getBlockMetadata(x, y, z);
            return side == (i1 & 3);
        }else{
            return false;
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z) {
        return MItems.bluestone;
    }
    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side) {
        return false;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.field_150182_M = reg.registerIcon(this.getTextureName() + "_" + "cross");
        this.field_150183_N = reg.registerIcon(this.getTextureName() + "_" + "line");
        this.field_150184_O = reg.registerIcon(this.getTextureName() + "_" + "cross_overlay");
        this.field_150180_P = reg.registerIcon(this.getTextureName() + "_" + "line_overlay");
        this.blockIcon = this.field_150182_M;
    }
    @SideOnly(Side.CLIENT)
    public static IIcon getWireIcon(String p_150173_0_) {
        return p_150173_0_.equals("cross") ? ModBlockBluestoneWire.field_150182_M : (p_150173_0_.equals("line") ? ModBlockBluestoneWire.field_150183_N : (p_150173_0_.equals("cross_overlay") ? ModBlockBluestoneWire.field_150184_O : (p_150173_0_.equals("line_overlay") ? ModBlockBluestoneWire.field_150180_P : null)));
    }
}