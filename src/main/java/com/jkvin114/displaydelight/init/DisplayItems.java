package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class DisplayItems {
    public static final DeferredRegister<Item> REGISTRY= DeferredRegister.create(ForgeRegistries.ITEMS, DisplayDelight.MODID);
    public static final RegistryObject<Item> PLATE = block(DisplayBlocks.PLATE);


    public static final RegistryObject<Item> FRUIT_SALAD = block(DisplayBlocks.FRUIT_SALAD);;
    public static final RegistryObject<Item> GLOW_BERRY_CUSTARD = block(DisplayBlocks.GLOW_BERRY_CUSTARD);
    public static final RegistryObject<Item> COOKED_RICE = block(DisplayBlocks.COOKED_RICE);
    public static final RegistryObject<Item> MIXED_SALAD = block(DisplayBlocks.MIXED_SALAD);
    public static final RegistryObject<Item> BEEF_STEW = block(DisplayBlocks.BEEF_STEW);
    public static final RegistryObject<Item> CHICKEN_SOUP = block(DisplayBlocks.CHICKEN_SOUP);
    public static final RegistryObject<Item> VEGETABLE_SOUP = block(DisplayBlocks.VEGETABLE_SOUP);
    public static final RegistryObject<Item> FISH_STEW = block(DisplayBlocks.FISH_STEW);
    public static final RegistryObject<Item> FRIED_RICE = block(DisplayBlocks.FRIED_RICE);
    public static final RegistryObject<Item> PUMPKIN_SOUP = block(DisplayBlocks.PUMPKIN_SOUP);
    public static final RegistryObject<Item> BAKED_COD_STEW = block(DisplayBlocks.BAKED_COD_STEW);
    public static final RegistryObject<Item> NOODLE_SOUP = block(DisplayBlocks.NOODLE_SOUP);
    public static final RegistryObject<Item> BONE_BROTH = block(DisplayBlocks.BONE_BROTH);
    public static final RegistryObject<Item> BACON_AND_EGGS = block(DisplayBlocks.BACON_AND_EGGS);
    public static final RegistryObject<Item> PASTA_WITH_MEATBALLS = block(DisplayBlocks.PASTA_WITH_MEATBALLS);
    public static final RegistryObject<Item> PASTA_WITH_MUTTON_CHOP = block(DisplayBlocks.PASTA_WITH_MUTTON_CHOP);
    public static final RegistryObject<Item> ROASTED_MUTTON_CHOPS = block(DisplayBlocks.ROASTED_MUTTON_CHOPS);
    public static final RegistryObject<Item> STEAK_AND_POTATOES = block(DisplayBlocks.STEAK_AND_POTATOES);
    public static final RegistryObject<Item> VEGETABLE_NOODLES = block(DisplayBlocks.VEGETABLE_NOODLES);
    public static final RegistryObject<Item> RATATOUILLE = block(DisplayBlocks.RATATOUILLE);
    public static final RegistryObject<Item> SQUID_INK_PASTA = block(DisplayBlocks.SQUID_INK_PASTA);
    public static final RegistryObject<Item> GRILLED_SALMON = block(DisplayBlocks.GRILLED_SALMON);
    public static final RegistryObject<Item> MUSHROOM_RICE = block(DisplayBlocks.MUSHROOM_RICE);
    public static final RegistryObject<Item> ROAST_CHICKEN = block(DisplayBlocks.ROAST_CHICKEN);
    public static final RegistryObject<Item> STUFFED_PUMPKIN = block(DisplayBlocks.STUFFED_PUMPKIN);
    public static final RegistryObject<Item> HONEY_GLAZED_HAM = block(DisplayBlocks.HONEY_GLAZED_HAM);
    public static final RegistryObject<Item> SHEPHEREDS_PIE = block(DisplayBlocks.SHEPHEREDS_PIE);
    public static final RegistryObject<Item> APPLE_CIDER = block(DisplayBlocks.APPLE_CIDER);
    public static final RegistryObject<Item> MELON_JUICE = block(DisplayBlocks.MELON_JUICE);
    public static final RegistryObject<Item> HOT_COCOA = block(DisplayBlocks.HOT_COCOA);

    public static final RegistryObject<Item> PLATED_DUMPLINGS = block(PlatedBlocks.PLATED_DUMPLINGS);
    public static final RegistryObject<Item> PLATED_HAMBURGER= block(PlatedBlocks.PLATED_HAMBURGER);
    public static final RegistryObject<Item> PLATED_BARBECUE_STICK= block(PlatedBlocks.PLATED_BARBECUE_STICK);

    public static final RegistryObject<Item> PLATED_CHICKEN_SANDWICH= block(PlatedBlocks.PLATED_CHICKEN_SANDWICH);
    public static final RegistryObject<Item> PLATED_COD_ROLL= block(PlatedBlocks.PLATED_COD_ROLL);
    public static final RegistryObject<Item> PLATED_EGG_SANDWICH= block(PlatedBlocks.PLATED_EGG_SANDWICH);
    public static final RegistryObject<Item> PLATED_KELP_ROLL= block(PlatedBlocks.PLATED_KELP_ROLL);
    public static final RegistryObject<Item> PLATED_KELP_ROLL_SLICE= block(PlatedBlocks.PLATED_KELP_ROLL_SLICE);
    public static final RegistryObject<Item> PLATED_SALMON_ROLL= block(PlatedBlocks.PLATED_SALMON_ROLL);
    public static final RegistryObject<Item> PLATED_MELON_POPSICLE= block(PlatedBlocks.PLATED_MELON_POPSICLE);
    public static final RegistryObject<Item> PLATED_STUFFED_POTATO= block(PlatedBlocks.PLATED_STUFFED_POTATO);
     public static final RegistryObject<Item> PLATED_CABBAGE_ROLLS= block(PlatedBlocks.PLATED_CABBAGE_ROLL);
     public static final RegistryObject<Item> PLATED_BACON_SANDWICH= block(PlatedBlocks.PLATED_BACON_SANDWICH);
     public static final RegistryObject<Item> PLATED_MUTTON_WRAP= block(PlatedBlocks.PLATED_MUTTON_WRAP);

    public static final RegistryObject<Item> PLATED_CAKE_SLICE =  block(SmallPlatedBlocks.PLATED_CAKE_SLICE);
    public static final RegistryObject<Item> PLATED_APPLE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_APPLE_PIE_SLICE);
    public static final RegistryObject<Item> PLATED_CHOCOLATE_PIE_SLICE =  block(SmallPlatedBlocks.PLATED_CHOCOLATE_PIE_SLICE);
    public static final RegistryObject<Item> PLATED_SWEET_BERRY_CHEESECAKE_SLICE =  block(SmallPlatedBlocks.PLATED_SWEET_BERRY_CHEESECAKE_SLICE);
    public static final RegistryObject<Item> SMALL_PLATED_STUFFED_POTATO =  block(SmallPlatedBlocks.PLATED_STUFFED_POTATO);
    public static final RegistryObject<Item> SMALL_PLATED_COD_ROLL =  block(SmallPlatedBlocks.PLATED_COD_ROLL);
    public static final RegistryObject<Item> SMALL_PLATED_SALMON_ROLL =  block(SmallPlatedBlocks.PLATED_SALMON_ROLL);
    public static final RegistryObject<Item> SMALL_PLATED_KELP_ROLL_SLICE =  block(SmallPlatedBlocks.PLATED_KELP_ROLL_SLICE);
    public static final RegistryObject<Item> SMALL_PLATED_CABBAGE_ROLLS =  block(SmallPlatedBlocks.PLATED_CABBAGE_ROLLS);
    public static final RegistryObject<Item> SMALL_PLATE =  block(DisplayBlocks.SMALL_PLATE);


    //VANILA
    public static final RegistryObject<Item> MUSHROOM_STEW = block(DisplayBlocks.MUSHROOM_STEW);
    public static final RegistryObject<Item> RABBIT_STEW = block(DisplayBlocks.RABBIT_STEW);
    public static final RegistryObject<Item> BEETROOT_STEW = block(DisplayBlocks.BEETROOT_STEW);

    //CORN DELIGHT

    public static final RegistryObject<Item> CD_NACHOS_BOWL = block(DisplayBlocks.CD_NACHOS_BOWL);
    public static final RegistryObject<Item> CD_CREAMY_COR_DRINK = block(DisplayBlocks.CD_CREAMY_COR_DRINK);

    public static final RegistryObject<Item> CD_CORNBREAD_STUFFING = block(DisplayBlocks.CD_CORNBREAD_STUFFING);
    public static final RegistryObject<Item> CD_CORN_SOUP = block(DisplayBlocks.CD_CORN_SOUP);
    public static final RegistryObject<Item> CD_CREAMED_CORN = block(DisplayBlocks.CD_CREAMED_CORN);

    //Expanded delight
    public static final RegistryObject<Item> ED_ASPARAGUS_SOUP = block(DisplayBlocks.ED_ASPARAGUS_SOUP);
    public static final RegistryObject<Item> ED_ASPARAGUS_SOUP_CREAMY = block(DisplayBlocks.ED_ASPARAGUS_SOUP_CREAMY);
    public static final RegistryObject<Item> ED_ASPARAGUS_AND_BACON_CHEESY = block(DisplayBlocks.ED_ASPARAGUS_AND_BACON_CHEESY);
    public static final RegistryObject<Item> ED_PEPERONATA = block(DisplayBlocks.ED_PEPERONATA);
    public static final RegistryObject<Item> ED_PEANUT_HONEY_SOUP = block(DisplayBlocks.ED_PEANUT_HONEY_SOUP);
    public static final RegistryObject<Item> ED_MAC_AND_CHEESE = block(DisplayBlocks.ED_MAC_AND_CHEESE);
    public static final RegistryObject<Item> ED_PEANUT_SALAD = block(DisplayBlocks.ED_PEANUT_SALAD);
    public static final RegistryObject<Item> ED_SWEET_POTTATO_SALAD = block(DisplayBlocks.ED_SWEET_POTTATO_SALAD);

    public static final RegistryObject<Item> ED_CINNAMON_RICE = block(DisplayBlocks.ED_CINNAMON_RICE);
    public static final RegistryObject<Item> ED_CINNAMON_APPLES = block(DisplayBlocks.ED_CINNAMON_APPLES);

    public static final RegistryObject<Item> ED_APPLE_JUICE = block(DisplayBlocks.ED_APPLE_JUICE);
    public static final RegistryObject<Item> ED_SWEET_BERRY_JUICE = block(DisplayBlocks.ED_SWEET_BERRY_JUICE);
    public static final RegistryObject<Item> ED_GLOW_BERRY_JUICE = block(DisplayBlocks.ED_GLOW_BERRY_JUICE);



    //delightful
    public static final RegistryObject<Item> DF_MATCHA_ICE_CREAM = block(DisplayBlocks.DF_MATCHA_ICE_CREAM);
    public static final RegistryObject<Item> DF_MATCHA_MILKSHAKE = block(DisplayBlocks.DF_MATCHA_MILKSHAKE);
    public static final RegistryObject<Item> DF_SALMONBERRY_ICE_CREAM = block(DisplayBlocks.DF_SALMONBERRY_ICE_CREAM);
    public static final RegistryObject<Item> DF_SALMONBERRY_MILKSHAKE = block(DisplayBlocks.DF_SALMONBERRY_MILKSHAKE);
    public static final RegistryObject<Item> DF_MATCHA_LATTE = block(DisplayBlocks.DF_MATCHA_LATTE);
    public static final RegistryObject<Item> DF_ENDER_NECTAR = block(DisplayBlocks.DF_ENDER_NECTAR);
    public static final RegistryObject<Item> DF_BERRY_MATCHA_LATTE = block(DisplayBlocks.DF_BERRY_MATCHA_LATTE);
    public static final RegistryObject<Item> DF_CACTUS_CHILI = block(DisplayBlocks.DF_CACTUS_CHILI);
    public static final RegistryObject<Item> DF_FIELD_SALAD = block(DisplayBlocks.DF_FIELD_SALAD);
    public static final RegistryObject<Item> DF_STUFFED_CANTALOUPE = block(DisplayBlocks.DF_STUFFED_CANTALOUPE);
    public static final RegistryObject<Item> DF_SINIGANG = block(DisplayBlocks.DF_SINIGANG);
    public static final RegistryObject<Item> DF_CACTUS_SOUP = block(DisplayBlocks.DF_CACTUS_SOUP);

//PINEAPPLE DELIGHT
    public static final RegistryObject<Item> PD_PINEAPPLE_FRIED_RICE = block(DisplayBlocks.PD_PINEAPPLE_FRIED_RICE);
    public static final RegistryObject<Item> PD_PINEAPPLE_ICE_CREAM = block(DisplayBlocks.PD_PINEAPPLE_ICE_CREAM);
    public static final RegistryObject<Item> PD_PINEAPPLE_MILK_SHAKE = block(DisplayBlocks.PD_PINEAPPLE_MILK_SHAKE);
    public static final RegistryObject<Item> PD_PINEAPPLE_JUICE = block(DisplayBlocks.PD_PINEAPPLE_JUICE);


    //ocean delight
    public static final RegistryObject<Item> OD_BOWL_OF_GUARDIAN_SOUP = block(DisplayBlocks.OD_BOWL_OF_GUARDIAN_SOUP);
    public static final RegistryObject<Item> OD_BRAISED_SEA_PICKLE = block(DisplayBlocks.OD_BRAISED_SEA_PICKLE);
    public static final RegistryObject<Item> OD_SEAGRASS_SALAD = block(DisplayBlocks.OD_SEAGRASS_SALAD);
    public static final RegistryObject<Item> OD_SQUID_RINGS = block(DisplayBlocks.OD_SQUID_RINGS);


    //alex delight
    public static final RegistryObject<Item> AD_MAGGOT_SALAD = block(DisplayBlocks.AD_MAGGOT_SALAD);
    public static final RegistryObject<Item> AD_KANGAROO_STEW = block(DisplayBlocks.AD_KANGAROO_STEW);
    public static final RegistryObject<Item> AD_ACACIA_BLOSSOM_SOUP = block(DisplayBlocks.AD_ACACIA_BLOSSOM_SOUP);
    public static final RegistryObject<Item> AD_LOBSTER_PASTA = block(DisplayBlocks.AD_LOBSTER_PASTA);
    public static final RegistryObject<Item> AD_KANGAROO_PASTA = block(DisplayBlocks.AD_KANGAROO_PASTA);

    //cultural delights
    public static final RegistryObject<Item> CTD_HEARTY_SALAD = block(DisplayBlocks.CTD_HEARTY_SALAD);
    public static final RegistryObject<Item> CTD_CREAMED_CORN = block(DisplayBlocks.CTD_CREAMED_CORN);
    public static final RegistryObject<Item> CTD_SPICY_CURRY = block(DisplayBlocks.CTD_SPICY_CURRY);
    public static final RegistryObject<Item> CTD_FRIED_EGGPLANT_PASTA = block(DisplayBlocks.CTD_FRIED_EGGPLANT_PASTA);

    //large meals
    public static final RegistryObject<Item> LM_PUFFERFISH_BROTH = block(DisplayBlocks.LM_PUFFERFISH_BROTH);
    public static final RegistryObject<Item> LM_POTATO_SOUP = block(DisplayBlocks.LM_POTATO_SOUP);
    public static final RegistryObject<Item> LM_RED_SOUP = block(DisplayBlocks.LM_RED_SOUP);
    public static final RegistryObject<Item> LM_TOMATO_EGG_SOUP = block(DisplayBlocks.LM_TOMATO_EGG_SOUP);
    public static final RegistryObject<Item> LM_COD_DELUXE= block(DisplayBlocks.LM_COD_DELUXE);
    public static final RegistryObject<Item> LM_HEARTY_LUNCH = block(DisplayBlocks.LM_HEARTY_LUNCH);
    public static final RegistryObject<Item> LM_CHICKEN_CURRY = block(DisplayBlocks.LM_CHICKEN_CURRY);
    public static final RegistryObject<Item> LM_PASTA_WITH_MUSHROOM_SAUCE = block(DisplayBlocks.LM_PASTA_WITH_MUSHROOM_SAUCE);
    public static final RegistryObject<Item> LM_OMURICE = block(DisplayBlocks.LM_OMURICE);
    public static final RegistryObject<Item> LM_MUSHROOM_POT_PIE = block(DisplayBlocks.LM_MUSHROOM_POT_PIE);
    public static final RegistryObject<Item> LM_ROASTED_MUTTOH_RACK = block(DisplayBlocks.LM_ROASTED_MUTTOH_RACK);
    public static final RegistryObject<Item> LM_SWEET_BERRY_CUSTARD = block(DisplayBlocks.LM_SWEET_BERRY_CUSTARD);
    public static final RegistryObject<Item> LM_RICE_PUDDING = block(DisplayBlocks.LM_RICE_PUDDING);

    //festive delight
    public static final RegistryObject<Item> FD_FESTIVE_CHICKEN = block(DisplayBlocks.FD_FESTIVE_CHICKEN);
    public static final RegistryObject<Item> FD_CHRISTMAS_TEA = block(DisplayBlocks.FD_CHRISTMAS_TEA);
    public static final RegistryObject<Item> FD_SALMON_VERRINES = block(DisplayBlocks.FD_SALMON_VERRINES);

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

}
