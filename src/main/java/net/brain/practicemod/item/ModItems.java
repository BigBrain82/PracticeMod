package net.brain.practicemod.item;

import net.brain.practicemod.PracticeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PracticeMod.MOD_ID);

    public static final RegistryObject<Item> BRAINITE = ITEMS.register("brainite",
        () -> new Item(new Item.Properties().setId(ITEMS.key("brainite"))));

    public static final RegistryObject<Item> RAW_BRAINITE = ITEMS.register("raw_brainite",
            () -> new Item(new Item.Properties().setId(ITEMS.key("raw_brainite"))));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
