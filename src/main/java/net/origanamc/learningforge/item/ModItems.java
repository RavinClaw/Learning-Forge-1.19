package net.origanamc.learningforge.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.origanamc.learningforge.LearningForge;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LearningForge.MOD_ID);


    // Adds an item called Zircon to the `mod index`
    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNINGFORGE_TAB)));

    // Adds an item called Raw Zircon to the `mod index`
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LEARNINGFORGE_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
