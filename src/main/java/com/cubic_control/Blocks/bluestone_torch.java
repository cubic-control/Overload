package com.cubic_control.Blocks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.cubic_control.Classes.BlockBluestoneTorch;
import com.cubic_control.CreativeTabs.MCreativeTabs;
import com.cubic_control.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneTorch;
import net.minecraft.block.BlockTorch;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class bluestone_torch extends BlockBluestoneTorch {

	private boolean field_150113_a;
    private static Map field_150112_b = new HashMap();
    private static final String __OBFID = "CL_00000298";
    
    protected bluestone_torch(boolean p_i45394_1_, String name) {
		super(p_i45394_1_);
		this.setBlockTextureName(RefStrings.MODID + ":bluestone_torch_on");
		this.setCreativeTab(MCreativeTabs.tabTech);
		this.setLightLevel(0.5f);
        this.setTickRandomly(true);
        this.setBlockName(name);
        GameRegistry.registerBlock(this, name);
    }
}