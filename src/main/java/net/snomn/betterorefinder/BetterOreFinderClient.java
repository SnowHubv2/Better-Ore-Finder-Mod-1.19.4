package net.snomn.betterorefinder;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import net.snomn.betterorefinder.particle.ModParticles;
import net.snomn.betterorefinder.particle.custom.GreenFlame;

public class BetterOreFinderClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_FLAME, GreenFlame.Factory::new);
    }
}
