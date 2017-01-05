package com.github.escapemc.thingsmod.client.gui;

import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class gui_test_chest extends GuiContainer {
	
	private TileEntityTestChest te;
	private static ResourceLocation TEST_CHEST_GUI_TEXTURE;


	public gui_test_chest(Container inventorySlotsIn, TileEntityTestChest te) {
		super(inventorySlotsIn);
		this.te = te;
		TEST_CHEST_GUI_TEXTURE = new ResourceLocation("tm:textures/gui/container/test_chest.png");
		this.ySize = 195;
		this.xSize = 176;
	}

	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(new TextComponentTranslation("container.test_chest", new Object[0]).getUnformattedText(), 8, 3, 4210752);
		this.fontRendererObj.drawString(new TextComponentTranslation("container.inventory", new Object[0]).getUnformattedText(), 8, 103, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(TEST_CHEST_GUI_TEXTURE);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
		
	}
}