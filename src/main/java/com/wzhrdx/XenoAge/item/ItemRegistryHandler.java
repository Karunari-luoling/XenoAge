package com.wzhrdx.XenoAge.item;

import com.wzhrdx.XenoAge.block.BlockRegistryHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistryHandler {

    public static Item SILVER_NUGGET = new ItemSilverNugget();
    public static final ItemBlock ITEM_SILVER_ORE = withRegistryName(new ItemBlock(BlockRegistryHandler.BLOCK_SILVER_ORE));
    public static Item SILVER_INGOT = new ItemSilverIngot();

    public static ItemBlock withRegistryName(ItemBlock item){
        item.setRegistryName(item.getBlock().getRegistryName());
        return item;
    }
    @SubscribeEvent
    public static void onRegistry(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(SILVER_NUGGET);
        registry.register(ITEM_SILVER_ORE);
        registry.register(SILVER_INGOT);
    }

    @SideOnly(Side.CLIENT)
    private static void registerModel (Item item){
        ModelResourceLocation modelResourceLocation = new ModelResourceLocation(item.getRegistryName(),"inventory");
        ModelLoader.setCustomModelResourceLocation(item,0, modelResourceLocation);
    }
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event){
        registerModel(SILVER_NUGGET);
        registerModel(ITEM_SILVER_ORE);
        registerModel(SILVER_INGOT);
    }

}
