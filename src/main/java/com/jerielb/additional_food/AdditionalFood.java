package com.jerielb.additional_food;

import com.jerielb.additional_food.item.ModItemGroups;
import com.jerielb.additional_food.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalFood implements ModInitializer {
	public static final String MOD_ID = "additional_food";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		
		ModItems.registerModItems();
	}
}