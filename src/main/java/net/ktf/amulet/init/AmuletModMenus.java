
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ktf.amulet.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ktf.amulet.world.inventory.GTEMenu;
import net.ktf.amulet.AmuletMod;

public class AmuletModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, AmuletMod.MODID);
	public static final RegistryObject<MenuType<GTEMenu>> GTE = REGISTRY.register("gte", () -> IForgeMenuType.create(GTEMenu::new));
}
