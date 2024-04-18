package net.depthdrako.botsfoundry.fluid;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;

public class ModFluidTypes {
    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/lava_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/lava_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/lava_overlay");
    public static final ResourceLocation COPPER_FLOWING_RL = new ResourceLocation("botsfoundry:block/molten_copper");
    public static final ResourceLocation COPPER_STILL_RL = new ResourceLocation("botsfoundry:block/molten_copper");
    public static final ResourceLocation IRON_FLOWING_RL = new ResourceLocation("botsfoundry:block/molten_iron");
    public static final ResourceLocation IRON_STILL_RL = new ResourceLocation("botsfoundry:block/molten_iron");
    public static final ResourceLocation GOLD_FLOWING_RL = new ResourceLocation("botsfoundry:block/molten_gold");
    public static final ResourceLocation GOLD_STILL_RL = new ResourceLocation("botsfoundry:block/molten_gold");
    public static final ResourceLocation NETHERITE_FLOWING_RL = new ResourceLocation("botsfoundry:block/molten_netherite");
    public static final ResourceLocation NETHERITE_STILL_RL = new ResourceLocation("botsfoundry:block/molten_netherite");
    public static final ResourceLocation DEBRIS_FLOWING_RL = new ResourceLocation("botsfoundry:block/molten_debris");
    public static final ResourceLocation DEBRIS_STILL_RL = new ResourceLocation("botsfoundry:block/molten_debris");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, BotsFoundry.MOD_ID);


    public static final RegistryObject<FluidType> MOLTEN_IRON_FLUID_TYPE = registerFluidType("molten_iron",
            new BaseFluidType(IRON_STILL_RL, IRON_FLOWING_RL, WATER_OVERLAY_RL, 0xFFFFD700,
                    new Vector3f(204f / 255f, 178f / 255f, 7f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(64).density(100)));

    public static final RegistryObject<FluidType> MOLTEN_GOLD_FLUID_TYPE = registerFluidType("molten_gold",
            new BaseFluidType(GOLD_STILL_RL, GOLD_FLOWING_RL, WATER_OVERLAY_RL, 0xFFFFD700,
                    new Vector3f(204f / 255f, 178f / 255f, 7f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(64).density(100)));

    public static final RegistryObject<FluidType> MOLTEN_COPPER_FLUID_TYPE = registerFluidType("molten_copper",
            new BaseFluidType(COPPER_STILL_RL, COPPER_FLOWING_RL, WATER_OVERLAY_RL, 0xFFf8957e,
                    new Vector3f(248f / 255f, 149f / 255f, 126f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(64).density(100)));

    public static final RegistryObject<FluidType> MOLTEN_NETHERITE_FLUID_TYPE = registerFluidType("molten_netherite",
            new BaseFluidType(NETHERITE_STILL_RL, NETHERITE_FLOWING_RL, WATER_OVERLAY_RL, 0xFFba715e,
                    new Vector3f(204f / 255f, 178f / 255f, 7f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(64).density(100)));

    public static final RegistryObject<FluidType> MOLTEN_DEBRIS_FLUID_TYPE = registerFluidType("molten_debris",
            new BaseFluidType(DEBRIS_STILL_RL, DEBRIS_FLOWING_RL, WATER_OVERLAY_RL, 0xFFba715e,
                    new Vector3f(204f / 255f, 178f / 255f, 7f / 255f),
                    FluidType.Properties.create().lightLevel(2).viscosity(64).density(100)));


    private static RegistryObject<FluidType> registerFluidType(String name, FluidType fluidType) {
        return FLUID_TYPES.register(name, () -> fluidType);
    }

    public static void register(IEventBus eventBus) {
        FLUID_TYPES.register(eventBus);
    }
}
