package jp.simplespace.matchanpluginutilities.api.gui;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiListener implements Listener {
    @EventHandler
    public void onClickInventory(InventoryClickEvent e){
        for(Gui gui : Gui.getGuiSet()){
            if (gui.getInventory().equals(e.getClickedInventory())){
                gui.getElementMap().get(e.getSlot()).action(e);
                return;
            }
        }
    }
}
