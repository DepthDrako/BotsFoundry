package net.depthdrako.botsfoundry.block;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.fluid.ModFluids;
import net.depthdrako.botsfoundry.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Locale;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BotsFoundry.MOD_ID);

    public static final  RegistryObject<Block> COMPRESSED_COBBLESTONE_X9 = registerBlock("blocks/compressed_cobblestonex9",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.ANCIENT_DEBRIS).noOcclusion()));

    //FLuids
    public static final RegistryObject<LiquidBlock> MOLTEN_IRON_BLOCK = BLOCKS.register("molten_iron_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_IRON, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));
    public static final RegistryObject<LiquidBlock> MOLTEN_GOLD_BLOCK = BLOCKS.register("molten_gold_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_GOLD, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));
    public static final RegistryObject<LiquidBlock> MOLTEN_COPPER_BLOCK = BLOCKS.register("molten_copper_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_COPPER, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));
    public static final RegistryObject<LiquidBlock> MOLTEN_NETHERITE_BLOCK = BLOCKS.register("molten_netherite_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_NETHERITE, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));
    public static final RegistryObject<LiquidBlock> MOLTEN_DEBRIS_BLOCK = BLOCKS.register("molten_debris_block",
            () -> new LiquidBlock(ModFluids.SOURCE_MOLTEN_DEBRIS, BlockBehaviour.Properties.copy(Blocks.LAVA).noLootTable()));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
