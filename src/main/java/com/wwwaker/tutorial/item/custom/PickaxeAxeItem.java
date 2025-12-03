package com.wwwaker.tutorial.item.custom;

import com.wwwaker.tutorial.tag.ModBlockTags;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class PickaxeAxeItem extends AxeItem {
    public PickaxeAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return state.isIn(ModBlockTags.PICKAXE_AXE) ? this.miningSpeed : 1.0F;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return state.isIn(ModBlockTags.PICKAXE_AXE);
//        int i = this.getMaterial().getMiningLevel();
//        if (i < MiningLevels.DIAMOND && state.isIn(BlockTags.NEEDS_DIAMOND_TOOL)) {
//            return false;
//        } else if (i < MiningLevels.IRON && state.isIn(BlockTags.NEEDS_IRON_TOOL)) {
//            return false;
//        } else {
//            return i < MiningLevels.STONE && state.isIn(BlockTags.NEEDS_STONE_TOOL) ? false : state.isIn(this.effectiveBlocks);
//        }
    }
}
