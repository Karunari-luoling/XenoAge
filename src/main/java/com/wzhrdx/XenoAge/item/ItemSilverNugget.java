package com.wzhrdx.XenoAge.item;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.item.Item;

public class ItemSilverNugget extends Item {

    public ItemSilverNugget() {
        this.setMaxStackSize(64);
        this.setTranslationKey(XenoAge.MODID + ".silvernugget");
        this.setRegistryName("silver_nugget");
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
    }
}