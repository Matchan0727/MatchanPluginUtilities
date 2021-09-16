package jp.simplespace.matchanpluginutilities;

import jp.simplespace.matchanpluginutilities.api.TeamManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        TeamManager.init();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static Plugin getPlugin(){
        return plugin;
    }
}
