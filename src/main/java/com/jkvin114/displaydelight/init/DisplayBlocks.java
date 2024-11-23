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
    public static final RegistryObject<Block> FRUIT_SALAD = createFoodBlock("fruit_salad",SoundType.WOOD);

    public static final RegistryObject<Block> COOKED_RICE = createFoodBlock("cooked_rice",SoundType.WOOD);
    public static final RegistryObject<Block> MIXED_SALAD = createFoodBlock("mixed_salad",SoundType.WOOD);
    public static final RegistryObject<Block> BEEF_STEW = createFoodBlock("beef_stew",SoundType.WOOD);
    public static final RegistryObject<Block> CHICKEN_SOUP = createFoodBlock("chicken_soup",SoundType.WOOD);
    public static final RegistryObject<Block> VEGETABLE_SOUP = createFoodBlock("vegetable_soup",SoundType.WOOD);
    public static final RegistryObject<Block> FISH_STEW = createFoodBlock("fish_stew",SoundType.WOOD);
    public static final RegistryObject<Block> FRIED_RICE = createFoodBlock("fried_rice",SoundType.WOOD);
    public static final RegistryObject<Block> PUMPKIN_SOUP = createFoodBlock("pumpkin_soup",SoundType.WOOD);
    public static final RegistryObject<Block> BAKED_COD_STEW = createFoodBlock("baked_cod_stew",SoundType.WOOD);
    public static final RegistryObject<Block> NOODLE_SOUP = createFoodBlock("noodle_soup",SoundType.WOOD);
    public static final RegistryObject<Block> BONE_BROTH = createFoodBlock("bone_broth",SoundType.WOOD);
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
    public static final RegistryObject<Block> ROAST_CHICKEN = createFoodBlock("roast_chicken",SoundType.WOOD);
    public static final RegistryObject<Block> STUFFED_PUMPKIN = createFoodBlock("stuffed_pumpkin",SoundType.WOOD);
    public static final RegistryObject<Block> HONEY_GLAZED_HAM = createFoodBlock("honey_glazed_ham",SoundType.WOOD);
    public static final RegistryObject<Block> SHEPHEREDS_PIE = createFoodBlock("shepherds_pie",SoundType.WOOD);
    public static final RegistryObject<Block> DOG_FOOD = createFoodBlock("dog_food",SoundType.WOOD);
    public static final RegistryObject<Block> HORSE_FEED = createFoodBlock("horse_feed",SoundType.CROP);
    public static final RegistryObject<Block> APPLE_CIDER = createDrinkFoodBlock("apple_cider");
    public static final RegistryObject<Block> MELON_JUICE = createDrinkFoodBlock("melon_juice");
    public static final RegistryObject<Block> HOT_COCOA = createDrinkFoodBlock("hot_cocoa");


    public static Block[] getAll() {
        return new Block[]{
                FRUIT_SALAD.get(),  GLOW_BERRY_CUSTARD.get(),COOKED_RICE.get(), MIXED_SALAD.get(),

                BEEF_STEW.get(), CHICKEN_SOUP.get(), VEGETABLE_SOUP.get(), FISH_STEW.get(), FRIED_RICE.get(), PUMPKIN_SOUP.get(),
                BAKED_COD_STEW.get(), NOODLE_SOUP.get(), BONE_BROTH.get(), BACON_AND_EGGS.get(), PASTA_WITH_MEATBALLS.get(),
                PASTA_WITH_MUTTON_CHOP.get(), ROASTED_MUTTON_CHOPS.get(), STEAK_AND_POTATOES.get(), VEGETABLE_NOODLES.get(), RATATOUILLE.get(),
                SQUID_INK_PASTA.get(), GRILLED_SALMON.get(), MUSHROOM_RICE.get(), ROAST_CHICKEN.get(), STUFFED_PUMPKIN.get(), HONEY_GLAZED_HAM.get(),
                SHEPHEREDS_PIE.get(), DOG_FOOD.get(), HORSE_FEED.get(), APPLE_CIDER.get(), MELON_JUICE.get(), HOT_COCOA.get(),
        };
    }
    private  static BlockBehaviour.Properties baseProps(){
        return   BlockBehaviour.Properties.of().noOcclusion().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.NONE);
    }
    private static RegistryObject<Block> createPieSliceFoodBlock(String name){
        return  REGISTRY.register(name,
                ()->new FoodBlock(
                        baseProps().sound(SoundType.WOOL)));
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
    private static RegistryObject<Block> createFoodBlock(String name,SoundType soundType){
        return  REGISTRY.register(name,
                ()->new FoodBlock(baseProps()
                        .sound(soundType)));
    }
}
