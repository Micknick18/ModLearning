package com.micknick18.modlearning.init;

import com.micknick18.modlearning.item.ItemML;
import com.micknick18.modlearning.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemML mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
