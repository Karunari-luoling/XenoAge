
package com.wzhrdx.XenoAge.creativetab;

import com.wzhrdx.XenoAge.item.ItemRegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabXenoAge extends CreativeTabs {
    public static final TabXenoAge TAB_XENO_AGE = new TabXenoAge();
    public TabXenoAge(){
        super("xenoage");
    }
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ItemRegistryHandler.SILVER_NUGGET);
    }

}
