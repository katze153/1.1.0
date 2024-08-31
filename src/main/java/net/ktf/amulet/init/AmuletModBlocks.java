
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ktf.amulet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ktf.amulet.block.UpdatetableBlock;
import net.ktf.amulet.AmuletMod;

public class AmuletModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmuletMod.MODID);
	public static final RegistryObject<Block> UPDATETABLE = REGISTRY.register("updatetable", () -> new UpdatetableBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
