package com.teamresourceful.resourcefulconfig.client.components.categories;

import com.teamresourceful.resourcefulconfig.api.client.theme.ResourcefulConfigActiveTheme;
import com.teamresourceful.resourcefulconfig.client.components.base.ListWidget;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;

public class CategoriesListWidget extends ListWidget {

    public CategoriesListWidget(int width, int height) {
        super(0, 0, width, height);
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        ResourceLocation container = ResourcefulConfigActiveTheme.current.getContainer();
        graphics.blitSprite(RenderType::guiTextured, container, getX(), getY(), getWidth(), getHeight());
        super.renderWidget(graphics, mouseX, mouseY, partialTicks);
    }
}
