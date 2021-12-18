package jp.simplespace.matchanpluginutilities.api.config;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import static jp.simplespace.matchanpluginutilities.api.config.ConfigManager.configs;

public class Config {
    private File file;
    private File folder;
    private FileConfiguration config;
    private Plugin plugin;
    private String name;
    public Config(Plugin pl, File folder, String name){
        plugin=pl;
        this.folder=folder;
        file=new File(folder,name);
        saveDefaultConfig();
        config= YamlConfiguration.loadConfiguration(file);
        configs.add(this);
        this.name=name;
    }
    public void reload(){
        file=new File(folder,config.getName());
        saveDefaultConfig();
        config= YamlConfiguration.loadConfiguration(file);
    }
    public void saveDefaultConfig(){
        if(!file.exists()){
            plugin.saveResource("config.yml",false);
        }
    }
    public FileConfiguration config(){
        return config;
    }
    public File getFile(){
        return file;
    }
    public void save(){
        try {
            config.save(file);
        } catch (IOException e) {
            Bukkit.getLogger().log(Level.SEVERE, "Could not save config to " + file, e);
        }
    }
    public Plugin getPlugin(){
        return this.plugin;
    }
    public File getFolder(){
        return this.folder;
    }
    public String getName(){
        return this.name;
    }
}
