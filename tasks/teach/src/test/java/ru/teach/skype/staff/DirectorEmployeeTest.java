package ru.teach.skype.staff;

import org.junit.Test;
import ru.teach.skype.Employee;

import static org.junit.Assert.*;

/**
 *
 */

public class DirectorEmployeeTest {


    /**
     * amount of employees
     */
    @Test
    public void amountEmployee() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Dima", 34, 11);
        Employee employee2 = new Employee("Lena", 34, 34);
        Employee employee3 = new Employee("Kolia", 29, 41);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.addSubordinate(employee3);
        assertEquals("amount of employees", 3, director.amountSubordinates());
    }

    /**
     * Replacement subordinates
     * 1. Replacement old subordinate and set new subordinate +
     * 2. Replacement subordinate who not set = IllegalArgumentException
     * 3. Replacement old subordinate and set null
     * 4. Replacement old subordinate and set empty
     * 5. Director not have subordinates, set new subordinates
     */

    /**
     * 1. Replacement old subordinate and set new subordinate +
     */
    @Test
    public void replacementSubordinates() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Marina", 33, 13);
        Employee employee2 = new Employee("Ylia", 21, 65);
        director.addSubordinate(employee1);
        director.replaceSubordinate(employee1, employee2);
        assertEquals("Replacement old subordinate to new subordinate ", employee2, director.getSubordinates(0));
        assertEquals("checking actual amount subordinates", 1, director.amountSubordinates());
    }

    /**
     * 2. Replacement subordinate who not set
     * @throws IllegalStateException if subordinate not set
     */
    @Test (expected = IllegalStateException.class)
    public void replacementSubordinatesNoSet() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Marina", 33, 13);
        Employee employee2 = new Employee("Ylia", 21, 65);
        director.replaceSubordinate(employee1, employee2);
    }

    /**
     * 3. Replacement old subordinate and set null
     * @throws IllegalStateException if subordinate not set
     */
    @Test (expected = IllegalStateException.class)
    public void replacementSubordinatesNull() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Marina", 33, 13);
        Employee employee2 = null;
        director.addSubordinate(employee1);
        director.replaceSubordinate(employee1, employee2);
    }


    /**
     * 4. Replacement old subordinate and set empty
     * @throw IllegalArgumentException if field empty
     */
    @Test(expected = IllegalArgumentException.class)
    public void replacementSubordinatesEmpty() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Marina", 33, 13);
        Employee employee2 = new Employee();
        director.addSubordinate(employee1);
        director.replaceSubordinate(employee1, employee2);
    }

    /**
     * 5. Director not have subordinates, set new subordinates
     */
    @Test (expected = IllegalStateException.class)
    public void replacementNotHaveSubordinate() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Marina", 33, 13);
        director.replaceSubordinate(null, employee1);
    }



    /**
     * 1. Установка подчин. когда у директора нет ни одного подчиненого должен быть exception
     *
     * @throws Exception у директора нет ни одного подчиненого
     */
    @Test (expected = IllegalStateException.class)
    public void setSubordinateNoSubordinate() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        director.setSubordinate(employee, 1);
    }

    /**
     * 2. у дир. есть несколько подчин. и установка подчин с отрицательным индексом
     *
     * @throws Exception значение индекса отрицательное
     */
    @Test(expected = IllegalArgumentException.class)
    public void setSubordinateNegativeValueIndex() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        director.addSubordinate(employee);
        director.setSubordinate(employee1, -1);
    }

    /**
     * 3. у дир. есть несколько подчин. и установка подчин с индексом большим чем колличество подчин
     *
     * @throws Exception значение индекса подчиненого больше чем колличество подчиненых
     */
    @Test(expected = IllegalArgumentException.class)
    public void setSubordinateMoreValueIndex() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        Employee employee2 = new Employee("Rita", 23, 11);
        Employee employee3 = new Employee("Max", 37, 12);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.setSubordinate(employee3, 3);
    }

    /**
     * 4. у дир. есть несколько подчин. и установка подчин в нулевую позицию
     */
    @Test
    public void setSubordinateZeroPosition() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        Employee employee2 = new Employee("Rita", 23, 11);
        Employee employee3 = new Employee("Max", 37, 12);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.setSubordinate(employee3, 0);
        assertEquals("set subordinate zero position",employee3,director.getSubordinates(0));
    }

    /**
     * 5. у дир. есть несколько подчин. и установка подчин в послед. позицию
     */
    @Test(expected = IllegalArgumentException.class)
    public void setSubordinateLastPosition() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        Employee employee2 = new Employee("Rita", 23, 11);
        Employee employee3 = new Employee("Max", 37, 12);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.setSubordinate(employee3, 3);
    }

    /**
     * 6. у дир. есть несколько подчин. и установка подчин не в крайнюю позицию
     */
    @Test
    public void setSubordinateAveragePosition() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        Employee employee2 = new Employee("Rita", 23, 11);
        Employee employee3 = new Employee("Max", 37, 12);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.setSubordinate(employee3, 2);
        assertEquals("Set subordinate avarege position ",employee3,director.getSubordinates(2));
    }

    /**
     * 7. у дир. есть несколько подчин. и установка подчин в виде null ссылки
     *
     * @throws IllegalStateException link to null
     */
    @Test(expected = IllegalStateException.class)
    public void setSubordinateNullLink() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Lena", 34, 21);
        Employee employee1 = new Employee("Vika", 54, 56);
        Employee employee2 = null;
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.setSubordinate(employee2,1);
    }


    /**
     * todo спросить
     * 8. set empty subordinate
     * @throws IllegalArgumentException У сотрудника должны быть заполнены все поля
     */
    @Test (expected = IllegalArgumentException.class)
    public void setSubordinateNull() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Marina",31,12);
        Employee employee1 = new Employee();
        director.addSubordinate(employee);
        director.setSubordinate(employee1, 0);
    }

    /**
     * change id
     */
    @Test
    public void changeId() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Vadim", 58, "IT", 1500);
        director.changeId(100, "+");
        assertEquals("change id ", 1600, director.getId());
    }

    /**
     * change id long less 1000
     */
    @Test(expected = IllegalStateException.class)
    public void changeIdLongLessThousand() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Vadim", 58, "IT", 1500);
        director.changeId(100);
        assertEquals("change id ", 100, director.getId());
    }

    /**
     * change id long
     */
    @Test
    public void changeIdLong() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Vadim", 58, "IT", 1500);
        director.changeId(1100);
        assertEquals("change id ", 1100, director.getId());
    }


    /**
     * id less 1000
     */
    @Test(expected = IllegalStateException.class)
    public void changeIdLessOneThousand() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Vadim", 58, "IT", 800);
        director.changeId(100, "+");
    }

    /**
     * Возраст меньше 50 и отдел не IT
     */
    @Test
    public void isOldAdministrator_1_ageLess50AndDepartmentNotIT() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee("Katia", 40, "API");
        assertFalse("Возраст меньше 50 и отдел не IT  - ", director21.isOldAdministrator());
    }

    /**
     * Возраст меньше 50 и отдел  IT
     */
    @Test
    public void isOldAdministrator_2_ageLess50AndDepartmentIT() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee("Katia", 40, "API");
        director21.setDepartment("IT");
        assertFalse("Возраст меньше 50 и отдел  IT -", director21.isOldAdministrator());
    }

    /**
     * Возраст 50 и отдел IT
     */
    @Test
    public void isOldAdministrator_3_age50AndDepartmentIT() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee("Katia", 40, "API");
        director21.setDepartment("IT");
        director21.setAge(50);
        assertFalse("Возраст 50 и отдел IT - ", director21.isOldAdministrator());
    }

    /**
     * Возраст больше 50 и отдел не IT
     */
    @Test
    public void isOldAdministrator_4_ageMore50AndDepartmentNotIT() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee();
        director21.setName("Katerina");
        director21.setAge(51);
        director21.setDepartment("ATI");
        assertFalse("Возраст больше 50 и отдел не IT - ", director21.isOldAdministrator());
    }

    /**
     * Возраст больше 50 и отдел  IT  (IT - "IT") String department = "IT"
     */
    @Test
    public void isOldAdministrator_5_1_ageMore50AndDepartmentIT() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee();
        director21.setName("Katerina");
        director21.setAge(51);
        director21.setDepartment("IT");
        assertTrue("5.1. Возраст больше 50 и отдел  IT + ", director21.isOldAdministrator());
    }

    /**
     * Возраст больше 50 и отдел  IT  (IT - новый объект String "IT") String department = new String("IT");
     */
    @Test
    public void isOldAdministrator_5_2_ageMore50AndDepartmentITNewObj() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee();
        director21.setName("Katerina");
        director21.setAge(51);
        String it = new String("IT");
        director21.setDepartment("ATI");
        director21.setDepartment(it);
        assertTrue("5.2. Возраст больше 50 и отдел  IT", director21.isOldAdministrator());
    }

    /**
     * Возраст больше 50 и отдел  Null
     */
    @Test
    public void isOldAdministrator_6_ageMore50AndDepartmentNull() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee();
        director21.setName("Katerina");
        director21.setAge(51);
        director21.setDepartment(null);
        assertFalse("Возраст больше 50 и отдел  Null - ", director21.isOldAdministrator());
    }

    /**
     * Возраст меньше 50 и отдел  Null
     */
    @Test
    public void isOldAdministrator_7_ageLess50AndDepartmentNull() throws Exception {
        DirectorEmployee director21 = new DirectorEmployee();
        director21.setName("Katerina");
        director21.setDepartment(null);
        director21.setAge(26);
        assertFalse("Возраст меньше 50 и отдел  Null - ", director21.isOldAdministrator());
    }


    /**
     * 1. Сравнение поля name на правильность введеного имени    +
     */
    @Test
    public void employeeKonstruktor_1_checkName() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Ivan", 39, "IT");
        assertEquals("Ivan", director.getName());
    }

    /**
     * 2. Сравнение поля age на правильность введеного возраста    +
     */
    @Test
    public void employeeKonstruktor_2_checkAge() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Ivan", 39, "IT");
        assertEquals(39, director.getAge());
    }

    /**
     * 3. Сравнение поля department на правильность введеного имени    +
     */
    @Test
    public void employeeKonstruktor_3_checkDepartment() throws Exception {
        DirectorEmployee director = new DirectorEmployee("Ivan", 39, "IT");
        assertEquals("IT", director.getDepartment());
    }

    /**
     * Тестовые случаи
     * 2. В отдел установлено значение          +
     */
    @Test
    public void getDepartment() {
        DirectorEmployee department = new DirectorEmployee();
        department.setDepartment("IT");
        assertEquals("IT", department.getDepartment());
    }


    /**
     * Тестовые случаи
     * 2. Сравнени на правльность установленного имяни           +
     */
    @Test
    public void setName() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        director.setName("Viktor");
        assertEquals("Viktor", director.getName());
    }


    /**
     * Тестовые случаи
     * 2. Сравнени на правльность установленного возраста                   +
     */
    @Test
    public void setAge() {
        DirectorEmployee director = new DirectorEmployee();
        director.setAge(58);
        assertEquals(58, director.getAge());
    }

    @Test
    /**
     * Тестовые случаи
     * 1. Сравнени на правльность установленного отдела                   +
     */

    public void setDepartment() {
        DirectorEmployee director = new DirectorEmployee();
        director.setDepartment("IT");
        assertEquals("IT", director.getDepartment());
    }

    @Test
    /**
     * Тестовые случаи
     * 1. Сравнени на правльность значения toStringBuilder
     */
    public void toStringDirector() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Masha", 30, 14);
        Employee employee2 = new Employee("Vika", 31, 26);
        Employee employee3 = new Employee("Mark", 41, 45);
        assertEquals("DIRECTOR [" + director.getName() + "] Number of subordinates = " + director.amountSubordinates() + ".", director.toString());
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        String rez = "DIRECTOR [null] Number of subordinates = 2:\n" + "\t[Masha], \n" + "\t[Vika].";
        String rez2 = "DIRECTOR [null] Number of subordinates = 3:\n" + "\t[Masha], \n" + "\t[Vika], \n" + "\t[Mark].";
        assertEquals(rez, director.toString());
        director.addSubordinate(employee3);
        assertEquals(rez2, director.toString());
    }


    /**
     * Two links on one object
     */
    @Test
    public void equals_1_twoLinksOnOneObj() {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = director1;
        assertTrue("two links on one object: ", director1.equals(director2));
    }

    /**
     * Second link null
     */
    @Test
    public void equals_2_secondLinkNull() {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = null;
        assertFalse("second link null: ", director1.equals(director2));
    }

    /**
     * First link DirectorEmployee and second link String
     */
    @Test
    public void equals_3_firstLinkDirectorEmployeeAndSecondLinkString() {
        DirectorEmployee director1 = new DirectorEmployee();
        String director2 = new String();
        assertFalse("First link DirectorEmployee and second link String: ", director1.equals(director2));
    }

    /**
     * There are two links with same name and different age
     */
    @Test
    public void equals_4_twoLinksSameNameDifferentAge() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Dima");
        director2.setName("Dima");
        director1.setAge(34);
        director2.setAge(35);
        assertFalse("There are two links with same name and different age", director1.equals(director2));
    }

    /**
     * There are two links with different name and same age
     */
    @Test
    public void equals_5_twoLinksDifferentNameSameAge() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Dima");
        director2.setName("Vasia");
        director1.setAge(33);
        director2.setAge(33);
        assertFalse("There are two links with different name and same age", director1.equals(director2));
    }

    /**
     * There are two employee with same age, name, department (same link department)
     */
    @Test
    public void equals_6_1_twoEmployeeSameNameAgeDepartmentOneSameLinkDepartment() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Vasia");
        director2.setName("Vasia");
        director1.setAge(33);
        director2.setAge(33);
        String department = "IT";
        director1.setDepartment(department);
        director2.setDepartment(department);
        assertTrue("There are two employee with same age, name, department (same link department)", director1.equals(director2));
    }

    /**
     * There are two employee with same age, name, department (two different links department )
     */
    @Test
    public void equals_6_2_twoEmployeeSameNameAgeDepartmentOneSameLinkDepartment() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Vasia");
        director2.setName("Vasia");
        director1.setAge(33);
        director2.setAge(33);
        String department = "IT";
        String department2 = "IT";
        director1.setDepartment(department);
        director2.setDepartment(department2);
        assertTrue("There are two employee with same age, name, department (same link department)", director1.equals(director2));
    }

    /**
     * There are two employee with same name, age and different department
     */
    @Test
    public void equals_7_twoEmployeeSameNameAgeDifferentDepartment() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Vasia");
        director2.setName("Vasia");
        director1.setAge(33);
        director2.setAge(33);
        director1.setDepartment("IT");
        director1.setDepartment("APM");
        assertFalse("There are two employee with same name, age and different department", director1.equals(director2));
    }

    /**
     * There are two employee with same name and different age and department
     */
    @Test
    public void equals_8_twoEmployeeSameNameDifferentAgeDepartment() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Vasia");
        director2.setName("Vasia");
        director1.setAge(32);
        director2.setAge(33);
        director1.setDepartment("IT");
        director1.setDepartment("APM");
        assertFalse("There are two employee with same name and different age and department", director1.equals(director2));
    }

    /**
     * There are two employee with same age and department and different name
     */
    @Test
    public void equals_9_twoEmployeeSameAgeDepartmentDifferentName() throws Exception {
        DirectorEmployee director1 = new DirectorEmployee();
        DirectorEmployee director2 = new DirectorEmployee();
        director1.setName("Olga");
        director2.setName("Vasia");
        director1.setAge(33);
        director2.setAge(33);
        director1.setDepartment("IT");
        director1.setDepartment("IT");
        assertFalse("There are two employee with same age and department and different name", director1.equals(director2));
    }

    /**
     * First link DirectorEmployee and second link Employee (all line same)
     */
    @Test
    public void equals_10_firstLinkDirectorEmployeeSecondEmployee() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee director22 = new Employee();
        director.setName("Vadim");
        director22.setName("Vadim");

        director.setAge(31);
        director22.setAge(31);

        director.setDepartment("IT");
        assertFalse("First link DirectorEmployee and second link Employee (all line same)", director.equals(director22));
    }

    @Test
    public void equals_11_Instanceof() throws Exception {
        DirectorEmployee director22 = new DirectorEmployee();
        String director23 = new String();
        director22.setName("director22");

        assertFalse(director22.equals(director23));
    }

    /**
     * one department = null, two department != null;
     */

    @Test
    public void equals_11_departmentOneNull() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        DirectorEmployee director1 = new DirectorEmployee();
        director.setName("Ygor");
        director.setAge(75);
        director1.setName("Ygor");
        director1.setAge(75);
        director1.setDepartment("IT");
        assertFalse("one department = null, two department != null", director.equals(director1));
    }

    /**
     * one department = null, two department = null;
     */

    @Test
    public void equals_11_departmentOneAndTwoNull() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        DirectorEmployee director1 = new DirectorEmployee();
        director.setName("Ygor");
        director.setAge(75);
        director1.setName("Ygor");
        director1.setAge(75);
        director.setDepartment("IT");
        director1.setDepartment("AT");
        assertFalse("one department = null, two department = null", director.equals(director1));
    }



    /**
     * 1. addEmployee subordinate, when director not have subordinates
     * 2. addEmployee subordinates in 1 index position and check 0,1 index position
     * 3. addEmployee subordinates in 2 index position and check 0,1,2 index position
     * 4. addEmployee clone subordinate
     * 5. addEmployee subordinate with null link
     * 6. addEmployee empty subordinate
     */

    /**
     * 1. addEmployee subordinate, when director not have subordinates
     */
    @Test
    public void addOneSubordinates() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Elena", 34, 78);
        director.addSubordinate(employee);
        assertEquals("addEmployee subordinate", employee, director.getSubordinates(0));
        assertEquals("amount subordinates", 1, director.amountSubordinates());
    }

    /**
     * 2. addEmployee two subordinates and check subordinates
     */
    @Test
    public void addTwoSubordinate() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Elena", 34, 78);
        Employee employee1 = new Employee("Rita", 60, 13);
        director.addSubordinate(employee);
        assertEquals("addEmployee one subordinate", employee, director.getSubordinates(0));
        assertEquals("amount subordinates", 1, director.amountSubordinates());
        director.addSubordinate(employee1);
        assertEquals("check 1 subordinate", employee, director.getSubordinates(0));
        assertEquals("check 2 subordinate", employee1, director.getSubordinates(1));
        assertEquals("amount subordinates", 2, director.amountSubordinates());
    }

    /**
     * 3. addEmployee three subordinates and check subordinates
     */
    @Test
    public void addThreeSubordinate() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Elena", 34, 78);
        Employee employee1 = new Employee("Rita", 60, 13);
        Employee employee2 = new Employee("Dima", 60, 13);
        director.addSubordinate(employee);
        assertEquals("addEmployee one subordinate", employee, director.getSubordinates(0));
        assertEquals("amount subordinates", 1, director.amountSubordinates());
        director.addSubordinate(employee1);
        assertEquals("check 1 subordinate", employee, director.getSubordinates(0));
        assertEquals("check 2 subordinate", employee1, director.getSubordinates(1));
        assertEquals("amount subordinates", 2, director.amountSubordinates());
        director.addSubordinate(employee2);
        assertEquals("check 1 subordinate", employee, director.getSubordinates(0));
        assertEquals("check 2 subordinate", employee1, director.getSubordinates(1));
        assertEquals("check 3 subordinate", employee2, director.getSubordinates(2));
        assertEquals("amount subordinates", 3, director.amountSubordinates());
    }

    /**
     * 4. addEmployee clone subordinate, the same name,age and id
     *
     * @throws Exception IllegalStateException if two same subordinates
     */
    @Test(expected = IllegalStateException.class)
    public void addCloneSubordinate() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Masha", 25, 31);
        Employee employee1 = new Employee("Masha", 25, 31);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
    }

    /**
     * 5. addEmployee subordinate with null link
     *
     * @throws IllegalStateException if link null
     */
    @Test(expected = IllegalStateException.class)
    public void addSubordinatesNullLink() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = null;
        director.addSubordinate(employee);
    }


    /**
     * 6. addEmployee empty subordinate
     * @throws IllegalStateException if empty subordinate
     */
    @Test (expected = IllegalStateException.class)
    public void addSubordinatesEmpty()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee();
        director.addSubordinate(employee);
    }

    /**
     * 7. addEmployee subordinate with age = empty
     * @throw IllegalStateException  if field age empty.
     */

    @Test(expected = IllegalStateException.class)
    public void addSubordinateAgeEmpty()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee();
        employee.setName("Marina");
        employee.setId(12);
        director.addSubordinate(employee);
    }

    /**
     * 7. addEmployee subordinate with  name = null
     * @throw IllegalStateException  if field name null.
     */

    @Test(expected = IllegalStateException.class)
    public void addSubordinateNameNull()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee();
        employee.setId(12);
        employee.setAge(45);
        director.addSubordinate(employee);
    }




    /**
     * 1. Delete one subordinate and check other subordinates
     */
    @Test
    public void deleteSubordinate() throws IllegalArgumentException {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Marina", 28, 13);
        Employee employee1 = new Employee("Viktoria", 31, 45);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.deleteSubordinate(employee);
        assertEquals("get subordinate 0", employee1, director.getSubordinates(0));
        assertEquals("amount subordinate 1", 1, director.amountSubordinates());
        director.deleteSubordinate(employee1);
        assertEquals("amount subordinates 0 ", 0, director.amountSubordinates());
    }

    /**
     * 3. Delete subordinates not set to director
     *
     * @throws IllegalStateException if subordinates not set
     */
    @Test (expected = IllegalStateException.class)
    public void deleteSubordinatesNoSet() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Marina", 32, 12);
        Employee employee1 = new Employee("Dima", 54, 40);
        director.addSubordinate(employee1);
        director.deleteSubordinate(employee);
    }

    /**
     * 4. Удаление подчиненого, который уже удален
     * @throws IllegalStateException если уже удален
     */

    @Test (expected = IllegalStateException.class)
    public void deleteSubordinateSecond()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee();
        director.addSubordinate(employee);
        assertEquals("amount subordinate",1,director.amountSubordinates());
        assertEquals("get subordinate",employee, director.getSubordinates(0));
        director.deleteSubordinate(employee);
        assertEquals("amount subordinate",0,director.amountSubordinates());
        director.deleteSubordinate(employee);
    }

    /**
     * Delete first subordinate and check
     */
    @Test
    public void deleteFirstSubordinate() throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Maxim",31,56);
        Employee employee1 = new Employee("Vera",65,12);
        Employee employee2 = new Employee("Lena",45,13);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        assertEquals("amount subordinates", 3, director.amountSubordinates());
        director.deleteSubordinate(employee);
        assertEquals("amount subordinates", 2, director.amountSubordinates());
        assertEquals("subordinate 1",employee1,director.getSubordinates(0));
        assertEquals("subordinate 2",employee2,director.getSubordinates(1));
    }

    /**
     * Delete middle subordinate and check
     */
    @Test
    public void deleteMiddleSubordinate()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Maxim",31,56);
        Employee employee1 = new Employee("Vera",65,12);
        Employee employee2 = new Employee("Lena",45,13);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        assertEquals("amount subordinates",3,director.amountSubordinates());
        director.deleteSubordinate(employee1);
        assertEquals("amount subordinates",2,director.amountSubordinates());
        assertEquals("subordinate 1",employee,director.getSubordinates(0));
        assertEquals("subordinate 2",employee2,director.getSubordinates(1));
    }

    /**
     * Delete last subordinate and check
     */
    @Test
    public void deleteLastSubordinate() throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Maxim",31,56);
        Employee employee1 = new Employee("Vera",65,12);
        Employee employee2 = new Employee("Lena",45,13);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        assertEquals("amount subordinates",3,director.amountSubordinates());
        director.deleteSubordinate(employee2);
        assertEquals("amount subordinates",2,director.amountSubordinates());
        assertEquals("subordinate 1",employee,director.getSubordinates(0));
        assertEquals("subordinate 2",employee1,director.getSubordinates(1));
    }



    /**
     * Вычисление СКО двух сотрудников
     */
    @Test
    public void calculateAQDTwoSubordinates()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Tolik",24,12);
        Employee employee1 = new Employee("Nina",51,34);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        assertEquals(1,1,director.calculateAverageQuadraticDeviation());
    }

    /**
     * Вычисление СКО 5 сотрудников
     */
    @Test
    public void calculateAQDFiveSubordinates()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Tolik",24,12);
        Employee employee1 = new Employee("Rita",34,24);
        Employee employee2 = new Employee("Dima",41,48);
        Employee employee3 = new Employee("Marina",29,78);
        Employee employee4 = new Employee("Olesia",19,12);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.addSubordinate(employee3);
        director.addSubordinate(employee4);
        assertEquals(25.2855,director.calculateAverageQuadraticDeviation(),0.0001);
    }

    /**
     * Вычисление СКО одного сотрудника
     * @throws IllegalStateException Сотрудников должно быть больше одного
     */
    @Test (expected = IllegalStateException.class)
    public void calculateAQDOneSubordinate()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Tolik",24,12);
        director.addSubordinate(employee);
        director.calculateAverageQuadraticDeviation();
    }

    /**
     * Вычисление СКО двух сотрудников, у одного сотрудника не заполнено поле id
     * @throws IllegalArgumentException Заполните поле id у сотрудника
     */
    @Test (expected = IllegalArgumentException.class)
    public void calculateAQDNotSetId()throws Exception{
        DirectorEmployee director = new DirectorEmployee();
        Employee employee = new Employee("Tolik",24,12);
        Employee employee1 = new Employee("Nina",51);
        director.addSubordinate(employee);
        director.addSubordinate(employee1);
        director.calculateAverageQuadraticDeviation();
    }
}
