package com.jkvin114.displaydelight.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class StackablePlateFoodBlock extends AbstractStackablePlatedFoodBlock{


    private final int maxStacks;
    public StackablePlateFoodBlock(BlockBehaviour.Properties props,int stacks) {
        super(props);
        if (stacks <= 0 || stacks > 10) throw new IllegalArgumentException("Stack size should be between 1 and 10");
        maxStacks = stacks;
    }

    @Override
    public int getMaxStackable() {
        return maxStacks;
    }

}
