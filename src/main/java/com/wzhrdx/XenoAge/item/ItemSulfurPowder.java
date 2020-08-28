package com.wzhrdx.XenoAge.item;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.item.Item;

public class ItemSulfurPowder extends Item {
    public ItemSulfurPowder(){
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
        this.setMaxStackSize(16);
        this.setRegistryName("sulfur_powder");
        this.setTranslationKey(XenoAge.MODID + ".sulfurpowder");
    }
}
