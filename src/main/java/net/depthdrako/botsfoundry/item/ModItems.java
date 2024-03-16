package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BotsFoundry.MOD_ID);
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BUSTER_SWORD = ITEMS.register("buster_sword",
            () -> new SwordItem(ModToolTeirs.BUSTER, 5, 4, new Item.Properties()));


    public static void register(IEventBus eventBus) {
          ITEMS.register(eventBus);
    }
}
