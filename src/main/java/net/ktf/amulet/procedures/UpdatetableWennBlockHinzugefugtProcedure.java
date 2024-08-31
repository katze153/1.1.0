package net.ktf.amulet.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class UpdatetableWennBlockHinzugefugtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(Blocks.CRYING_OBSIDIAN == (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock())) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
