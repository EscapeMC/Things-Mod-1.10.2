package com.github.escapemc.thingsmod.blocks;

import com.github.escapemc.thingsmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class test_block extends Block {

	public test_block(Material materialIn) {
		super(materialIn);

		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(15);
		this.setHardness(0.6F);
		
		
		setUnlocalizedName(Reference.ModItems.TEST_BLOCK.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TEST_BLOCK.getRegistryName());
	
	
	}

}
