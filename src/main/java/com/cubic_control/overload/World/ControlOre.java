package com.cubic_control.overload.World;

import java.util.Random;

import com.cubic_control.overload.Blocks.MBlocks;
import com.cubic_control.overload.Configuration.MConfiguration;
import com.cubic_control.overload.Dimensions.DimensionIDs;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ControlOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 0:
			generateOverworld(random, chunkX * 16, chunkZ * 16, world);
			break;
		case 1:
			generateEnd(random, chunkX * 16, chunkZ * 16, world);
			break;
		}
	}
	private void addOre(Block block, Block blockspawn, Random random, World world, int posX, int posZ, int minY, int maxY, int minVien, int maxVien, int spawnChance){
		for(int i = 0; i < spawnChance; i++){
			int defaultChunkSize = 16;
			
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);
			
			new WorldGenMinable(block, (minVien + random.nextInt(maxVien - minVien)), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
		}
	//addOre(MinHeight,MaxHeight,MinVien,MaxVien,SpawnChance)
	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
	}
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world) {
		addOre(MBlocks.ender_rite_ore, Blocks.stone, random, world, chunkX, chunkZ, 5, 45, 1, 5, 15);
		addOre(MBlocks.nightmare_ore, Blocks.stone, random, world, chunkX, chunkZ, 0, 25, 1, 3, 20);
		addOre(MBlocks.bubblegum_ore, Blocks.stone, random, world, chunkX, chunkZ, 25, 45, 1, 5, 35);
		addOre(MBlocks.clay_dark, Blocks.clay, random, world, chunkX, chunkZ, 0, 256, 1, 5, 50);
		addOre(MBlocks.clay_light, Blocks.clay, random, world, chunkX, chunkZ, 0, 256, 1, 5, 50);
		addOre(MBlocks.ruby_ore, Blocks.stone, random, world, chunkX, chunkZ, 0, 35, 1, 8, 22);
		//Stones
		addOre(MBlocks.andesite, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.diorite, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.granite, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.marble, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.slate, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.basalt, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.rhyolite, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.dacite, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		addOre(MBlocks.trachyte, Blocks.stone, random, world, chunkX, chunkZ, 0, 256, 5, 15, 30);
		//Gem Ores
		addOre(MBlocks.Amethyst_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Carnelian_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Jade_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Jasper_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Malachite_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Moonstone_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Onyx_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Peridot_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Sapphire_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Tanzanite_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Tiger_eye_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		addOre(MBlocks.Topaz_Ore, Blocks.stone, random, world, chunkX, chunkZ, 3, 40, 1, 2, 27);
		//Color ores
			//Non-Colors
		addOre(MBlocks.white_ore, Blocks.stone, random, world, chunkX, chunkZ, 1, 63, 1, 5, 20);
		addOre(MBlocks.black_ore, Blocks.stone, random, world, chunkX, chunkZ, 1, 63, 1, 5, 20);
			//Primary Colors
		addOre(MBlocks.yellow_ore, Blocks.stone, random, world, chunkX, chunkZ, 1, 63, 1, 5, 30);
		addOre(MBlocks.red_ore, Blocks.stone, random, world, chunkX, chunkZ, 1, 63, 1, 5, 30);
		addOre(MBlocks.blue_ore, Blocks.stone, random, world, chunkX, chunkZ, 1, 63, 1, 5, 30);
	}
	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		if(MConfiguration.SpawnEndOres){
			addOre(MBlocks.end_iron_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 4, 10, 77);
			addOre(MBlocks.end_coal_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 5, 10, 88);
			addOre(MBlocks.end_gold_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 4, 8, 44);
			addOre(MBlocks.end_diamond_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 1, 12, 33);
			addOre(MBlocks.end_emerald_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 1, 8, 22);
			addOre(MBlocks.end_ruby_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 1, 8, 22);
			addOre(MBlocks.end_lapis_ore, Blocks.end_stone, random, world, chunkX, chunkZ, 0, 256, 1, 8, 3);
		}
		
	}
}
