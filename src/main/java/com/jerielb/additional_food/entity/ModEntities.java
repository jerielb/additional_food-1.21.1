package com.jerielb.additional_food.entity;

import com.jerielb.additional_food.AdditionalFood;
import com.jerielb.additional_food.entity.custom.JollibeeEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
	public static final EntityType<JollibeeEntity> JOLLIBEE = Registry.register(Registries.ENTITY_TYPE,
			Identifier.of(AdditionalFood.MOD_ID, "jollibee"),
			EntityType.Builder.create(JollibeeEntity::new, SpawnGroup.MISC)
					.dimensions(1f, 2f).build());
	
	public static void registerModEntities() {
		AdditionalFood.LOGGER.info("Registering Mod Entities for " + AdditionalFood.MOD_ID);
	}
}
