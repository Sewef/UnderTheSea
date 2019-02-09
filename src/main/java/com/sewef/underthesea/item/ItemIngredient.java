package com.sewef.underthesea.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemIngredient extends Item {
    
    public ItemIngredient(String name) {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
    }
    
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return stack.getUnlocalizedName().equals("item.heart_of_the_sea") ? EnumRarity.UNCOMMON : EnumRarity.COMMON;
    }
}
