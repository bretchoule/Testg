
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettervillagersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.bettervillagersmod.BetterVillagersModMod;

public class BetterVillagersModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterVillagersModMod.MODID);
	public static final RegistryObject<CreativeModeTab> BETTER_VILLAGERS = REGISTRY.register("better_villagers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.better_villagers_mod.better_villagers")).icon(() -> new ItemStack(BetterVillagersModModBlocks.OAK_LUMBERJACK_TABLE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BetterVillagersModModBlocks.OAK_LUMBERJACK_TABLE.get().asItem());
				tabData.accept(BetterVillagersModModBlocks.BIRCH_LUMBERJACK_TABLE.get().asItem());
				tabData.accept(BetterVillagersModModBlocks.DARK_OAK_LUMEJACK_TABLE.get().asItem());
				tabData.accept(BetterVillagersModModBlocks.RAID_BLOCK.get().asItem());
			}).withSearchBar().build());
}
