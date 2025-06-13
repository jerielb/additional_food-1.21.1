package com.jerielb.additional_food.villager;

import com.google.common.collect.ImmutableSet;
import com.jerielb.additional_food.AdditionalFood;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
	public static final RegistryKey<PointOfInterestType> JOLLIBEE_EMP_POI_KEY = registerPoiKey("jollibee_emp_poi");
	public static final PointOfInterestType JOLLIBEE_EMP_POI = registerPOI("jollibee_emp_poi", Blocks.CHISELED_QUARTZ_BLOCK);
	
	public static final VillagerProfession JOLLIBEE_EMP = registerProfession("jollibee_emp", JOLLIBEE_EMP_POI_KEY);
	
	public static final RegistryKey<PointOfInterestType> STREET_FOOD_VENDOR_POI_KEY = registerPoiKey("street_food_vendor_poi");
	public static final PointOfInterestType STREET_FOOD_VENDOR_EMP_POI = registerPOI("street_food_vendor_poi", Blocks.QUARTZ_PILLAR);
	
	public static final VillagerProfession STREET_FOOD_VENDOR = registerProfession("street_food_vendor", STREET_FOOD_VENDOR_POI_KEY);
	
	private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
		return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(AdditionalFood.MOD_ID, name),
				new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
						ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN));
	}
	
	private static PointOfInterestType registerPOI(String name, Block block) {
		return PointOfInterestHelper.register(Identifier.of(AdditionalFood.MOD_ID, name),
				1, 1, block);
	}
	
	private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
		return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(AdditionalFood.MOD_ID, name));
	}
	
	public static void registerVillagers() {
		AdditionalFood.LOGGER.info("Registering Villagers for " + AdditionalFood.MOD_ID);
	}
}
