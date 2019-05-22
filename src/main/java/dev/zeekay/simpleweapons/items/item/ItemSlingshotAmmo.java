package dev.zeekay.simpleweapons.items.item;

import dev.zeekay.simpleweapons.Main;
import dev.zeekay.simpleweapons.init.ModItems;
import dev.zeekay.simpleweapons.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSlingshotAmmo extends Item implements IHasModel {

    public ItemSlingshotAmmo(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.Proxy.registerItemRenderer(this, 0, "inventory");
    }

}
