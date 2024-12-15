package com.easynull.nullspromo;

import com.easynull.nullspromo.client.utils.ClientUtil;
import com.easynull.nullspromo.init.ModInit;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(NullsPromo.ID)
public class NullsPromo {
    public static final String ID = "nullspromo";
    private static final Logger LOGGER = LogUtils.getLogger();

    public NullsPromo(){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        ModInit.register(eventBus);
        eventBus.addListener(this::setup);
        eventBus.addListener(this::client);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    }

    private void client(final FMLClientSetupEvent event){
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        forgeBus.addListener(ClientUtil::clientTick);
    }

    private void enqueueIMC(final InterModEnqueueEvent event){
    }

    private void processIMC(final InterModProcessEvent event){
    }
}
