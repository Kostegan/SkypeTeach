package ru.test.skype.collection.person;

/**
 *
 */
public interface IManager {
    boolean addPerson(Person person);

    void deletePerson(Person person);

    void printPersons();

    int contains();

    Person getPerson(int i);

    boolean checkPerson(Person person);

    void sortByName();

    void sortByAge();

    void sortByNameAge();
}
