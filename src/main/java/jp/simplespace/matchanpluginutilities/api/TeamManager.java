package jp.simplespace.matchanpluginutilities.api;

import jp.simplespace.matchanpluginutilities.Main;
import org.bukkit.plugin.Plugin;

public class TeamManager {
    private static Plugin plugin;
    private static boolean isInit = false;
    public static void init(){
        if(isInit) return;
        plugin = Main.getPlugin();
        isInit = true;
    }
}
