package com.wwwaker.tutorial.block.custom;

import com.wwwaker.tutorial.block.ModBlocks;
import com.wwwaker.tutorial.block.ModFluid;
import com.wwwaker.tutorial.block.ModFluids;
import com.wwwaker.tutorial.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.state.StateManager;

public class OilFluid extends ModFluid {
    @Override
    public Fluid getFlowing() {
        return ModFluids.Oil_Flowing;
    }

    @Override
    public Fluid getStill() {
        return ModFluids.Oil;
    }

    @Override
    public Item getBucketItem() {
        return ModItems.Oil_Bucket;
    }

    @Override
    protected BlockState toBlockState(FluidState state) {
        return ModBlocks.Oil.getDefaultState().with(FluidBlock.LEVEL, getBlockStateLevel(state));
    }

    @Override
    public boolean isStill(FluidState state) {
        return false;
    }

    @Override
    public int getLevel(FluidState state) {
        return 0;
    }

    public static class Flowing extends OilFluid {
        @Override
        protected void appendProperties(StateManager.Builder<Fluid, FluidState> builder) {
            super.appendProperties(builder);
            builder.add(LEVEL);
        }

        @Override
        public boolean isStill(FluidState state) {
            return false;
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL);
        }
    }

    public static class Still extends OilFluid {
        @Override
        public boolean isStill(FluidState state) {
            return true;
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }
    }

}
