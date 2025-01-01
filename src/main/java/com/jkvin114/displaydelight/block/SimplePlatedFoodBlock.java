package com.jkvin114.displaydelight.block;
import net.minecraft.world.entity.MobCategory;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SimplePlatedFoodBlock extends AbstractStackablePlatedFoodBlock{


    public SimplePlatedFoodBlock(Properties props) {
        super(props);
    }


    @Override
    public int getMaxStackable() {
        return 1;
    }
}
