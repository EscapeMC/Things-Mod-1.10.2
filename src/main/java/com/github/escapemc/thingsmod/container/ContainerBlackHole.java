package com.github.escapemc.thingsmod.container;

import com.github.escapemc.thingsmod.hardlib.api.internal.CommonContainerBlackHole;
import com.github.escapemc.thingsmod.hardlib.api.inventory.SlotItem;
import com.github.escapemc.thingsmod.tileentity.TileEntityBlackHole;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerBlackHole extends CommonContainerBlackHole {
	TileEntityBlackHole tileEntity;
    private int numRows = 9;


	public ContainerBlackHole(InventoryPlayer inventory, TileEntityBlackHole te) {
		super(inventory, inventory, null);
		tileEntity = te;
		IItemHandler inven = tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
        for (int j = 0; j < this.numRows; ++j)
        {
            for (int k = 0; k < 18; ++k)
            {
                this.addSlotToContainer(new SlotItem(inven, k + j * 18, 8 + k * 18, 12 + j * 18));
            }
        }
		
		
		}
}
