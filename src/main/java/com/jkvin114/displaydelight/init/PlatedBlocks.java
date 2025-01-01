package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.SimplePlatedFoodBlock;
import com.jkvin114.displaydelight.block.StackablePlateFoodBlock;
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

public class PlatedBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DisplayDelight.MODID);
    public static final RegistryObject<Block> PLATED_DUMPLINGS = createStackablePlatedBlock("plated_dumplings", 2);
    public static final RegistryObject<Block> PLATED_HAMBURGER = createPlatedBlock("plated_hamburger");
    public static final RegistryObject<Block> PLATED_BARBECUE_STICK = createStackablePlatedBlock("plated_barbecue_stick", 3);
    public static final RegistryObject<Block> PLATED_CHICKEN_SANDWICH = createStackablePlatedBlock("plated_chicken_sandwich", 2);
    public static final RegistryObject<Block> PLATED_EGG_SANDWICH = createStackablePlatedBlock("plated_egg_sandwich", 2);
    public static final RegistryObject<Block> PLATED_KELP_ROLL = createStackablePlatedBlock("plated_kelp_roll", 3);
    public static final RegistryObject<Block> PLATED_MELON_POPSICLE = createStackablePlatedBlock("plated_melon_popsicle", 2);
    public static final RegistryObject<Block> PLATED_STUFFED_POTATO = createStackablePlatedBlock("plated_stuffed_potato", 3);
    public static final RegistryObject<Block> PLATED_MUTTON_WRAP = createStackablePlatedBlock("plated_mutton_wrap", 2);
    public static final RegistryObject<Block> PLATED_BACON_SANDWICH = createPlatedBlock("plated_bacon_sandwich");

    public static final RegistryObject<Block> PLATED_CABBAGE_ROLL = createStackablePlatedBlock("plated_cabbage_rolls", 3);

    public static final RegistryObject<Block> PLATED_COD_ROLL = createStackablePlatedBlock("plated_cod_roll", 6);
    public static final RegistryObject<Block> PLATED_KELP_ROLL_SLICE = createStackablePlatedBlock("plated_kelp_roll_slice", 6);
    public static final RegistryObject<Block> PLATED_SALMON_ROLL = createStackablePlatedBlock("plated_salmon_roll", 6);

    public static final RegistryObject<Block> PLATED_SWEET_BERRY_COOKIE = createStackablePlatedBlock("plated_sweet_berry_cookie", 4);
    public static final RegistryObject<Block> PLATED_HONEY_COOKIE = createStackablePlatedBlock("plated_honey_cookie", 4);


    //VANILA
    public static final RegistryObject<Block> PLATED_COOKIE = createStackablePlatedBlock("plated_cookie", 4);
    public static final RegistryObject<Block> PLATED_PUMPKIN_PIE = createPlatedBlock("plated_pumpkin_pie");


    //corn delight
    public static final RegistryObject<Block> CD_GRILLED_CORN = createStackablePlatedBlock("cd_plated_grilled_corn", 2);
    public static final RegistryObject<Block> CD_CLASSIC_CORN_DOG = createStackablePlatedBlock("cd_plated_classic_corn_dog", 2);
    public static final RegistryObject<Block> CD_TACO = createStackablePlatedBlock("cd_plated_taco", 2);


    //DELIGHTFUL
    public static final RegistryObject<Block> DF_SMORE = createStackablePlatedBlock("df_plated_smore", 2);
    public static final RegistryObject<Block> DF_CHEESEBURGER = createPlatedBlock("df_plated_cheeseburger");
    public static final RegistryObject<Block> DF_DELUXE_CHEESEBURGER = createPlatedBlock("df_plated_deluxe_cheeseburger");
    public static final RegistryObject<Block> DF_NUT_BUTTER_AND_JELLY_SANDWICH = createPlatedBlock("df_plated_nut_butter_and_jelly_sandwich");

    public static final RegistryObject<Block> DF_COOKED_MARSHMELLOW_STICK = createStackablePlatedBlock("df_plated_cooked_marshmallow_stick", 3);
    public static final RegistryObject<Block> DF_CANTALOUPE_POPSICLE = createStackablePlatedBlock("df_plated_cantaloupe_popsicle", 2);
    public static final RegistryObject<Block> DF_CANTALOUPE_BREAD = createStackablePlatedBlock("df_plated_cantaloupe_bread", 2);
    public static final RegistryObject<Block> DF_WRAPPED_CANTALOUPE = createStackablePlatedBlock("df_plated_wrapped_cantaloupe", 2);

    //OCEAN DELIGHT
    public static final RegistryObject<Block> OD_BACKED_TENTACLE_ON_A_STICK = createStackablePlatedBlock("od_plated_baked_tentacle_on_a_stick", 2);
    public static final RegistryObject<Block> OD_ELDER_GUARDIAN_ROLL = createStackablePlatedBlock("od_plated_elder_guardian_roll", 6);
    public static final RegistryObject<Block> OD_FUGU_ROLL = createStackablePlatedBlock("od_plated_fugu_roll", 6);
    public static final RegistryObject<Block> OD_HONEY_FRIED_KELP = createPlatedBlock("od_plated_honey_fried_kelp");
    public static final RegistryObject<Block> OD_COOKED_STUFFED_COD = createStackablePlatedBlock("od_plated_cooked_stuffed_cod", 2);

    //ALEX DELIGHT
    public static final RegistryObject<Block> AD_BUNFUNBUS_SANDWICH = createPlatedBlock("ad_plated_bunfungus_sandwich");
    public static final RegistryObject<Block> AD_BISON_BURGER = createPlatedBlock("ad_plated_bison_burger");
    public static final RegistryObject<Block> AD_GONGYLIDIA_BRUSCHETTA = createStackablePlatedBlock("ad_plated_gongylidia_bruschetta", 2);

    //cultural delight
    public static final RegistryObject<Block> CTD_ELOTE = createStackablePlatedBlock("ctd_plated_elote",2);
    public static final RegistryObject<Block> CTD_EMPANADA = createStackablePlatedBlock("ctd_plated_empanada",2);
    public static final RegistryObject<Block> CTD_BEEF_BURITO = createStackablePlatedBlock("ctd_plated_beef_burrito",2);
    public static final RegistryObject<Block> CTD_MUTTON_SANDWICH = createPlatedBlock("ctd_plated_mutton_sandwich");
    public static final RegistryObject<Block> CTD_EGGPLANT_BURGER = createPlatedBlock("ctd_plated_eggplant_burger");
    public static final RegistryObject<Block> CTD_AVOCADO_TOAST = createPlatedBlock("ctd_plated_avocado_toast");
    public static final RegistryObject<Block> CTD_CHICKEN_TACO = createStackablePlatedBlock("ctd_plated_chicken_taco",2);
    public static final RegistryObject<Block> CTD_PORK_WRAP = createStackablePlatedBlock("ctd_plated_pork_wrap",2);
    public static final RegistryObject<Block> CTD_FISH_TACO = createStackablePlatedBlock("ctd_plated_fish_taco",2);
    public static final RegistryObject<Block> CTD_CHICKEN_ROLL = createStackablePlatedBlock("ctd_plated_chicken_roll",3);
    public static final RegistryObject<Block> CTD_MIDORI_ROLL = createStackablePlatedBlock("ctd_plated_midori_roll",3);
    public static final RegistryObject<Block> CTD_CHICKEN_ROLL_SLICE = createStackablePlatedBlock("ctd_plated_chicken_roll_slice",6);
    public static final RegistryObject<Block> CTD_MIDORI_ROLL_SLICE = createStackablePlatedBlock("ctd_plated_midori_roll_slice",6);
    public static final RegistryObject<Block> CTD_PUFFERFISH_ROLL = createStackablePlatedBlock("ctd_plated_pufferfish_roll",6);
    public static final RegistryObject<Block> CTD_TROPICAL_ROLL = createStackablePlatedBlock("ctd_plated_tropical_roll",6);
    public static final RegistryObject<Block> CTD_RICE_BALL = createStackablePlatedBlock("ctd_plated_rice_ball",4);
    public static final RegistryObject<Block> CTD_EGG_ROLL = createStackablePlatedBlock("ctd_plated_egg_roll",6);
    public static final RegistryObject<Block> CTD_CALAMARI_ROLL = createStackablePlatedBlock("ctd_plated_calamari_roll",6);



    private static BlockBehaviour.Properties baseProps() {
        return BlockBehaviour.Properties.of().noOcclusion()
                .instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN);
    }

    public static RegistryObject<Block> createStackablePlatedBlock(String name, int maxStacks) {
        RegistryObject<Block> b = REGISTRY.register(name,
                () -> new StackablePlateFoodBlock(baseProps()
                        .sound(SoundType.WOOD), maxStacks));
        blocks.add(b);
        return b;
    }

    public static RegistryObject<Block> createPlatedBlock(String name) {
        RegistryObject<Block> b = REGISTRY.register(name,
                () -> new SimplePlatedFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(b);
        return b;
    }

    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    };

}
