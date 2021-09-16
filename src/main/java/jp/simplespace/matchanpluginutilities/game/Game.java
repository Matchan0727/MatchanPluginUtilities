package jp.simplespace.matchanpluginutilities.game;

import org.bukkit.scheduler.BukkitRunnable;

public interface Game {
    boolean isStarting();
    void start();
    void setRunnable(BukkitRunnable task);
    BukkitRunnable getRunnable(BukkitRunnable task);
}
