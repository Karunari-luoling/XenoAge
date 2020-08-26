package com.wzhrdx.XenoAge;

import com.wzhrdx.XenoAge.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = XenoAge.MODID, name = XenoAge.NAME, version = XenoAge.VERSION, acceptedMinecraftVersions = "1.12.2")
public class XenoAge {
    public static final String MODID = "xenoage";
    public static final String NAME = "Xeno Age";
    public static final String VERSION = "1.0.0";
    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
 /**
    public static final CreativeTabs TAB_XENO_AGE= new CreativeTabs(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemRegistryHandler.SILVER_NUGGET);
        }

    }; **/
}
