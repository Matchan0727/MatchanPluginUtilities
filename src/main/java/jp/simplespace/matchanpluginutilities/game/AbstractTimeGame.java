package jp.simplespace.matchanpluginutilities.game;

import org.bukkit.scheduler.BukkitRunnable;

public abstract class AbstractTimeGame implements TimeGame {
    boolean isStarting = false;
    long time = 0;
    BukkitRunnable runnable;
    boolean isPause;
    @Override
    public boolean isStarting() {
        return isStarting;
    }

    @Override
    public abstract void start();

    @Override
    public void setRunnable(BukkitRunnable task) {
        runnable=task;
    }

    @Override
    public BukkitRunnable getRunnable(BukkitRunnable task) {
        return runnable;
    }

    @Override
    public void setTime(long second) {
        time=second;
    }

    @Override
    public void setTime(int second) {
        time=second;
    }

    @Override
    public long getTimeSecond() {
        return time;
    }

    @Override
    public int getTimeMinute() {
        return Math.toIntExact(time / 60);
    }

    @Override
    public int getTimeHour() {
        return Math.toIntExact((time / 60)/60);
    }

    @Override
    public void pauseTime(boolean b) {
        isPause=b;
    }

    @Override
    public boolean isPauseTime() {
        return isPause;
    }
}

