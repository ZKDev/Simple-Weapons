package dev.zeekay.simpleweapons.items.weapons;

import dev.zeekay.simpleweapons.Main;
import dev.zeekay.simpleweapons.init.ModItems;
import dev.zeekay.simpleweapons.items.item.ItemSlingshotAmmo;
import dev.zeekay.simpleweapons.util.IHasModel;
import dev.zeekay.simpleweapons.util.Ref;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;

public class WeaponSlingshot extends ItemBow implements IHasModel {

    public WeaponSlingshot(String name) {
        super();
        this.maxStackSize = 1;
        this.setMaxDamage(192);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Ref.tabSimpleWeapons);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.Proxy.registerItemRenderer(this, 0, "inventory");
    }

    private ItemStack findAmmo(EntityPlayer player)
    {
        if (this.isArrow(player.getHeldItem(EnumHand.OFF_HAND)))
        {
            return player.getHeldItem(EnumHand.OFF_HAND);
        }
        else if (this.isArrow(player.getHeldItem(EnumHand.MAIN_HAND)))
        {
            return player.getHeldItem(EnumHand.MAIN_HAND);
        }
        else
        {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i)
            {
                ItemStack itemstack = player.inventory.getStackInSlot(i);

                if (this.isArrow(itemstack))
                {
                    return itemstack;
                }
            }

            return ItemStack.EMPTY;
        }
    }

    @Override
    protected boolean isArrow(ItemStack stack)
    {
        return stack.getItem() instanceof ItemSlingshotAmmo;
    }


}
