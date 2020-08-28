package com.wzhrdx.XenoAge.item;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.item.Item;

public class ItemSilverPowder extends Item {
    public ItemSilverPowder(){
        this.setTranslationKey(XenoAge.MODID + ".silverpowder");
        this.setRegistryName("silver_powder");
        this.setMaxStackSize(16);
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
    }
}
