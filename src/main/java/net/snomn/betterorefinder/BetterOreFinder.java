package net.snomn.betterorefinder;

import net.fabricmc.api.ModInitializer;

import net.snomn.betterorefinder.particle.ModParticles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterOreFinder implements ModInitializer {
    public static String MOD_ID = "betterorefinder";
    public static final Logger LOGGER = LoggerFactory.getLogger("better-ore-finder");

    @Override
    public void onInitialize() {
        LOGGER.info("Running!");

        ModParticles.registerParticles();
    }
}