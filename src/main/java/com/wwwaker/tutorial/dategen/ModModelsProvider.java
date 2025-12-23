package com.wwwaker.tutorial.dategen;

import com.wwwaker.tutorial.block.ModBlockFamilies;
import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.block.custom.CornBlock;
import com.wwwaker.tutorial.block.custom.StrawberryBlock;
import com.wwwaker.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        ModBlockFamilies.getFamilies()
            .filter(BlockFamily::shouldGenerateModels)
            .forEach(family ->
                    blockStateModelGenerator.
                            registerCubeAllModelTexturePool(family.getBaseBlock())
                            .family(family));

//        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
        blockStateModelGenerator.registerCrop(ModBlocks.STRAWBERRY_CROP, StrawberryBlock.AGE, 0, 1, 2, 3, 4, 5);

        blockStateModelGenerator.blockStateCollector
                .accept(VariantsBlockStateSupplier.create(ModBlocks.CORN_CROP)
                        .coordinate(
                                BlockStateVariantMap.create(CornBlock.AGE)
                                        .register(stage -> BlockStateVariant.create()
                                                .put(VariantSettings.MODEL,
                                                        blockStateModelGenerator.createSubModel(ModBlocks.CORN_CROP, "_stage" + stage,
                                                                Models.CROSS, TextureMap::cross))
                                        )
                        )
                );

        blockStateModelGenerator.registerSimpleState(ModBlocks.ORANGE_NIGHTSTAND);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.SIMPLE_ORANGE_CLOCK);
        blockStateModelGenerator.registerSimpleState(ModBlocks.LAMP_BLOCK);

        blockStateModelGenerator.registerLog(ModBlocks.ICE_ETHER_LOG).log(ModBlocks.ICE_ETHER_LOG).wood(ModBlocks.ICE_ETHER_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ICE_ETHER_LOG).log(ModBlocks.STRIPPED_ICE_ETHER_LOG).wood(ModBlocks.STRIPPED_ICE_ETHER_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_PLANKS);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARDBOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANTHRACITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.FIRE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FIRE_ETHER_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WOODEN_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLDEN_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_PICKAXE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_PICKAXE_AXE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ICE_ETHER_BOOTS);

        itemModelGenerator.register(ModItems.ICE_ETHER_HORSE_ARMOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.A_MOMENT_APART_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.register(ModItems.OIL_BUCKET, Models.GENERATED);
    }
}
