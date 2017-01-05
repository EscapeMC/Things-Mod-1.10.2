package com.github.escapemc.thingsmod.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TileEntityBlackHole extends TileEntity {


	private String customName;
	protected ItemStackHandler inputSlot;

	public TileEntityBlackHole() {
		inputSlot = new ItemStackHandler(171);
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setTag("inputSlot", inputSlot.serializeNBT());

		return compound;
	}

	
	@Override
	public void readFromNBT(NBTTagCompound compound) {
		inputSlot.deserializeNBT(compound.getCompoundTag("inputSlot"));
		super.readFromNBT(compound);
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			this.markDirty();
			if(worldObj != null && worldObj.getBlockState(pos).getBlock() != getBlockType()) {
				return (T) inputSlot;
			}
			if(facing == null) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.UP) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.DOWN) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.NORTH) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.EAST) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.WEST) {
				return (T) inputSlot;
			}
			if(facing == EnumFacing.SOUTH) {
				return (T) inputSlot;
			}
		}
		return super.getCapability(capability, facing);
	}	

	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return this.getCapability(capability, facing) != null;
	}

	public void setCustomName(String customName) {
		this.customName = customName;
	}

	
	
}