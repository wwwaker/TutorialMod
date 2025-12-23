package com.wwwaker.tutorial;

import com.wwwaker.tutorial.block.ModBlockEntities;
import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.block.ModFluids;
import com.wwwaker.tutorial.item.ModItemGroups;
import com.wwwaker.tutorial.item.ModItems;
import com.wwwaker.tutorial.sound.ModSoundEvents;
import com.wwwaker.tutorial.villager.ModTrades;
import com.wwwaker.tutorial.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorial-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerGroups();

		ModTrades.registerTrades();
		ModVillagers.registerModVillagers();
		ModSoundEvents.registerSounds();
		ModBlockEntities.registerModBlockEntities();
		ModFluids.registerModFluid();

		StrippableBlockRegistry.register(ModBlocks.ICE_ETHER_LOG, ModBlocks.STRIPPED_ICE_ETHER_LOG);
		StrippableBlockRegistry.register(ModBlocks.ICE_ETHER_WOOD, ModBlocks.STRIPPED_ICE_ETHER_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICE_ETHER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICE_ETHER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ICE_ETHER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ICE_ETHER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICE_ETHER_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ICE_ETHER_LEAVES, 30, 60);

//		FuelRegistry.INSTANCE.add(ModItems.ANTHRACITE, 1600);

		LOGGER.info("Hello Fabric world!");
	}
}