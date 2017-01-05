package com.github.escapemc.thingsmod.init;

import com.github.escapemc.thingsmod.Main;
import com.github.escapemc.thingsmod.items.test_armor;
import com.github.escapemc.thingsmod.items.test_bag;
import com.github.escapemc.thingsmod.items.test_item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class ModItems {

	public static Item test_item;
	
	public static Item test_bag;
	
	public static Item test_helmet;
	public static Item test_chestplate;
	public static Item test_leggings;
	public static Item test_boots;
	
	
	
	public static ArmorMaterial test_armor_material = EnumHelper.addArmorMaterial("test_armor_material", "tm:test_armor", 3148, new int[] {3, 7, 5, 3}, 22, null, 0);	
	
	
	public static void init() {
		
		test_item = new test_item().setCreativeTab(Main.ThingsModTab);
		
		test_bag = new test_bag().setCreativeTab(Main.ThingsModTab);
		
		test_helmet = new test_armor(test_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.ThingsModTab);
		test_chestplate = new test_armor(test_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.ThingsModTab);
		test_leggings = new test_armor(test_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.ThingsModTab);
		test_boots = new test_armor(test_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.ThingsModTab);
		
		
	}
	
	public static void registry() {
		
		GameRegistry.register(test_item);
		
		GameRegistry.register(test_bag);
		
		GameRegistry.register(test_helmet);
		GameRegistry.register(test_chestplate);
		GameRegistry.register(test_leggings);
		GameRegistry.register(test_boots);
		
		
	}
	
	public static void registerRenders() {
		
		registerRender(test_item);
		
		registerRender(test_bag);
		
		registerRender(test_helmet);
		registerRender(test_chestplate);
		registerRender(test_leggings);
		registerRender(test_boots);

		
		
		
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		
	    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
		
	}
	
	
}
