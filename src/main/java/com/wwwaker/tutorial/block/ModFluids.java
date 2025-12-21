package com.wwwaker.tutorial.block;

import com.wwwaker.tutorial.TutorialMod;
import com.wwwaker.tutorial.block.custom.OilFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {
    public static final FlowableFluid Oil = register("oil", new OilFluid.Still());
    public static final FlowableFluid Oil_Flowing = register("oil_flowing", new OilFluid.Flowing());

    private static <T extends Fluid> T register(String id, T value) {
        return Registry.register(Registries.FLUID, new Identifier(TutorialMod.MOD_ID, id), value);
    }

    static {
        for (Fluid fluid : Registries.FLUID) {
            for (FluidState fluidState : fluid.getStateManager().getStates()) {
                Fluid.STATE_IDS.add(fluidState);
            }
        }
    }

    public static void registerModFluid(){}
}
