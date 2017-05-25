package com.cubic_control.overload.Blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class ModBlockStaticLiquid extends BlockStaticLiquid{

	protected ModBlockStaticLiquid(Material material, String name) {
		super(material);
		this.setCreativeTab(null);
		this.setHardness(100.0F);
		this.setBlockName(name);
		this.disableStats();
		this.setBlockTextureName(name);
		GameRegistry.registerBlock(this, name);
	}
	public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
        super.onNeighborBlockChange(world, x, y, z, block);

        if(world.getBlock(x, y, z) == MBlocks.lava_cold){
            this.setNotStationary(world, x, y, z, MBlocks.lava_cold_flowing);
        }
    }
	
	private void setNotStationary(World world, int x, int y, int z, Block block) {
        int l = world.getBlockMetadata(x, y, z);
        world.setBlock(x, y, z, block, l, 2);
        world.scheduleBlockUpdate(x, y, z, block, this.tickRate(world));
    }
	@Override
	public void updateTick(World world, int x, int y, int z, Random rand) {
        if(this == MBlocks.lava_cold){
            int l = rand.nextInt(3);
            int i1;

            for(i1 = 0; i1 < l; ++i1){
                x += rand.nextInt(3) - 1;
                ++y;
                z += rand.nextInt(3) - 1;
                Block block = world.getBlock(x, y, z);

                if(block.getMaterial() == Material.air){
                    if(this.isFlammable(world, x - 1, y, z) || this.isFlammable(world, x + 1, y, z) || this.isFlammable(world, x, y, z - 1) || this.isFlammable(world, x, y, z + 1) || this.isFlammable(world, x, y - 1, z) || this.isFlammable(world, x, y + 1, z)){
                    	world.setBlock(x, y, z, MBlocks.ice_fire);
                        return;
                    }
                }else if(block.getMaterial().blocksMovement()){
                    return;
                }
            }
            if(l == 0){
                i1 = x;
                int k1 = z;

                for(int j1 = 0; j1 < 3; ++j1){
                    x = i1 + rand.nextInt(3) - 1;
                    z = k1 + rand.nextInt(3) - 1;

                    if(world.isAirBlock(x, y + 1, z) && this.isFlammable(world, x, y, z)){
                    	world.setBlock(x, y + 1, z, MBlocks.ice_fire);
                    }
                }
            }
        }
    }
	//TODO: Put something like this in CubicCore
	private boolean isFlammable(World world, int x, int y, int z) {
        return world.getBlock(x, y, z).getMaterial().getCanBurn();
    }

}
