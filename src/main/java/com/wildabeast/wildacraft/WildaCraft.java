package com.wildabeast.wildacraft;

import com.wildabeast.wildacraft.registry.WCBlocks;
import com.wildabeast.wildacraft.registry.WCCreativeModeTabs;
import com.wildabeast.wildacraft.registry.WCItems;



import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(WildaCraft.MOD_ID)
public class WildaCraft {
    public static final String MOD_ID = "wildacraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WildaCraft(IEventBus modEventBus, ModContainer modContainer) {
        WCBlocks.register(modEventBus);
        WCItems.register(modEventBus);
        WCCreativeModeTabs.register(modEventBus);
    }

}