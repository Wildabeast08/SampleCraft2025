package com.wildabeast.yourmodid.registry;

import com.wildabeast.yourmodid.wildacraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WCCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, wildacraft.MOD_ID);

    //Creative mode tabs go here

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

}