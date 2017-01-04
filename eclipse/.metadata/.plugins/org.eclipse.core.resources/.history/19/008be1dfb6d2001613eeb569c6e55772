package com.github.escapemc.thingsmod.handlers;

import com.github.escapemc.thingsmod.client.gui.GuiTestBag;
import com.github.escapemc.thingsmod.client.gui.gui_test_chest;
import com.github.escapemc.thingsmod.container.ContainerTestBag;
import com.github.escapemc.thingsmod.container.ContainerTestChest;
import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static final int TEST_CHEST = 37;
	public static final int TEST_BAG = 38;
	
	
	

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		if(ID == TEST_CHEST) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if(tileEntity instanceof TileEntityTestChest){
				return new ContainerTestChest(player.inventory, (TileEntityTestChest) tileEntity);
			}
		}
		if(ID == TEST_BAG) {
			return new ContainerTestBag(player.inventory);

		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		if(ID == TEST_CHEST) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if(tileEntity instanceof TileEntityTestChest){
				return new gui_test_chest(new ContainerTestChest(player.inventory, (TileEntityTestChest)tileEntity), (TileEntityTestChest) tileEntity);
			}
		if(ID == TEST_BAG) {	
			
			return new GuiTestBag(new ContainerTestBag(player.inventory));

			
		}
		
		}
		return null;
	}


}