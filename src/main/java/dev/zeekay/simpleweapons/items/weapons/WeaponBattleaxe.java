package dev.zeekay.simpleweapons.items.weapons;

import dev.zeekay.simpleweapons.Main;
import dev.zeekay.simpleweapons.init.ModItems;
import dev.zeekay.simpleweapons.items.api.ABattleaxe;
import dev.zeekay.simpleweapons.util.IHasModel;
import dev.zeekay.simpleweapons.util.Ref;

public class WeaponBattleaxe extends ABattleaxe implements IHasModel {

	public WeaponBattleaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Ref.tabSimpleWeapons);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.Proxy.registerItemRenderer(this, 0, "inventory");
	}
}