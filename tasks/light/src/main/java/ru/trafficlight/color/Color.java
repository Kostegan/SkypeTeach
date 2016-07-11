package ru.trafficlight.color;

/**
 *
 */
public enum Color {
    Green(2),
    Yellow(3),
    Red(5);

    Color(int glowTime){
        this.glowTime = glowTime;
    }

    private int glowTime;

    public int getGlowTime(){
        return glowTime;
    }
}
