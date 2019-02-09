package com.sewef.underthesea.item;

import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemDriedKelp extends ItemFood {

    public ItemDriedKelp() {
        super(1, 0.6F, false);
        setUnlocalizedName("dried_kelp");
        setRegistryName("dried_kelp");
    }
    
    @Override
    public int getMaxItemUseDuration(ItemStack stack) {
        // Dried Kelp is faster to eat. Getting the original ItemFood use duration and dividing.
        return itemUseDuration/2;
    }
}
