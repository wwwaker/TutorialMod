package com.wwwaker.tutorial.villager;

import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

import javax.swing.text.html.parser.Entity;

public class ModTrades {
    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.CORN, 12, 12, 2));
            factories.add(new TradeOffers.SellItemFactory(ModItems.STRAWBERRY_SEEDS.getDefaultStack(), 1, 12, 5, 1, 0.5f));
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.STRAWBERRY, 30),
                    new ItemStack(Items.EMERALD, 5), 2, 3, 0.1f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.STRAWBERRY, 30),
                    new ItemStack(Items.EMERALD, 5), 2, 5, 0.1f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(Items.MILK_BUCKET, 1, 2, ModItems.CHEESE, 3, 4, 20));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.ICE_ETHER, 16),
                    EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SHARPNESS, 2)), 2, 10, 0.1f
            ));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER, 1, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.ICE_ETHER, 2, 12, 2));
            factories.add(new TradeOffers.SellItemFactory(ModItems.FIRE_ETHER_AXE.getDefaultStack(), 10, 1, 1, 3, 0.1f));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ICE_ETHER_MASTER, 2, factories -> {
            factories.add(new TradeOffers.BuyForOneEmeraldFactory(ModItems.FIRE_ETHER, 5, 12, 5));
            factories.add(new TradeOffers.SellItemFactory(ModBlocks.ICE_ETHER_BLOCK.asItem().getDefaultStack(), 10, 1, 4 , 5, 0.1f));

        });
    }
}
