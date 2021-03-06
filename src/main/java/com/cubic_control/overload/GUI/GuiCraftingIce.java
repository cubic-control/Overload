package com.cubic_control.overload.GUI;

import org.lwjgl.opengl.GL11;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class GuiCraftingIce extends GuiCrafting{
	
	private static final ResourceLocation resource = new ResourceLocation(RefStrings.MODID + ":textures/gui/container/ice_crafting_table.png");

	public GuiCraftingIce(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5) {
		super(par1InventoryPlayer, par2World, par3, par4, par5);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_){
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(resource);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }

}
