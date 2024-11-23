package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SimplePlatedFoodBlock;
import com.jkvin114.displaydelight.block.SmallPlatedFoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SmallPlatedBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS,DisplayDelight.MODID);

    public static final RegistryObject<Block> PLATED_CAKE_SLICE =  createPlatedBlock("small_plated_cake_slice");
    public static final RegistryObject<Block> PLATED_APPLE_PIE_SLICE=  createPlatedBlock("small_plated_apple_pie_slice");
    public static final RegistryObject<Block> PLATED_CHOCOLATE_PIE_SLICE =  createPlatedBlock("small_plated_chocolate_pie_slice");
    public static final RegistryObject<Block> PLATED_SWEET_BERRY_CHEESECAKE_SLICE =  createPlatedBlock("small_plated_sweet_berry_cheesecake_slice");
    public static final RegistryObject<Block> PLATED_STUFFED_POTATO =  createPlatedBlock("small_plated_stuffed_potato");
    public static final RegistryObject<Block> PLATED_COD_ROLL =  createPlatedBlock("small_plated_cod_roll");
    public static final RegistryObject<Block> PLATED_SALMON_ROLL =  createPlatedBlock("small_plated_salmon_roll");
    public static final RegistryObject<Block> PLATED_KELP_ROLL_SLICE =  createPlatedBlock("small_plated_kelp_roll_slice");
    public static final RegistryObject<Block> PLATED_CABBAGE_ROLLS =  createPlatedBlock("small_plated_cabbage_rolls");

    private static BlockBehaviour.Properties baseProps(){
        return BlockBehaviour.Properties.of().noOcclusion()
                .instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }
    private static RegistryObject<Block> createPlatedBlock(String name){
        return  REGISTRY.register(name,
                ()->new SmallPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }public static Block[] getAll() {
        return new Block[]{PLATED_APPLE_PIE_SLICE.get(),PLATED_CAKE_SLICE.get(),
        PLATED_CHOCOLATE_PIE_SLICE.get(),PLATED_SWEET_BERRY_CHEESECAKE_SLICE.get(),
        PLATED_STUFFED_POTATO.get(),PLATED_COD_ROLL.get(),PLATED_SALMON_ROLL.get(),
        PLATED_KELP_ROLL_SLICE.get(),PLATED_CABBAGE_ROLLS.get()};}
}
