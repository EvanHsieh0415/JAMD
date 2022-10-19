package com.unrealdinnerbone.jamd.forge;

import com.unrealdinnerbone.jamd.JAMD;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(JAMD.MOD_ID)
public class JAMDForge {
    public JAMDForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(JAMD.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(DataEvent::onData);
        JAMD.init();
    }
}
