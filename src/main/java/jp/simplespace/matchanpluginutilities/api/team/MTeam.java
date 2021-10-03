package jp.simplespace.matchanpluginutilities.api.team;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MTeam implements ITeam{
    private final Set<Player> entries = new HashSet<>();
    private String name;
    private String displayName;
    private Scoreboard scoreboard;
    private Team team;
    private ChatColor color;

    MTeam(Scoreboard scoreboard, String name, String displayName, ChatColor color){
        this.scoreboard=scoreboard;
        this.name=name;
        this.displayName=displayName;
        this.team=scoreboard.registerNewTeam(name);
        team.setSuffix(ChatColor.RESET.toString());
        team.setDisplayName(displayName);
        team.setColor(color);
    }
    @Override
    public boolean add(Player player) {
        if(!entries.contains(player)){
            team.addEntry(player.getUniqueId().toString());
        }
        return entries.add(player);
    }

    @Override
    public boolean remove(Player player) {
        if(entries.contains(player)){
            team.removeEntry(player.getUniqueId().toString());
        }
        return entries.remove(player);
    }

    @Override
    public boolean hasEntry(Player player) {
        return entries.contains(player);
    }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDisplayName(){
        return displayName;
    }

    @Override
    public Set<Player> getEntries() {
        return entries;
    }

    @Override
    public Scoreboard getScoreboard() {
        return scoreboard;
    }
    @Override
    public Team getTeam(){
        return team;
    }

    public void setOption(Team.Option option, Team.OptionStatus status) {
        team.setOption(option,status);
    }

    public Team.OptionStatus getOption(Team.Option option) {
        return team.getOption(option);
    }
}
