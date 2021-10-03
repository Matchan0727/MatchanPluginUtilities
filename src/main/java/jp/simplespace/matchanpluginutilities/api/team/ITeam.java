package jp.simplespace.matchanpluginutilities.api.team;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import java.util.Set;

public interface ITeam {
    boolean add(Player player);
    boolean remove(Player player);
    boolean hasEntry(Player player);
    String getName();
    Set<Player> getEntries();
    Scoreboard getScoreboard();
    Team getTeam();
    String getDisplayName();
}
