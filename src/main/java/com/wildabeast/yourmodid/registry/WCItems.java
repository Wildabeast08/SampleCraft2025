package com.wildabeast.yourmodid.registry;

import com.wildabeast.yourmodid.wildacraft;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class WCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(wildacraft.MOD_ID);

    //Items go here

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}