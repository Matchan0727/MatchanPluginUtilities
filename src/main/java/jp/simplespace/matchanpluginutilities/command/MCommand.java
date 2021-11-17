package jp.simplespace.matchanpluginutilities.command;

import jp.simplespace.matchanpluginutilities.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.defaults.PluginsCommand;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

public class MCommand {
    private final PluginCommand command;
    private TabCompleter tabCompleter;
    @Nullable private MCommand subCommand;
    public MCommand(PluginCommand command){
        this.command=command;
        this.tabCompleter=command.getTabCompleter();
        this.subCommand=subCommand;
    }
    public MCommand(String name){
        this(Bukkit.getPluginCommand(name));
    }

    public void setSubCommand(MCommand command){
        this.subCommand=command;
    }
    public MCommand getSubCommand(){
        return this.subCommand;
    }

}
