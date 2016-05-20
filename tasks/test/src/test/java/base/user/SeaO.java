package base.user;

/**
 *
 */
public class SeaO extends Sea {
    protected String a = "AAA";

    private String name;
    private int age;

    public SeaO(){
        super.go();
    }


    protected class A{

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

