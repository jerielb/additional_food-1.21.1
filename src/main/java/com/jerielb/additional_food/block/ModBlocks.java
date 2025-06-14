package com.jerielb.additional_food.block;

import com.jerielb.additional_food.AdditionalFood;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static final Block QUARTZ_BLOCK = registerBlock("quartz_block", new Block(AbstractBlock.Settings.create().mapColor(MapColor.OFF_WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(0.8F)));
	
	// helper methods
	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, Identifier.of(AdditionalFood.MOD_ID, name), block);
	}
	
	private static void registerBlockItem(String name, Block block) {
		Registry.register(Registries.ITEM, Identifier.of(AdditionalFood.MOD_ID, name), new BlockItem(block, new Item.Settings()));
	}
	
	public static void registerModBlocks() {
		AdditionalFood.LOGGER.info("Registering Mod Blocks for " + AdditionalFood.MOD_ID);
	}
}
