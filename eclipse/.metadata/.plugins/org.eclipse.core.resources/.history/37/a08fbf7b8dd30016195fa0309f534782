package com.github.escapemc.thingsmod.hardlib.api.inventory;

import com.github.escapemc.thingsmod.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotBag extends SlotItemHandler {

	public SlotBag(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
		super(itemHandler, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		
		if(stack.getItem() == ModItems.test_bag){
		return false;
		
		}
	
		return true;
	
	}
}