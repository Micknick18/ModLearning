package com.micknick18.modlearning.init;

import com.micknick18.modlearning.block.BlockFlag;
import com.micknick18.modlearning.block.BlockML;
import com.micknick18.modlearning.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{

    public static final BlockML flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, "flag");
    }
}
