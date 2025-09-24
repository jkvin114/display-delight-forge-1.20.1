package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import com.jkvin114.displaydelight.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;
import java.util.stream.Stream;


public class DisplayBlocks {
    public static List<RegistryObject<Block>> blocks = new ArrayList<>() ;

    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS,DisplayDelight.MODID);

    public static final RegistryObject<Block> PLATE = REGISTRY.register("food_plate",
            ()-> new EmptyPlateBlock(
            BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                    .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SMALL_PLATE = REGISTRY.register("small_food_plate",
            ()-> new EmptySmallPlateBlock(
                    BlockBehaviour.Properties.of().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)
                            .sound(SoundType.WOOD)));

    public static final RegistryObject<Block> GLOW_BERRY_CUSTARD = createDrinkFoodBlock("glow_berry_custard");
    public static final RegistryObject<Block> FRUIT_SALAD = createFoodBlock("fruit_salad");

    public static final RegistryObject<Block> COOKED_RICE = createFoodBlock("cooked_rice");
    public static final RegistryObject<Block> MIXED_SALAD = createFoodBlock("mixed_salad");
    public static final RegistryObject<Block> BEEF_STEW = createFoodBlock("beef_stew");
    public static final RegistryObject<Block> CHICKEN_SOUP = createFoodBlock("chicken_soup");
    public static final RegistryObject<Block> VEGETABLE_SOUP = createFoodBlock("vegetable_soup");
    public static final RegistryObject<Block> FISH_STEW = createFoodBlock("fish_stew");
    public static final RegistryObject<Block> FRIED_RICE = createFoodBlock("fried_rice");
    public static final RegistryObject<Block> PUMPKIN_SOUP = createFoodBlock("pumpkin_soup");
    public static final RegistryObject<Block> BAKED_COD_STEW = createFoodBlock("baked_cod_stew");
    public static final RegistryObject<Block> NOODLE_SOUP = createFoodBlock("noodle_soup");
    public static final RegistryObject<Block> BONE_BROTH = createFoodBlock("bone_broth");
    public static final RegistryObject<Block> BACON_AND_EGGS = createWideFoodBlock("bacon_and_eggs");
    public static final RegistryObject<Block> PASTA_WITH_MEATBALLS = createWideFoodBlock("pasta_with_meatballs");
    public static final RegistryObject<Block> PASTA_WITH_MUTTON_CHOP = createWideFoodBlock("pasta_with_mutton_chop");
    public static final RegistryObject<Block> ROASTED_MUTTON_CHOPS = createWideFoodBlock("roasted_mutton_chops");
    public static final RegistryObject<Block> STEAK_AND_POTATOES = createWideFoodBlock("steak_and_potatoes");
    public static final RegistryObject<Block> VEGETABLE_NOODLES = createWideFoodBlock("vegetable_noodles");
    public static final RegistryObject<Block> RATATOUILLE = createWideFoodBlock("ratatouille");
    public static final RegistryObject<Block> SQUID_INK_PASTA = createWideFoodBlock("squid_ink_pasta");
    public static final RegistryObject<Block> GRILLED_SALMON = createWideFoodBlock("grilled_salmon");
    public static final RegistryObject<Block> MUSHROOM_RICE = createWideFoodBlock("mushroom_rice");
    public static final RegistryObject<Block> ROAST_CHICKEN = createFoodBlock("roast_chicken");
    public static final RegistryObject<Block> STUFFED_PUMPKIN = createFoodBlock("stuffed_pumpkin");
    public static final RegistryObject<Block> HONEY_GLAZED_HAM = createFoodBlock("honey_glazed_ham");
    public static final RegistryObject<Block> SHEPHEREDS_PIE = createFoodBlock("shepherds_pie");
    public static final RegistryObject<Block> APPLE_CIDER = createDrinkFoodBlock("apple_cider");
    public static final RegistryObject<Block> MELON_JUICE = createDrinkFoodBlock("melon_juice");
    public static final RegistryObject<Block> HOT_COCOA = createDrinkFoodBlock("hot_cocoa");


    //VANILA
    public static final RegistryObject<Block> MUSHROOM_STEW = createFoodBlock("mushroom_stew");
    public static final RegistryObject<Block> RABBIT_STEW = createFoodBlock("rabbit_stew");
    public static final RegistryObject<Block> BEETROOT_STEW = createFoodBlock("beetroot_soup");

    //CORN DELIGHT

    public static final RegistryObject<Block> CD_NACHOS_BOWL = createFoodBlock("cd_nachos_bowl");
    public static final RegistryObject<Block> CD_CREAMY_COR_DRINK = createDrinkFoodBlock("cd_creamy_corn_drink");

    public static final RegistryObject<Block> CD_CORNBREAD_STUFFING = createFoodBlock("cd_cornbread_stuffing");
    public static final RegistryObject<Block> CD_CORN_SOUP = createFoodBlock("cd_corn_soup");
    public static final RegistryObject<Block> CD_CREAMED_CORN = createFoodBlock("cd_creamed_corn");


//delightful
    public static final RegistryObject<Block> DF_MATCHA_ICE_CREAM = createFoodBlock("df_matcha_ice_cream");
    public static final RegistryObject<Block> DF_MATCHA_MILKSHAKE= createDrinkFoodBlock("df_matcha_milkshake");
    public static final RegistryObject<Block> DF_SALMONBERRY_ICE_CREAM = createFoodBlock("df_salmonberry_ice_cream");
    public static final RegistryObject<Block> DF_SALMONBERRY_MILKSHAKE = createDrinkFoodBlock("df_salmonberry_milkshake");
    public static final RegistryObject<Block> DF_MATCHA_LATTE = createDrinkFoodBlock("df_matcha_latte");
    public static final RegistryObject<Block> DF_ENDER_NECTAR = createDrinkFoodBlock("df_ender_nectar");
    public static final RegistryObject<Block> DF_BERRY_MATCHA_LATTE = createDrinkFoodBlock("df_berry_matcha_latte");
    public static final RegistryObject<Block> DF_CACTUS_CHILI = createFoodBlock("df_cactus_chili");
    public static final RegistryObject<Block> DF_FIELD_SALAD = createFoodBlock("df_field_salad");
    public static final RegistryObject<Block> DF_STUFFED_CANTALOUPE = createFoodBlock("df_stuffed_cantaloupe");
    public static final RegistryObject<Block> DF_SINIGANG = createFoodBlock("df_sinigang");
    public static final RegistryObject<Block> DF_CACTUS_SOUP = createFoodBlock("df_cactus_soup");

    //pineapple delight
    public static final RegistryObject<Block> PD_PINEAPPLE_FRIED_RICE = createFoodBlock("pd_pineapple_fried_rice");
    public static final RegistryObject<Block> PD_PINEAPPLE_ICE_CREAM = createDrinkFoodBlock("pd_pineapple_ice_cream");
    public static final RegistryObject<Block> PD_PINEAPPLE_MILK_SHAKE = createDrinkFoodBlock("pd_pineapple_milk_shake");
    public static final RegistryObject<Block> PD_PINEAPPLE_JUICE = createDrinkFoodBlock("pd_pineapple_juice");

    //ocean delight
    public static final RegistryObject<Block> OD_BOWL_OF_GUARDIAN_SOUP = createFoodBlock("od_bowl_of_guardian_soup");
    public static final RegistryObject<Block> OD_BRAISED_SEA_PICKLE = createFoodBlock("od_braised_sea_pickle");
    public static final RegistryObject<Block> OD_SEAGRASS_SALAD = createFoodBlock("od_seagrass_salad");
    public static final RegistryObject<Block> OD_SQUID_RINGS = createFoodBlock("od_squid_rings");

    //alex delight
    public static final RegistryObject<Block> AD_MAGGOT_SALAD = createFoodBlock("ad_maggot_salad");
    public static final RegistryObject<Block> AD_KANGAROO_STEW = createFoodBlock("ad_kangaroo_stew");
    public static final RegistryObject<Block> AD_ACACIA_BLOSSOM_SOUP = createFoodBlock("ad_acacia_blossom_soup");
    public static final RegistryObject<Block> AD_LOBSTER_PASTA = createWideFoodBlock("ad_lobster_pasta");
    public static final RegistryObject<Block> AD_KANGAROO_PASTA = createWideFoodBlock("ad_kangaroo_pasta");

    //cultural delight
    public static final RegistryObject<Block> CTD_HEARTY_SALAD = createFoodBlock("ctd_hearty_salad");
    public static final RegistryObject<Block> CTD_CREAMED_CORN = createFoodBlock("ctd_creamed_corn");
    public static final RegistryObject<Block> CTD_SPICY_CURRY = createFoodBlock("ctd_spicy_curry");
    public static final RegistryObject<Block> CTD_FRIED_EGGPLANT_PASTA = createWideFoodBlock("ctd_fried_eggplant_pasta");

    //large meals
    public static final RegistryObject<Block> LM_PUFFERFISH_BROTH = createFoodBlock("lm_pufferfish_broth");
    public static final RegistryObject<Block> LM_POTATO_SOUP = createFoodBlock("lm_potato_soup");
    public static final RegistryObject<Block> LM_RED_SOUP = createFoodBlock("lm_red_soup");
    public static final RegistryObject<Block> LM_TOMATO_EGG_SOUP = createFoodBlock("lm_tomato_egg_soup");
    public static final RegistryObject<Block> LM_COD_DELUXE= createWideFoodBlock("lm_cod_deluxe");
    public static final RegistryObject<Block> LM_HEARTY_LUNCH = createWideFoodBlock("lm_hearty_lunch");
    public static final RegistryObject<Block> LM_CHICKEN_CURRY = createWideFoodBlock("lm_chicken_curry");
    public static final RegistryObject<Block> LM_PASTA_WITH_MUSHROOM_SAUCE = createWideFoodBlock("lm_pasta_with_mushroom_sauce");
    public static final RegistryObject<Block> LM_OMURICE = createFoodBlock("lm_omurice");
    public static final RegistryObject<Block> LM_MUSHROOM_POT_PIE = createFoodBlock("lm_mushroom_pot_pie");
    public static final RegistryObject<Block> LM_ROASTED_MUTTOH_RACK = createFoodBlock("lm_roasted_mutton_rack");
    public static final RegistryObject<Block> LM_SWEET_BERRY_CUSTARD = createDrinkFoodBlock("lm_sweet_berry_custard");
    public static final RegistryObject<Block> LM_RICE_PUDDING = createFoodBlock("lm_rice_pudding");

    //festive delight
    public static final RegistryObject<Block> FD_FESTIVE_CHICKEN = createFoodBlock("fd_festive_chicken");
    public static final RegistryObject<Block> FD_CHRISTMAS_TEA = createDrinkFoodBlock("fd_christmas_tea");
    public static final RegistryObject<Block> FD_SALMON_VERRINES = createDrinkFoodBlock("fd_salmon_verrines");



    public static List<Block> getAll() {
        return blocks.stream().map(RegistryObject::get).toList();
    }
    private static BlockBehaviour.Properties baseProps(){
        return   BlockBehaviour.Properties.of().noOcclusion().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }

    public static RegistryObject<Block> createDrinkFoodBlock(String name){

        RegistryObject<Block> block =  REGISTRY.register(name,
                ()->new DrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));

     //   DisplayItems.registerBlockItem(block);
        blocks.add(block);
        return block;
    }
    public static RegistryObject<Block> createWideFoodBlock(String name){
        RegistryObject<Block> block= REGISTRY.register(name,
                ()->new WideFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
      //  DisplayItems.registerBlockItem(block);

        return block;
    }
    public static RegistryObject<Block> createFoodBlock(String name){
        RegistryObject<Block> block= REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
        blocks.add(block);
    //    DisplayItems.registerBlockItem(block);
        return block;
    }
}
