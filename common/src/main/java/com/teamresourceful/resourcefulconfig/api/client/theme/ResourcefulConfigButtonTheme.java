package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigButtonTheme {

    ResourcefulConfigButtonTheme DEFAULT = new ResourcefulConfigButtonTheme() {};

    default ResourceLocation background(boolean hovered) {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default int icon(boolean hovered) {
        return hovered ? 0xFFFAF9F6 : 0xFF727478;
    }

    default Style style(boolean hovered) {
        return Style.EMPTY.withColor(hovered ? 0xFFFAF9F6 : 0xFF727478);
    }
}
