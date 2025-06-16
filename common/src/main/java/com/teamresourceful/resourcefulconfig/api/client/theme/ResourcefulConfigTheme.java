package com.teamresourceful.resourcefulconfig.api.client.theme;

import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;

public interface ResourcefulConfigTheme {

    ResourcefulConfigTheme DEFAULT = new ResourcefulConfigTheme() {};
    ResourceLocation EMPTY_TEXTURE = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "empty");

    default int getPrimaryColor() {
        return 0xFFFAF9F6;
    }

    default int getSecondaryColor() {
        return 0xFF727478;
    }

    default Style getPrimaryStyle() {
        return Style.EMPTY.withColor(this.getPrimaryColor());
    }

    default Style getSecondaryStyle() {
        return Style.EMPTY.withColor(this.getSecondaryColor());
    }

    default ResourceLocation getBackground() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "background");
    }

    default ResourceLocation getSection() {
        return ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    }

    default ResourcefulConfigDropdownTheme dropdown() {
        return ResourcefulConfigDropdownTheme.DEFAULT;
    }

    default ResourcefulConfigTextBoxTheme textbox() {
        return ResourcefulConfigTextBoxTheme.DEFAULT;
    }

    default ResourcefulConfigModalTheme modal() {
        return ResourcefulConfigModalTheme.DEFAULT;
    }

    default ResourcefulConfigScrollbarTheme scrollbar() {
        return ResourcefulConfigScrollbarTheme.DEFAULT;
    }

    default ResourcefulConfigCategoriesTheme categories() {
        return ResourcefulConfigCategoriesTheme.DEFAULT;
    }

    default ResourcefulConfigButtonTheme button() {
        return ResourcefulConfigButtonTheme.DEFAULT;
    }

    default ResourcefulConfigColorTheme color() {
        return ResourcefulConfigColorTheme.DEFAULT;
    }

    default ResourcefulConfigDraggableTheme draggable() {
        return ResourcefulConfigDraggableTheme.DEFAULT;
    }

    default ResourcefulConfigToggleTheme toggle() {
        return ResourcefulConfigToggleTheme.DEFAULT;
    }

    default ResourcefulConfigSliderTheme slider() {
        return ResourcefulConfigSliderTheme.DEFAULT;
    }
}
