package net.foureyes.slaykeday.item;

import net.foureyes.slaykeday.SlaykeDay;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SlaykeDay.MOD_ID);

    // ITEMS START HERE //

    public static final RegistryObject<Item> RAW_SLAYKINITE = ITEMS.register("raw_slaykinite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAYKINITE_INGOT = ITEMS.register("slaykinite_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SLAYKINITE_NUGGET = ITEMS.register("slaykinite_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_OPAL = ITEMS.register("black_opal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_ROD = ITEMS.register("netherite_rod",
            () -> new Item(new Item.Properties()));

    // ITEMS END HERE //

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
