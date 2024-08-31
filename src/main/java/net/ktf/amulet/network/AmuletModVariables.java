package net.ktf.amulet.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmuletModVariables {
	public static boolean time = true;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}
