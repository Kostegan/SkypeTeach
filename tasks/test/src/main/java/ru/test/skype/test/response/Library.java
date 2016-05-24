package ru.test.skype.test.response;

/**
 *
 */
public class Library {
    public String name = "Вася";
    public String newName = "Иван";

    public void generate(String name, String newName) {
        name = name + "1";
        newName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }
}

class Test{
    public static void main(String[] args) {
        Library library = new Library();
        System.out.println("The first name is: "+library.name);
        System.out.println("The second name is: "+library.newName);
        System.out.println("----------------------------------");
        library.generate(library.name,library.newName);
        System.out.println("The new name1 is: "+library.name);
        System.out.println("The new name2 is: "+library.newName);
    }
}
