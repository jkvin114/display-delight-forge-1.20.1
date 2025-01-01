package com.jkvin114.displaydelight.init;

import com.jkvin114.displaydelight.DisplayDelight;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class DisplayItems {

    public static final DeferredRegister<Item> REGISTRY= DeferredRegister.create(ForgeRegistries.ITEMS, DisplayDelight.MODID);
    public static final RegistryObject<Item> PLATE = registerBlockItem(DisplayBlocks.PLATE);
    public static final RegistryObject<Item> SMALL_PLATE =  registerBlockItem(DisplayBlocks.SMALL_PLATE);

    public static RegistryObject<Item> registerBlockItem(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties())
        );
    }

}
