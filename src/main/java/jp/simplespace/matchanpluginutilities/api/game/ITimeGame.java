package jp.simplespace.matchanpluginutilities.api.game;

import org.bukkit.scheduler.BukkitRunnable;

public interface ITimeGame<E extends BukkitRunnable> extends IGame<E> {
    void setTime(long second);
    void setTime(int second);
    long getTimeSecond();
    int getTimeMinute();
    int getTimeHour();
    void pauseTime(boolean b);
    boolean isPauseTime();

}
