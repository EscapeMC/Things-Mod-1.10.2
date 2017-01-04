package com.github.escapemc.thingsmod;

import com.github.escapemc.thingsmod.init.ModBlocks;
import com.github.escapemc.thingsmod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting() {
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.test_furnace), new Object[] {"III", "ICI", "III", 'I', ModItems.test_item, 'C', Blocks.FURNACE});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.test_block), new Object[] {" I ", "III", " I ", 'I', ModItems.test_item});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.test_chest), new Object[] {"III", "ICI", "III", 'I', ModItems.test_item, 'C', Blocks.CHEST});

		GameRegistry.addRecipe(new ItemStack(ModItems.test_bag), new Object[] {"III", "I I", "III", 'I', ModItems.test_item});

		
		GameRegistry.addSmelting(ModBlocks.test_block, new ItemStack(ModItems.test_item), 5.0F);
		
		
			
	}
	
}
