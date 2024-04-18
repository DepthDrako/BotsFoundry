package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BotsFoundry.MOD_ID);

public static final RegistryObject<CreativeModeTab> FOUNDRY_MATERIALS = CREATIVE_MODE_TABS.register("foundry_materials",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOLTEN_IRON_BUCKET.get()))
                .title(Component.translatable("creativetab.foundry_materials"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.MOLTEN_IRON_BUCKET.get());
                    output.accept(ModItems.MOLTEN_GOLD_BUCKET.get());
                    output.accept(ModItems.MOLTEN_COPPER_BUCKET.get());
                    output.accept(ModItems.MOLTEN_NETHERITE_BUCKET.get());
                    output.accept(ModItems.MOLTEN_DEBRIS_BUCKET.get());
                    output.accept(ModItems.INGOT_CAST.get());
                    output.accept(ModItems.AXE_HEAD_CAST.get());
                    output.accept(ModItems.HOE_HEAD_CAST.get());
                    output.accept(ModItems.MEDIUM_HILT_CAST.get());
                    output.accept(ModItems.PICKAXE_HEAD_CAST.get());
                    output.accept(ModItems.SHOVEL_HEAD_CAST.get());
                    output.accept(ModItems.SMALL_BINDING_CAST.get());
                    output.accept(ModItems.SWORD_BLADE_CAST.get());
                    output.accept(ModItems.SCRAP_CAST.get());
                })
                .build());

    public static final RegistryObject<CreativeModeTab> FOUNDRY_PARTS = CREATIVE_MODE_TABS.register("foundry_parts",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_SWORD_BLADE.get()))
                    .title(Component.translatable("creativetab.foundry_parts"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //imprints
                        output.accept(ModItems.WOOD_AXE_HEAD.get());
                        output.accept(ModItems.WOOD_HOE_HEAD.get());
                        output.accept(ModItems.WOOD_SHOVEL_HEAD.get());
                        output.accept(ModItems.WOOD_PICKAXE_HEAD.get());
                        output.accept(ModItems.WOOD_BINDING_SMALL.get());
                        output.accept(ModItems.WOOD_SWORD_BLADE.get());
                        //iron.json
                        output.accept(ModItems.IRON_AXE_HEAD.get());
                        output.accept(ModItems.IRON_HOE_HEAD.get());
                        output.accept(ModItems.IRON_SHOVEL_HEAD.get());
                        output.accept(ModItems.IRON_PICKAXE_HEAD.get());
                        output.accept(ModItems.IRON_BINDING_SMALL.get());
                        output.accept(ModItems.IRON_SWORD_BLADE.get());
                        //GOlD
                        output.accept(ModItems.GOLD_AXE_HEAD.get());
                        output.accept(ModItems.GOLD_HOE_HEAD.get());
                        output.accept(ModItems.GOLD_SHOVEL_HEAD.get());
                        output.accept(ModItems.GOLD_PICKAXE_HEAD.get());
                        output.accept(ModItems.GOLD_BINDING_SMALL.get());
                        output.accept(ModItems.GOLD_SWORD_BLADE.get());
                        //NETHERITE
                        output.accept(ModItems.NETHERITE_AXE_HEAD.get());
                        output.accept(ModItems.NETHERITE_HOE_HEAD.get());
                        output.accept(ModItems.NETHERITE_SHOVEL_HEAD.get());
                        output.accept(ModItems.NETHERITE_PICKAXE_HEAD.get());
                        output.accept(ModItems.NETHERITE_BINDING_SMALL.get());
                        output.accept(ModItems.NETHERITE_SWORD_BLADE.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FOUNDRY_WEAPONS = CREATIVE_MODE_TABS.register("foundry_weapons",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.WOODEN_UCHIGATANA.get()))
                    .title(Component.translatable("creativetab.foundry_weapons"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //CRUDE
                        //IRON
                        output.accept(ModItems.CRUDE_IRON_SWORD.get());
                        //GOlD
                        output.accept(ModItems.CRUDE_GOLD_SWORD.get());
                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> FOUNDRY_TOOLS = CREATIVE_MODE_TABS.register("foundry_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUDE_IRON_PICKAXE.get()))
                    .title(Component.translatable("creativetab.foundry_tools"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //CRUDE
                        //IRON
                        output.accept(ModItems.CRUDE_IRON_AXE.get());
                        output.accept(ModItems.CRUDE_IRON_PICKAXE.get());
                        output.accept(ModItems.CRUDE_IRON_HOE.get());
                        output.accept(ModItems.CRUDE_IRON_SHOVEL.get());

                        //GOlD
                        output.accept(ModItems.CRUDE_GOLD_AXE.get());
                        output.accept(ModItems.CRUDE_GOLD_PICKAXE.get());
                        output.accept(ModItems.CRUDE_GOLD_HOE.get());
                        output.accept(ModItems.CRUDE_GOLD_SHOVEL.get());

                    })
                    .build());


        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }
}
