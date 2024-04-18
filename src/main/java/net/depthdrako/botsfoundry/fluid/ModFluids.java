package net.depthdrako.botsfoundry.fluid;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.block.ModBlocks;
import net.depthdrako.botsfoundry.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, BotsFoundry.MOD_ID);
//IRON
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_IRON = FLUIDS.register("molten_iron_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_IRON = FLUIDS.register("flowing_molten_iron_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_IRON_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_IRON_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_IRON_FLUID_TYPE, SOURCE_MOLTEN_IRON, FLOWING_MOLTEN_IRON)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_IRON_BLOCK)
            .bucket(ModItems.MOLTEN_IRON_BUCKET);
//GOLD
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_GOLD = FLUIDS.register("molten_gold_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_GOLD = FLUIDS.register("flowing_molten_gold_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_GOLD_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_GOLD_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_GOLD_FLUID_TYPE, SOURCE_MOLTEN_GOLD, FLOWING_MOLTEN_GOLD)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_GOLD_BLOCK)
            .bucket(ModItems.MOLTEN_GOLD_BUCKET);
//COPPER
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_COPPER = FLUIDS.register("molten_copper_fluid",
        () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_COPPER = FLUIDS.register("flowing_molten_copper_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_COPPER_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_COPPER_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_COPPER_FLUID_TYPE, SOURCE_MOLTEN_COPPER, FLOWING_MOLTEN_COPPER)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_COPPER_BLOCK)
            .bucket(ModItems.MOLTEN_COPPER_BUCKET);
//NETHERITE
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_NETHERITE = FLUIDS.register("molten_netherite_fluid",
        () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_NETHERITE = FLUIDS.register("flowing_molten_netherite_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_NETHERITE_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_NETHERITE_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_NETHERITE_FLUID_TYPE, SOURCE_MOLTEN_NETHERITE, FLOWING_MOLTEN_NETHERITE)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_NETHERITE_BLOCK)
            .bucket(ModItems.MOLTEN_NETHERITE_BUCKET);
//Molten Debris
    public static final RegistryObject<FlowingFluid> SOURCE_MOLTEN_DEBRIS = FLUIDS.register("molten_debris_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.MOLTEN_DEBRIS_FLUID_PROPERTIES));

    public static final RegistryObject<FlowingFluid> FLOWING_MOLTEN_DEBRIS = FLUIDS.register("flowing_molten_debris_fluid",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.MOLTEN_DEBRIS_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_DEBRIS_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.MOLTEN_DEBRIS_FLUID_TYPE, SOURCE_MOLTEN_DEBRIS, FLOWING_MOLTEN_DEBRIS)
            .slopeFindDistance(2).levelDecreasePerBlock(1).block(ModBlocks.MOLTEN_DEBRIS_BLOCK)
            .bucket(ModItems.MOLTEN_DEBRIS_BUCKET);
    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}