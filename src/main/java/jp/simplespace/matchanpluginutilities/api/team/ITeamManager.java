package jp.simplespace.matchanpluginutilities.api.team;

import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Scoreboard;
import org.jetbrains.annotations.Nullable;

public interface ITeamManager<T extends ITeam> {
    boolean addTeam(T team);
    boolean removeTeam(T team);
    T createTeam(String name, String displayName, ChatColor color);
    @Nullable
    T getTeam(String name);
    Scoreboard getScoreboard();
}
