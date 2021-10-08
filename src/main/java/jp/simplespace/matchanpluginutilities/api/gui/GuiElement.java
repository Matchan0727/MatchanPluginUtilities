package jp.simplespace.matchanpluginutilities.api.gui;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class GuiElement {
    private ItemStack item;
    private String displayName;
    private String description;
    private GuiAction action;

    public GuiElement(ItemStack item,GuiAction action){
        this.item=item;
        this.displayName=item.getItemMeta().hasDisplayName()?item.getItemMeta().getDisplayName():"";
        this.description=item.getItemMeta().hasLore()?String.join("\n",item.getItemMeta().getLore()):"";
        this.action=action;
    }
    public void action(InventoryClickEvent e){
        action.run(this, e);
    }
    public ItemStack getItemStack(){
        return item;
    }
    public String getDisplayName(){
        return displayName;
    }
    public String getDescription(){
        return description;
    }
    public GuiAction getGuiAction(){
        return action;
    }
}
