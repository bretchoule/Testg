
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.bettervillagersmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BetterVillagersModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == BetterVillagersModModVillagerProfessions.LUMBERJACK_VILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_LOG, 15),

					new ItemStack(Items.EMERALD), 10, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_SAPLING, 20),

					new ItemStack(Items.EMERALD, 2), 10, 2, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.STRIPPED_OAK_WOOD, 4), 10, 2, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.OAK_SLAB, 12), 10, 2, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.STICK, 32),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Blocks.OAK_STAIRS, 16), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Blocks.OAK_SIGN), new ItemStack(Items.OAK_HANGING_SIGN), 10, 5, 0.05f));
		}
	}
}
