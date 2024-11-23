package com.jkvin114.displaydelight.mixin;

import com.jkvin114.displaydelight.init.DisplayTags;
import net.minecraft.world.level.Level;

import org.jetbrains.annotations.NotNull;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nullable;
import java.util.List;
@Mixin(Item.class)
public abstract class ItemMixin {

    @Inject(method = "appendHoverText", at = @At("TAIL"))
    private void applyTooltip(ItemStack stack, @Nullable Level pLevel, List<Component> list, TooltipFlag pIsAdvanced, CallbackInfo c) {
        if (stack.is(DisplayTags.DISPLAYABLE)) {
            list.add(Component.translatable("item.displaydelight.tooltip.displayable").withStyle(ChatFormatting.GRAY));
        }
        if(stack.is(DisplayTags.PLATE_DISPLAYABLE) || stack.is(DisplayTags.SMALL_PLATE_DISPLAYABLE)){
            list.add(Component.translatable("item.displaydelight.tooltip.can_placed_on").withStyle(ChatFormatting.GRAY));
        }
        if (stack.is(DisplayTags.PLATE_DISPLAYABLE)) {
            list.add(Component.translatable("block.displaydelight.food_plate").withStyle(ChatFormatting.GRAY));
        }
        if (stack.is(DisplayTags.SMALL_PLATE_DISPLAYABLE)) {
            list.add(Component.translatable("block.displaydelight.small_food_plate").withStyle(ChatFormatting.GRAY));
        }
    }
}