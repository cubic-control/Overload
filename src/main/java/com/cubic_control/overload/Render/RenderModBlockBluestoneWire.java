package com.cubic_control.overload.Render;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Blocks.ModBlockBluestoneWire;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderModBlockBluestoneWire implements ISimpleBlockRenderingHandler{

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
		//Taken from RenderBlocks.class method 'renderBlockRedstoneWire'. Changed slightly to work with bluestone.
		Tessellator tessellator = Tessellator.instance;
        int l = world.getBlockMetadata(x, y, z);
        IIcon iicon = ModBlockBluestoneWire.getWireIcon("cross");
        IIcon iicon1 = ModBlockBluestoneWire.getWireIcon("line");
        IIcon iicon2 = ModBlockBluestoneWire.getWireIcon("cross_overlay");
        IIcon iicon3 = ModBlockBluestoneWire.getWireIcon("line_overlay");
        //TODO: Deleting/Changing this does nothing.
        tessellator.setBrightness(block.getMixedBrightnessForBlock(world, x, y, z));
        float f = (float)l / 15.0F;
        float f1 = f * 0.6F + 0.4F;
        
        if(l == 0){
            f1 = 0.3F;
        }
        float f2 = f * f * 0.7F - 0.5F;
        float f3 = f * f * 0.6F - 0.7F;

        if(f2 < 0.0F){
            f2 = 0.0F;
        }
        if(f3 < 0.0F){
            f3 = 0.0F;
        }
        //TODO: Deleting this makes it blue, but causes end piece to change to green or dark blue.
        //tessellator.setColorOpaque_F(f1, f2, f3);
        tessellator.setColorOpaque_F(f2, f1, f1);
        double d0 = 0.015625D;
        double d1 = 0.015625D;
        boolean flag = ModBlockBluestoneWire.isPowerProviderOrWire(world, x - 1, y, z, 1) || !world.getBlock(x - 1, y, z).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x - 1, y - 1, z, -1);
        boolean flag1 = ModBlockBluestoneWire.isPowerProviderOrWire(world, x + 1, y, z, 3) || !world.getBlock(x + 1, y, z).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x + 1, y - 1, z, -1);
        boolean flag2 = ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y, z - 1, 2) || !world.getBlock(x, y, z - 1).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y - 1, z - 1, -1);
        boolean flag3 = ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y, z + 1, 0) || !world.getBlock(x, y, z + 1).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y - 1, z + 1, -1);
        
        if(!world.getBlock(x, y + 1, z).isBlockNormalCube()){
            if(world.getBlock(x - 1, y, z).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x - 1, y + 1, z, -1)){
                flag = true;
            }
            if(world.getBlock(x + 1, y, z).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x + 1, y + 1, z, -1)){
                flag1 = true;
            }
            if(world.getBlock(x, y, z - 1).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y + 1, z - 1, -1)){
                flag2 = true;
            }
            if(world.getBlock(x, y, z + 1).isBlockNormalCube() && ModBlockBluestoneWire.isPowerProviderOrWire(world, x, y + 1, z + 1, -1)){
                flag3 = true;
            }
        }
        float f4 = (float)(x + 0);
        float f5 = (float)(x + 1);
        float f6 = (float)(z + 0);
        float f7 = (float)(z + 1);
        int i1 = 0;

        if((flag || flag1) && !flag2 && !flag3){
            i1 = 1;
        }
        if((flag2 || flag3) && !flag1 && !flag){
            i1 = 2;
        }
        if(i1 == 0){
            int j1 = 0;
            int k1 = 0;
            int l1 = 16;
            int i2 = 16;
            boolean flag4 = true;
            
            if(!flag){
                f4 += 0.3125F;
            }
            if(!flag){
                j1 += 5;
            }
            if(!flag1){
                f5 -= 0.3125F;
            }
            if(!flag1){
                l1 -= 5;
            }
            if(!flag2){
                f6 += 0.3125F;
            }
            if(!flag2){
                k1 += 5;
            }
            if(!flag3){
                f7 -= 0.3125F;
            }
            if(!flag3){
                i2 -= 5;
            }
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon.getInterpolatedU((double)l1), (double)iicon.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon.getInterpolatedU((double)l1), (double)iicon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon.getInterpolatedU((double)j1), (double)iicon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon.getInterpolatedU((double)j1), (double)iicon.getInterpolatedV((double)i2));
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon2.getInterpolatedU((double)l1), (double)iicon2.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon2.getInterpolatedU((double)l1), (double)iicon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon2.getInterpolatedU((double)j1), (double)iicon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon2.getInterpolatedU((double)j1), (double)iicon2.getInterpolatedV((double)i2));
        }else if (i1 == 1){
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
        }else{
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)y + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)y + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
        }
        if(!world.getBlock(x, y + 1, z).isBlockNormalCube()){
            float f8 = 0.021875F;
            
            if(world.getBlock(x - 1, y, z).isBlockNormalCube() && world.getBlock(x - 1, y + 1, z) == MBlocks.bluestone_wire){
                //tessellator.setColorOpaque_F(f1, f2, f3);
            	tessellator.setColorOpaque_F(f2, f1, f1);
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 1), (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 0), (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 1), (double)iicon3.getMinU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)(y + 0), (double)(z + 0), (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)x + 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            }
            if(world.getBlock(x + 1, y, z).isBlockNormalCube() && world.getBlock(x + 1, y + 1, z) == MBlocks.bluestone_wire){
                //tessellator.setColorOpaque_F(f1, f2, f3);
            	tessellator.setColorOpaque_F(f2, f1, f1);
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 1), (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 0), (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 1), (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 1), (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)((float)(y + 1) + 0.021875F), (double)(z + 0), (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 1) - 0.015625D, (double)(y + 0), (double)(z + 0), (double)iicon3.getMinU(), (double)iicon3.getMinV());
            }
            if(world.getBlock(x, y, z - 1).isBlockNormalCube() && world.getBlock(x, y + 1, z - 1) == MBlocks.bluestone_wire){
                //tessellator.setColorOpaque_F(f1, f2, f3);
            	tessellator.setColorOpaque_F(f2, f1, f1);
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)z + 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)z + 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)z + 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)z + 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)z + 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            }
            if(world.getBlock(x, y, z + 1).isBlockNormalCube() && world.getBlock(x, y + 1, z + 1) == MBlocks.bluestone_wire){
                //tessellator.setColorOpaque_F(f1, f2, f3);
            	tessellator.setColorOpaque_F(f2, f1, f1);
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(x + 1), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 1), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(x + 0), (double)(y + 0), (double)(z + 1) - 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(x + 0), (double)((float)(y + 1) + 0.021875F), (double)(z + 1) - 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            }
        }
        return true;
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return false;
	}

	@Override
	public int getRenderId() {
		return RenderModBlockIDs.BLUESTONE_WIRE;
	}

}
