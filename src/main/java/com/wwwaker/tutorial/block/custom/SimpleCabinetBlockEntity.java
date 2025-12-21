package com.wwwaker.tutorial.block.custom;

import com.wwwaker.tutorial.block.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;

public class SimpleCabinetBlockEntity extends LootableContainerBlockEntity {
    private DefaultedList<ItemStack> invStackList = createInventory();

    private DefaultedList<ItemStack> createInventory() {
        return DefaultedList.ofSize(18, ItemStack.EMPTY);
    }

    protected SimpleCabinetBlockEntity(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    public SimpleCabinetBlockEntity(BlockPos blockPos, BlockState blockState) {
        this(ModBlockEntities.SIMPLE_CABINET, blockPos, blockState);
    }

    @Override
    protected DefaultedList<ItemStack> getInvStackList() {
        return this.invStackList;
    }

    @Override
    protected void setInvStackList(DefaultedList<ItemStack> list) {
        this.invStackList = list;
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("container.simple_cabinet");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
//        return GenericContainerScreenHandler.createGeneric9x2(syncId, playerInventory);
        return new GenericContainerScreenHandler(ScreenHandlerType.GENERIC_9X2, syncId, playerInventory, this, 2);
    }

    @Override
    public int size() {
        return 18;
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.invStackList = DefaultedList.ofSize(this.size(), ItemStack.EMPTY);
        if(!this.deserializeLootTable(nbt)) {
            Inventories.readNbt(nbt, this.invStackList);
        }
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        if(!this.serializeLootTable(nbt)) {
            Inventories.writeNbt(nbt, this.invStackList);
        }
    }
}
