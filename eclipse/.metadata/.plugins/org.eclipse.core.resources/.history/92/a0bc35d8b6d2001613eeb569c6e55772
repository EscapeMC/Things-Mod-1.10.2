package com.github.escapemc.thingsmod;

import com.github.escapemc.thingsmod.handlers.GuiHandler;
import com.github.escapemc.thingsmod.init.ModBlocks;
import com.github.escapemc.thingsmod.init.ModItems;
import com.github.escapemc.thingsmod.proxies.CommonProxy;
import com.github.escapemc.thingsmod.tileentity.TileEntityTestChest;
import com.github.escapemc.thingsmod.tileentity.TileEntityTestFurnace;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)



public class Main {

	
	public static final ThingsModTab ThingsModTab = new ThingsModTab("ThingsModTab");
	
	
	
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.registry();
		ModBlocks.init();
		ModBlocks.registry();

		GameRegistry.registerTileEntity(TileEntityTestFurnace.class, Reference.MOD_ID + "TileEntityTestFurnace");
		GameRegistry.registerTileEntity(TileEntityTestChest.class, Reference.MOD_ID + "TileEntityTestChest");
		
		proxy.init();
	
				
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
	
		ModCrafting.initCrafting();
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
	
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");
	
	
	
	}

	
}
