package com.wildabeast.yourmodid.registry;

import com.wildabeast.yourmodid.wildacraft;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class WCBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(wildacraft.MOD_ID);

    //Blocks go here

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }

    private static DeferredBlock<Block> registerWithItem(String blockID, Supplier<? extends Block> sup) {
        DeferredBlock<Block> block = registerWithNoItem(blockID, sup);
        WCItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    private static DeferredBlock<Block> registerWithNoItem(String blockID, Supplier<? extends Block> sup) {
        return BLOCKS.register(blockID, sup);
    }

}