package ru.test.skype.superTest;

/**
 *
 */
public class Male extends People {
    private String mode;

    public Male(String name,int age,String mode) {
        super(name,age);
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
