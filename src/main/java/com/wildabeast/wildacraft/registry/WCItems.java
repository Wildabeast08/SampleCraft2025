package com.wildabeast.wildacraft.registry;

import com.wildabeast.wildacraft.WildaCraft;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


public class WCItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WildaCraft.MOD_ID);

    //Items go here
    public static final DeferredItem<Item> COSMOS_ITEM = ITEMS.register( "ark_of_cosmos",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ELEMENTS_ITEM = ITEMS.register( "ark_of_elements",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ANCIENTS_ITEM = ITEMS.register( "ark_of_ancients",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRACTURED_ITEM = ITEMS.register( "fractured_ark",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MURASAMA_ITEM = ITEMS.register( "murasama_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHEATHED_MURASAMA_ITEM = ITEMS.register( "sheathed_murasama_sword",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZENITH_ITEM = ITEMS.register( "zenith_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DEATHS_ASCENSION_ITEM = ITEMS.register( "deaths_ascension",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HOLY_COLLIDER_ITEM = ITEMS.register( "holy_collider",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}