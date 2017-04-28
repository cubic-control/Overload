package com.cubic_control.overload.GUI;

import com.cubic_control.overload.TileEntity.TileEntityFurnaceFire;
import com.cubic_control.overload.TileEntity.TileEntityIceFurnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 1){
			return new ContainerWorkbenchIce(player.inventory, world, x, y, z);
		}
		if(ID == 2){
			return new ContainerWorkbenchFire(player.inventory, world, x, y, z);
		}
		if(ID == 3){
			return new ContainerFurnaceFire(player.inventory, new TileEntityFurnaceFire());
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == 1){
			return new GuiCraftingIce(player.inventory, world, x, y, z);
		}
		if(ID == 2){
			return new GuiCraftingFire(player.inventory, world, x, y, z);
		}
		if(ID == 3){
			return new GuiFurnaceFire(player.inventory, new TileEntityFurnaceFire());
		}
		return null;
	}

}
