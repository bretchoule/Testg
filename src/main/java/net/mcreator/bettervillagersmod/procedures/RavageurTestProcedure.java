package net.mcreator.bettervillagersmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RavageurTestProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getTarget(), event.getEntity());
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:raiders"))) && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:dismounts_underwater")))) {
			sourceentity.startRiding(entity);
			if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:raiders"))) && entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("minecraft:dismounts_underwater")))) {
				if (entity instanceof Player _player) {
					_player.getAbilities().invulnerable = false;
					_player.onUpdateAbilities();
				}
			}
		}
	}
}
