package net.snomn.betterorefinder;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterOreFinder implements ModInitializer {
    public static String MOD_ID = "betterorefinder";
    public static final Logger LOGGER = LoggerFactory.getLogger("better-ore-finder");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
    }
}