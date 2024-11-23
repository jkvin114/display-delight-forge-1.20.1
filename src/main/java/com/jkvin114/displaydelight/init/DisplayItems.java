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

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

}
