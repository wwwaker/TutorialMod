package com.wwwaker.tutorial.dategen;

import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
    }

/**
 * 重写generateItemModels方法，用于注册物品的模型
 * @param itemModelGenerator 物品模型生成器，用于注册物品的模型
 */
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    // 注册冰醚物品模型
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
    // 注册原始冰醚物品模型
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER, Models.GENERATED);
    // 注册纸板物品模型
        itemModelGenerator.register(ModItems.CARDBOARD, Models.GENERATED);
    // 注册玉米物品模型
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
    // 注册草莓物品模型
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
    // 注册奶酪物品模型
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);


    }
}
