package jp.simplespace.matchanpluginutilities.api.game;

public interface ITimeGame extends IGame {
    void setTime(long second);
    void setTime(int second);
    long getTimeSecond();
    int getTimeMinute();
    int getTimeHour();
    void pauseTime(boolean b);
    boolean isPauseTime();

}
