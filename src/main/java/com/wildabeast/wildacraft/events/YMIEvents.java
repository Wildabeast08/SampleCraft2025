package com.wildabeast.wildacraft.events;


import com.wildabeast.wildacraft.WildaCraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = WildaCraft.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class YMIEvents {

    @SubscribeEvent
    public static void doAThing(LivingDamageEvent.Pre event) {

    }

}