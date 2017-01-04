package com.github.escapemc.thingsmod;

public class Reference {

	public static final String MOD_ID = "tm";
	public static final String MOD_VERSION = "1.1.0.1";
	public static final String MOD_NAME = "Things Mod";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	
	public static final String CLIENT_PROXY_CLASS = "com.github.escapemc.thingsmod.proxies.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.github.escapemc.thingsmod.proxies.ServerProxy";

	
	
	
	
	
	
	public static enum ModItems {
	
	
		TEST_ITEM("test_item", "test_item"),
		
		TEST_BLOCK("test_block", "test_block"),
		
		TEST_HELMET("test_helmet", "test_helmet"),
		TEST_CHESTPLATE("test_chestplate", "test_chestplate"),
		TEST_LEGGINGS("test_leggings", "test_leggings"),
		TEST_BOOTS("test_boots", "test_boots"),
		
		TEST_BAG("test_bag", "test_bag"),
		
		TEST_CHEST("test_chest", "test_chest");
	
	
	
	
		private String unlocalizedName;
		private String registryName;
		
	
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		
		
		
		}
	
		public String getUnlocalizedName() {
		
			return unlocalizedName;
		
		}
	
		public String getRegistryName() {
		
			return registryName;
		
		}
	
	}
	
}


