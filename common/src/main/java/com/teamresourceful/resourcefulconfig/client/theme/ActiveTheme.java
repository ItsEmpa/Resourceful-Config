package com.teamresourceful.resourcefulconfig.client.theme;

import com.teamresourceful.resourcefulconfig.api.client.ResourcefulConfigTheme;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;

import java.util.Objects;

@ApiStatus.Internal
public class ActiveTheme {

    private static final ResourceLocation BACKGROUND = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "background");
    private static final ResourceLocation HEADER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "header");
    private static final ResourceLocation CONTAINER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    private static final ResourceLocation ACCENT = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "accent");

    private static final ResourceLocation BUTTON = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    private static final ResourceLocation BUTTON_HOVER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover");

    private static final ResourceLocation SWITCH_ON = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_on");
    private static final ResourceLocation SWITCH_OFF = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_off");

    private static ResourcefulConfigTheme current;

    public static void set(ResourcefulConfigTheme theme) {
        if (theme == null) {
            throw new IllegalArgumentException("Theme cannot be null");
        }
        current = theme;
    }

    public static ResourceLocation forButton(boolean hovered) {
        if (hovered) {
            return Objects.requireNonNullElse(current.getButtonHover(), BUTTON_HOVER);
        }
        return Objects.requireNonNullElse(current.getButton(), BUTTON);
    }

    public static ResourceLocation forSwitch(boolean value) {
        if (value) {
            return Objects.requireNonNullElse(current.getSwitchOn(), SWITCH_ON);
        }
        return Objects.requireNonNullElse(current.getSwitchOff(), SWITCH_OFF);
    }

    public static ResourceLocation background() {
        return Objects.requireNonNullElse(current.getBackground(), BACKGROUND);
    }

    public static ResourceLocation container() {
        return Objects.requireNonNullElse(current.getContainer(), CONTAINER);
    }

    public static ResourceLocation header() {
        return Objects.requireNonNullElse(current.getHeader(), HEADER);
    }

    public static ResourceLocation accent() {
        return Objects.requireNonNullElse(current.getAccent(), ACCENT);
    }

    public static ResourceLocation button() {
        return Objects.requireNonNullElse(current.getButton(), BUTTON);
    }

    // Colors

    public static int primaryTextColor() {
        return current.getPrimaryTextColor();
    }

    public static int secondaryTextColor() {
        return current.getSecondaryTextColor();
    }

    public static int forText(boolean isTitle) {
        return isTitle ? primaryTextColor() : secondaryTextColor();
    }

    public static int iconColor() {
        return current.getIconColor();
    }
}
