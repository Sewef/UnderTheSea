package com.sewef.underthesea.init;

import com.sewef.underthesea.UnderTheSea;
import com.sewef.underthesea.item.ItemDriedKelp;
import com.sewef.underthesea.item.ItemIngredient;
import com.sewef.underthesea.item.ItemTurtleShell;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=UnderTheSea.MODID)
public class UnderTheSeaItems {
    
    // Full list
    public static final List<Item> ALLITEMS = new ArrayList<>();
    
    public static void init() {
        
        // Crafting materials, useless alone
        ALLITEMS.add(new ItemIngredient("scute"));
        ALLITEMS.add(new ItemIngredient("nautilus_shell"));
        ALLITEMS.add(new ItemIngredient("heart_of_the_sea"));
        
        // Food
        ALLITEMS.add(new ItemDriedKelp());
        
        // Armor
        ALLITEMS.add(new ItemTurtleShell("turtle_helmet", CreativeTabs.COMBAT, ItemTurtleShell.SCUTE, 2, EntityEquipmentSlot.HEAD));
        
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        for (Item theItem : ALLITEMS)
            event.getRegistry().registerAll(theItem);
    }
    
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Item theItem : ALLITEMS)
            registerRender(theItem);
    }
        
    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
    }
}
