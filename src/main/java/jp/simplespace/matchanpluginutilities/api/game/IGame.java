package jp.simplespace.matchanpluginutilities.api.game;

import org.bukkit.scheduler.BukkitRunnable;

public interface IGame<E extends BukkitRunnable> {
    boolean isStarting();
    void start();
    void setRunnable(E task);
    E getRunnable();
}
