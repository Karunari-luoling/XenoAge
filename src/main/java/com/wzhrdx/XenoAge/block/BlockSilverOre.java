package com.wzhrdx.XenoAge.block;

import com.wzhrdx.XenoAge.XenoAge;
import com.wzhrdx.XenoAge.creativetab.TabXenoAge;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemPickaxe;

public class BlockSilverOre extends Block {

    public BlockSilverOre(){
        super(Material.ROCK);
        this.setTranslationKey(XenoAge.MODID + ".silverore");
        this.setRegistryName("silver_ore");
        this.setCreativeTab(TabXenoAge.TAB_XENO_AGE);
        this.setHardness(5F);
        this.setHarvestLevel("pickaxe",2);
    }
}
