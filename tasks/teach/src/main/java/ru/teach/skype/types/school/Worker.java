package ru.teach.skype.types.school;

/**
 *
 */
public class Worker implements IWorker {
    private String name;
    private int age;
    private String degree;
    private static int count;

    private Worker (){
    }

    public static IWorker createWorker() {
        IWorker instance;
        if (count < 5) {
            instance = new Worker();
            count++;
            return instance;
        } else {
            throw new IllegalArgumentException("Workers can not be more than five.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
