
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettervillagersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bettervillagersmod.BetterVillagersModMod;

public class BetterVillagersModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BetterVillagersModMod.MODID);
	public static final RegistryObject<Item> OAK_LUMBERJACK_TABLE = block(BetterVillagersModModBlocks.OAK_LUMBERJACK_TABLE);
	public static final RegistryObject<Item> BIRCH_LUMBERJACK_TABLE = block(BetterVillagersModModBlocks.BIRCH_LUMBERJACK_TABLE);
	public static final RegistryObject<Item> DARK_OAK_LUMEJACK_TABLE = block(BetterVillagersModModBlocks.DARK_OAK_LUMEJACK_TABLE);
	public static final RegistryObject<Item> RAID_BLOCK = block(BetterVillagersModModBlocks.RAID_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
