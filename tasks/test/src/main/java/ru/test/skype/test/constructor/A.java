package ru.test.skype.test.constructor;

/**
 *
 */
public class A {
    private String name;
    private String surname;
    private String massage;

    public A() {

    }

    public A(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public A(String massage){
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
