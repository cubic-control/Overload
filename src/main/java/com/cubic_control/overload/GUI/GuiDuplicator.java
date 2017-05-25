package com.cubic_control.overload.GUI;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.TileEntity.TileEntityDuplicator;
import com.cubic_control.overload.lib.RefStrings;

@SideOnly(Side.CLIENT)
public class GuiDuplicator extends GuiContainer{
    private static final ResourceLocation textures = new ResourceLocation(RefStrings.MODID+":textures/gui/container/duplicator.png");
    private TileEntityDuplicator tile;

    public GuiDuplicator(InventoryPlayer par1InventoryPlayer, World world, int x, int y, int z) {
        super(new ContainerDuplicator(par1InventoryPlayer, world, x, y, z));
        this.tile = (TileEntityDuplicator)world.getTileEntity(x, y, z);
    }
    
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_) {
        String s = this.tile.hasCustomInventoryName() ? this.tile.getInventoryName() : I18n.format(this.tile.getInventoryName(), new Object[0]);
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(textures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if(this.tile.isUsing()){
            i1 = this.tile.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 2);
        }
        i1 = this.tile.getCookProgressScaled(24);
        this.drawTexturedModalRect(k + 79, l + 34, 176, 14, i1 + 1, 16);
    }
}