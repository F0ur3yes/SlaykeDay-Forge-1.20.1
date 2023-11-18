package net.foureyes.slaykeday.item;

import net.foureyes.slaykeday.SlaykeDay;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SlaykeDay.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SLAYKE_DAY_TAB = CREATIVE_MODE_TABS.register("slayke_day",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SLAYKINITE_INGOT.get()))
                    .title(Component.translatable("creativetab.slayke_day"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_SLAYKINITE.get());
                        pOutput.accept(ModItems.SLAYKINITE_INGOT.get());
                        pOutput.accept(ModItems.SLAYKINITE_NUGGET.get());
                        pOutput.accept(ModItems.BLACK_OPAL.get());
                        pOutput.accept(ModItems.NETHERITE_ROD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
