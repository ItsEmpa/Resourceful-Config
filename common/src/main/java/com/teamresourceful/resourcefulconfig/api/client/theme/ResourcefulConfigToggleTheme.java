package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigToggleTheme {

    ResourcefulConfigToggleTheme DEFAULT = new ResourcefulConfigToggleTheme() {};

    default ResourceLocation background(boolean hovered) {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default ResourceLocation pill(boolean hovered, boolean value) {
        return value ?
                ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_on") :
                ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_off");
    }

    default int text(boolean hovered, boolean value) {
        return !value ? 0xFFFAF9F6 : 0xFF727478;
    }
}
