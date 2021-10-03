package jp.simplespace.matchanpluginutilities.api.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class GuiListener implements Listener {
    @EventHandler
    public void onClickInventory(InventoryClickEvent e){
        for(Gui gui : Gui.getGuiSet()){
            if (gui.getInventory().equals(e.getClickedInventory())){
                gui.getElementMap().get(e.getRawSlot()).action(e);
                e.setCancelled(true);
                return;
            }
        }
    }
    @EventHandler
    public void onOpenInventory(InventoryOpenEvent e){
        if(e.getPlayer() instanceof Player){
            Player player = (Player) e.getPlayer();
            player.updateInventory();
        }
    }
}
