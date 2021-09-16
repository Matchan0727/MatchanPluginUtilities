package jp.simplespace.matchanpluginutilities.api.config;

import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class ConfigManager {
    static Set<Config> configs = new HashSet<>();

    public static Config createConfig(Plugin plugin,File folder,String name){
        return new Config(plugin,folder,name);
    }
    public static Set<Config> getConfigSets(){
        return new HashSet<>(configs);
    }
    @Nullable
    public static Config getConfig(String name){
        for(Config config : configs){
            if(config.getConfig().getName().equals(name)){
                return config;
            }
        }
        return null;
    }
}
