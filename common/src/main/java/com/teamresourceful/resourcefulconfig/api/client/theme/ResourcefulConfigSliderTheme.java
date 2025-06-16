package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigSliderTheme {

    ResourcefulConfigSliderTheme DEFAULT = new ResourcefulConfigSliderTheme() {};

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default ResourceLocation line() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover");
    }

    default ResourceLocation pill() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    }

    default int text() {
        return 0xFFFAF9F6;
    }
}
