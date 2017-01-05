package com.github.escapemc.thingsmod.client.gui;

import com.github.escapemc.thingsmod.tileentity.TileEntityBlackHole;
import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentTranslation;

public class GuiBlackHole extends GuiContainer {
	
	private TileEntityBlackHole te;
	private static ResourceLocation TEST_BAG_GUI_TEXTURE;


	public GuiBlackHole(Container inventorySlotsIn, TileEntityBlackHole te) {
		super(inventorySlotsIn);
		this.te = te;
		TEST_BAG_GUI_TEXTURE = new ResourceLocation("tm:textures/gui/container/black_hole.png");
		this.ySize = 266;
		this.xSize = 338;
	}

	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(new TextComponentTranslation("container.black_hole", new Object[0]).getUnformattedText(), 8, 3, 4210752);
		this.fontRendererObj.drawString(new TextComponentTranslation("container.inventory", new Object[0]).getUnformattedText(), 128, 174, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);

		this.mc.getTextureManager().bindTexture(TEST_BAG_GUI_TEXTURE);
		int x = (width - xSize) / 2;
		int y = (height - ySize) / 2;
		this.drawModalRectWithCustomSizedTexture(x, y, 0, 0, xSize, ySize, 512, 512);
		//this.drawModalRectWithCustomSizedTexture(x, y, u, v, mouseY, y, textureWidth, textureHeight);
		//this.drawTexturedModalRect(xCoord, yCoord, textureSprite, widthIn, heightIn);
		//this.drawTexturedModalRect(x, y, 0, 0, xSize, ySize);

		
	}
}