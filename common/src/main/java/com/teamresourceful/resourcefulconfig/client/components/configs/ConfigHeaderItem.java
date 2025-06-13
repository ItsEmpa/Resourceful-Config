package com.teamresourceful.resourcefulconfig.client.components.configs;

import com.teamresourceful.resourcefulconfig.client.theme.ActiveTheme;
import com.teamresourceful.resourcefulconfig.client.UIConstants;
import com.teamresourceful.resourcefulconfig.client.components.base.ContainerWidget;
import com.teamresourceful.resourcefulconfig.client.components.base.ListWidget;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.StringWidget;
import net.minecraft.client.gui.layouts.LinearLayout;
import net.minecraft.client.renderer.RenderType;

public class ConfigHeaderItem extends ContainerWidget implements ListWidget.Item {


    public ConfigHeaderItem() {
        super(0, 0, 0, 0);
    }

    public void init() {
        clear();

        Font font = Minecraft.getInstance().font;

        int width = this.width - UIConstants.PAGE_PADDING * 4;

        LinearLayout titleDesc = LinearLayout
                .vertical()
                .spacing(UIConstants.SPACING);

        titleDesc.addChild(new StringWidget(width, 9, UIConstants.MOD_CONFIGS, font).alignLeft().setColor(ActiveTheme.primaryTextColor()));
        titleDesc.addChild(new StringWidget(width, 9, UIConstants.MOD_CONFIGS_DESCRIPTION, font).alignLeft().setColor(ActiveTheme.secondaryTextColor()));

        titleDesc.arrangeElements();
        titleDesc.setPosition(this.getX() + UIConstants.PAGE_PADDING * 2, this.getY() + UIConstants.PAGE_PADDING * 2);
        titleDesc.visitWidgets(this::addRenderableWidget);
        this.height = titleDesc.getHeight() + UIConstants.PAGE_PADDING * 3;
    }

    @Override
    protected void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        graphics.blitSprite(
                RenderType::guiTextured,
                ActiveTheme.accent(),
                getX() + UIConstants.PAGE_PADDING, getY() + UIConstants.PAGE_PADDING,
                width - UIConstants.PAGE_PADDING * 2, height - UIConstants.PAGE_PADDING
        );
        super.renderWidget(graphics, mouseX, mouseY, partialTicks);
    }

    @Override
    protected void positionUpdated() {
        init();
    }

    @Override
    public void setItemWidth(int width) {
        this.setWidth(width);
    }
}
