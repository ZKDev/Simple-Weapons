package dev.zeekay.simpleweapons.util;

import dev.zeekay.simpleweapons.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Ref {

	public static final String MOD_ID = "simpleweapons";
	public static final String NAME = "Simple Weapons";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	public static final String CLIENT_PROXY_CLASS = "dev.zeekay.simpleweapons.proxy.ClientProxy";
	public static final String COMMON_PROXY_CLASS = "dev.zeekay.simpleweapons.proxy.CommonProxy";
	
	public static final CreativeTabs tabSimpleWeapons = new CreativeTabs(MOD_ID) {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.IRON_BATTLE_AXE);
		}
		
		public String getTranslatedTabLabel(){
			return "Simple Weapons";
		}
	};
	
}
