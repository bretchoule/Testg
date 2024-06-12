
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bettervillagersmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bettervillagersmod.block.RaidBlockBlock;
import net.mcreator.bettervillagersmod.block.LumberjackTableBlock;
import net.mcreator.bettervillagersmod.block.DarkOakLumejackTableBlock;
import net.mcreator.bettervillagersmod.block.BirchLumberjackTableBlock;
import net.mcreator.bettervillagersmod.BetterVillagersModMod;

public class BetterVillagersModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterVillagersModMod.MODID);
	public static final RegistryObject<Block> OAK_LUMBERJACK_TABLE = REGISTRY.register("oak_lumberjack_table", () -> new LumberjackTableBlock());
	public static final RegistryObject<Block> BIRCH_LUMBERJACK_TABLE = REGISTRY.register("birch_lumberjack_table", () -> new BirchLumberjackTableBlock());
	public static final RegistryObject<Block> DARK_OAK_LUMEJACK_TABLE = REGISTRY.register("dark_oak_lumejack_table", () -> new DarkOakLumejackTableBlock());
	public static final RegistryObject<Block> RAID_BLOCK = REGISTRY.register("raid_block", () -> new RaidBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
