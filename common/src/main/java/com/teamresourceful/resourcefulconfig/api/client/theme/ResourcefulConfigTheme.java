package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigTheme {

    default ResourceLocation getContainer() {
        return ResourcefulConfigThemeDefault.INSTANCE.getContainer();
    }

    default ResourceLocation getBackground() {
        return ResourcefulConfigThemeDefault.INSTANCE.getBackground();
    }

    default ResourceLocation getHeader() {
        return ResourcefulConfigThemeDefault.INSTANCE.getHeader();
    }

    default ResourceLocation getAccent() {
        return ResourcefulConfigThemeDefault.INSTANCE.getAccent();
    }

    default ResourceLocation getButton() {
        return ResourcefulConfigThemeDefault.INSTANCE.getButton();
    }

    default ResourceLocation getButtonHover() {
        return ResourcefulConfigThemeDefault.INSTANCE.getButtonHover();
    }

    default ResourceLocation getSwitchOn() {
        return ResourcefulConfigThemeDefault.INSTANCE.getSwitchOn();
    }

    default ResourceLocation getSwitchOff() {
        return ResourcefulConfigThemeDefault.INSTANCE.getSwitchOff();
    }

    default ResourceLocation getReset() {
        return ResourcefulConfigThemeDefault.INSTANCE.getReset();
    }

    default ResourceLocation getEdit() {
        return ResourcefulConfigThemeDefault.INSTANCE.getEdit();
    }

    default ResourceLocation getChevronDown() {
        return ResourcefulConfigThemeDefault.INSTANCE.getChevronDown();
    }
    default ResourceLocation getChevronLeft() {
        return ResourcefulConfigThemeDefault.INSTANCE.getChevronLeft();
    }
    default ResourceLocation getCross() {
        return ResourcefulConfigThemeDefault.INSTANCE.getCross();
    }
    default ResourceLocation getCheck() {
        return ResourcefulConfigThemeDefault.INSTANCE.getCheck();
    }
    default ResourceLocation getDraggable() {
        return ResourcefulConfigThemeDefault.INSTANCE.getDraggable();
    }
    default ResourceLocation getDelete() {
        return ResourcefulConfigThemeDefault.INSTANCE.getDelete();
    }
    default ResourceLocation getEyeDropper() {
        return ResourcefulConfigThemeDefault.INSTANCE.getEyeDropper();
    }

    default ResourceLocation ofButton(boolean isHovered) {
        return isHovered ? getButtonHover() : getButton();
    }

    default ResourceLocation ofSwitch(boolean on) {
        return on ? getSwitchOn() : getSwitchOff();
    }

    ResourceLocation ofIcon(String icon);



}
