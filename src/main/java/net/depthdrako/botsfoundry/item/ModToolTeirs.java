package net.depthdrako.botsfoundry.item;

import net.depthdrako.botsfoundry.BotsFoundry;
import net.depthdrako.botsfoundry.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTeirs {
    public static final Tier BUSTER = TierSortingRegistry.registerTier(
          new ForgeTier(5,1500,5f,4f,25,
                  ModTags.Blocks.BUSTER_WEAPONS, () -> Ingredient.of(ModItems.SAPPHIRE.get())),
            new ResourceLocation(BotsFoundry.MOD_ID, "sapphire"), List.of(Tiers.NETHERITE), List.of());
}
