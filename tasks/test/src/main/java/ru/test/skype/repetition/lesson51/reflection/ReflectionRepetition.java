package ru.test.skype.repetition.lesson51.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 *
 */
public class ReflectionRepetition {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("ru.test.skype.repetition.lesson51.reflection.Person");
        int age = 25;
        String name = "Nina";

        Object person = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        methods[1].invoke(person, name);
        methods[3].invoke(person,age);
        System.out.println("Method has name: " + methods[0].getName() + " ,the method returns a result: " + methods[0].invoke(person));
        System.out.println("Method has name: " + methods[2].getName() + " ,the method returns a result: " + methods[2].invoke(person));
    }
}

class Person {
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
