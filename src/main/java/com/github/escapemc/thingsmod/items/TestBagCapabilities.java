package com.github.escapemc.thingsmod.items;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

public class TestBagCapabilities implements ICapabilitySerializable {

	protected ItemStackHandler inputSlot;

	public TestBagCapabilities() {
		inputSlot = new ItemStackHandler(18);

		
		
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return this.getCapability(capability, facing) != null;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if(capability == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			return (T) inputSlot;
		}
		return null;
	}

	@Override
	public NBTBase serializeNBT() {
		NBTTagCompound NBTBase = new NBTTagCompound();
		((NBTTagCompound)NBTBase).setTag("inputSlot", inputSlot.serializeNBT());
		return NBTBase;
		
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		inputSlot.deserializeNBT(((NBTTagCompound) nbt).getCompoundTag("inputSlot"));

		
	}


}
