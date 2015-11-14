package ru.teach.skype;

/**
 * Класс для добавления новых сотрудников.
 */
public class Statistic {
    public static void main(String[] args) throws Exception {
        Employee marina = new Employee();
        Employee anton = new Employee();

        System.out.println("Marina is: " + marina);
        marina.setName("Marina");

        System.out.println("Name of marina: " + marina.getName());
        marina.setAge(24);

        System.out.println("Marina is age: " + marina.getAge());
        anton.setName("Anton");

        System.out.println("Name of anton: " + anton.getName());
        anton.setAge(29);

        System.out.println("Anton is age: " + anton.getAge());

        System.out.println("Equals: "+ marina.equals(anton));
    }
}
