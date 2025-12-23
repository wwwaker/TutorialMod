package com.wwwaker.tutorial.dategen;

import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.item.ModItemGroups;
import com.wwwaker.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.ICE_ETHER, "Ice Ether");
        translationBuilder.add(ModItems.RAW_ICE_ETHER, "Raw Ice Ether");
        translationBuilder.add(ModItems.CARDBOARD, "Cardboard");

        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "Ice Ether Ore");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "Raw Ice Ether Block");

        translationBuilder.add(ModBlocks.ICE_ETHER_STAIRS, "Ice Ether Stairs");
        translationBuilder.add(ModBlocks.ICE_ETHER_SLAB, "Ice Ether Slab");
        translationBuilder.add(ModBlocks.ICE_ETHER_WALL, "Ice Ether Wall");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE, "Ice Ether Fence");
        translationBuilder.add(ModBlocks.ICE_ETHER_FENCE_GATE, "Ice Ether Fence Gate");
        translationBuilder.add(ModBlocks.ICE_ETHER_PRESSURE_PLATE, "Ice Ether Pressure Plate");
        translationBuilder.add(ModBlocks.ICE_ETHER_BUTTON, "Ice Ether Button");
        translationBuilder.add(ModBlocks.ICE_ETHER_TRAPDOOR, "Ice Ether Trapdoor");
        translationBuilder.add(ModBlocks.ICE_ETHER_DOOR, "Ice Ether Door");

        translationBuilder.add(ModItems.FIRE_ETHER, "Fire Ether");
        translationBuilder.add(ModItems.FIRE_ETHER_SWORD, "Fire Ether Sword");
        translationBuilder.add(ModItems.FIRE_ETHER_SHOVEL, "Fire Ether Shovel");
        translationBuilder.add(ModItems.FIRE_ETHER_PICKAXE, "Fire Ether Pickaxe");
        translationBuilder.add(ModItems.FIRE_ETHER_AXE, "Fire Ether Axe");
        translationBuilder.add(ModItems.FIRE_ETHER_HOE, "Fire Ether Hoe");
        translationBuilder.add(ModItems.FIRE_ETHER_PICKAXE_AXE, "Fire Ether Pickaxe Axe");
        translationBuilder.add(ModItems.WOODEN_PICKAXE_AXE, "Wooden Pickaxe Axe");
        translationBuilder.add(ModItems.STONE_PICKAXE_AXE, "Stone Pickaxe Axe");
        translationBuilder.add(ModItems.IRON_PICKAXE_AXE, "Iron Pickaxe Axe");
        translationBuilder.add(ModItems.GOLDEN_PICKAXE_AXE, "Golden Pickaxe Axe");
        translationBuilder.add(ModItems.DIAMOND_PICKAXE_AXE, "Diamond Pickaxe Axe");
        translationBuilder.add(ModItems.NETHERITE_PICKAXE_AXE, "Netherite Pickaxe Axe");

        translationBuilder.add(ModItems.ICE_ETHER_HELMET, "Ice Ether Helmet");
        translationBuilder.add(ModItems.ICE_ETHER_CHESTPLATE, "Ice Ether Chestplate");
        translationBuilder.add(ModItems.ICE_ETHER_LEGGINGS, "Ice Ether Leggings");
        translationBuilder.add(ModItems.ICE_ETHER_BOOTS, "Ice Ether Boots");
        translationBuilder.add(ModItems.ICE_ETHER_HORSE_ARMOR, "Ice Ether Horse Armor");


        translationBuilder.add(ModItemGroups.TUTORIAL_GROUP, "Tutorial Group");
        translationBuilder.add("itemGroup.tutorial_group2", "Tutorial Group2");

        translationBuilder.add(ModItems.CORN, "Corn");
        translationBuilder.add(ModItems.STRAWBERRY,"Strawberry");
        translationBuilder.add(ModItems.CHEESE,"Cheese");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "Strawberry Seeds");

        translationBuilder.add(ModItems.ANTHRACITE, "Anthracite");

        translationBuilder.add("tooltip.tutorial.pickaxe_axe.shift", "This is a item that can be used as a pickaxe and an axe");
        translationBuilder.add("tooltip.tutorial.pickaxe_axe", "Hold §eSHIFT§r for more information!");

        translationBuilder.add("entity.minecraft.villager.ice_ether_master", "Ice Ether Master");

        translationBuilder.add("sound.tutorial-mod.test", "Test");
        translationBuilder.add("sound.tutorial-mod.block_break", "Block Break");
        translationBuilder.add("sound.tutorial-mod.block_place", "Block Place");
        translationBuilder.add("sound.tutorial-mod.block_step", "Block Step");
        translationBuilder.add("sound.tutorial-mod.block_hit", "Block Hit");
        translationBuilder.add("sound.tutorial-mod.block_fall", "Block Fall");
        translationBuilder.add(ModItems.A_MOMENT_APART_MUSIC_DISC, "A Moment Apart Music Disc");
        translationBuilder.add(ModItems.A_MOMENT_APART_MUSIC_DISC.getTranslationKey()+".desc", "A Moment Apart");

        translationBuilder.add(ModItems.BASEBALL_BAT, "Baseball Bat");
        translationBuilder.add(ModBlocks.ORANGE_NIGHTSTAND, "Orange Nightstand");
        translationBuilder.add(ModBlocks.SIMPLE_ORANGE_CLOCK, "Simple Orange Clock");
        translationBuilder.add(ModBlocks.LAMP_BLOCK, "Lamp Block");

        translationBuilder.add(ModBlocks.SIMPLE_CABINET, "Simple Cabinet");
        translationBuilder.add("container.simple_cabinet", "Simple Cabinet");

        translationBuilder.add(ModItems.OIL_BUCKET, "Oil Bucket");

        translationBuilder.add(ModBlocks.ICE_ETHER_LOG, "Ice Ether Log");
        translationBuilder.add(ModBlocks.ICE_ETHER_WOOD, "Ice Ether Wood");
        translationBuilder.add(ModBlocks.STRIPPED_ICE_ETHER_LOG, "Stripped Ice Ether Log");
        translationBuilder.add(ModBlocks.STRIPPED_ICE_ETHER_WOOD, "Stripped Ice Ether Wood");
        translationBuilder.add(ModBlocks.ICE_ETHER_PLANKS, "Ice Ether Planks");
        translationBuilder.add(ModBlocks.ICE_ETHER_LEAVES, "Ice Ether Leaves");
    }
}
