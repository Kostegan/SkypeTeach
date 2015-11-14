package ru.teach.skype.my.list;

import org.junit.Test;
import ru.teach.skype.Employee;
import ru.teach.skype.IEmployee;

import static org.junit.Assert.*;


/**
 * Tested class MyArrayList
 * ----- method addEmployee -----
 * 1. addEmployee Employee if MyArrayList set null.      -+   ?
 * 2. addEmployee element not Employee              -
 * 3. addEmployee Employee and same Employee (copy) -
 * 4. addEmployee Employee  3 elements              +
 * <p>
 * * -----getEmployeeByIndex----
 * 1. delete employee by index
 * 2. index is more than list size
 * 3. index is negative
 * <p>
 * ----- method size -----
 * 1. in list have several elements
 * 2. check size empty list
 * <p>
 * ----- method get(int index) -----
 * 1. MyArrayList set null
 * 2. MyArrayList empty
 * 3. set index more than size MyArrayList
 * 4. set index "-1"
 * <p>
 * ----- method get(Employee employee) -----
 * 1. MyArrayList set null
 * 2. employee set null
 * 3. set 3 elements to MyArrayList and find employee
 * <p>
 * ----- method contains(Employee employee) -----
 * 1. verify MyArrayList set null
 * 2. verify MyArrayList not set employee
 * 3. set 3 elements and contains employee
 * <p>
 * ----- method deleteEmployee-----
 * 1. specified element set null           -
 * 2. specified element not set to array   -
 * <p>
 * -----method deleteEmployeeByIndex-----
 * 1. index set null
 * 2. length array less value specified index
 */

public class MyListTest {

    private IMyList<IEmployee> createList() {
        return new MyLinkedList<>();
    }

    /**
     * * ----- method addEmployee -----
     * 1. add different elements                        +
     * 2. add two the same employees
     * 3. add two new Employee with same arguments(name,age,id)
     * 4. add element = null(throw NullPointerException)                                     -
     */


    /**
     * ----- method addEmployee -----
     * 1. add Employee different 3 elements
     */
    @Test
    public void addThreeEmployee() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 34, 21);
        IEmployee employee2 = new Employee("Dima", 35, 31);
        IEmployee employee3 = new Employee("Vika", 29, 28);
        list.addEmployee(employee1);
        assertEquals("List has one element = ", 1, list.size());
        assertEquals("add employee1", employee1, list.getEmployeeByIndex(0));
        list.addEmployee(employee2);
        assertEquals("List has two elements =  ", 2, list.size());
        assertEquals("add employee2", employee2, list.getEmployeeByIndex(1));
        list.addEmployee(employee3);
        assertEquals("List has three element  = ", 3, list.size());
        assertEquals("add employee2", employee3, list.getEmployeeByIndex(2));
    }

    /**
     * ----- method addEmployee -----
     * 2. add two same employee
     */

    @Test
    public void addTwoSameEmployee() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Viktor", 34, 21);
        list.addEmployee(employee);
        list.addEmployee(employee);
        assertEquals("List have two employee: ", 2, list.size());
        assertEquals("get employee1: ", employee, list.getEmployeeByIndex(0));
        assertEquals("get employee2: ", employee, list.getEmployeeByIndex(1));
    }


    /**
     * 3. add two new Employee with same arguments(name,age,id)
     */
    @Test
    public void addTwoEmployeeSameAllArguments() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 34, 21);
        IEmployee employee2 = new Employee("Viktor", 34, 21);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        assertEquals("List have two employee:", 2, list.size());
        assertEquals("get employee1: ", employee1, list.getEmployeeByIndex(0));
        assertEquals("get employee2: ", employee2, list.getEmployeeByIndex(1));
    }

    /**
     * 4.Add employee = null.(throw NullPointerException)
     */
    @Test(expected = NullPointerException.class)
    public void addEmployeeNull() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = null;
        list.addEmployee(employee1);
    }


    /**
     *  * ----- method deleteEmployee-----
     * 1. Delete several elements.
     * 2. specified element not set to array   -
     * 3. delete element which have three copies in list
     * 4. delete all copies elements
     */

    /**
     * First element will deleted, list has one element.
     */
    @Test
    public void deleteFirstElement(){
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Dima",12,33);
        list.addEmployee(employee);
        assertEquals("List has one element",1,list.size());
        assertEquals("Delete first element",1,list.deleteEmployee(employee));
        assertEquals("List does not has element",0,list.size());
    }

    /**
     * Delete two elements.
     */
    @Test
    public void deleteEmployee() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Igor", 32, 12);
        IEmployee employee2 = new Employee("Rita", 30, 21);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        assertEquals("amount elements in array: ", 2, list.size());
        list.deleteEmployee(employee1);
        assertEquals("amount elements in array: ", 1, list.size());
        assertEquals("List has element from first position", employee2, list.getEmployeeByIndex(0));
        list.deleteEmployee(employee2);
        assertEquals("List does not has elements", 0, list.size());
    }

    /**
     * 2. Delete specified element not set to list   -
     */
    @Test
    public void deleteEmployeeNotSet() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Ron", 21, 12);
        IEmployee employee2 = new Employee("Katy", 44, 32);
        list.addEmployee(employee2);
        assertEquals("an element was not set in the list", -1, list.deleteEmployee(employee1));
    }


    /**
     * 3.1. delete five elements
     */
    @Test
    public void deleteFiveElements() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 45, 31);
        IEmployee employee2 = new Employee("Rita", 32, 1);
        IEmployee employee3 = new Employee("Masha", 55, 21);
        IEmployee employee4 = new Employee("Sveta", 45, 45);
        IEmployee employee5 = new Employee("Kirill", 25, 32);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        list.addEmployee(employee4);
        list.addEmployee(employee5);
        list.deleteEmployee(employee2);
        assertEquals("List has four elements",4,list.size());
        list.deleteEmployee(employee3);
        assertEquals("List does not has elements.",3, list.size());
    }


    /**
     * 3. delete element which have three copies in list
     */
    @Test
    public void deleteElementHaveThreeCopy() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 45, 31);
        list.addEmployee(employee1);
        list.addEmployee(employee1);
        list.addEmployee(employee1);
        list.addEmployee(employee1);
        list.deleteEmployee(employee1);
        assertEquals("List does not has elements.",0, list.size());
    }

    /**
     * 4. delete all copies elements
     */

    @Test
    public void deleteAllCopies() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 34, 14);
        IEmployee employee2 = new Employee("Marina", 43, 21);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee2);
        list.addEmployee(employee1);
        assertEquals(4, list.size());
        list.deleteEmployee(employee1);
        assertEquals("List has two elements", 2, list.size());
        assertEquals(employee2, list.getEmployeeByIndex(0));
        assertEquals(employee2, list.getEmployeeByIndex(1));
    }

    /**
     * ----- method size -----
     * 1. in list have several elements
     * 2. check size empty list
     */


    /**
     * 1. in list have several elements
     */
    @Test
    public void sizeListHaveThreeElements() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Igor", 32, 11);
        IEmployee employee2 = new Employee("Viktor", 42, 14);
        IEmployee employee3 = new Employee("Elena", 54, 15);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        assertEquals("List consist from three elements", 3, list.size());
    }

    /**
     * 2. check size empty list
     */
    @Test
    public void sizeEmptyList() {
        IMyList<IEmployee> list = createList();
        assertEquals("Empty list: ", 0, list.size());
    }


    /**
     * -----getEmployeeByIndex----
     * 1. Return specified element by index
     * 2. Specified index is negative
     * 3. Index is more list size
     */

    /**
     * 1. Return specified element by index
     */
    @Test
    public void getEmployeeByIndex() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Sergey", 34, 56);
        list.addEmployee(employee1);
        assertEquals("Return element by index", employee1, list.getEmployeeByIndex(0));
    }

    /**
     * 2. Specified index is negative
     */
    @Test(expected = IllegalArgumentException.class)
    public void getIndexIsNegative() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Roma", 34, 2);
        list.addEmployee(employee);
        list.getEmployeeByIndex(-2);
    }

    /**
     * 3. Index is more list size
     */
    @Test (expected = IllegalArgumentException.class)
    public void getEmployeeByIndexMoreListSize() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor", 34, 23);
        IEmployee employee2 = new Employee("Marina", 56, 13);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.getEmployeeByIndex(3);
    }
    /**
     * -----deleteEmployeeByIndex-----
     * 1. Delete several employees by index
     * 2. Index is more than is list size
     * 3. Index is equal list size
     * 4. index is negative
     * 5. index value is more then size
     * 5. delete from empty list
     * 6. Delete last employee, and add new employee.
     */

    /**
     * 1. Delete several employees by index
     */
    @Test
    public void deleteByIndex() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Igor", 34, 12);
        IEmployee employee2 = new Employee("Max", 23, 11);
        IEmployee employee3 = new Employee("Roma", 45, 10);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        list.deleteEmployeeByIndex(1);
        assertEquals("List have two elements", 2, list.size());
        assertEquals("First element ", employee1, list.getEmployeeByIndex(0));
        assertEquals("First element ", employee3, list.getEmployeeByIndex(1));
        list.deleteEmployeeByIndex(1);
        assertEquals("List have two elements", 1, list.size());
        assertEquals("First element ", employee1, list.getEmployeeByIndex(0));
        list.deleteEmployeeByIndex(0);
        assertEquals("List does not have elements", 0, list.size());
    }

    /**
     * 2. Index is more than is list size
     */
    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexMoreSize() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee();
        list.addEmployee(employee1);
        list.deleteEmployeeByIndex(2);
    }


    /**
     * 3. Index is equal list size
     */
    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexEqualSize() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee();
        IEmployee employee2 = new Employee();
        IEmployee employee3 = new Employee();
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        list.deleteEmployeeByIndex(3);
    }

    /**
     * 4. index is negative
     */
    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexIsNegative() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Roma", 34, 2);
        list.addEmployee(employee);
        list.deleteEmployeeByIndex(-2);
    }

    /**
     * 5. index value is more then size
     */
    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexIsMoreSize() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Roma", 34, 2);
        list.addEmployee(employee);
        list.deleteEmployeeByIndex(5);
    }

    /**
     * 5. delete from empty list
     */
    @Test(expected = IllegalArgumentException.class)
    public void deleteByIndexEmptyList() {
        IMyList<IEmployee> list = createList();
        list.deleteEmployeeByIndex(1);
    }

    /**
     * 6. Delete last employee, and add new employee.
     */

    @Test
    public void deleteLastAndAddEmployee(){
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Viktor",34,23);
        IEmployee employee2 = new Employee("Dmitriy",14,43);
        IEmployee employee3 = new Employee("Aleksandr",64,22);
        IEmployee employee4 = new Employee("Roman",32,53);
        assertEquals("List doesn't have employees.", 0, list.size());
        list.addEmployee(employee1);
        assertEquals("List have one element: employee1. Location in position: 0", employee1, list.getEmployeeByIndex(0));
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        assertEquals("List have  element: employee1. Location in position: 0", employee1, list.getEmployeeByIndex(0));
        assertEquals("List have  element: employee2. Location in position: 1", employee2, list.getEmployeeByIndex(1));
        assertEquals("List have  element: employee2. Location in position: 2", employee3, list.getEmployeeByIndex(2));
        list.deleteEmployeeByIndex(2);
        list.addEmployee(employee4);
        assertEquals("List have  element: employee1. Location in position: 0", employee1, list.getEmployeeByIndex(0));
        assertEquals("List have  element: employee2. Location in position: 1", employee2, list.getEmployeeByIndex(1));
        assertEquals("List have  element: employee2. Location in position: 2", employee4, list.getEmployeeByIndex(2));
    }

    /**
     * ----- getIndexByEmployee-----
     * 1. get index by element
     * 2. the element not set to list
     * 3. element has several copies
     */

    /**
     * 1. get index by element
     */
    @Test
    public void getIndexByEmployee() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Kirill", 23, 7);
        IEmployee employee2 = new Employee("Max", 45, 4);
        IEmployee employee3 = new Employee("Rik", 14, 12);
        list.addEmployee(employee1);
        list.addEmployee(employee2);
        list.addEmployee(employee3);
        list.addEmployee(employee1);
        assertEquals("get index employee1", 0, list.getIndexByEmployee(employee1));
        assertEquals("get index employee2", 1, list.getIndexByEmployee(employee2));
        assertEquals("get index employee3", 2, list.getIndexByEmployee(employee3));
    }

    /**
     * 2. the element not set to list
     */
    @Test
    public void getIndexByEmployeeNotSet() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee("Kirill", 23, 7);
        IEmployee employee3 = new Employee("Rik", 14, 12);
        list.addEmployee(employee1);
        assertEquals("element not set to list", -1, list.getIndexByEmployee(employee3));
    }

    /**
     * 3. element has several copies
     */
    @Test
    public void getIndexByEmployeeSeveralCopy() {
        IMyList<IEmployee> list = createList();
        IEmployee employee1 = new Employee();
        list.addEmployee(employee1);
        list.addEmployee(employee1);
        list.addEmployee(employee1);
        assertEquals("position in list", 0, list.getIndexByEmployee(employee1));
    }

    /**
     * 4. set null
     */
    @Test
    public void getIndexByEmployeeNull() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Fedor,45,23");
        list.addEmployee(employee);
        assertEquals("Return -1", -1, list.getIndexByEmployee(null));

    }

    /**
     * ------ containEmployee ------
     * 1. find specified element to list
     * 2. element not set to list
     * 3. element has several copies
     * 4. contain null
     */

    /**
     * ------ containEmployee ------
     * 1. contain element to list
     */
    @Test
    public void containEmployee() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee();
        list.addEmployee(employee);
        assertTrue("contain list employee", list.containsEmployee(employee));
    }

    /**
     * ------ containEmployee ------
     * 2. element not set to list
     */
    @Test
    public void containEmployeeNotSet() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Rita", 25, 11);
        IEmployee employee2 = new Employee("Dmit", 26, 21);
        list.addEmployee(employee);
        assertFalse("contain list employee2", list.containsEmployee(employee2));
    }

    /**
     * ------ containEmployee ------
     * 3. element has several copies
     */
    @Test
    public void containEmployeeSeveralCopies() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee("Rita", 28, 21);
        IEmployee employee2 = new Employee("Vika", 43, 20);
        IEmployee employee3 = new Employee("Misha", 45, 24);
        list.addEmployee(employee2);
        list.addEmployee(employee);
        list.addEmployee(employee3);
        list.addEmployee(employee);
        assertTrue("contain list employee2", list.containsEmployee(employee));
    }

    /**
     * ------ containEmployee ------
     * 4. contain null
     */
    @Test
    public void containEmployeeNull() {
        IMyList<IEmployee> list = createList();
        IEmployee employee = new Employee();
        list.addEmployee(employee);
        assertFalse("contain list employee2", list.containsEmployee(null));
    }
}
