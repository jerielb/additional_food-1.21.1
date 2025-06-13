package com.jerielb.additional_food.item;

import net.minecraft.component.type.FoodComponent;

public class ModFoodComponents {
	// Meals
	public static final FoodComponent CHICKEN_JOY = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F).build();
	public static final FoodComponent JOLLY_SPAGHETTI = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F).build();
	public static final FoodComponent PALABOK = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F).build();
	public static final FoodComponent BURGER_STEAK = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F).build();
	
	// Burgers
	public static final FoodComponent YUM_BURGER = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F).build();
	public static final FoodComponent CHAMP_BURGER = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F).build();
	public static final FoodComponent JOLLY_HOTDOG = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8F).build();
	
	// Sides
	public static final FoodComponent FRIES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build();
	public static final FoodComponent CHICKEN_NUGGETS = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build();
	
	// Deserts
	public static final FoodComponent PEACH_MANGO_PIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.3F).build();
	
	// Street Food
	public static final FoodComponent FISH_BALL = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3F).build();
}
