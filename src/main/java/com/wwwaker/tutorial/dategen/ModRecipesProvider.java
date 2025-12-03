package com.wwwaker.tutorial.dategen;

import com.wwwaker.tutorial.TutorialMod;
import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.item.ModItems;
import com.wwwaker.tutorial.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> ICE_ETHER = List.of(ModItems.RAW_ICE_ETHER, ModBlocks.ICE_ETHER_ORE);

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ICE_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.RAW_ICE_ETHER,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ICE_ETHER_BLOCK);

        createStairsRecipe(ModBlocks.ICE_ETHER_STAIRS, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_SLAB, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);
        createTransmutationRecipe(ModBlocks.ICE_ETHER_BUTTON, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);
        createPressurePlateRecipe( RecipeCategory.REDSTONE ,ModBlocks.ICE_ETHER_PRESSURE_PLATE, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, ModBlocks.ICE_ETHER_WALL, ModBlocks.ICE_ETHER_BLOCK);
        createDoorRecipe(ModBlocks.ICE_ETHER_DOOR, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.ICE_ETHER_TRAPDOOR, Ingredient.ofItems(ModBlocks.ICE_ETHER_BLOCK))
                .criterion(hasItem(ModBlocks.ICE_ETHER_BLOCK), conditionsFromItem(ModBlocks.ICE_ETHER_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ICE_ETHER_FENCE, 6)
                .pattern("#X#")
                .pattern("#X#")
                .input('#', ModBlocks.ICE_ETHER_BLOCK)
                .input('X', ModItems.ICE_ETHER)
                .criterion(hasItem(ModItems.ICE_ETHER), conditionsFromItem(ModItems.ICE_ETHER))
                .offerTo(exporter, new Identifier(TutorialMod.MOD_ID, "ice_ether_fence"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ICE_ETHER_FENCE_GATE, 2)
                .pattern("#X#")
                .pattern("#X#")
                .input('X', ModBlocks.ICE_ETHER_BLOCK)
                .input('#', ModItems.ICE_ETHER)
                .criterion(hasItem(ModItems.ICE_ETHER), conditionsFromItem(ModItems.ICE_ETHER))
                .offerTo(exporter, new Identifier(TutorialMod.MOD_ID, "ice_ether_fence_gate"));


        offerSmelting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f, 200, "ice_ether");
        offerBlasting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f, 100, "ice_ether");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ICE_ETHER_ORE, 1)
                .input(ModItems.RAW_ICE_ETHER)
                .input(Items.STONE)
                .criterion(hasItem(ModItems.RAW_ICE_ETHER), conditionsFromItem(ModItems.RAW_ICE_ETHER))
                .offerTo(exporter, new Identifier(TutorialMod.MOD_ID, "ice_ether_ore"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, Items.SUGAR, 3)
                .pattern("###")
                .input('#', ModItemTags.SUGAR_INGREDIENTS)
                .criterion(hasItem(Items.BEETROOT), conditionsFromTag(ModItemTags.SUGAR_INGREDIENTS))
                .offerTo(exporter, new Identifier(TutorialMod.MOD_ID, "sugar_from_beetroot"));


        offerFoodCookingRecipe(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING,
                600, ModItems.RAW_ICE_ETHER, ModItems.ICE_ETHER, 0.35f);



    }
}
