package com.easynull.nullspromo.init;

import com.easynull.nullspromo.NullsPromo;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.*;

public class ModInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NullsPromo.ID);

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NullsPromo.ID);

    public static void register(IEventBus bus){
        ITEMS.register(bus);
        BLOCKS.register(bus);
    }
}
