package dev.zeekay.simpleweapons.init;

import java.util.ArrayList;
import java.util.List;

import dev.zeekay.simpleweapons.items.ItemBase;
import dev.zeekay.simpleweapons.items.api.ABattleaxe;
import dev.zeekay.simpleweapons.items.api.ASpear;
import dev.zeekay.simpleweapons.items.api.ASword;
import dev.zeekay.simpleweapons.items.item.ItemSlingshotAmmo;
import dev.zeekay.simpleweapons.items.weapons.*;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Battleaxes
	public static final ABattleaxe DIAMOND_BATTLE_AXE = new WeaponBattleaxe("diamond_battle_axe", ToolMaterial.DIAMOND);
	public static final ABattleaxe GOLD_BATTLE_AXE = new WeaponBattleaxe("gold_battle_axe", ToolMaterial.GOLD);
	public static final ABattleaxe IRON_BATTLE_AXE = new WeaponBattleaxe("iron_battle_axe", ToolMaterial.IRON);
	public static final ABattleaxe WOOD_BATTLE_AXE = new WeaponBattleaxe("wood_battle_axe", ToolMaterial.WOOD);
	
	//Broadswords
	public static final ASword DIAMOND_BROAD_SWORD = new WeaponBroadsword("diamond_broad_sword", ToolMaterial.DIAMOND);
	public static final ASword GOLD_BROAD_SWORD = new WeaponBroadsword("gold_broad_sword", ToolMaterial.GOLD);
	public static final ASword IRON_BROAD_SWORD = new WeaponBroadsword("iron_broad_sword", ToolMaterial.IRON);
	public static final ASword WOOD_BROAD_SWORD = new WeaponBroadsword("wood_broad_sword", ToolMaterial.WOOD);
	
	//Longswords
	public static final ASword DIAMOND_LONG_SWORD = new WeaponLongsword("diamond_long_sword", ToolMaterial.DIAMOND);
	public static final ASword GOLD_LONG_SWORD = new WeaponLongsword("gold_long_sword", ToolMaterial.GOLD);
	public static final ASword IRON_LONG_SWORD = new WeaponLongsword("iron_long_sword", ToolMaterial.IRON);
	public static final ASword WOOD_LONG_SWORD = new WeaponLongsword("wood_long_sword", ToolMaterial.WOOD);
	
	//Shortswords
	public static final ASword DIAMOND_SHORT_SWORD = new WeaponShortsword("diamond_short_sword", ToolMaterial.DIAMOND);
	public static final ASword GOLD_SHORT_SWORD = new WeaponShortsword("gold_short_sword", ToolMaterial.GOLD);
	public static final ASword IRON_SHORT_SWORD = new WeaponShortsword("iron_short_sword", ToolMaterial.IRON);
	public static final ASword WOOD_SHORT_SWORD = new WeaponShortsword("wood_short_sword", ToolMaterial.WOOD);
	
	//Spears
	public static final ASpear DIAMOND_SPEAR = new WeaponSpear("diamond_spear", ToolMaterial.DIAMOND);
	public static final ASpear GOLD_SPEAR = new WeaponSpear("gold_spear", ToolMaterial.GOLD);
	public static final ASpear IRON_SPEAR = new WeaponSpear("iron_spear", ToolMaterial.IRON);
	public static final ASpear WOOD_SPEAR = new WeaponSpear("wood_spear", ToolMaterial.WOOD);

	//Slingshot
	public static final WeaponSlingshot SLINGSHOT = new WeaponSlingshot("slingshot");
	public static final ItemSlingshotAmmo SLINGSHOT_AMMO = new ItemSlingshotAmmo("slingshot_ammo");
}
