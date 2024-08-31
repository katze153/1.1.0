
package net.ktf.amulet.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.ktf.amulet.procedures.AmuletWhileBaubleIsEquippedTickProcedure;
import net.ktf.amulet.procedures.AmuletWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure;
import net.ktf.amulet.procedures.AmuletBaubleIsUnequippedProcedure;
import net.ktf.amulet.procedures.AmuletBaubleIsEquippedProcedure;

public class AmuletItem extends Item implements ICurioItem {
	public AmuletItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		AmuletWennEinGegenstandHergestelltOderGeschmolzenWurdeProcedure.execute(itemstack);
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		AmuletWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity(), stack);
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		AmuletBaubleIsEquippedProcedure.execute(stack);
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		AmuletBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
