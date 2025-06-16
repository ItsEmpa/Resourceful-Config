package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigModalTheme {

    ResourcefulConfigModalTheme DEFAULT = new ResourcefulConfigModalTheme() {};

    default ResourceLocation header() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "header");
    }

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    }
}
