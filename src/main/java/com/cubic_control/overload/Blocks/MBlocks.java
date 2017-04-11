package com.cubic_control.overload.Blocks;

import com.cubic_control.overload.Blocks.ModBlockLogFire;
import com.cubic_control.overload.Blocks.ModBlockLogIce;
import com.cubic_control.overload.CreativeTabs.MCreativeTabs;
import com.cubic_control.overload.GUI.GuiHandler;
import com.cubic_control.overload.Item.MItems;
import com.cubic_control.overload.Main.MainRegistry;
import com.cubic_control.overload.TileEntity.TileEntityLightPyramidEntity;
import com.cubic_control.overload.lib.RefStrings;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockMelon;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStem;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class MBlocks {
	public static void mainRegistry(){
		InitializeBlock();
		NetworkRegistry.INSTANCE.registerGuiHandler(MainRegistry.instance, new GuiHandler());
		MinecraftForge.EVENT_BUS.register(new VanilaBlockDropChanger());
		MinecraftForge.EVENT_BUS.register(new VanilaBlockTextureChanger());
	}
	public static Block ender_rite_ore;
	public static Block ender_rite_block;
	public static Block ender_rite_stairs;
	public static Block ender_rite_slab;
	public static Block ender_rite_slab_double;
	public static Block end_iron_ore;
	public static Block end_coal_ore;
	public static Block end_gold_ore;
	public static Block end_diamond_ore;
	public static Block end_emerald_ore;
	public static Block bluestone_ore;
	public static Block lit_bluestone_ore;
	public static Block bluestone_torch;
	public static Block unlit_bluestone_torch;
	public static Block bluestone_wire;
	public static Block end_ruby_ore;
	public static Block ruby_block;
	public static Block end_lapis_ore;
	public static Block powered_repeater;
	public static Block unpowered_repeater;
	public static Block bubblegum_ore;
	public static Block dark_brick;
	public static Block dark_brick_stairs;
	public static Block dark_brick_side;
	public static Block light_brick;
	public static Block light_brick_stairs;
	public static Block light_brick_side;
	public static Block mixed_brick;
	public static Block mixed_brick_stairs;
	public static Block mixed_brick_side;
	public static Block aged_brick;
	public static Block aged_brick_stairs;
	public static Block aged_brick_side;
	public static Block clay_dark;
	public static Block clay_light;
	public static Block light_pyramid;
	public static Block duplicator;
	public static Block rainbow_fire;
	public static Block rainbow_portal;
	public static Block super_slime;
	//Ice
	public static Block ice_stone;
	public static Block ice_stone_polished;
	public static Block ice_stone_pillar;
	public static Block ice_stonebrick;
	public static Block ice_cobblestone;
	public static Block ice_planks;
	public static BlockFence ice_fence;
	public static BlockFenceGate ice_fence_gate;
	public static Block ice_log;
	public static BlockSapling ice_sapling;
	public static Block ice_leaves;
	public static Block ice_dirt;
	public static Block ice_grass;
	public static Block ice_fire;
	public static Block ice_portal;
	public static Block ice_crafting_table;
	public static Block door_ice;
		//Stairs
	public static Block ice_stone_stairs;
	public static Block ice_stonebrick_stairs;
	public static Block ice_cobblestone_stairs;
	//Fire
	public static Block fire_stone;
	public static Block fire_stone_polished;
	public static Block fire_stone_pillar;
	public static Block fire_stonebrick;
	public static Block fire_cobblestone;
	public static Block fire_planks;
	public static BlockFence fire_fence;
	public static BlockFenceGate fire_fence_gate;
	public static Block fire_log;
	public static BlockSapling fire_sapling;
	public static Block fire_leaves;
	public static Block fire_dirt;
	public static Block fire_grass;
	public static Block burned_fire;
	public static Block fire_portal;
	public static Block fire_crafting_table;
	public static Block door_fire;
		//Stairs
	public static Block fire_stone_stairs;
	public static Block fire_stonebrick_stairs;
	public static Block fire_cobblestone_stairs;
	//Nightmare
	public static Block nightmare_stone;
	public static Block nightmare_stone_polished;
	public static Block nightmare_stone_pillar;
	public static Block nightmare_stonebrick;
	public static Block nightmare_cobblestone;
	public static Block nightmare_ore;
	public static Block nightmare_block;
	public static Block nightmare_dirt;
	public static Block nightmare_grass;
	public static Block nightmare_fire;
	public static Block nightmare_portal;
		//Stairs
	public static Block nightmare_stone_stairs;
	public static Block nightmare_stonebrick_stairs;
	public static Block nightmare_cobblestone_stairs;
	//Sandstone
	public static Block sandstone_polished;
	public static Block sandstone_pillar;
	public static Block sandstone_brick;
	public static Block sandstone_cobblestone;
		//Stairs
	public static Block sandstone_brick_stairs;
	public static Block sandstone_cobblestone_stairs;
	//Marble
	public static Block marble;
	public static Block marble_polished;
	public static Block marble_pillar;
	public static Block marble_brick;
	public static Block marble_cobblestone;
		//Stairs
	public static Block marble_stairs;
	public static Block marble_brick_stairs;
	public static Block marble_cobblestone_stairs;
	//Granite
	public static Block granite;
	public static Block granite_polished;
	public static Block granite_pillar;
	public static Block granite_brick;
	public static Block granite_cobblestone;
		//Stairs
	public static Block granite_stairs;
	public static Block granite_brick_stairs;
	public static Block granite_cobblestone_stairs;
	//Diorite
	public static Block diorite;
	public static Block diorite_polished;
	public static Block diorite_pillar;
	public static Block diorite_brick;
	public static Block diorite_cobblestone;
		//Stairs
	public static Block diorite_stairs;
	public static Block diorite_brick_stairs;
	public static Block diorite_cobblestone_stairs;
	//Andesite
	public static Block andesite;
	public static Block andesite_polished;
	public static Block andesite_pillar;
	public static Block andesite_brick;
	public static Block andesite_cobblestone;
		//Stairs
	public static Block andesite_stairs;
	public static Block andesite_brick_stairs;
	public static Block andesite_cobblestone_stairs;
	//Slate
	public static Block slate;
	public static Block slate_polished;
	public static Block slate_pillar;
	public static Block slate_brick;
	public static Block slate_cobblestone;
		//Stairs
	public static Block slate_stairs;
	public static Block slate_brick_stairs;
	public static Block slate_cobblestone_stairs;
	//Stone
	public static Block stone_polished;
	public static Block stone_pillar;
	//Red Sandstone
	public static Block red_sandstone;
	public static Block red_sandstone_polished;
	public static Block red_sandstone_pillar;
	public static Block red_sandstone_brick;
	public static Block red_sandstone_cobblestone;
		//Stairs
	public static Block red_sandstone_stairs;
	public static Block red_sandstone_brick_stairs;
	public static Block red_sandstone_cobblestone_stairs;
	//Basalt
	public static Block basalt;
	public static Block basalt_polished;
	public static Block basalt_pillar;
	public static Block basalt_brick;
	public static Block basalt_cobblestone;
		//Stairs
	public static Block basalt_stairs;
	public static Block basalt_brick_stairs;
	public static Block basalt_cobblestone_stairs;
	//Rhyolite
	public static Block rhyolite;
	public static Block rhyolite_polished;
	public static Block rhyolite_pillar;
	public static Block rhyolite_brick;
	public static Block rhyolite_cobblestone;
		//Stairs
	public static Block rhyolite_stairs;
	public static Block rhyolite_brick_stairs;
	public static Block rhyolite_cobblestone_stairs;
	//Dacite
	public static Block dacite;
	public static Block dacite_polished;
	public static Block dacite_pillar;
	public static Block dacite_brick;
	public static Block dacite_cobblestone;
		//Stairs
	public static Block dacite_stairs;
	public static Block dacite_brick_stairs;
	public static Block dacite_cobblestone_stairs;
	//Trachyte
	public static Block trachyte;
	public static Block trachyte_polished;
	public static Block trachyte_pillar;
	public static Block trachyte_brick;
	public static Block trachyte_cobblestone;
		//Stairs
	public static Block trachyte_stairs;
	public static Block trachyte_brick_stairs;
	public static Block trachyte_cobblestone_stairs;
	//Bone
	public static Block bone_block;
	public static Block bone_polished;
	public static Block bone_brick;
	/**SEEDS*/
	public static BlockStem white_melon_stem;
	public static BlockStem blue_melon_stem;
	public static BlockStem purple_melon_stem;
	public static BlockStem red_melon_stem;
	public static BlockStem violet_melon_stem;
	public static BlockStem yellow_melon_stem;
	/*Food*/
	public static Block melon_white;
	public static Block melon_blue;
	public static Block melon_purple;
	public static Block melon_red;
	public static Block melon_violet;
	public static Block melon_yellow;
	//Color ores/blocks
	public static Block rainbow_block;
	public static Block black_ore;
	public static Block black_block;
	public static Block blue_ore;
	public static Block blue_block;
	public static Block brown_ore;
	public static Block brown_block;
	public static Block cyan_ore;
	public static Block cyan_block;
	public static Block green_ore;
	public static Block green_block;
	public static Block lime_ore;
	public static Block lime_block;
	public static Block magenta_ore;
	public static Block magenta_block;
	public static Block orange_ore;
	public static Block orange_block;
	public static Block pink_ore;
	public static Block pink_block;
	public static Block purple_ore;
	public static Block purple_block;
	public static Block red_ore;
	public static Block red_block;
	public static Block violet_ore;
	public static Block violet_block;
	public static Block white_ore;
	public static Block white_block;
	public static Block yellow_ore;
	public static Block yellow_block;
		//Stairs
	public static Block black_stairs;
	public static Block blue_stairs;
	public static Block brown_stairs;
	public static Block cyan_stairs;
	public static Block green_stairs;
	public static Block lime_stairs;
	public static Block magenta_stairs;
	public static Block orange_stairs;
	public static Block pink_stairs;
	public static Block purple_stairs;
	public static Block red_stairs;
	public static Block violet_stairs;
	public static Block white_stairs;
	public static Block yellow_stairs;
		//Bricks
	public static Block black_brick;
	public static Block blue_brick;
	public static Block brown_brick;
	public static Block cyan_brick;
	public static Block green_brick;
	public static Block lime_brick;
	public static Block magenta_brick;
	public static Block orange_brick;
	public static Block pink_brick;
	public static Block purple_brick;
	public static Block red_brick;
	public static Block violet_brick;
	public static Block white_brick;
	public static Block yellow_brick;
			//Stairs
	public static Block black_brick_stairs;
	public static Block blue_brick_stairs;
	public static Block brown_brick_stairs;
	public static Block cyan_brick_stairs;
	public static Block green_brick_stairs;
	public static Block lime_brick_stairs;
	public static Block magenta_brick_stairs;
	public static Block orange_brick_stairs;
	public static Block pink_brick_stairs;
	public static Block purple_brick_stairs;
	public static Block red_brick_stairs;
	public static Block violet_brick_stairs;
	public static Block white_brick_stairs;
	public static Block yellow_brick_stairs;
			//Slabs
	public static BlockSlab black_brick_slab;
	public static BlockSlab black_brick_slab_double;
	public static BlockSlab blue_brick_slab;
	public static BlockSlab blue_brick_slab_double;
	public static BlockSlab brown_brick_slab;
	public static BlockSlab brown_brick_slab_double;
	public static BlockSlab cyan_brick_slab;
	public static BlockSlab cyan_brick_slab_double;
	public static BlockSlab green_brick_slab;
	public static BlockSlab green_brick_slab_double;
	public static BlockSlab lime_brick_slab;
	public static BlockSlab lime_brick_slab_double;
	public static BlockSlab magenta_brick_slab;
	public static BlockSlab magenta_brick_slab_double;
	public static BlockSlab orange_brick_slab;
	public static BlockSlab orange_brick_slab_double;
	public static BlockSlab pink_brick_slab;
	public static BlockSlab pink_brick_slab_double;
	public static BlockSlab purple_brick_slab;
	public static BlockSlab purple_brick_slab_double;
	public static BlockSlab red_brick_slab;
	public static BlockSlab red_brick_slab_double;
	public static BlockSlab violet_brick_slab;
	public static BlockSlab violet_brick_slab_double;
	public static BlockSlab white_brick_slab;
	public static BlockSlab white_brick_slab_double;
	public static BlockSlab yellow_brick_slab;
	public static BlockSlab yellow_brick_slab_double;
	//Gem Ores
	public static Block Aventurine_Ore;
	public static Block Amethyst_Ore;
	public static Block Beryl_Ore;
	public static Block Carnelian_Ore;
	public static Block Jade_Ore;
	public static Block Jasper_Ore;
	public static Block Malachite_Ore;
	public static Block Moonstone_Ore;
	public static Block Onyx_Ore;
	public static Block Peridot_Ore;
	public static Block Sapphire_Ore;
	public static Block Serendibite_Ore;
	public static Block Tanzanite_Ore;
	public static Block Tiger_eye_Ore;
	public static Block Topaz_Ore;
	public static Block Vermarine_Ore;
	//Gem Blocks
	public static Block Aventurine_Block;
	public static Block Amethyst_Block;
	public static Block Beryl_Block;
	public static Block Carnelian_Block;
	public static Block Jade_Block;
	public static Block Jasper_Block;
	public static Block Malachite_Block;
	public static Block Moonstone_Block;
	public static Block Onyx_Block;
	public static Block Peridot_Block;
	public static Block Sapphire_Block;
	public static Block Serendibite_Block;
	public static Block Tanzanite_Block;
	public static Block Tiger_eye_Block;
	public static Block Topaz_Block;
	public static Block Vermarine_Block;
		//Stairs
	public static Block Aventurine_Stairs;
	public static Block Amethyst_Stairs;
	public static Block Beryl_Stairs;
	public static Block Carnelian_Stairs;
	public static Block Jade_Stairs;
	public static Block Jasper_Stairs;
	public static Block Malachite_Stairs;
	public static Block Moonstone_Stairs;
	public static Block Onyx_Stairs;
	public static Block Peridot_Stairs;
	public static Block Sapphire_Stairs;
	public static Block Serendibite_Stairs;
	public static Block Tanzanite_Stairs;
	public static Block Tiger_eye_Stairs;
	public static Block Topaz_Stairs;
	public static Block Vermarine_Stairs;
		//Slabs
	public static Block Vermarine_Slab;
	public static Block Vermarine_Slab_Double;
	//Buttons
	public static Block Aventurine_Button;
	public static Block Amethyst_Button;
	public static Block Beryl_Button;
	public static Block Carnelian_Button;
	public static Block Jade_Button;
	public static Block Jasper_Button;
	public static Block Malachite_Button;
	public static Block Moonstone_Button;
	public static Block Onyx_Button;
	public static Block Peridot_Button;
	public static Block Sapphire_Button;
	public static Block Serendibite_Button;
	public static Block Tanzanite_Button;
	public static Block Tiger_eye_Button;
	public static Block Topaz_Button;
	public static Block Vermarine_Button;
	//Halloween
		//White
	public static Block white_pumpkin;
	public static Block white_pumpkin_1;
	public static Block white_pumpkin_1_lit;
	public static Block white_pumpkin_2;
	public static Block white_pumpkin_2_lit;
	public static Block white_pumpkin_3;
	public static Block white_pumpkin_3_lit;
	public static Block white_pumpkin_4;
	public static Block white_pumpkin_4_lit;
	public static Block white_pumpkin_5;
	public static Block white_pumpkin_5_lit;
	public static Block white_pumpkin_6;
	public static Block white_pumpkin_6_lit;
	public static Block white_pumpkin_7;
	public static Block white_pumpkin_7_lit;
	public static Block white_pumpkin_8;
	public static Block white_pumpkin_8_lit;
	public static BlockStem white_pumpkin_stem;
		//Blue
	public static Block blue_pumpkin;
	public static Block blue_pumpkin_1;
	public static Block blue_pumpkin_1_lit;
	public static Block blue_pumpkin_2;
	public static Block blue_pumpkin_2_lit;
	public static Block blue_pumpkin_3;
	public static Block blue_pumpkin_3_lit;
	public static Block blue_pumpkin_4;
	public static Block blue_pumpkin_4_lit;
	public static Block blue_pumpkin_5;
	public static Block blue_pumpkin_5_lit;
	public static Block blue_pumpkin_6;
	public static Block blue_pumpkin_6_lit;
	public static Block blue_pumpkin_7;
	public static Block blue_pumpkin_7_lit;
	public static Block blue_pumpkin_8;
	public static Block blue_pumpkin_8_lit;
	public static BlockStem blue_pumpkin_stem;
	/*DIMENSIONAL*/
	public static Block ice_coal_ore;
	public static Block ice_diamond_ore;
	public static Block ice_emerald_ore;
	public static Block ice_gold_ore;
	public static Block ice_iron_ore;
	public static Block ice_lapis_ore;
	public static Block ice_ruby_ore;
	
	public static void InitializeBlock(){
		ender_rite_ore = new ModBlockOre(Material.rock, "ender_rite_ore", 2);
		ender_rite_block = new ModBlock(Material.rock, "ender_rite_block", "pickaxe", 2, 3F, 30F, Block.soundTypeMetal);
		ender_rite_stairs = new ModBlockStairs("ender_rite_stairs", ender_rite_block, 2, "pickaxe", "ender_rite_block");
		ender_rite_slab_double = new ModBlockSlab(true, Material.rock, "ender_rite", 3F, 30F, 2, "pickaxe", Block.soundTypeMetal, "ender_rite_block");
		ender_rite_slab = new ModBlockSlab(false, Material.rock, "ender_rite", 3F, 30F, 2, "pickaxe", Block.soundTypeMetal, "ender_rite_block");
		end_iron_ore = new End_Ore(Material.rock, "end_iron_ore", 3f, 15f, 1, "iron_ore");
		end_coal_ore = new End_Ore(Material.rock, "end_coal_ore", 3f, 15f, 0, "coal_ore");
		end_gold_ore = new End_Ore(Material.rock, "end_gold_ore", 3f, 15f, 2, "gold_ore");
		end_diamond_ore = new End_Ore(Material.rock, "end_diamond_ore", 3f, 15f, 2, "diamond_ore");
		end_emerald_ore = new End_Ore(Material.rock, "end_emerald_ore", 3f, 15f, 2, "emerald_ore");
		end_ruby_ore = new End_Ore(Material.rock, "end_ruby_ore", 3f, 15f, 2, "end_ruby_ore");
		end_lapis_ore = new End_Ore(Material.rock, "end_lapis_ore", 3f, 15f, 1, "lapis_ore");
		bluestone_ore = new bluestone_ore(Material.rock, "bluestone_ore");
		lit_bluestone_ore = new lit_bluestone_ore(Material.rock, "lit_bluestone_ore", "bluestone_ore");
		bluestone_torch = new bluestone_torch(true, "bluestone_torch");
		unlit_bluestone_torch = new unlit_bluestone_torch(false, "unlit_bluestone_torch");
		bluestone_wire = new bluestone_wire(Material.circuits, "bluestone_wire");
		ruby_block = new ruby_block(Material.iron, "ruby_block");
		powered_repeater = new BlockBluestoneRepeater(true, "repeater_on");
		unpowered_repeater = new BlockBluestoneRepeater(false, "repeater_off");
		bubblegum_ore = new ModBlockOre(Material.rock, "bubblegum_ore", 1);
		dark_brick = new ModBlock(Material.rock, "dark_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		dark_brick_stairs = new ModBlockStairs("dark_brick_stairs", dark_brick, 0, "pickaxe", "dark_brick");
		dark_brick_side = new ModBlock(Material.rock, "dark_brick_side", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		light_brick = new ModBlock(Material.rock, "light_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		light_brick_stairs = new ModBlockStairs("light_brick_stairs", light_brick, 0, "pickaxe", "light_brick");
		light_brick_side = new ModBlock(Material.rock, "light_brick_side", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		mixed_brick = new ModBlock(Material.rock, "mixed_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		mixed_brick_stairs = new ModBlockStairs("mixed_brick_stairs", mixed_brick, 0, "pickaxe", "mixed_brick");
		mixed_brick_side = new ModBlock(Material.rock, "mixed_brick_side", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		aged_brick = new ModBlock(Material.rock, "aged_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		aged_brick_stairs = new ModBlockStairs("aged_brick_stairs", aged_brick, 0, "pickaxe", "aged_brick");
		aged_brick_side = new ModBlock(Material.rock, "aged_brick_side", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		clay_dark = new ModBlockClay(MItems.dark_clay_ball, "clay_dark");
		clay_light = new ModBlockClay(MItems.light_clay_ball, "clay_light");
		light_pyramid = new ModBlockTileEntity(Material.glass, "light_pyramid_block", "pickaxe", 0, 15f, 30f, Block.soundTypeGlass).setLightLevel(1.0f).setLightOpacity(0);
		duplicator = new ModBlockDuplicator("duplicator");
		rainbow_fire = new ModBlockFireRainbow("rainbow_fire");
		rainbow_portal = new ModBlockPortalRainbow("rainbow_portal");
		super_slime = new ModBlockSuperSlime("super_slime");
		//Ice
		ice_stone = new ModStone("ice_stone");
		ice_stone_polished = new ModBlock(Material.rock, "ice_stone_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		ice_stone_pillar = new ModBlockPillar(ice_stone, 3f, 30f, "ice_stone_pillar");
		ice_stonebrick = new ModBlock(Material.rock, "ice_stonebrick", "pickaxe", 1, 1.5F, 30F, Block.soundTypeStone);
		ice_cobblestone = new Cobblestone(Material.rock, "ice_cobblestone");
		ice_planks = new ModBlock(Material.ice, "planks_ice", "axe", 0, 2f, 15f, Block.soundTypeWood);
		ice_fence = new ModBlockFence("planks_ice", Material.ice, "ice_fence");
		ice_fence_gate = new ModBlockFenceGate("planks_ice", Material.ice, "ice_fence_gate");
		ice_log = new ModBlockLogIce("log_ice", RefStrings.MODID + ":log_ice");
		ice_sapling = new ModBlockSaplingIce("sapling_ice", Material.ice);
		ice_leaves = new ModBlockLeavesIce(Material.ice,"leaves_ice");
		ice_dirt = new ModBlockDirtIce("ice_dirt");
		ice_grass = new ModBlockGrassIce(Material.grass, "ice_grass");
		ice_fire = new ModBlockFireIce("ice_fire");
		ice_portal = new ModBlockPortalIce("ice_portal");
		ice_crafting_table = new ModBlockWorkbenchIce("ice_crafting_table", 2f, 15f);
		door_ice = new ModBlockDoor(ice_planks, "door_ice", 2f, 15f);
			//Stairs
		ice_stone_stairs = new ModBlockStairs("ice_stone_stairs", ice_stone, 0, "pickaxe", "ice_stone");
		ice_stonebrick_stairs = new ModBlockStairs("ice_stonebrick_stairs", ice_stonebrick, 0, "pickaxe", "ice_stonebrick");
		ice_cobblestone_stairs = new ModBlockStairs("ice_cobblestone_stairs", ice_cobblestone, 0, "pickaxe", "ice_cobblestone");
		//Fire
		fire_stone = new ModStone("fire_stone");
		fire_stone_polished = new ModBlock(Material.rock, "fire_stone_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		fire_stone_pillar = new ModBlockPillar(fire_stone, 3f, 30f, "fire_stone_pillar");
		fire_stonebrick = new ModBlock(Material.rock, "fire_stonebrick", "pickaxe", 1, 1.5F, 30F, Block.soundTypeStone);
		fire_cobblestone = new Cobblestone(Material.rock, "fire_cobblestone");
		fire_planks = new ModBlock(Material.rock, "planks_fire", "axe", 0, 2f, 15f, Block.soundTypeWood);
		fire_fence = new ModBlockFence("planks_fire", Material.rock, "fire_fence");
		fire_fence_gate = new ModBlockFenceGate("planks_fire", Material.ice, "fire_fence_gate");
		fire_log = new ModBlockLogFire("log_fire", RefStrings.MODID + ":log_fire");
		fire_sapling = new ModBlockSaplingFire("sapling_fire", Material.rock);
		fire_leaves = new ModBlockLeavesFire(Material.rock, "leaves_fire");
		fire_dirt = new ModBlockDirtFire("fire_dirt");
		fire_grass = new ModBlockGrassFire(Material.grass, "fire_grass");
		burned_fire = new ModBlockFireFire("burned_fire");
		fire_portal = new ModBlockPortalFire("fire_portal");
		fire_crafting_table = new ModBlockWorkbenchFire("fire_crafting_table", 2f, 15f);
		door_fire = new ModBlockDoor(fire_planks, "door_fire", 2f, 15f);
			//Stairs
		fire_stone_stairs = new ModBlockStairs("fire_stone_stairs", fire_stone, 0, "pickaxe", "fire_stone");
		fire_stonebrick_stairs = new ModBlockStairs("fire_stonebrick_stairs", fire_stonebrick, 0, "pickaxe", "fire_stonebrick");
		fire_cobblestone_stairs = new ModBlockStairs("fire_cobblestone_stairs", fire_cobblestone, 0, "pickaxe", "fire_cobblestone");
		//Nightmare
		nightmare_stone = new ModStone("nightmare_stone");
		nightmare_stone_polished = new ModBlock(Material.rock, "nightmare_stone_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		nightmare_stone_pillar = new ModBlockPillar(nightmare_stone, 3f, 30f, "nightmare_stone_pillar");
		nightmare_stonebrick = new ModBlock(Material.rock, "nightmare_stonebrick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		nightmare_cobblestone = new ModBlock(Material.rock, "nightmare_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		nightmare_ore = new ModBlockOre(Material.rock, "nightmare_ore", 2);
		nightmare_block = new ModBlock(Material.iron, "nightmare_block", "pickaxe", 2, 5F, 25F, Block.soundTypeMetal);
		nightmare_dirt = new ModBlockDirtNightmare("nightmare_dirt");
		nightmare_grass = new ModBlockGrassNightmare(Material.grass, "nightmare_grass");
		nightmare_fire = new ModBlockFireNightmare("nightmare_fire");
		nightmare_portal = new ModBlockPortalNightmare("nightmare_portal");
			//Stairs
		nightmare_stone_stairs = new ModBlockStairs("nightmare_stone_stairs", nightmare_stone, 0, "pickaxe", "nightmare_stone");
		nightmare_stonebrick_stairs = new ModBlockStairs("nightmare_stonebrick_stairs", nightmare_stonebrick, 0, "pickaxe", "nightmare_stonebrick");
		nightmare_cobblestone_stairs = new ModBlockStairs("nightmare_cobblestone_stairs", nightmare_cobblestone, 0, "pickaxe", "nightmare_cobblestone");
		//Sandstone
		sandstone_polished = new ModBlock(Material.rock, "sandstone_polished", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
		sandstone_pillar = new ModBlockPillar(Blocks.sandstone, 1f, 30f, "sandstone_pillar");
		sandstone_brick = new ModBlock(Material.rock, "sandstone_brick", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
		sandstone_cobblestone = new ModBlock(Material.rock, "sandstone_cobblestone", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
			//Stairs
		sandstone_brick_stairs = new ModBlockStairs("sandstone_brick_stairs", sandstone_brick, 0, "pickaxe", "sandstone_brick");
		sandstone_cobblestone_stairs = new ModBlockStairs("sandstone_cobblestone_stairs", sandstone_cobblestone, 0, "pickaxe", "sandstone_cobblestone");
		//Marble
		marble = new ModBlock(Material.rock, "marble", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		marble_polished = new ModBlock(Material.rock, "marble_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		marble_pillar = new ModBlockPillar(marble, 3f, 30f, "marble_pillar");
		marble_brick = new ModBlock(Material.rock, "marble_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		marble_cobblestone = new ModBlock(Material.rock, "marble_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		marble_stairs = new ModBlockStairs("marble_stairs", marble, 0, "pickaxe", "marble");
		marble_brick_stairs = new ModBlockStairs("marble_brick_stairs", marble_brick, 0, "pickaxe", "marble_brick");
		marble_cobblestone_stairs = new ModBlockStairs("marble_cobblestone_stairs", marble_cobblestone, 0, "pickaxe", "marble_cobblestone");
		//Granite
		granite = new ModBlock(Material.rock, "granite", "pickaxe", 0, 1f, 15f, Block.soundTypeStone);
		granite_polished = new ModBlock(Material.rock, "granite_polished", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		granite_pillar = new ModBlockPillar(granite, 2f, 30f, "granite_pillar");
		granite_brick = new ModBlock(Material.rock, "granite_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		granite_cobblestone = new ModBlock(Material.rock, "granite_cobblestone", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
			//Stairs
		granite_stairs = new ModBlockStairs("granite_stairs", granite, 0, "pickaxe", "granite");
		granite_brick_stairs = new ModBlockStairs("granite_brick_stairs", granite_brick, 0, "pickaxe", "granite_brick");
		granite_cobblestone_stairs = new ModBlockStairs("granite_cobblestone_stairs", granite_cobblestone, 0, "pickaxe", "granite_cobblestone");
		//Diorite
		diorite = new ModBlock(Material.rock, "diorite", "pickaxe", 0, 1f, 15f, Block.soundTypeStone);
		diorite_polished = new ModBlock(Material.rock, "diorite_polished", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		diorite_pillar = new ModBlockPillar(diorite, 2f, 30f, "diorite_pillar");
		diorite_brick = new ModBlock(Material.rock, "diorite_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		diorite_cobblestone = new ModBlock(Material.rock, "diorite_cobblestone", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
			//Stairs
		diorite_stairs = new ModBlockStairs("diorite_stairs", diorite, 0, "pickaxe", "diorite");
		diorite_brick_stairs = new ModBlockStairs("diorite_brick_stairs", diorite_brick, 0, "pickaxe", "diorite_brick");
		diorite_cobblestone_stairs = new ModBlockStairs("diorite_cobblestone_stairs", diorite_cobblestone, 0, "pickaxe", "diorite_cobblestone");
		//Andesite
		andesite = new ModBlock(Material.rock, "andesite", "pickaxe", 0, 1f, 15f, Block.soundTypeStone);
		andesite_polished = new ModBlock(Material.rock, "andesite_polished", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		andesite_pillar = new ModBlockPillar(andesite, 2f, 30f, "andesite_pillar");
		andesite_brick = new ModBlock(Material.rock, "andesite_brick", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
		andesite_cobblestone = new ModBlock(Material.rock, "andesite_cobblestone", "pickaxe", 0, 2f, 30f, Block.soundTypeStone);
			//Stairs
		andesite_stairs = new ModBlockStairs("andesite_stairs", andesite, 0, "pickaxe", "andesite");
		andesite_brick_stairs = new ModBlockStairs("andesite_brick_stairs", andesite_brick, 0, "pickaxe", "andesite_brick");
		andesite_cobblestone_stairs = new ModBlockStairs("andesite_cobblestone_stairs", andesite_cobblestone, 0, "pickaxe", "andesite_cobblestone");
		//Slate
		slate = new ModBlock(Material.rock, "slate", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		slate_polished = new ModBlock(Material.rock, "slate_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		slate_pillar = new ModBlockPillar(slate, 3f, 30f, "slate_pillar");
		slate_brick = new ModBlock(Material.rock, "slate_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		slate_cobblestone = new ModBlock(Material.rock, "slate_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		slate_stairs = new ModBlockStairs("slate_stairs", slate, 0, "pickaxe", "slate");
		slate_brick_stairs = new ModBlockStairs("slate_brick_stairs", slate_brick, 0, "pickaxe", "slate_brick");
		slate_cobblestone_stairs = new ModBlockStairs("slate_cobblestone_stairs", slate_cobblestone, 0, "pickaxe", "slate_cobblestone");
		//Stone
		stone_polished = new ModBlock(Material.rock, "stone_polished", "pickaxe", 0, 1.5f, 30f, Block.soundTypeStone);
		stone_pillar = new ModBlockPillar(Blocks.stone, 1.5f, 30f, "stone_pillar");
		//Red Sandstone
		red_sandstone = new ModBlock(Material.rock, "red_sandstone", "pickaxe", 0, 0.8f, 4f, Block.soundTypeStone);
		red_sandstone_polished = new ModBlock(Material.rock, "red_sandstone_polished", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
		red_sandstone_pillar = new ModBlockPillar(red_sandstone, 1f, 30f, "red_sandstone_pillar");
		red_sandstone_brick = new ModBlock(Material.rock, "red_sandstone_brick", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
		red_sandstone_cobblestone = new ModBlock(Material.rock, "red_sandstone_cobblestone", "pickaxe", 0, 1f, 30f, Block.soundTypeStone);
			//Stairs
		red_sandstone_stairs = new ModBlockStairs("red_sandstone_stairs", red_sandstone, 0, "pickaxe", "red_sandstone");
		red_sandstone_brick_stairs = new ModBlockStairs("red_sandstone_brick_stairs", red_sandstone_brick, 0, "pickaxe", "red_sandstone_brick");
		red_sandstone_cobblestone_stairs = new ModBlockStairs("red_sandstone_cobblestone_stairs", red_sandstone_cobblestone, 0, "pickaxe", "red_sandstone_cobblestone");
		//Basalt
		basalt = new ModBlock(Material.rock, "basalt", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		basalt_polished = new ModBlock(Material.rock, "basalt_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		basalt_pillar = new ModBlockPillar(basalt, 3f, 30f, "basalt_pillar");
		basalt_brick = new ModBlock(Material.rock, "basalt_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		basalt_cobblestone = new ModBlock(Material.rock, "basalt_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		basalt_stairs = new ModBlockStairs("basalt_stairs", basalt, 0, "pickaxe", "basalt");
		basalt_brick_stairs = new ModBlockStairs("basalt_brick_stairs", basalt_brick, 0, "pickaxe", "basalt_brick");
		basalt_cobblestone_stairs = new ModBlockStairs("basalt_cobblestone_stairs", basalt_cobblestone, 0, "pickaxe", "basalt_cobblestone");
		//Rhyolite
		rhyolite = new ModBlock(Material.rock, "rhyolite", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		rhyolite_polished = new ModBlock(Material.rock, "rhyolite_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		rhyolite_pillar = new ModBlockPillar(basalt, 3f, 30f, "rhyolite_pillar");
		rhyolite_brick = new ModBlock(Material.rock, "rhyolite_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		rhyolite_cobblestone = new ModBlock(Material.rock, "rhyolite_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		rhyolite_stairs = new ModBlockStairs("rhyolite_stairs", rhyolite, 0, "pickaxe", "rhyolite");
		rhyolite_brick_stairs = new ModBlockStairs("rhyolite_brick_stairs", rhyolite_brick, 0, "pickaxe", "rhyolite_brick");
		rhyolite_cobblestone_stairs = new ModBlockStairs("rhyolite_cobblestone_stairs", rhyolite_cobblestone, 0, "pickaxe", "rhyolite_cobblestone");
		//Dacite
		dacite = new ModBlock(Material.rock, "dacite", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		dacite_polished = new ModBlock(Material.rock, "dacite_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		dacite_pillar = new ModBlockPillar(basalt, 3f, 30f, "dacite_pillar");
		dacite_brick = new ModBlock(Material.rock, "dacite_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		dacite_cobblestone = new ModBlock(Material.rock, "dacite_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		dacite_stairs = new ModBlockStairs("dacite_stairs", dacite, 0, "pickaxe", "dacite");
		dacite_brick_stairs = new ModBlockStairs("dacite_brick_stairs", dacite_brick, 0, "pickaxe", "dacite_brick");
		dacite_cobblestone_stairs = new ModBlockStairs("dacite_cobblestone_stairs", dacite_cobblestone, 0, "pickaxe", "dacite_cobblestone");
		//Trachyte
		trachyte = new ModBlock(Material.rock, "trachyte", "pickaxe", 0, 1.5f, 15f, Block.soundTypeStone);
		trachyte_polished = new ModBlock(Material.rock, "trachyte_polished", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		trachyte_pillar = new ModBlockPillar(basalt, 3f, 30f, "trachyte_pillar");
		trachyte_brick = new ModBlock(Material.rock, "trachyte_brick", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
		trachyte_cobblestone = new ModBlock(Material.rock, "trachyte_cobblestone", "pickaxe", 0, 3f, 30f, Block.soundTypeStone);
			//Stairs
		trachyte_stairs = new ModBlockStairs("trachyte_stairs", trachyte, 0, "pickaxe", "trachyte");
		trachyte_brick_stairs = new ModBlockStairs("trachyte_brick_stairs", trachyte_brick, 0, "pickaxe", "trachyte_brick");
		trachyte_cobblestone_stairs = new ModBlockStairs("trachyte_cobblestone_stairs", trachyte_cobblestone, 0, "pickaxe", "trachyte_cobblestone");
		//Bone
		bone_block = new ModBlock(Material.rock, "bone_block", "pickaxe", 0, 2f, 10f, Block.soundTypeStone);
		bone_polished = new ModBlock(Material.rock, "bone_polished", "pickaxe", 0, 2.5f, 20f, Block.soundTypeStone);
		bone_brick = new ModBlock(Material.rock, "bone_brick", "pickaxe", 0, 2.5f, 20f, Block.soundTypeStone);
		/*Food*/
		melon_white = new ModBlockMelon("white_melon", "melon_white");
		melon_blue = new ModBlockMelon("blue_melon", "melon_blue");
		melon_purple = new ModBlockMelon("purple_melon", "melon_purple");
		melon_red = new ModBlockMelon("red_melon", "melon_red");
		melon_violet = new ModBlockMelon("violet_melon", "melon_violet");
		melon_yellow = new ModBlockMelon("yellow_melon", "melon_yellow");
		/**STEMS*/
		white_melon_stem = new ModBlockStem(melon_white, "white_melon_stem");
		blue_melon_stem = new ModBlockStem(melon_blue, "blue_melon_stem");
		purple_melon_stem = new ModBlockStem(melon_purple, "purple_melon_stem");
		red_melon_stem = new ModBlockStem(melon_red, "red_melon_stem");
		violet_melon_stem = new ModBlockStem(melon_violet, "violet_melon_stem");
		yellow_melon_stem = new ModBlockStem(melon_yellow, "yellow_melon_stem");
		//Gem Ores + Blocks
		Aventurine_Ore = new Gem_Ores(Material.rock, "aventurine_ore");
		Amethyst_Ore = new Gem_Ores(Material.rock, "amethyst_ore");
		Beryl_Ore = new Gem_Ores(Material.rock, "beryl_ore");
		Carnelian_Ore = new Gem_Ores(Material.rock, "carnelian_ore");
		Jade_Ore = new Gem_Ores(Material.rock, "jade_ore");
		Jasper_Ore = new Gem_Ores(Material.rock, "jasper_ore");
		Malachite_Ore = new Gem_Ores(Material.rock, "malachite_ore");
		Moonstone_Ore = new Gem_Ores(Material.rock, "moonstone_ore");
		Onyx_Ore = new Gem_Ores(Material.rock, "onyx_ore");
		Peridot_Ore = new Gem_Ores(Material.rock, "peridot_ore");
		Sapphire_Ore = new Gem_Ores(Material.rock, "sapphire_ore");
		Serendibite_Ore = new Gem_Ores(Material.rock, "serendibite_ore").setLightOpacity(0);
		Tanzanite_Ore = new Gem_Ores(Material.rock, "tanzanite_ore");
		Tiger_eye_Ore = new Gem_Ores(Material.rock, "tiger_eye_ore");
		Topaz_Ore = new Gem_Ores(Material.rock, "topaz_ore");
		Vermarine_Ore = new Gem_Ores(Material.rock, "vermarine_ore");
			//Blocks
		Aventurine_Block = new Gem_Blocks(Material.rock, "aventurine_block");
		Amethyst_Block = new Gem_Blocks(Material.iron, "amethyst_block");
		Beryl_Block = new Gem_Blocks(Material.iron, "beryl_block");
		Carnelian_Block = new Gem_Blocks(Material.iron, "carnelian_block");
		Jade_Block = new Gem_Blocks(Material.iron, "jade_block");
		Jasper_Block = new Gem_Blocks(Material.iron, "jasper_block");
		Malachite_Block = new Gem_Blocks(Material.iron, "malachite_block");
		Moonstone_Block = new Gem_Blocks(Material.iron, "moonstone_block");
		Onyx_Block = new Gem_Blocks(Material.iron, "onyx_block");
		Peridot_Block = new Gem_Blocks(Material.iron, "peridot_block");
		Sapphire_Block = new Gem_Blocks(Material.iron, "sapphire_block");
		Serendibite_Block = new Gem_Blocks(Material.iron, "serendibite_block").setLightOpacity(0);
		Tanzanite_Block = new Gem_Blocks(Material.iron, "tanzanite_block");
		Tiger_eye_Block = new Gem_Blocks(Material.iron, "tiger_eye_block");
		Topaz_Block = new Gem_Blocks(Material.iron, "topaz_block");
		Vermarine_Block = new Gem_Blocks(Material.iron, "vermarine_block");
			//Stairs
		Aventurine_Stairs = new ModBlockStairs("aventurine_stairs", Aventurine_Block, 3, "pickaxe", "gems/blocks/aventurine_block");
		Amethyst_Stairs = new ModBlockStairs("amethyst_stairs", Amethyst_Block, 3, "pickaxe", "gems/blocks/amethyst_block");
		Beryl_Stairs = new ModBlockStairs("beryl_stairs", Beryl_Block, 3, "pickaxe", "gems/blocks/beryl_block");
		Carnelian_Stairs = new ModBlockStairs("carnelian_stairs", Carnelian_Block, 3, "pickaxe", "gems/blocks/carnelian_block");
		Jade_Stairs = new ModBlockStairs("jade_stairs", Jade_Block, 3, "pickaxe", "gems/blocks/jade_block");
		Jasper_Stairs = new ModBlockStairs("jasper_stairs", Jasper_Block, 3, "pickaxe", "gems/blocks/jasper_block");
		Malachite_Stairs = new ModBlockStairs("malachite_stairs", Malachite_Block, 3, "pickaxe", "gems/blocks/malachite_block");
		Moonstone_Stairs = new ModBlockStairs("moonstone_stairs", Moonstone_Block, 3, "pickaxe", "gems/blocks/moonstone_block");
		Onyx_Stairs = new ModBlockStairs("onyx_stairs", Onyx_Block, 3, "pickaxe", "gems/blocks/onyx_block");
		Peridot_Stairs = new ModBlockStairs("peridot_stairs", Peridot_Block, 3, "pickaxe", "gems/blocks/peridot_block");
		Sapphire_Stairs = new ModBlockStairs("sapphire_stairs", Sapphire_Block, 3, "pickaxe", "gems/blocks/sapphire_block");
		Serendibite_Stairs = new ModBlockStairs("serendibite_stairs", Serendibite_Block, 3, "pickaxe", "gems/blocks/serendibite_block");
		Tanzanite_Stairs = new ModBlockStairs("tanzanite_stairs", Tanzanite_Block, 3, "pickaxe", "gems/blocks/tanzanite_block");
		Tiger_eye_Stairs = new ModBlockStairs("tiger_eye_stairs", Tiger_eye_Block, 3, "pickaxe", "gems/blocks/tiger_eye_block");
		Topaz_Stairs = new ModBlockStairs("topaz_stairs", Topaz_Block, 3, "pickaxe", "gems/blocks/topaz_block");
		Vermarine_Stairs = new ModBlockStairs("vermarine_stairs", Vermarine_Block, 3, "pickaxe", "gems/blocks/vermarine_block");
			//Slabs
		Vermarine_Slab_Double = new ModBlockSlab(true, Material.iron, "vermarine", 5f, 30f, 3, "pickaxe", Block.soundTypeMetal, "gems/blocks/vermarine_block");
		Vermarine_Slab = new ModBlockSlab(false, Material.iron, "vermarine", 5f, 30f, 3, "pickaxe", Block.soundTypeMetal, "gems/blocks/vermarine_block");
		//Color ores/blocks
		rainbow_block = new c_block(Material.iron, "rainbow_block").setLightLevel(1.0f);
		black_ore = new c_ore(Material.rock, "black_ore");
		black_block = new c_block(Material.iron, "black_block");
		blue_ore = new c_ore(Material.rock, "blue_ore");
		blue_block = new c_block(Material.iron, "blue_block");
		brown_ore = new c_ore(Material.rock, "brown_ore");
		brown_block = new c_block(Material.iron, "brown_block");
		cyan_ore = new c_ore(Material.rock, "cyan_ore");
		cyan_block = new c_block(Material.iron, "cyan_block");
		green_ore = new c_ore(Material.rock, "green_ore");
		green_block = new c_block(Material.iron, "green_block");
		lime_ore = new c_ore(Material.rock, "lime_ore");
		lime_block = new c_block(Material.iron, "lime_block");
		magenta_ore = new c_ore(Material.rock, "magenta_ore");
		magenta_block = new c_block(Material.iron, "magenta_block");
		orange_ore = new c_ore(Material.rock, "orange_ore");
		orange_block = new c_block(Material.iron, "orange_block");
		pink_ore = new c_ore(Material.rock, "pink_ore");
		pink_block = new c_block(Material.iron, "pink_block");
		purple_ore = new c_ore(Material.rock, "purple_ore");
		purple_block = new c_block(Material.iron, "purple_block");
		red_ore = new c_ore(Material.rock, "red_ore");
		red_block = new c_block(Material.iron, "red_block");
		violet_ore = new c_ore(Material.rock, "violet_ore");
		violet_block = new c_block(Material.iron, "violet_block");
		white_ore = new c_ore(Material.rock, "white_ore");
		white_block = new c_block(Material.iron, "white_block");
		yellow_ore = new c_ore(Material.rock, "yellow_ore");
		yellow_block = new c_block(Material.iron, "yellow_block");
			//Stairs
		black_stairs = new c_stairs("black_block", black_block);
		blue_stairs = new c_stairs("blue_block", blue_block);
		brown_stairs = new c_stairs("brown_block", brown_block);
		cyan_stairs = new c_stairs("cyan_block", cyan_block);
		green_stairs = new c_stairs("green_block", green_block);
		lime_stairs = new c_stairs("lime_block", lime_block);
		magenta_stairs = new c_stairs("magenta_block", magenta_block);
		orange_stairs = new c_stairs("orange_block", orange_block);
		pink_stairs = new c_stairs("pink_block", pink_block);
		purple_stairs = new c_stairs("purple_block", purple_block);
		red_stairs = new c_stairs("red_block", red_block);
		violet_stairs = new c_stairs("violet_block", violet_block);
		white_stairs = new c_stairs("white_block", white_block);
		yellow_stairs = new c_stairs("yellow_block", yellow_block);
			//Bricks
		black_brick = new c_block(Material.iron, "black_brick");
		blue_brick = new c_block(Material.iron, "blue_brick");
		brown_brick = new c_block(Material.iron, "brown_brick");
		cyan_brick = new c_block(Material.iron, "cyan_brick");
		green_brick = new c_block(Material.iron, "green_brick");
		lime_brick = new c_block(Material.iron, "lime_brick");
		magenta_brick = new c_block(Material.iron, "magenta_brick");
		orange_brick = new c_block(Material.iron, "orange_brick");
		pink_brick = new c_block(Material.iron, "pink_brick");
		purple_brick = new c_block(Material.iron, "purple_brick");
		red_brick = new c_block(Material.iron, "red_brick");
		violet_brick = new c_block(Material.iron, "violet_brick");
		white_brick = new c_block(Material.iron, "white_brick");
		yellow_brick = new c_block(Material.iron, "yellow_brick");
				//Stairs
		black_brick_stairs = new c_stairs("black_brick", black_brick);
		blue_brick_stairs = new c_stairs("blue_brick", blue_brick);
		brown_brick_stairs = new c_stairs("brown_brick", brown_brick);
		cyan_brick_stairs = new c_stairs("cyan_brick", cyan_brick);
		green_brick_stairs = new c_stairs("green_brick", green_brick);
		lime_brick_stairs = new c_stairs("lime_brick", lime_brick);
		magenta_brick_stairs = new c_stairs("magenta_brick", magenta_brick);
		orange_brick_stairs = new c_stairs("orange_brick", orange_brick);
		pink_brick_stairs = new c_stairs("pink_brick", pink_brick);
		purple_brick_stairs = new c_stairs("purple_brick", purple_brick);
		red_brick_stairs = new c_stairs("red_brick", red_brick);
		violet_brick_stairs = new c_stairs("violet_brick", violet_brick);
		white_brick_stairs = new c_stairs("white_brick", white_brick);
		yellow_brick_stairs = new c_stairs("yellow_brick", yellow_brick);
				//Slabs
		black_brick_slab_double = new c_slabs(true, Material.iron, "black_brick");
		black_brick_slab = new c_slabs(false, Material.iron, "black_brick");
		blue_brick_slab_double = new c_slabs(true, Material.iron, "blue_brick");
		blue_brick_slab = new c_slabs(false, Material.iron, "blue_brick");
		brown_brick_slab_double = new c_slabs(true, Material.iron, "brown_brick");
		brown_brick_slab = new c_slabs(false, Material.iron, "brown_brick");
		cyan_brick_slab_double = new c_slabs(true, Material.iron, "cyan_brick");
		cyan_brick_slab = new c_slabs(false, Material.iron, "cyan_brick");
		green_brick_slab_double = new c_slabs(true, Material.iron, "green_brick");
		green_brick_slab = new c_slabs(false, Material.iron, "green_brick");
		lime_brick_slab_double = new c_slabs(true, Material.iron, "lime_brick");
		lime_brick_slab = new c_slabs(false, Material.iron, "lime_brick");
		magenta_brick_slab_double = new c_slabs(true, Material.iron, "magenta_brick");
		magenta_brick_slab = new c_slabs(false, Material.iron, "magenta_brick");
		orange_brick_slab_double = new c_slabs(true, Material.iron, "orange_brick");
		orange_brick_slab = new c_slabs(false, Material.iron, "orange_brick");
		pink_brick_slab_double = new c_slabs(true, Material.iron, "pink_brick");
		pink_brick_slab = new c_slabs(false, Material.iron, "pink_brick");
		purple_brick_slab_double = new c_slabs(true, Material.iron, "purple_brick");
		purple_brick_slab = new c_slabs(false, Material.iron, "purple_brick");
		red_brick_slab_double = new c_slabs(true, Material.iron, "red_brick");
		red_brick_slab = new c_slabs(false, Material.iron, "red_brick");
		violet_brick_slab_double = new c_slabs(true, Material.iron, "violet_brick");
		violet_brick_slab = new c_slabs(false, Material.iron, "violet_brick");
		white_brick_slab_double = new c_slabs(true, Material.iron, "white_brick");
		white_brick_slab = new c_slabs(false, Material.iron, "white_brick");
		yellow_brick_slab_double = new c_slabs(true, Material.iron, "yellow_brick");
		yellow_brick_slab = new c_slabs(false, Material.iron, "yellow_brick");
		//Buttons
		Aventurine_Button = new ModBlockButton(false, Aventurine_Block, 5f, 30f);
		Amethyst_Button = new ModBlockButton(false, Amethyst_Block, 5f, 30f);
		Beryl_Button = new ModBlockButton(false, Beryl_Block, 5f, 30f);
		Carnelian_Button = new ModBlockButton(false, Carnelian_Block, 5f, 30f);
		Jade_Button = new ModBlockButton(false, Jade_Block, 5f, 30f);
		Jasper_Button = new ModBlockButton(false, Jasper_Block, 5f, 30f);
		Malachite_Button = new ModBlockButton(false, Malachite_Block, 5f, 30f);
		Moonstone_Button = new ModBlockButton(false, Moonstone_Block, 5f, 30f);
		Onyx_Button = new ModBlockButton(false, Onyx_Block, 5f, 30f);
		Peridot_Button = new ModBlockButton(false, Peridot_Block, 5f, 30f);
		Sapphire_Button = new ModBlockButton(false, Sapphire_Block, 5f, 30f);
		Serendibite_Button = new ModBlockButton(false, Serendibite_Block, 5f, 30f);
		Tanzanite_Button = new ModBlockButton(false, Tanzanite_Block, 5f, 30f);
		Tiger_eye_Button = new ModBlockButton(false, Tiger_eye_Block, 5f, 30f);
		Topaz_Button = new ModBlockButton(false, Topaz_Block, 5f, 30f);
		Vermarine_Button = new ModBlockButton(false, Vermarine_Block, 5f, 30f);
		//Halloween
			//White
		white_pumpkin = new ModBlockPumpkin(false, false, "white_pumpkin", 0);
		white_pumpkin_1 = new ModBlockPumpkin(false, true, "white_pumpkin", 1);
		white_pumpkin_1_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 1);
		white_pumpkin_2 = new ModBlockPumpkin(false, true, "white_pumpkin", 2);
		white_pumpkin_2_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 2);
		white_pumpkin_3 = new ModBlockPumpkin(false, true, "white_pumpkin", 3);
		white_pumpkin_3_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 3);
		white_pumpkin_4 = new ModBlockPumpkin(false, true, "white_pumpkin", 4);
		white_pumpkin_4_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 4);
		white_pumpkin_5 = new ModBlockPumpkin(false, true, "white_pumpkin", 5);
		white_pumpkin_5_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 5);
		white_pumpkin_6 = new ModBlockPumpkin(false, true, "white_pumpkin", 6);
		white_pumpkin_6_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 6);
		white_pumpkin_7 = new ModBlockPumpkin(false, true, "white_pumpkin", 7);
		white_pumpkin_7_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 7);
		white_pumpkin_8 = new ModBlockPumpkin(false, true, "white_pumpkin", 8);
		white_pumpkin_8_lit = new ModBlockPumpkin(true, true, "white_pumpkin", 8);
		white_pumpkin_stem = new ModBlockStem(white_pumpkin, "white_pumpkin_stem", "pumpkin/");
			//Blue
		blue_pumpkin = new ModBlockPumpkin(false, false, "blue_pumpkin", 0);
		blue_pumpkin_1 = new ModBlockPumpkin(false, true, "blue_pumpkin", 1);
		blue_pumpkin_1_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 1);
		blue_pumpkin_2 = new ModBlockPumpkin(false, true, "blue_pumpkin", 2);
		blue_pumpkin_2_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 2);
		blue_pumpkin_3 = new ModBlockPumpkin(false, true, "blue_pumpkin", 3);
		blue_pumpkin_3_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 3);
		blue_pumpkin_4 = new ModBlockPumpkin(false, true, "blue_pumpkin", 4);
		blue_pumpkin_4_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 4);
		blue_pumpkin_5 = new ModBlockPumpkin(false, true, "blue_pumpkin", 5);
		blue_pumpkin_5_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 5);
		blue_pumpkin_6 = new ModBlockPumpkin(false, true, "blue_pumpkin", 6);
		blue_pumpkin_6_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 6);
		blue_pumpkin_7 = new ModBlockPumpkin(false, true, "blue_pumpkin", 7);
		blue_pumpkin_7_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 7);
		blue_pumpkin_8 = new ModBlockPumpkin(false, true, "blue_pumpkin", 8);
		blue_pumpkin_8_lit = new ModBlockPumpkin(true, true, "blue_pumpkin", 8);
		blue_pumpkin_stem = new ModBlockStem(blue_pumpkin, "blue_pumpkin_stem", "pumpkin/");
		/*DIMENSIONAL*/
		ice_coal_ore = new ModBlockOre(Material.rock, "ice_coal_ore", 0);
		ice_diamond_ore = new ModBlockOre(Material.rock, "ice_diamond_ore", 2);
		ice_emerald_ore = new ModBlockOre(Material.rock, "ice_emerald_ore", 2);
		ice_gold_ore = new ModBlockOre(Material.rock, "ice_gold_ore", 2);
		ice_iron_ore = new ModBlockOre(Material.rock, "ice_iron_ore", 1);
		ice_lapis_ore = new ModBlockOre(Material.rock, "ice_lapis_ore", 1);
		ice_ruby_ore = new ModBlockOre(Material.rock, "ice_ruby_ore", 2);
	}
}
