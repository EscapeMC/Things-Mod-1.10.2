package com.github.escapemc.thingsmod.init;

import com.github.escapemc.thingsmod.Main;
import com.github.escapemc.thingsmod.blocks.black_hole;
import com.github.escapemc.thingsmod.blocks.test_block;
import com.github.escapemc.thingsmod.blocks.test_chest;
import com.github.escapemc.thingsmod.blocks.test_furnace;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	public static Block test_block;
	public static Block test_furnace;
	public static Block lit_test_furnace;
	public static Block test_chest;
	public static Block black_hole;
	
	public static void init() {
		
		test_block = new test_block(Material.IRON).setCreativeTab(Main.ThingsModTab);
		
		test_furnace = new test_furnace(Material.ROCK, false, "test_furnace").setCreativeTab(Main.ThingsModTab);
		lit_test_furnace = new test_furnace(Material.ROCK, true, "lit_test_furnace");
		
		test_chest = new test_chest(Material.ROCK).setCreativeTab(Main.ThingsModTab);
		
		black_hole = new black_hole(Material.CAKE).setCreativeTab(Main.ThingsModTab);
		
		
		
	}
	
	public static void registry() {
		
		ModBlocks.registerBlock(test_block);
		
		ModBlocks.registerBlock(test_furnace);
		ModBlocks.registerBlock(lit_test_furnace);
		
		ModBlocks.registerBlock(test_chest);
		
		ModBlocks.registerBlock(black_hole);
		
		
	}
	
	public static void registerRenders() {
		
		registerRender(test_block);
		
		registerRender(test_furnace);
		registerRender(lit_test_furnace);
		
		registerRender(test_chest);
		
		registerRender(black_hole);
		
		
	}
	
	public static void registerBlock(Block block) {
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
		
		
	}

	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
		
		
	}
	
	
	
}
