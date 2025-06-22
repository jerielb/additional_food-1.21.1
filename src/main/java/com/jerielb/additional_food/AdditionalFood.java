package com.jerielb.additional_food;

import com.jerielb.additional_food.block.ModBlocks;
import com.jerielb.additional_food.entity.ModEntities;
import com.jerielb.additional_food.entity.custom.JollibeeEntity;
import com.jerielb.additional_food.item.ModItemGroups;
import com.jerielb.additional_food.item.ModItems;
import com.jerielb.additional_food.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalFood implements ModInitializer {
	public static final String MOD_ID = "additional_food";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		
		ModVillagers.registerVillagers();
		ModVillagers.registerVillagers();
		// Jollibee Employee Trades
		// NOVICE
		TradeOfferHelper.registerVillagerOffers(ModVillagers.JOLLIBEE_EMP, 1, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.FRIES, 1), 16, 2, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.CHICKEN_NUGGETS, 1), 16, 2, 0.04f)
			));
		});
		// APPRENTICE
		TradeOfferHelper.registerVillagerOffers(ModVillagers.JOLLIBEE_EMP, 2, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.YUM_BURGER, 1), 16, 4, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.CHAMP_BURGER, 1), 16, 4, 0.04f)
			));
		});
		// JOURNEYMAN
		TradeOfferHelper.registerVillagerOffers(ModVillagers.JOLLIBEE_EMP, 3, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 8),
					new ItemStack(ModItems.JOLLY_HOTDOG, 1), 16, 8, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 12),
					new ItemStack(ModItems.JOLLY_SPAGHETTI, 1), 16, 8, 0.04f)
			));
		});
		// EXPERT
		TradeOfferHelper.registerVillagerOffers(ModVillagers.JOLLIBEE_EMP, 4, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 12),
					new ItemStack(ModItems.BURGER_STEAK, 1), 16, 16, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 16),
					new ItemStack(ModItems.PALABOK, 1), 16, 16, 0.04f)
			));
		});
		// MASTER
		TradeOfferHelper.registerVillagerOffers(ModVillagers.JOLLIBEE_EMP, 5, factories -> {
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 16),
					new ItemStack(ModItems.CHICKEN_JOY, 1), 16, 32, 0.04f)
			));
			factories.add(((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD, 4),
					new ItemStack(ModItems.PEACH_MANGO_PIE, 1), 16, 32, 0.04f)
			));
		});
		
		FabricDefaultAttributeRegistry.register(ModEntities.JOLLIBEE, JollibeeEntity.createAttributes());
	}
}