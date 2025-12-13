package com.wwwaker.tutorial.block;

import com.mojang.datafixers.types.Type;
import com.wwwaker.tutorial.block.custom.SimpleCabinetBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Util;

public class ModBlockEntities {
    public static final BlockEntityType<SimpleCabinetBlockEntity> SIMPLE_CABINET = create("simple_cabinet",
            BlockEntityType.Builder.create(SimpleCabinetBlockEntity::new, ModBlocks.SIMPLE_CABINET));

    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, id, builder.build(type));
    }

    public static void registerModBlockEntities() {}
}
