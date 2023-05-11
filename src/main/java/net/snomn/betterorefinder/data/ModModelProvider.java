package net.snomn.betterorefinder.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator. registerCubeAllModelTexturePool
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // itemModelGenerator.register
    }
}

// https://www.youtube.com/watch?v=A9PxJy-BdBI&list=PLKGarocXCE1EMYzuBUTYjHnFeBrRFbesk&index=6
