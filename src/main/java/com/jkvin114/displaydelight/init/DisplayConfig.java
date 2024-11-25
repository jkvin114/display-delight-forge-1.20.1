package com.jkvin114.displaydelight.init;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.config.IConfigSpec;
import net.minecraftforge.fml.config.ModConfig;

public class DisplayConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final IConfigSpec CONFIG;

    public static final ForgeConfigSpec.BooleanValue TOOLTIP;
    public static final ForgeConfigSpec.BooleanValue MESSAGE;
    static {
        BUILDER.push("Features");
        TOOLTIP = BUILDER.comment("Should placeable tooltips be enabled?").define("Tooltips", true);
        MESSAGE = BUILDER.comment("Should a message be enabled when attempting to place a food item?").define("Display-Message", true);
        BUILDER.pop();
        CONFIG = BUILDER.build();
    }
}