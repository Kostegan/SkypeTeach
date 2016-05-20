package ru.test.skype.collection.person;

/**
 * A test class, will be used to testing  collections class.
 */
public class Person implements Comparable<Person> {
    private String name;
    private int age;

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

    public Person getPerson(){
        return new Person();
    }

    public void print(){
        System.out.println("Test method.");
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
