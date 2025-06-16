package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigDraggableTheme {

    ResourcefulConfigDraggableTheme DEFAULT = new ResourcefulConfigDraggableTheme() {};

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default ResourceLocation entry(boolean hovered) {
        return hovered ? ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover") : ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default int text(boolean hovered) {
        return hovered ? 0xFFFAF9F6 : 0xFF727478;
    }
}
