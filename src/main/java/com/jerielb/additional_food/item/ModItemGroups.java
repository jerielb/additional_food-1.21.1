package com.jerielb.additional_food.item;

import com.jerielb.additional_food.AdditionalFood;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	// tab group for ITEMS
	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalFood.MOD_ID, "additional_items"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.FRIES)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional_food.additional_items")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// Meals
						entries.add(ModItems.CHICKEN_JOY);
						entries.add(ModItems.JOLLY_SPAGHETTI);
						entries.add(ModItems.PALABOK);
						entries.add(ModItems.BURGER_STEAK);
						
						// Burgers
						entries.add(ModItems.YUM_BURGER);
						entries.add(ModItems.CHAMP_BURGER);
						entries.add(ModItems.JOLLY_HOTDOG);
						
						// Sides
						entries.add(ModItems.FRIES);
						entries.add(ModItems.CHICKEN_NUGGETS);
						
						// Deserts
						entries.add(ModItems.PEACH_MANGO_PIE);
					})
					.build());
	
	// gets called by the Main class onInitialize() method
	public static void registerItemGroups() {
		AdditionalFood.LOGGER.info("Registering Item Groups for " + AdditionalFood.MOD_ID);
	}
}
