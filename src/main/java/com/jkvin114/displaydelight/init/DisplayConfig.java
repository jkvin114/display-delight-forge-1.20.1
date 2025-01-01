package com.jkvin114.displaydelight.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.IConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class DisplayConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final IConfigSpec CONFIG;

    public static final ForgeConfigSpec.BooleanValue TOOLTIP;
    public static final ForgeConfigSpec.BooleanValue MESSAGE;
    public static final ForgeConfigSpec.BooleanValue DISABLE_VANILLA_FOODS;
    public static final ForgeConfigSpec.BooleanValue DISABLE_EATING_ANIMATION_FIX;
    static {
        BUILDER.push("Features");
        DISABLE_VANILLA_FOODS = BUILDER
                .comment("Disable Vanila Food(mushroom stew,rabbit stew,beetroot soup) Placement. Set to true if vanila food placement conflicts with other mods")
                .define("Disable-Vanila-Food-Placement", false);
        TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
        DISABLE_EATING_ANIMATION_FIX = BUILDER.comment("This mod uses hardcoded check to remove annoying eating animation while plating some foods.\n" +
                        " Try setting this to true if there are any related issues(can't eat foods, can't plate foods, etc.). (only applicable for Forge version)")
                .define("Disable-Eating-Animation-Fix", false);

        MESSAGE = BUILDER.comment("Should a message be enabled when attempting to place a food item?")
                .define("Display-Message", true);
        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}