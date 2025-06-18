package com.teamresourceful.resourcefulconfig.client.components.options.types;

import com.teamresourceful.resourcefulconfig.api.types.entries.ResourcefulConfigObjectEntry;
import com.teamresourceful.resourcefulconfig.client.UIConstants;
import com.teamresourceful.resourcefulconfig.client.components.ModSprites;
import com.teamresourceful.resourcefulconfig.client.components.base.BaseWidget;
import com.teamresourceful.resourcefulconfig.client.components.base.ListWidget;
import com.teamresourceful.resourcefulconfig.client.components.options.Options;
import com.teamresourceful.resourcefulconfig.client.screens.base.ModalOverlay;
import com.teamresourceful.resourcefulconfig.client.theme.ActiveTheme;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderType;

public class ObjectOptionWidget extends BaseWidget {

    private static final int WIDTH = 100;
    private static final int SIZE = 12;
    private static final int SPACING = 4;
    private static final int PADDING = 2;

    private final ResourcefulConfigObjectEntry entry;

    public ObjectOptionWidget(ResourcefulConfigObjectEntry entry) {
        super(WIDTH, 16);

        this.entry = entry;
    }

    @Override
    protected void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        graphics.blitSprite(RenderType::guiTextured, ActiveTheme.button().background(this.isHovered()), getX(), getY(), getWidth(), getHeight());

        int contentWidth = font.width(UIConstants.EDIT) + SPACING + SIZE;

        graphics.blitSprite(
                RenderType::guiTextured,
                ActiveTheme.button().edit(),
                getX() + (getWidth() - contentWidth) / 2, getY() + PADDING,
                SIZE, SIZE,
                ActiveTheme.button().icon(this.isHovered())
        );
        graphics.drawString(
                font, UIConstants.EDIT.copy().withStyle(ActiveTheme.button().style(this.isHovered())),
                getX() + (getWidth() - contentWidth) / 2 + SIZE + SPACING,
                getY() + (getHeight() - font.lineHeight) / 2 + 1,
                -1
        );
    }

    @Override
    public void onClick(double mouseX, double mouseY) {
        new ObjectEditOverlay(this.entry).open();
    }


    private static class ObjectEditOverlay extends ModalOverlay {

        private final ResourcefulConfigObjectEntry entry;

        protected ObjectEditOverlay(ResourcefulConfigObjectEntry entry) {
            super();
            this.entry = entry;

            this.title = entry.getTitle(UIConstants.EDIT_OBJECT);
        }

        @Override
        protected void init() {
            super.init();

            ListWidget list = addRenderableWidget(new ListWidget(0, 0, this.contentWidth, this.contentHeight));
            list.setPosition(this.left, this.top);
            Options.populateOptions(list, this.entry.elements());
        }

        @Override
        public void renderBackground(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
            super.renderBackground(graphics, mouseX, mouseY, partialTicks);
        }
    }
}
