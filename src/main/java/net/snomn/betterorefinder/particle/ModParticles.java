package net.snomn.betterorefinder.particle;


import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.snomn.betterorefinder.BetterOreFinder;

public class ModParticles {

    // INstance of particle
    public static final DefaultParticleType GREEN_FLAME = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(BetterOreFinder.MOD_ID, "green_flame"), GREEN_FLAME);
    }
}