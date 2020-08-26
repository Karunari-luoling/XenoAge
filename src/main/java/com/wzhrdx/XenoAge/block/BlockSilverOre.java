package com.wzhrdx.XenoAge.block;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSilverOre extends Block {

    public BlockSilverOre(){
        super(Material.ROCK);
        this.setTranslationKey(XenoAge.MODID + ".silverore");
        this.setRegistryName("silver_ore");
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
    }
}
