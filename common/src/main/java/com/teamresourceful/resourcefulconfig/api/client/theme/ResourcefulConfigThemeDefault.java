package com.teamresourceful.resourcefulconfig.api.client.theme;

import com.teamresourceful.resourcefulconfig.client.components.ModSprites;
import net.minecraft.resources.ResourceLocation;

public class ResourcefulConfigThemeDefault implements ResourcefulConfigTheme {
    public static final ResourcefulConfigTheme INSTANCE = new ResourcefulConfigThemeDefault();
    private ResourcefulConfigThemeDefault() {}

    private final ResourceLocation RESET = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "reset");
    private final ResourceLocation EDIT = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "edit");
    private final ResourceLocation CHEVRON_DOWN = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "chevron_down");
    private final ResourceLocation CHEVRON_LEFT = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "chevron_left");
    private final ResourceLocation CROSS = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "cross");
    private final ResourceLocation CHECK = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "check");
    private final ResourceLocation DRAGGABLE = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "draggable");
    private final ResourceLocation DELETE = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "delete");
    private final ResourceLocation EYE_DROPPER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "eye_dropper");

    private final ResourceLocation BACKGROUND = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "background");
    private final ResourceLocation HEADER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "header");
    private final ResourceLocation CONTAINER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "container");
    private final ResourceLocation ACCENT = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "accent");

    private final ResourceLocation BUTTON = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button");
    private final ResourceLocation BUTTON_HOVER = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "button_hover");

    private final ResourceLocation SWITCH_ON = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_on");
    private final ResourceLocation SWITCH_OFF = ResourceLocation.fromNamespaceAndPath("resourcefulconfig", "switch_off");


    @Override
    public ResourceLocation getContainer() {
        return CONTAINER;
    }

    @Override
    public ResourceLocation getBackground() {
        return BACKGROUND;
    }

    @Override
    public ResourceLocation getHeader() {
        return HEADER;
    }

    @Override
    public ResourceLocation getAccent() {
        return ACCENT;
    }

    @Override
    public ResourceLocation getButton() {
        return BUTTON;
    }

    @Override
    public ResourceLocation getButtonHover() {
        return BUTTON_HOVER;
    }

    @Override
    public ResourceLocation getSwitchOn() {
        return SWITCH_ON;
    }

    @Override
    public ResourceLocation getSwitchOff() {
        return SWITCH_OFF;
    }

    @Override
    public ResourceLocation getReset() {
        return RESET;
    }

    @Override
    public ResourceLocation getEdit() {
        return EDIT;
    }

    @Override
    public ResourceLocation getChevronDown() {
        return CHEVRON_DOWN;
    }

    @Override
    public ResourceLocation getChevronLeft() {
        return CHEVRON_LEFT;
    }

    @Override
    public ResourceLocation getCross() {
        return CROSS;
    }

    @Override
    public ResourceLocation getCheck() {
        return CHECK;
    }

    @Override
    public ResourceLocation getDraggable() {
        return DRAGGABLE;
    }

    @Override
    public ResourceLocation getDelete() {
        return DELETE;
    }

    @Override
    public ResourceLocation getEyeDropper() {
        return EYE_DROPPER;
    }

    @Override
    public ResourceLocation ofIcon(String icon) {
        return ModSprites.ofIcon(icon);
    }
}
