package com.wildabeast.wildacraft.registry;

import com.wildabeast.wildacraft.WildaCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@EventBusSubscriber(modid = WildaCraft.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class WCCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WildaCraft.MOD_ID);

    //Creative mode tabs go here

    public static void register(IEventBus bus) {
        CREATIVE_MODE_TABS.register(bus);
    }

    @SubscribeEvent
    private static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(WCItems.COSMOS_ITEM);
            event.accept(WCItems.ELEMENTS_ITEM);
            event.accept(WCItems.ANCIENTS_ITEM);
            event.accept(WCItems.FRACTURED_ITEM);
            event.accept(WCItems.MURASAMA_ITEM);
            event.accept(WCItems.SHEATHED_MURASAMA_ITEM);
            event.accept(WCItems.ZENITH_ITEM);
            event.accept(WCItems.DEATHS_ASCENSION_ITEM);
            event.accept(WCItems.HOLY_COLLIDER_ITEM);
        }
    }

}