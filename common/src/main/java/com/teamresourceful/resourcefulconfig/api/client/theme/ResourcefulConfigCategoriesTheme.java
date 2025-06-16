package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigCategoriesTheme {

    ResourcefulConfigCategoriesTheme DEFAULT = new ResourcefulConfigCategoriesTheme() {};

    default ResourceLocation entry(boolean hovered) {
        return hovered ? ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover") : ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default Style style(boolean hovered) {
        return Style.EMPTY.withColor(hovered ? 0xFFFAF9F6 : 0xFF727478);
    }
}
