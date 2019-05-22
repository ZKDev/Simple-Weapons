package dev.zeekay.simpleweapons.items.armor;

import dev.zeekay.simpleweapons.Main;
import dev.zeekay.simpleweapons.init.ModItems;
import dev.zeekay.simpleweapons.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.Proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
