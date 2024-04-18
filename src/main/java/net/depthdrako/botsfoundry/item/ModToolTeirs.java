package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.fluid.ModFluids;
import net.depthdrako.botsfoundry.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTeirs {
    public static final Tier FORGED_IRON_BASE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 4000, 11f, 3f, 26,
                    ModTags.Blocks.NEEDS_FORGE_TOOL, () -> Ingredient.of(Items.IRON_INGOT)),
            new ResourceLocation(BotsFoundry.MOD_ID, "forged_tool"), List.of(Tiers.NETHERITE), List.of());









}
