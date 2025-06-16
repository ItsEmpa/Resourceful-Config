package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigDropdownTheme {

    ResourcefulConfigDropdownTheme DEFAULT = new ResourcefulConfigDropdownTheme() {};

    default ResourceLocation border() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "accent");
    }

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default ResourceLocation entry(boolean hovered) {
        return hovered ? ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover") : ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default int icon(boolean hovered) {
        return hovered ? 0xFFFAF9F6 : 0xFF727478;
    }

    default Style style(boolean hovered) {
        return Style.EMPTY.withColor(hovered ? 0xFFFAF9F6 : 0xFF727478);
    }
}
