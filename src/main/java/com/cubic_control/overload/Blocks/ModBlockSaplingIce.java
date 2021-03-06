package com.cubic_control.overload.Blocks;

import java.util.List;
import java.util.Random;

import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.World.Gen.WorldGenIceBigTree;
import com.cubic_control.overload.World.Gen.WorldGenIceTrees;
import com.cubic_control.overload.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class ModBlockSaplingIce extends BlockSapling implements IGrowable{
	
	private static String[] saplings;
	private IIcon[] textures;
	private static final int TYPES = 1;
	
	private static WorldGenerator tree;
	private static WorldGenerator treeBig;
	
	protected ModBlockSaplingIce(String name, Material material) {
		super();
		treeBig = new WorldGenIceBigTree(true, 10, 1, 5);
		tree = new WorldGenIceTrees(true);
		this.setCreativeTab(MCreativeTabs.tabBlocks);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setHardness(0);
		this.setResistance(0);
		this.setStepSound(soundTypeGrass);
		this.setBlockName(name);
		GameRegistry.registerBlock(this, name);
		saplings = new String[] { name };
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		textures = new IIcon[saplings.length];
		for (int i = 0; i < saplings.length; ++i)
		{
			textures[i] = iconRegister.registerIcon(RefStrings.MODID + ":" + saplings[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if (meta < 0 || meta >= saplings.length)
		{
			meta = 0;
		}
		return textures[meta];
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list)
	{
		for (int i = 0; i < saplings.length; ++i)
		{
			list.add(new ItemStack(block, 1, i));
		}
	}

	public boolean isValidPosition(World world, int x, int y, int z, int metadata)
	{
		Block block = world.getBlock(x, y - 1, z);
		switch (metadata)
		{
		default:
			return block == MBlocks.ice_grass || block == MBlocks.ice_dirt || block.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this);
		}
	}

	@Override
	public boolean canPlaceBlockOnSide(World world, int x, int y, int z, int side)
	{
		return isValidPosition(world, x, y, z, -1);
	}

	@Override
	public boolean canBlockStay(World world, int x, int y, int z)
	{
		Block soil = world.getBlock(x, y - 1, z);

		if (world.getBlockMetadata(x, y, z) != 7)
			return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) &&
					(soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
		else
			return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) &&
					(soil != null && soil.canSustainPlant(world, x, y - 1, z, ForgeDirection.UP, this));
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random)
	{
		if (world.isRemote)
			return;

		if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(7) == 0)
		{
			this.func_149878_d(world, x, y, z, random);
		}
	}

	@Override
	public void func_149878_d(World world, int x, int y, int z, Random random)
	{
		int meta = world.getBlockMetadata(x, y, z) & TYPES;
		Object obj = null;
		int rnd = random.nextInt(10);

		if (obj == null) {
			if (rnd < 5) {
				obj = tree;
			}
			if (rnd >= 5) {
				obj = treeBig;
			}
		}
		if (obj != null)
		{
			world.setBlockToAir(x, y, z);

			if (!((WorldGenerator) obj).generate(world, random, x, y, z))
			{
				world.setBlock(x, y, z, this, meta, 2);
			}
		}
	}

	@Override
	public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable) {
		if (world.getBlock(x, y, z) == MBlocks.ice_dirt) {
			return true;
		}
		if (world.getBlock(x, y, z) == MBlocks.ice_grass) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void onPlantGrow(World world, int x, int y, int z, int sourceX, int sourceY, int sourceZ) {
		if (this == MBlocks.ice_dirt || this == MBlocks.ice_grass)
		{
			world.setBlock(x, y, z, MBlocks.ice_dirt, 0, 2);
		}
	}
}
