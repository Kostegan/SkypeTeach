package ru.teach.skype.types.school;

/**
 *
 */
public class WorkerDirector implements IWorker {
    private String Name;
    private int age;
    private String degree;
    private static int count = 0;



    public WorkerDirector() {
        if (count == 0) {
            count++;
        } else {
            throw new IllegalArgumentException("Director must will be only one. ");
        }
    }

    public WorkerDirector(String name, int age, String degree) {
        if (count == 0) {
            setName(name);
            setAge(age);
            setDegree(degree);
            count++;
        } else {
            throw new IllegalArgumentException("Director must will be only one. ");
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    private static void endConstructor() {
    }

    public void createDirector() {

    }
}
