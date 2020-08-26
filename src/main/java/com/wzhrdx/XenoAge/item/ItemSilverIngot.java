package com.wzhrdx.XenoAge.item;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.item.Item;

public class ItemSilverIngot extends Item {
    public ItemSilverIngot() {
        this.setMaxStackSize(64);
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
        this.setTranslationKey(XenoAge.MODID + ".silveringot");
        this.setRegistryName("silver_ingot");
    }
}
