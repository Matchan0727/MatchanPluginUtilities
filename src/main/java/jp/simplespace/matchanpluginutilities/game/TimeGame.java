package jp.simplespace.matchanpluginutilities.game;

public interface TimeGame extends Game {
    void setTime(long second);
    void setTime(int second);
    long getTimeSecond();
    int getTimeMinute();
    int getTimeHour();
    void pauseTime(boolean b);
    boolean isPauseTime();

}
