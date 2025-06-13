package com.teamresourceful.resourcefulconfig.api.client;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigTheme {

    ResourcefulConfigTheme DEFAULT = new ResourcefulConfigTheme() {};

    default int getPrimaryTextColor() {
        return 0xFFFAF9F6;
    }

    default int getSecondaryTextColor() {
        return 0xFF727478;
    }

    default int getIconColor() {
        return 0xFFFFFFFF;
    }

    default ResourceLocation getContainer() {
        return null;
    }

    default ResourceLocation getBackground() {
        return null;
    }

    default ResourceLocation getHeader() {
        return null;
    }

    default ResourceLocation getAccent() {
        return null;
    }

    default ResourceLocation getButton() {
        return null;
    }

    default ResourceLocation getButtonHover() {
        return null;
    }

    default ResourceLocation getSwitchOn() {
        return null;
    }

    default ResourceLocation getSwitchOff() {
        return null;
    }

}
