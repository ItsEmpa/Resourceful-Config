package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigScrollbarTheme {

    ResourcefulConfigScrollbarTheme DEFAULT = new ResourcefulConfigScrollbarTheme() {};

    default ResourceLocation background() {
        return ResourcefulConfigTheme.EMPTY_TEXTURE;
    }

    default ResourceLocation thumb(boolean hovered) {
        return hovered ? ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "scrollbar_thumb_hover") : ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "scrollbar_thumb");
    }

    default int text(boolean hovered) {
        return hovered ? 0xFFFAF9F6 : 0xFF727478;
    }
}
