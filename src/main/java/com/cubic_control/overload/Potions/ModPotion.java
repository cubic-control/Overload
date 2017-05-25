package com.cubic_control.overload.Potions;

import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class ModPotion extends Potion{

	protected ModPotion(int id, boolean isBadEffect, int liquidColor, String name) {
		super(id, isBadEffect, liquidColor);
		this.setPotionName(name);
	}
	@Override
	protected Potion setIconIndex(int par1, int par2) {
		super.setIconIndex(par1, par2);
		return this;
	}
	@Override
	public int getStatusIconIndex() {
		ResourceLocation resource = new ResourceLocation(RefStrings.MODID+":textures/gui/container/inventory.png");
		Minecraft.getMinecraft().renderEngine.bindTexture(resource);
		return super.getStatusIconIndex();
	}

}
