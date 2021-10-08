package jp.simplespace.matchanpluginutilities.api.gui.setup;

import jp.simplespace.matchanpluginutilities.api.gui.Gui;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class SetupGui extends Gui {
    private FileConfiguration config;
    public SetupGui(String name, Inventory inventory,FileConfiguration config) {
        super(name, inventory);
        this.config=config;
    }

    public SetupGui(String name, int size, String displayName,FileConfiguration config) {
        super(name, size, displayName);
        this.config=config;
    }

    public SetupGui(String name, InventoryType type, String displayName,FileConfiguration config) {
        super(name, type, displayName);
        this.config=config;
    }
    public FileConfiguration getConfig(){
        return config;
    }
    public void setConfig(FileConfiguration config){
        this.config=config;
    }
}
