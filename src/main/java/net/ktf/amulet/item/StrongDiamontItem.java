
package net.ktf.amulet.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StrongDiamontItem extends Item {
	public StrongDiamontItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
