package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigTextBoxTheme {

    ResourcefulConfigTextBoxTheme DEFAULT = new ResourcefulConfigTextBoxTheme() {};

    default ResourceLocation background() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    }
}
