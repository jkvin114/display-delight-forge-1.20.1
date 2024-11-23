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

public class DisplayBlocks {
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

    //Expanded delight
    public static final RegistryObject<Block> ED_ASPARAGUS_SOUP = createFoodBlock("ed_asparagus_soup");
    public static final RegistryObject<Block> ED_ASPARAGUS_SOUP_CREAMY = createFoodBlock("ed_asparagus_soup_creamy");
    public static final RegistryObject<Block> ED_ASPARAGUS_AND_BACON_CHEESY = createWideFoodBlock("ed_asparagus_and_bacon_cheesy");
    public static final RegistryObject<Block> ED_PEPERONATA = createWideFoodBlock("ed_peperonata");
    public static final RegistryObject<Block> ED_PEANUT_HONEY_SOUP = createFoodBlock("ed_peanut_honey_soup");
    public static final RegistryObject<Block> ED_MAC_AND_CHEESE = createFoodBlock("ed_mac_and_cheese");
    public static final RegistryObject<Block> ED_PEANUT_SALAD = createFoodBlock("ed_peanut_salad");
    public static final RegistryObject<Block> ED_SWEET_POTTATO_SALAD = createFoodBlock("ed_sweet_potato_salad");

    public static final RegistryObject<Block> ED_CINNAMON_RICE = createFoodBlock("cinnamon_rice");
    public static final RegistryObject<Block> ED_CINNAMON_APPLES = createFoodBlock("cinnamon_apples");

    public static final RegistryObject<Block> ED_APPLE_JUICE = createDrinkFoodBlock("ed_apple_juice");
    public static final RegistryObject<Block> ED_SWEET_BERRY_JUICE = createDrinkFoodBlock("ed_sweet_berry_juice");
    public static final RegistryObject<Block> ED_GLOW_BERRY_JUICE = createDrinkFoodBlock("ed_glow_berry_juice");



    public static Block[] getAll() {
        return new Block[]{
                FRUIT_SALAD.get(),  GLOW_BERRY_CUSTARD.get(),COOKED_RICE.get(), MIXED_SALAD.get(),

                BEEF_STEW.get(), CHICKEN_SOUP.get(), VEGETABLE_SOUP.get(), FISH_STEW.get(), FRIED_RICE.get(), PUMPKIN_SOUP.get(),
                BAKED_COD_STEW.get(), NOODLE_SOUP.get(), BONE_BROTH.get(), BACON_AND_EGGS.get(), PASTA_WITH_MEATBALLS.get(),
                PASTA_WITH_MUTTON_CHOP.get(), ROASTED_MUTTON_CHOPS.get(), STEAK_AND_POTATOES.get(), VEGETABLE_NOODLES.get(), RATATOUILLE.get(),
                SQUID_INK_PASTA.get(), GRILLED_SALMON.get(), MUSHROOM_RICE.get(), ROAST_CHICKEN.get(), STUFFED_PUMPKIN.get(), HONEY_GLAZED_HAM.get(),
                SHEPHEREDS_PIE.get(),  APPLE_CIDER.get(), MELON_JUICE.get(), HOT_COCOA.get(),

                MUSHROOM_STEW.get(),RABBIT_STEW.get(),BEETROOT_STEW.get(),

                CD_NACHOS_BOWL.get(),CD_CREAMY_COR_DRINK.get(),CD_CORN_SOUP.get(),CD_CORNBREAD_STUFFING.get(),CD_CREAMED_CORN.get(),

                ED_ASPARAGUS_SOUP.get(),ED_ASPARAGUS_SOUP_CREAMY.get(),ED_ASPARAGUS_AND_BACON_CHEESY.get(),
                ED_PEPERONATA.get(),ED_PEANUT_HONEY_SOUP.get(),ED_MAC_AND_CHEESE.get(),ED_PEANUT_SALAD.get(),
                ED_SWEET_POTTATO_SALAD.get(),ED_CINNAMON_RICE.get(),ED_CINNAMON_APPLES.get(),
                ED_APPLE_JUICE.get(),ED_SWEET_BERRY_JUICE.get(),ED_GLOW_BERRY_JUICE.get()

        };
    }
    private  static BlockBehaviour.Properties baseProps(){
        return   BlockBehaviour.Properties.of().noOcclusion().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }

    private static RegistryObject<Block> createDrinkFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new DrinkBlock(baseProps()
                        .sound(SoundType.GLASS)));
    }
    private static RegistryObject<Block> createWideFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new WideFoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }
    private static RegistryObject<Block> createFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(SoundType.WOOD)));
    }
}