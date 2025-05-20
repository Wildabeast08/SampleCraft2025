package com.wildabeast.yourmodid;

import com.wildabeast.yourmodid.registry.WCBlocks;
import com.wildabeast.yourmodid.registry.WCCreativeModeTabs;
import com.wildabeast.yourmodid.registry.WCItems;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(wildacraft.MOD_ID)
public class wildacraft {
    public static final String MOD_ID = "wildacraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public wildacraft(IEventBus modEventBus, ModContainer modContainer) {
        WCBlocks.register(modEventBus);
        WCItems.register(modEventBus);
        WCCreativeModeTabs.register(modEventBus);
    }

}