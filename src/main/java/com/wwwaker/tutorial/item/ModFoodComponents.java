package com.wwwaker.tutorial.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.6F).build();
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(2).saturationModifier(0.3F)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.2f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6F)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,100),1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100), 1.0f).build();
}
