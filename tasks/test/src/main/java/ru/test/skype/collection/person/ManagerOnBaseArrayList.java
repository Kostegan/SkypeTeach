package ru.test.skype.collection.person;

import java.util.*;

/**
 *
 */
public class ManagerOnBaseArrayList implements IManager {
    private List<Person> persons = new ArrayList<>();

    public ManagerOnBaseArrayList() {
    }

    @Override
    public boolean addPerson(Person person) {
        return persons.add(person);
    }

    @Override
    public void deletePerson(Person person) {
        for (Iterator<Person> iterator = persons.iterator(); iterator.hasNext(); ) {
            Person next = iterator.next();
            if (next.equals(person)) {
                iterator.remove();
            }

        }
    }

    @Override
    public void printPersons() {
        for (Person person : persons) {
            System.out.println();
        }
    }

    private boolean checkPerson() {
        return false;
    }

    @Override
    public int contains() {
        return persons.size();
    }

    @Override
    public Person getPerson(int i) {
        return persons.get(i);
    }

    @Override
    public boolean checkPerson(Person person) {
        for (Person personT : persons){
            if(personT.equals(person)){
                return true;
            }
        }
            return false;
    }

    @Override
    public void sortByName() {
        Collections.sort(persons,new PersonComparator(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void sortByAge() {
        Collections.sort(persons);
    }

    @Override
    public void sortByNameAge() {
        Collections.sort(persons,new PersonComparator(){
            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.getName().compareTo(o2.getName());
                if(i==0){
                    return o1.getAge()-o2.getAge();
                } return i;

            }
        });
    }

    public void sortBy(){
    }
}
