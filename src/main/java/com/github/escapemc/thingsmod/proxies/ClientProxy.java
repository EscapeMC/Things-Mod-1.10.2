package com.github.escapemc.thingsmod.proxies;

import com.github.escapemc.thingsmod.init.ModBlocks;
import com.github.escapemc.thingsmod.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {

		ModItems.registerRenders();
		ModBlocks.registerRenders();
		
	}


	
}
