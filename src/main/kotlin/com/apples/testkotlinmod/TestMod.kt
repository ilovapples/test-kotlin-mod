package com.apples.testkotlinmod

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.item.*;
import net.minecraft.util.*;
import org.slf4j.LoggerFactory;

object ExampleMod : ModInitializer {
    private val logger = LoggerFactory.getLogger("test-kotlin-mod")
    public val EXAMPLE_ITEM: Item = Item(FabricItemSettings())
    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        logger.info("Hello Fabric world!");
        Registry.register(Registries.ITEM, Identifier("test-kotlin-mod", "example_item"), EXAMPLE_ITEM);
    }
}