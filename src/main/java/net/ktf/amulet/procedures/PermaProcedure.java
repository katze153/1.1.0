package net.ktf.amulet.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.ktf.amulet.world.inventory.GTEMenu;
import net.ktf.amulet.AmuletMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PermaProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		AmuletMod.queueServerWork(1, () -> {
			if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof GTEMenu) {
				UmainnProcedure.execute(entity);
			}
		});
	}
}
