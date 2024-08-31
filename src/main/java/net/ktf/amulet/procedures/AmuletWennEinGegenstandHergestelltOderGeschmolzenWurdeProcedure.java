package net.ktf.amulet.procedures;

import net.minecraft.world.item.ItemStack;

public class AmuletWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putDouble("lvl", 0);
	}
}
