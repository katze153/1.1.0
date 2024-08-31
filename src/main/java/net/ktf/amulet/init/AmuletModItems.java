
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ktf.amulet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.ktf.amulet.item.StrongDiamontItem;
import net.ktf.amulet.item.AmuletItem;
import net.ktf.amulet.AmuletMod;

public class AmuletModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmuletMod.MODID);
	public static final RegistryObject<Item> STRONG_DIAMONT = REGISTRY.register("strong_diamont", () -> new StrongDiamontItem());
	public static final RegistryObject<Item> UPDATETABLE = block(AmuletModBlocks.UPDATETABLE);
	public static final RegistryObject<Item> AMULET = REGISTRY.register("amulet", () -> new AmuletItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
