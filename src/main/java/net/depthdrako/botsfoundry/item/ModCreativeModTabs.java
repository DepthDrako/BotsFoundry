package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
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

public static final RegistryObject<CreativeModeTab> FOUNDRY_TAB = CREATIVE_MODE_TABS.register("foundry_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                .title(Component.translatable("creativetab.foundry_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.SAPPHIRE.get());
                    output.accept(ModItems.RAW_SAPPHIRE.get());
                    output.accept(ModItems.BUSTER_SWORD.get());

                })
                .build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
    }
}
