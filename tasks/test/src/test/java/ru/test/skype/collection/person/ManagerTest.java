package ru.test.skype.collection.person;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class ManagerTest {
    private IManager createManager() {
        return new ManagerOnBaseArrayList();
    }

    @Test
    public void deleteOnePersonFromManager() {
        Person person1 = new Person("Michail", 23);
        Person person2 = new Person("Viktor", 28);
        Person person3 = new Person("Stepan", 31);
        Person person4 = new Person("Aleksey", 29);
        IManager manager = createManager();
        manager.addPerson(person1);
        manager.addPerson(person2);
        manager.addPerson(person3);
        manager.addPerson(person4);
        assertTrue("Manager is contains a person1.", manager.checkPerson(person1));
        assertTrue("Manager is contains a person2.", manager.checkPerson(person2));
        assertTrue("Manager is contains a person3.", manager.checkPerson(person3));
        assertTrue("Manager is contains a person4.", manager.checkPerson(person4));
        assertEquals("Manager consists of:", 4, manager.contains());
        manager.deletePerson(person2);
        assertEquals("Manager consists of:", 3, manager.contains());
        assertTrue("Manager is contains a person1.", manager.checkPerson(person1));
        assertTrue("Manager is contains a person3.", manager.checkPerson(person3));
        assertTrue("Manager is contains a person4.", manager.checkPerson(person4));
        manager.deletePerson(person1);
        assertEquals("Manager consists of:", 2, manager.contains());
        assertTrue("Manager is contains a person3.", manager.checkPerson(person3));
        assertTrue("Manager is contains a person4.", manager.checkPerson(person4));
    }

    @Test
    public void sortPersonsByAge() {
        Person person1 = new Person("Michail", 29);
        Person person2 = new Person("Viktor", 28);
        Person person3 = new Person("Stepan", 31);
        Person person4 = new Person("Aleksey", 30);
        IManager manager = createManager();

        manager.addPerson(person1);
        manager.addPerson(person2);
        manager.addPerson(person3);
        manager.addPerson(person4);

        assertEquals("The first person is: ", person1, manager.getPerson(0));
        assertEquals("The second person is: ", person2, manager.getPerson(1));
        assertEquals("The third person is: ", person3, manager.getPerson(2));
        assertEquals("The fourth person is: ", person4, manager.getPerson(3));
        manager.sortByAge();

        assertEquals("The first person is: ", person2, manager.getPerson(0));
        assertEquals("The second person is: ", person1, manager.getPerson(1));
        assertEquals("The third person is: ", person4, manager.getPerson(2));
        assertEquals("The fourth person is: ", person3, manager.getPerson(3));
    }


    @Test
    public void orderByName() {
        Person person1 = new Person("Michail", 29);
        Person person2 = new Person("Viktor", 28);
        Person person3 = new Person("Stepan", 31);
        Person person4 = new Person("Aleksey", 30);
        IManager manager = createManager();

        manager.addPerson(person1);
        manager.addPerson(person2);
        manager.addPerson(person3);
        manager.addPerson(person4);

        assertEquals("The first person is: ", person1, manager.getPerson(0));
        assertEquals("The second person is: ", person2, manager.getPerson(1));
        assertEquals("The third person is: ", person3, manager.getPerson(2));
        assertEquals("The fourth person is: ", person4, manager.getPerson(3));
        manager.sortByName();

        assertEquals("The first person is: " + person4.getName(), person4, manager.getPerson(0));
        assertEquals("The second person is: "+ person1.getName(), person1, manager.getPerson(1));
        assertEquals("The third person is: "+ person3.getName(), person3, manager.getPerson(2));
        assertEquals("The fourth person is: "+ person2.getName(), person2, manager.getPerson(3));
    }

    @Test
    public void orderByNameAndAge() {
        Person person1 = new Person("Michail", 29);
        Person person2 = new Person("Viktor", 28);
        Person person5 = new Person("Viktor", 20);
        Person person3 = new Person("Stepan", 31);
        Person person4 = new Person("Aleksey", 30);
        IManager manager = createManager();

        manager.addPerson(person1);
        manager.addPerson(person2);
        manager.addPerson(person3);
        manager.addPerson(person4);
        manager.addPerson(person5);

        assertEquals("The first person is: ", person1, manager.getPerson(0));
        assertEquals("The second person is: ", person2, manager.getPerson(1));
        assertEquals("The third person is: ", person3, manager.getPerson(2));
        assertEquals("The fourth person is: ", person4, manager.getPerson(3));
        assertEquals("The fourth person is: ", person5, manager.getPerson(4));
        manager.sortByNameAge();
        assertEquals("The first person is: " + person4.getName(), person4, manager.getPerson(0));
        assertEquals("The second person is: "+ person1.getName(), person1, manager.getPerson(1));
        assertEquals("The third person is: " + person3.getName(), person3, manager.getPerson(2));
        assertEquals("The fourth person is: "+ person5.getName(), person5, manager.getPerson(3));
        assertEquals("The fourth person is: "+ person2.getName(), person2, manager.getPerson(4));
    }


}
