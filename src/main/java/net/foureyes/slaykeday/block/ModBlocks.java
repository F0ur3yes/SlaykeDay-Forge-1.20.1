package net.foureyes.slaykeday.block;

import net.foureyes.slaykeday.SlaykeDay;
import net.foureyes.slaykeday.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SlaykeDay.MOD_ID);

    // BLOCKS START HERE //

    public static final RegistryObject<Block> BLACK_OPAL_ORE = registerBlock("black_opal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
    public static final RegistryObject<Block> DEEPSLATE_BLACK_OPAL_ORE = registerBlock("deepslate_black_opal_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    // BLOCKS END HERE //

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
