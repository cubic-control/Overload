package com.cubic_control.overload.Tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemTimeAxe extends ModItemSword{
	private long time;

	public ModItemTimeAxe(ToolMaterial p_i45356_1_, String string, long l) {
		super(p_i45356_1_, string);
		this.time = l;
	}
	//@Override
	//public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		//if(!world.isRemote){
			//if(world.getWorldTime() != time){
				//world.setWorldTime(time);
				//return stack;
			//}else{
				//return super.onItemRightClick(stack, world, player);
			//}
	    //}else{
	    	//return super.onItemRightClick(stack, world, player);
	    //}
	//}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float par8, float par9, float par10) {
		if(!world.isRemote){
			if(world.getWorldTime() != time){
				world.setWorldTime(time);
				return true;
			}else{
				return false;
			}
	    }else{
	    	return false;
	    }
	}

}