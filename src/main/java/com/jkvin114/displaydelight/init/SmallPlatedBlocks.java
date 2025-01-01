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

import java.util.ArrayList;
import java.util.List;

public class SmallPlatedBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisplayDelight.MODID);

    public static final RegistryObject<Block> PLATED_CAKE_SLICE = createPlatedBlock("small_plated_cake_slice");
    public static final RegistryObject<Block> PLATED_APPLE_PIE_SLICE = createPlatedBlock("small_plated_apple_pie_slice");
    public static final RegistryObject<Block> PLATED_CHOCOLATE_PIE_SLICE = createPlatedBlock("small_plated_chocolate_pie_slice");
    public static final RegistryObject<Block> PLATED_SWEET_BERRY_CHEESECAKE_SLICE = createPlatedBlock("small_plated_sweet_berry_cheesecake_slice");
    public static final RegistryObject<Block> PLATED_STUFFED_POTATO = createPlatedBlock("small_plated_stuffed_potato");
    public static final RegistryObject<Block> PLATED_COD_ROLL = createPlatedBlock("small_plated_cod_roll");
    public static final RegistryObject<Block> PLATED_SALMON_ROLL = createPlatedBlock("small_plated_salmon_roll");
    public static final RegistryObject<Block> PLATED_KELP_ROLL_SLICE = createPlatedBlock("small_plated_kelp_roll_slice");
    public static final RegistryObject<Block> PLATED_CABBAGE_ROLLS = createPlatedBlock("small_plated_cabbage_rolls");

    //DELIGHTFUL
    public static final RegistryObject<Block> DF_SALMONBERRY_PIE_SLICE = createPlatedBlock("df_small_plated_salmonberry_pie_slice");
    public static final RegistryObject<Block> DF_PUMPKIN_PIE_SLICE = createPlatedBlock("df_small_plated_pumpkin_pie_slice");

    public static final RegistryObject<Block> PD_PINEAPPLE_PIE_SLICE = createPlatedBlock("pd_small_plated_pineapple_pie_slice");

    //oceans delight
    public static final RegistryObject<Block> OD_ELDER_QUARDIAN_ROLL = createPlatedBlock("od_small_plated_elder_guardian_roll");
    public static final RegistryObject<Block> OD_FUGU_ROLL = createPlatedBlock("od_small_plated_fugu_roll");

    //cultural delight
    public static final RegistryObject<Block> CTD_CHICKEN_ROLL_SLICE = createPlatedBlock("ctd_small_plated_chicken_roll_slice");
    public static final RegistryObject<Block> CTD_MIDORI_ROLL_SLICE = createPlatedBlock("ctd_small_plated_midori_roll_slice");
    public static final RegistryObject<Block> CTD_PUFFERFISH_ROLL = createPlatedBlock("ctd_small_plated_pufferfish_roll");
    public static final RegistryObject<Block> CTD_TROPICAL_ROLL = createPlatedBlock("ctd_small_plated_tropical_roll");
    public static final RegistryObject<Block> CTD_RICE_BALL = createPlatedBlock("ctd_small_plated_rice_ball");
    public static final RegistryObject<Block> CTD_EGG_ROLL = createPlatedBlock("ctd_small_plated_egg_roll");
    public static final RegistryObject<Block> CTD_CALAMARI_ROLL = createPlatedBlock("ctd_small_plated_calamari_roll");
    public static final RegistryObject<Block> CTD_CUT_PICKLE= createPlatedBlock("ctd_small_plated_cut_pickle");



    private static BlockBehaviour.Properties baseProps() {
        return BlockBehaviour.Properties.of().noOcclusion()
                .instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }

    public static RegistryObject<Block> createPlatedBlock(String name) {
        RegistryObject<Block> b= REGISTRY.register(name,
                () -> new SmallPlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(b);
        return b;
    }

    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    };

}
