package com.jerielb.additional_food.item;

import com.jerielb.additional_food.AdditionalFood;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	// Jollibee Meals
	public static final Item CHICKEN_JOY = registerItem("chicken_joy", new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_JOY)));
	public static final Item JOLLY_SPAGHETTI = registerItem("jolly_spaghetti", new Item(new Item.Settings().food(ModFoodComponents.JOLLY_SPAGHETTI)));
	public static final Item PALABOK = registerItem("palabok", new Item(new Item.Settings().food(ModFoodComponents.PALABOK)));
	public static final Item BURGER_STEAK = registerItem("burger_steak", new Item(new Item.Settings().food(ModFoodComponents.BURGER_STEAK)));
	
	// Jollibee Burgers
	public static final Item YUM_BURGER = registerItem("yum_burger", new Item(new Item.Settings().food(ModFoodComponents.YUM_BURGER)));
	public static final Item CHAMP_BURGER = registerItem("champ_burger", new Item(new Item.Settings().food(ModFoodComponents.CHAMP_BURGER)));
	public static final Item JOLLY_HOTDOG = registerItem("jolly_hotdog", new Item(new Item.Settings().food(ModFoodComponents.JOLLY_HOTDOG)));
	
	// Jollibee Sides
	public static final Item FRIES = registerItem("fries", new Item(new Item.Settings().food(ModFoodComponents.FRIES)));
	public static final Item CHICKEN_NUGGETS = registerItem("chicken_nuggets", new Item(new Item.Settings().food(ModFoodComponents.CHICKEN_NUGGETS)));
	
	// Jollibee Deserts
	public static final Item PEACH_MANGO_PIE = registerItem("peach_mango_pie", new Item(new Item.Settings().food(ModFoodComponents.PEACH_MANGO_PIE)));
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalFood.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		AdditionalFood.LOGGER.info("Registering Mod Items for " + AdditionalFood.MOD_ID);
	}
}