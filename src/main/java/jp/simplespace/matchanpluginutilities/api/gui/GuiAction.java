package jp.simplespace.matchanpluginutilities.api.gui;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.jetbrains.annotations.Nullable;

public abstract class GuiAction{
    public abstract void run(GuiElement element,InventoryClickEvent e);
}
