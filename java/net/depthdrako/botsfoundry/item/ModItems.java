package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.fluid.ModFluids;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BotsFoundry.MOD_ID);


    //BUCKETS
    public static final RegistryObject<Item> MOLTEN_IRON_BUCKET = ITEMS.register("buckets/molten_iron_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_IRON, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_GOLD_BUCKET = ITEMS.register("buckets/molten_gold_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_GOLD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_COPPER_BUCKET = ITEMS.register("buckets/molten_copper_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_COPPER, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_NETHERITE_BUCKET = ITEMS.register("buckets/molten_netherite_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_NETHERITE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));
    public static final RegistryObject<Item> MOLTEN_DEBRIS_BUCKET = ITEMS.register("buckets/molten_debris_bucket",
            () -> new BucketItem(ModFluids.SOURCE_MOLTEN_DEBRIS, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)));



    //Casting Items
    public static final RegistryObject<Item> INGOT_CAST = ITEMS.register("casts/ingot_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SWORD_BLADE_CAST = ITEMS.register("casts/sword_blade_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PICKAXE_HEAD_CAST = ITEMS.register("casts/pickaxe_head_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> HOE_HEAD_CAST = ITEMS.register("casts/hoe_head_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SHOVEL_HEAD_CAST = ITEMS.register("casts/shovel_head_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> AXE_HEAD_CAST = ITEMS.register("casts/axe_head_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SMALL_BINDING_CAST = ITEMS.register("casts/small_binding_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MEDIUM_HILT_CAST = ITEMS.register("casts/medium_hilt_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SCRAP_CAST = ITEMS.register("casts/scrap_cast",
            () -> new Item(new Item.Properties().stacksTo(1)));



    //inprints
    public static final RegistryObject<Item> WOOD_AXE_HEAD = ITEMS.register("wood/axe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOOD_BINDING_SMALL = ITEMS.register("wood/binding_small",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOOD_HOE_HEAD = ITEMS.register("wood/hoe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOOD_PICKAXE_HEAD = ITEMS.register("wood/pickaxe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOOD_SHOVEL_HEAD = ITEMS.register("wood/shovel_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WOOD_SWORD_BLADE = ITEMS.register("wood/sword_blade",
            () -> new Item(new Item.Properties().stacksTo(1)));




    //Filled Casts
    //Ingot
    public static final RegistryObject<Item> IRON_FILLED_INGOT = ITEMS.register("casts/filled/iron/ingot/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_FILLED_CAST_INGOT = ITEMS.register("casts/filled/netherite/ingot/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> COPPER_FILLED_CAST_INGOT = ITEMS.register("casts/filled/copper/ingot/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_FILLED_CAST_INGOT = ITEMS.register("casts/filled/gold/ingot/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DEBRIS_FILLED_CAST_INGOT = ITEMS.register("casts/filled/debris/ingot/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Sword Blade
    public static final RegistryObject<Item> GOLD_SWORD_BLADE_CAST = ITEMS.register("casts/filled/gold/sword_blade/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_SWORD_BLADE_CAST = ITEMS.register("casts/filled/iron/sword_blade/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SWORD_BLADE_CAST = ITEMS.register("casts/filled/netherite/sword_blade/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Axe Head
    public static final RegistryObject<Item> GOLD_AXE_HEAD_CAST = ITEMS.register("casts/filled/gold/axe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_AXE_HEAD_CAST = ITEMS.register("casts/filled/iron/axe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_AXE_HEAD_CAST = ITEMS.register("casts/filled/netherite/axe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //PickAxe Head
    public static final RegistryObject<Item> GOLD_PICKAXE_HEAD_CAST = ITEMS.register("casts/filled/gold/pickaxe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD_CAST = ITEMS.register("casts/filled/iron/pickaxe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_PICKAXE_HEAD_CAST = ITEMS.register("casts/filled/netherite/pickaxe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Shovel Head
    public static final RegistryObject<Item> GOLD_SHOVEL_HEAD_CAST = ITEMS.register("casts/filled/gold/shovel_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD_CAST = ITEMS.register("casts/filled/iron/shovel_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_HEAD_CAST = ITEMS.register("casts/filled/netherite/shovel_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Hoe Head
    public static final RegistryObject<Item> GOLD_HOE_HEAD_CAST = ITEMS.register("casts/filled/gold/hoe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_HOE_HEAD_CAST = ITEMS.register("casts/filled/iron/hoe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_HOE_HEAD_CAST = ITEMS.register("casts/filled/netherite/hoe_head/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Small Binding
    public static final RegistryObject<Item> GOLD_SMALL_BINDING_CAST = ITEMS.register("casts/filled/gold/small_binding/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_SMALL_BINDING_CAST = ITEMS.register("casts/filled/iron/small_binding/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SMALL_BINDING_CAST = ITEMS.register("casts/filled/netherite/small_binding/cast",
            () -> new Item(new Item.Properties().stacksTo(1)));

    //Forged Tools Bits
    //iron
    public static final RegistryObject<Item> IRON_AXE_HEAD = ITEMS.register("forged_parts/iron/axe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_HOE_HEAD = ITEMS.register("forged_parts/iron/hoe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_SHOVEL_HEAD = ITEMS.register("forged_parts/iron/shovel_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_PICKAXE_HEAD = ITEMS.register("forged_parts/iron/pickaxe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_BINDING_SMALL = ITEMS.register("forged_parts/iron/binding_small",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_SWORD_BLADE = ITEMS.register("forged_parts/iron/sword_blade",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //gold
    public static final RegistryObject<Item> GOLD_AXE_HEAD = ITEMS.register("forged_parts/gold/gold_axe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_HOE_HEAD = ITEMS.register("forged_parts/gold/gold_hoe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_SHOVEL_HEAD = ITEMS.register("forged_parts/gold/gold_shovel_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_PICKAXE_HEAD = ITEMS.register("forged_parts/gold/gold_pickaxe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_BINDING_SMALL = ITEMS.register("forged_parts/gold/gold_binding_small",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_SWORD_BLADE = ITEMS.register("forged_parts/gold/gold_sword_blade",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //NETHERITE
    public static final RegistryObject<Item> NETHERITE_AXE_HEAD = ITEMS.register("forged_parts/netherite/netherite_axe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_HOE_HEAD = ITEMS.register("forged_parts/netherite/netherite_hoe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SHOVEL_HEAD = ITEMS.register("forged_parts/netherite/netherite_shovel_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_PICKAXE_HEAD = ITEMS.register("forged_parts/netherite/netherite_pickaxe_head",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_BINDING_SMALL = ITEMS.register("forged_parts/netherite/netherite_binding_small",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_SWORD_BLADE = ITEMS.register("forged_parts/netherite/netherite_sword_blade",
            () -> new Item(new Item.Properties().stacksTo(1)));
    //Tools
    //Crude
    //Iron
    public static final RegistryObject<Item> CRUDE_IRON_AXE = ITEMS.register("tools/crude/iron/axe",
            () -> new AxeItem(Tiers.IRON, 2,-3, new Item.Properties().durability(175)));
    public static final RegistryObject<Item> CRUDE_IRON_PICKAXE = ITEMS.register("tools/crude/iron/pickaxe",
            () -> new PickaxeItem(Tiers.IRON, 2,-3, new Item.Properties().durability(175)));
    public static final RegistryObject<Item> CRUDE_IRON_HOE = ITEMS.register("tools/crude/iron/hoe",
            () -> new HoeItem(Tiers.IRON, 2,-3, new Item.Properties().durability(175)));
    public static final RegistryObject<Item> CRUDE_IRON_SHOVEL = ITEMS.register("tools/crude/iron/shovel",
            () -> new ShovelItem(Tiers.IRON, 2,-3, new Item.Properties().durability(175)));
    public static final RegistryObject<Item> CRUDE_IRON_SWORD = ITEMS.register("tools/crude/iron/sword",
            () -> new SwordItem(Tiers.IRON, 2,-3, new Item.Properties().durability(175)));
    //GOlD
    public static final RegistryObject<Item> CRUDE_GOLD_AXE = ITEMS.register("tools/crude/gold/axe",
            () -> new AxeItem(Tiers.GOLD, 2,-3, new Item.Properties().durability(20)));
    public static final RegistryObject<Item> CRUDE_GOLD_PICKAXE = ITEMS.register("tools/crude/gold/pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, 2,-3, new Item.Properties().durability(20)));
    public static final RegistryObject<Item> CRUDE_GOLD_HOE = ITEMS.register("tools/crude/gold/hoe",
            () -> new HoeItem(Tiers.GOLD, 2,-3, new Item.Properties().durability(20)));
    public static final RegistryObject<Item> CRUDE_GOLD_SHOVEL = ITEMS.register("tools/crude/gold/shovel",
            () -> new ShovelItem(Tiers.GOLD, 2,-3, new Item.Properties().durability(20)));
    public static final RegistryObject<Item> CRUDE_GOLD_SWORD = ITEMS.register("tools/crude/gold/sword",
            () -> new SwordItem(Tiers.GOLD, 2,-3, new Item.Properties().durability(20)));

    //weapons EPF
    public static final RegistryObject<Item> WOODEN_UCHIGATANA = ITEMS.register("epf_add/wooden_uchigatana",
            () -> new SwordItem(Tiers.WOOD, 1,1, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> STONE_UCHIGATANA = ITEMS.register("epf_add/stone_uchigatana",
            () -> new SwordItem(Tiers.STONE, 1,1, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> GOLD_UCHIGATANA = ITEMS.register("epf_add/gold_uchigatana",
            () -> new SwordItem(Tiers.GOLD, 1,1, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> DIAMOND_UCHIGATANA = ITEMS.register("epf_add/diamond_uchigatana",
            () -> new SwordItem(Tiers.DIAMOND, 1,1, new Item.Properties().durability(200)));
    public static final RegistryObject<Item> NETHERITE_UCHIGATANA = ITEMS.register("epf_add/netherite_uchigatana",
            () -> new SwordItem(Tiers.NETHERITE, 1,1, new Item.Properties().durability(200)));

    public static void register(IEventBus eventBus) {
          ITEMS.register(eventBus);
    }
}
