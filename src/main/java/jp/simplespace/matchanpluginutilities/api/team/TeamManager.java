package jp.simplespace.matchanpluginutilities.api.team;

import jp.simplespace.matchanpluginutilities.Main;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.scoreboard.Scoreboard;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class TeamManager {
    private final Set<MTeam> teams = new HashSet<>();
    private Scoreboard scoreboard;
    public TeamManager(Scoreboard scoreboard){
        this.scoreboard=scoreboard;
    }

    boolean addTeam(MTeam team){
        return teams.add(team);
    }
    boolean removeTeam(MTeam team){
        return teams.remove(team);
    }
    public MTeam createTeam(String name, String displayName, ChatColor color){
        MTeam team = new MTeam(scoreboard,name,displayName,color);
        teams.add(team);
        return team;
    }
    @Nullable
    public MTeam getTeam(String name){
        for(MTeam team : teams){
            if(team.getName().equalsIgnoreCase(name)) return team;
        }
        return null;
    }
    public Scoreboard getScoreboard(){
        return scoreboard;
    }
}
