package com.micknick18.modlearning.init;

import com.micknick18.modlearning.item.ItemML;
import com.micknick18.modlearning.item.ItemMapleLeaf;
import com.micknick18.modlearning.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)

public class ModItems
{
    public static final ItemML mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
