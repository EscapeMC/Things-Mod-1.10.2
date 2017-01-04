package com.github.escapemc.thingsmod.container;

import com.github.escapemc.thingsmod.hardlib.api.internal.CommonContainer9x5;
import com.github.escapemc.thingsmod.hardlib.api.inventory.SlotItem;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerTestBag extends CommonContainer9x5 {
    private int numRows = 2;


	public ContainerTestBag(InventoryPlayer inventory) {
		super(inventory, inventory, null);
		IItemHandler inven = inventory.player.getHeldItem(EnumHand.MAIN_HAND).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
        for (int j = 0; j < this.numRows; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new SlotItem(inven, k + j * 9, 8 + k * 18, 12 + j * 18));
            }
        }
		
		
		}
}
