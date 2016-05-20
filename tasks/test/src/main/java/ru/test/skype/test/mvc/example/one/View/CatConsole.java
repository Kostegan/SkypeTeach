package ru.test.skype.test.mvc.example.one.View;


/**
 *
 */
public class CatConsole implements ICatWindow {
    @Override
    public String[] getNewCatInfo() {
        return new String[0];
    }

    @Override
    public void printInfo(String name, int age){
        System.out.println("Cat:");
        System.out.println("Cat name is: "+ name);
        System.out.println("Cat age is : "+age);


    }
}
