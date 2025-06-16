package com.teamresourceful.resourcefulconfig.client.components.base;

import com.teamresourceful.resourcefulconfig.client.theme.ActiveTheme;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Renderable;
import net.minecraft.client.gui.components.events.GuiEventListener;
import net.minecraft.client.gui.layouts.LayoutElement;
import net.minecraft.client.gui.narration.NarratableEntry;
import net.minecraft.client.gui.navigation.ScreenRectangle;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.util.Mth;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ListWidget extends ContainerWidget {

    private static final int SCROLLBAR_WIDTH = 6;
    private static final int SCROLLBAR_PADDING = 4;
    private static final int OVERSCROLL = 2;
    private static final int PADDING = 2;

    protected final List<Item> items = new ArrayList<>();

    private double scroll = 0;
    private int lastHeight = 0;
    private boolean scrolling = false;

    public ListWidget(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public void update(ListWidget old) {
        if (this.items.size() != old.items.size()) return;
        if (this.height != old.height) return;
        updateLastHeight();
        if (this.lastHeight != old.lastHeight) return;

        this.scroll = old.scroll;
        this.scrolling = old.scrolling;
    }

    public void add(Item item) {
        items.add(item);
        updateScrollBar();
    }

    @Override
    public void clear() {
        super.clear();
        this.items.clear();
    }

    @Override
    public @NotNull List<? extends GuiEventListener> children() {
        return items;
    }

    @Override
    public void renderWidget(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        int x = this.getX() + PADDING;
        int y = this.getY() + PADDING;
        int width = this.getWidth() - PADDING * 2;
        int height = this.getHeight() - PADDING * 2;


        boolean showsScrollBar = this.lastHeight > height;
        int actualWidth = width - (showsScrollBar ? SCROLLBAR_WIDTH + 2 : 0);

        graphics.enableScissor(x, y, x + actualWidth, y + height);

        int itemY = y - (int) scroll + OVERSCROLL / 2;
        this.lastHeight = 0;

        for (Item item : items) {
            item.setItemWidth(actualWidth);
            item.setX(getX() + PADDING);
            item.setY(itemY);

            item.render(graphics, mouseX, mouseY, partialTicks);
            itemY += item.getHeight();
            this.lastHeight += item.getHeight();
        }

        graphics.disableScissor();

        if (this.lastHeight > height) {
            int scrollBarX = x + actualWidth + 1;
            int scrollBarY = y + SCROLLBAR_PADDING + (int) ((this.scroll / (double) this.lastHeight) * height);
            int thumbHeight = (int) ((height / (double) this.lastHeight) * height) - SCROLLBAR_PADDING * 2;
            boolean hovered = this.isMouseOver(mouseX, mouseY) && mouseX >= scrollBarX &&
                    mouseX <= scrollBarX + SCROLLBAR_WIDTH && mouseY >= scrollBarY && mouseY <= scrollBarY + thumbHeight;

            graphics.blitSprite(
                    RenderType::guiTextured, ActiveTheme.scrollbar().background(),
                    scrollBarX, y + 1, SCROLLBAR_WIDTH, height - 2
            );
            graphics.blitSprite(
                    RenderType::guiTextured, ActiveTheme.scrollbar().thumb(hovered),
                    scrollBarX, scrollBarY, SCROLLBAR_WIDTH, thumbHeight
            );
        }
    }

    @Override
    public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
        if (this.scrolling) {
            double scrollBarHeight = (this.height / (double) this.lastHeight) * this.height;
            double scrollBarDragY = dragY / (this.height - scrollBarHeight);
            this.setScroll(this.scroll + scrollBarDragY * this.lastHeight);
            return true;
        }
        return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double scrollX, double scrollY) {
        this.setScroll(this.scroll - scrollY * 10);
        return true;
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (isMouseOver(mouseX, mouseY)) {
            if (isMouseOverScrollBar(mouseX, mouseY)) {
                this.scrolling = true;
                return true;
            }
            return super.mouseClicked(mouseX, mouseY, button);
        }
        return false;
    }

    @Override
    public boolean mouseReleased(double d, double e, int i) {
        if (i == 0) {
            this.scrolling = false;
        }
        return super.mouseReleased(d, e, i);
    }

    private boolean isMouseOverScrollBar(double mouseX, double mouseY) {
        if (this.lastHeight > this.height) {
            int scrollBarX = this.getX() + this.getWidth() - PADDING - SCROLLBAR_WIDTH - 1;
            return mouseX >= scrollBarX && mouseX <= scrollBarX + SCROLLBAR_WIDTH && mouseY >= this.getY() && mouseY <= this.getY() + this.height;
        }
        return false;
    }

    protected void updateLastHeight() {
        boolean showsScrollBar = this.lastHeight > this.height;
        int actualWidth = this.getWidth() - PADDING * 2 - (showsScrollBar ? SCROLLBAR_WIDTH + 2 : 0);

        this.lastHeight = 0;
        int y = this.getY() + PADDING - (int) scroll + OVERSCROLL / 2;
        for (Item item : items) {
            item.setItemWidth(actualWidth);
            item.setX(getX());
            item.setY(y);
            this.lastHeight += item.getHeight();
            y += item.getHeight();
        }
    }

    protected void updateScrollBar() {
        updateLastHeight();
        this.setScroll(this.scroll);
    }

    protected void setScroll(double scroll) {
        int height = this.getHeight() - PADDING * 2;
        this.scroll = Mth.clamp(scroll, 0, Math.max(0, this.lastHeight - height + OVERSCROLL));
    }

    public interface Item extends GuiEventListener, Renderable, NarratableEntry, LayoutElement {

        @Override
        default @NotNull ScreenRectangle getRectangle() {
            return LayoutElement.super.getRectangle();
        }

        void setItemWidth(int width);
    }
}
