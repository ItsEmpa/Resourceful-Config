package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigColorTheme {

    ResourcefulConfigColorTheme DEFAULT = new ResourcefulConfigColorTheme() {};

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "accent");
    }

    default ResourceLocation border() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }

    default ResourceLocation presets() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "accent");
    }

    default ResourceLocation eyedropper() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "eye_dropper");
    }
}
