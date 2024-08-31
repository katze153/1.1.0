package net.ktf.amulet.procedures;

import net.minecraft.world.item.ItemStack;

public class AmuletBaubleIsEquippedProcedure {
	public static void execute(ItemStack itemstack) {
		if (0 == itemstack.getOrCreateTag().getDouble("lvl")) {
			itemstack.getOrCreateTag().putDouble("lvl", 1);
		}
	}
}
