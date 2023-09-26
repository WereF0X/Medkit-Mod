
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.medkitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.medkitmod.item.MedkitItem;
import net.mcreator.medkitmod.MedkitModMod;

public class MedkitModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MedkitModMod.MODID);
	public static final RegistryObject<Item> MEDKIT = REGISTRY.register("medkit", () -> new MedkitItem());
}
