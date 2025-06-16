package com.teamresourceful.resourcefulconfig.client.theme;

import com.teamresourceful.resourcefulconfig.api.client.theme.*;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class ActiveTheme {

    private static ResourcefulConfigTheme current;

    public static void set(ResourcefulConfigTheme theme) {
        if (theme == null) {
            throw new IllegalArgumentException("Theme cannot be null");
        }
        current = theme;
    }

    public static ResourcefulConfigTheme get() {
        if (current == null) {
            throw new IllegalStateException("Active theme has not been set");
        }
        return current;
    }

    public static ResourceLocation background() {
        return current.getBackground();
    }

    public static ResourceLocation section() {
        return current.getSection();
    }

    // Colors

    public static Style primaryStyle() {
        return current.getPrimaryStyle();
    }

    public static Style secondaryStyle() {
        return current.getSecondaryStyle();
    }

    public static int secondaryColor() {
        return current.getSecondaryColor();
    }

    // Elements

    public static ResourcefulConfigDropdownTheme dropdown() {
        return current.dropdown();
    }

    public static ResourcefulConfigTextBoxTheme textbox() {
        return current.textbox();
    }

    public static ResourcefulConfigModalTheme modal() {
        return current.modal();
    }

    public static ResourcefulConfigScrollbarTheme scrollbar() {
        return current.scrollbar();
    }

    public static ResourcefulConfigCategoriesTheme categories() {
        return current.categories();
    }

    public static ResourcefulConfigButtonTheme button() {
        return current.button();
    }

    public static ResourcefulConfigColorTheme color() {
        return current.color();
    }

    public static ResourcefulConfigDraggableTheme draggable() {
        return current.draggable();
    }

    public static ResourcefulConfigToggleTheme toggle() {
        return current.toggle();
    }

    public static ResourcefulConfigSliderTheme slider() {
        return current.slider();
    }
}
