package jp.simplespace.matchanpluginutilities.api.game;

import org.bukkit.scheduler.BukkitRunnable;

public interface IGame {
    boolean isStarting();
    void start();
    void setRunnable(BukkitRunnable task);
    BukkitRunnable getRunnable(BukkitRunnable task);
}
