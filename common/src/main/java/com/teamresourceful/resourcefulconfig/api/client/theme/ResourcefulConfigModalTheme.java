package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigModalTheme {

    ResourcefulConfigModalTheme DEFAULT = new ResourcefulConfigModalTheme() {};

    default ResourceLocation header() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "header");
    }

    default ResourceLocation chevronLeft() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "chevron_left");
    }

    default ResourceLocation cross() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "cross");
    }

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    }
}
