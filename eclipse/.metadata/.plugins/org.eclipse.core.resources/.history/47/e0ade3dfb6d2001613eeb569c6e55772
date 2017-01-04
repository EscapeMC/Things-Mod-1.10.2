package com.github.escapemc.thingsmod.client.gui;

import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class GuiTestBag extends GuiContainer {
	
	private static ResourceLocation TEST_BAG_GUI_TEXTURE;


	public GuiTestBag(Container inventorySlotsIn) {
		super(inventorySlotsIn);
		TEST_BAG_GUI_TEXTURE = new ResourceLocation("tm:textures/gui/container/test_bag.png");
		this.ySize = 141;
		this.xSize = 176;
	}

	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(new TextComponentTranslation("container.test_bag", new Object[0]).getUnformattedText(), 8, 3, 4210752);
		this.fontRendererObj.drawString(new TextComponentTranslation("container.inventory", new Object[0]).getUnformattedText(), 8, 48, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(TEST_BAG_GUI_TEXTURE);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
		
	}
}