package com.sewef.underthesea.item;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ItemTurtleShell extends ItemArmor {
    public static final ArmorMaterial SCUTE = EnumHelper.addArmorMaterial("scute", "underthesea:turtle", 276, new int[]{0, 0, 0, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0F);
    
    public ItemTurtleShell (String name, CreativeTabs tab, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
    
    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (!player.isInsideOfMaterial(Material.WATER)) {
            player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 10*20));
        }
    }
}
