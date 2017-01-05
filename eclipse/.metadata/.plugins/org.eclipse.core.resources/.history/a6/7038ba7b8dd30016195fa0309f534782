package com.github.escapemc.thingsmod.items;

import javax.annotation.Nullable;

import com.github.escapemc.thingsmod.Main;
import com.github.escapemc.thingsmod.Reference;
import com.github.escapemc.thingsmod.handlers.GuiHandler;
import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.client.CPacketPlayer.Position;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class test_bag extends Item {
	
	public test_bag() {
		
		this.setMaxStackSize(1);
		setUnlocalizedName(Reference.ModItems.TEST_BAG.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TEST_BAG.getRegistryName());
	
	}
	
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound nbt) {
		return new TestBagCapabilities();
	} 
		
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
	
		playerIn.openGui(Main.instance, GuiHandler.TEST_BAG, worldIn, 0, 0, 0);
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemStackIn);
		
	}
	
}
