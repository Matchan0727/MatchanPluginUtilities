package jp.simplespace.matchanpluginutilities.api.gui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Gui {
    private static final Set<Gui> guiSet = new HashSet<>();
    private String name;
    private Inventory inventory;
    private final Map<Integer,GuiElement> elementMap = new HashMap<>();
    public Gui(String name, Inventory inventory){
        this.name=name;
        this.inventory=inventory;
        guiSet.add(this);
    }
    public Gui(String name,int size,String displayName){
        this(name,Bukkit.createInventory(null,size,displayName));
    }
    public Gui(String name, InventoryType type,String displayName){
        this(name,Bukkit.createInventory(null,type,displayName));
    }
    public void put(int slot,GuiElement element){
        elementMap.put(slot,element);
    }
    public Inventory getInventory(){
        formatInventory();
        return inventory;
    }
    public Inventory formatInventory(){
        inventory.clear();
        for(int slot : elementMap.keySet()){
            inventory.setItem(slot,elementMap.get(slot).getItemStack());
        }
        return inventory;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Map<Integer,GuiElement> getElementMap(){
        return new HashMap<>(elementMap);
    }
    public InventoryView openGui(Player player){
        return player.openInventory(inventory);
    }
    public static Set<Gui> getGuiSet(){
        return new HashSet<>(guiSet);
    }
}
