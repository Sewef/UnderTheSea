package com.sewef.underthesea;

import com.sewef.underthesea.init.UnderTheSeaItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = UnderTheSea.MODID, version = UnderTheSea.VERSION)
public class UnderTheSea {
    public static final String MODID = "underthesea";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        UnderTheSeaItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Under the sea, darling it's better, down where it's wetter, take it from me!");
    }
}