package com.wildabeast.yourmodid.events;


import com.wildabeast.yourmodid.wildacraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;

@EventBusSubscriber(modid = wildacraft.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class WCEvents {

    @SubscribeEvent
    public static void doAThing(LivingDamageEvent.Pre event) {

    }

}