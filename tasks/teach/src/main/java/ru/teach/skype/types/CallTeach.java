package ru.teach.skype.types;

/**
 *
 */
public class CallTeach {
    public static void main(String[] args) {
        Child2 c = new Child2();
        System.out.println(c.getName());
    }
}

class Base {
    String name;

    public Base() {

    }

    public Base(String name) {
        setName(name);
    }

    public String getName() {
        return "base";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatistic() {
        return "stat";
    }
}

class Child extends Base {
    int height;

    public Child() {}

    public Child(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public String getName() {
        return "child (" + super.getName() + ")";
    }
}

class Child2 extends Child {
    @Override
    public String getName() {
        return "child2 [" + super.getName() + "]: " + getStatistic();
    }
}
