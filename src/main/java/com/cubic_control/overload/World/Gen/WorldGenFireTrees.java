package com.cubic_control.overload.World.Gen;

import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Blocks.ModBlockSaplingFire;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenFireTrees extends WorldGenFireAbstractTree{
    /** The minimum height of a generated tree. */
    private final int minTreeHeight;
    /** True if this tree should grow Vines. */
    private final boolean vinesGrow;
    /** The wood to use in tree generation. */
    private static Block wood;
    /** The leaves to use in tree generation. */
    private static Block leaves;
    
	private static final String __OBFID = "CL_00000438";

    public WorldGenFireTrees(boolean p_i2027_1_) {
        this(p_i2027_1_, 6, leaves, wood, false);
    }

    public WorldGenFireTrees(boolean p_i2028_1_, int minTreeHeight, Block metaWood, Block metaLeaves, boolean growVines) {
        super(p_i2028_1_);
        this.minTreeHeight = minTreeHeight;
        WorldGenFireTrees.wood = metaWood;
        WorldGenFireTrees.leaves = metaLeaves;
        this.vinesGrow = growVines;
    }

	public boolean generate(World world, Random p_76484_2_, int x, int y, int z) {
        int l = p_76484_2_.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if(y >= 1 && y + l + 1 <= 256){
            byte b0;
            int k1;
            Block block;

            for(int i1 = y; i1 <= y + 1 + l; ++i1){
                b0 = 1;

                if(i1 == y){
                    b0 = 0;
                }
                if(i1 >= y + 1 + l - 2){
                    b0 = 2;
                }
                for(int j1 = x - b0; j1 <= x + b0 && flag; ++j1){
                    for(k1 = z - b0; k1 <= z + b0 && flag; ++k1){
                        if(i1 >= 0 && i1 < 256){
                            block = world.getBlock(j1, i1, k1);

                            if(!this.isReplaceable(world, j1, i1, k1)){
                                flag = false;
                            }
                        }else{
                            flag = false;
                        }
                    }
                }
            }
            if(!flag){
                return false;
            }else{
                Block block2 = world.getBlock(x, y - 1, z);
                boolean isSoil = block2.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, (ModBlockSaplingFire)MBlocks.fire_sapling);
                
                if(isSoil && y < 256 - l - 1){
                    block2.onPlantGrow(world, x, y - 1, z, x, y, z);
                    b0 = 3;
                    byte b1 = 0;
                    int l1;
                    int i2;
                    int j2;
                    int i3;

                    for(k1 = y - b0 + l; k1 <= y + l; ++k1){
                        i3 = k1 - (y + l);
                        l1 = b1 + 1 - i3 / 2;

                        for(i2 = x - l1; i2 <= x + l1; ++i2){
                            j2 = i2 - x;

                            for(int k2 = z - l1; k2 <= z + l1; ++k2){
                                int l2 = k2 - z;

                                if(Math.abs(j2) != l1 || Math.abs(l2) != l1 || p_76484_2_.nextInt(2) != 0 && i3 != 0){
                                    Block block1 = world.getBlock(i2, k1, k2);

                                    if(block1.isAir(world, i2, k1, k2) || block1.isLeaves(world, i2, k1, k2)){
                                        this.setBlockAndNotifyAdequately(world, i2, k1, k2, MBlocks.fire_leaves, 0);
                                    }
                                }
                            }
                        }
                    }
                    for(k1 = 0; k1 < l; ++k1){
                        block = world.getBlock(x, y + k1, z);

                        if(block.isAir(world, x, y + k1, z) || block.isLeaves(world, x, y + k1, z)){
                            this.setBlockAndNotifyAdequately(world, x, y + k1, z, MBlocks.fire_log, 0);

//                            if (this.vinesGrow && k1 > 0)
//                            {
//                                if (p_76484_2_.nextInt(3) > 0 && p_76484_1_.isAirBlock(p_76484_3_ - 1, p_76484_4_ + k1, p_76484_5_))
//                                {
//                                    this.setBlockAndNotifyAdequately(p_76484_1_, p_76484_3_ - 1, p_76484_4_ + k1, p_76484_5_, Blocks.vine, 8);
//                                }
//
//                                if (p_76484_2_.nextInt(3) > 0 && p_76484_1_.isAirBlock(p_76484_3_ + 1, p_76484_4_ + k1, p_76484_5_))
//                                {
//                                    this.setBlockAndNotifyAdequately(p_76484_1_, p_76484_3_ + 1, p_76484_4_ + k1, p_76484_5_, Blocks.vine, 2);
//                                }
//
//                                if (p_76484_2_.nextInt(3) > 0 && p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_ + k1, p_76484_5_ - 1))
//                                {
//                                    this.setBlockAndNotifyAdequately(p_76484_1_, p_76484_3_, p_76484_4_ + k1, p_76484_5_ - 1, Blocks.vine, 1);
//                                }
//
//                                if (p_76484_2_.nextInt(3) > 0 && p_76484_1_.isAirBlock(p_76484_3_, p_76484_4_ + k1, p_76484_5_ + 1))
//                                {
//                                    this.setBlockAndNotifyAdequately(p_76484_1_, p_76484_3_, p_76484_4_ + k1, p_76484_5_ + 1, Blocks.vine, 4);
//                                }
//                            }
                        }
                    }
                    if(this.vinesGrow){
                        for(k1 = y - 3 + l; k1 <= y + l; ++k1){
                            i3 = k1 - (y + l);
                            l1 = 2 - i3 / 2;

                            for(i2 = x - l1; i2 <= x + l1; ++i2){
                                for(j2 = z - l1; j2 <= z + l1; ++j2){
//                                    if (p_76484_1_.getBlock(i2, k1, j2).isLeaves(p_76484_1_, i2, k1, j2))
//                                    {
//                                        if (p_76484_2_.nextInt(4) == 0 && p_76484_1_.getBlock(i2 - 1, k1, j2).isAir(p_76484_1_, i2 - 1, k1, j2))
//                                        {
//                                            this.growVines(p_76484_1_, i2 - 1, k1, j2, 8);
//                                        }
//
//                                        if (p_76484_2_.nextInt(4) == 0 && p_76484_1_.getBlock(i2 + 1, k1, j2).isAir(p_76484_1_, i2 + 1, k1, j2))
//                                        {
//                                            this.growVines(p_76484_1_, i2 + 1, k1, j2, 2);
//                                        }
//
//                                        if (p_76484_2_.nextInt(4) == 0 && p_76484_1_.getBlock(i2, k1, j2 - 1).isAir(p_76484_1_, i2, k1, j2 - 1))
//                                        {
//                                            this.growVines(p_76484_1_, i2, k1, j2 - 1, 1);
//                                        }
//
//                                        if (p_76484_2_.nextInt(4) == 0 && p_76484_1_.getBlock(i2, k1, j2 + 1).isAir(p_76484_1_, i2, k1, j2 + 1))
//                                        {
//                                            this.growVines(p_76484_1_, i2, k1, j2 + 1, 4);
//                                        }
//                                    }
                                }
                            }
                        }
                        if(p_76484_2_.nextInt(5) == 0 && l > 5){
                            for(k1 = 0; k1 < 2; ++k1){
                                for(i3 = 0; i3 < 4; ++i3){
                                    if(p_76484_2_.nextInt(4 - k1) == 0){
                                        l1 = p_76484_2_.nextInt(3);
                                        this.setBlockAndNotifyAdequately(world, x + Direction.offsetX[Direction.rotateOpposite[i3]], y + l - 5 + k1, z + Direction.offsetZ[Direction.rotateOpposite[i3]], Blocks.cocoa, l1 << 2 | i3);
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
    }
}