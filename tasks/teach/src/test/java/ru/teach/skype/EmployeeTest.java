package ru.teach.skype;

import org.junit.Test;
import ru.teach.skype.staff.DirectorEmployee;

import static org.junit.Assert.*;

/**
 *
 */
public class EmployeeTest {

    /**
     * входная операция "+"
     */
    @Test
    public void changeIdSwitch_1() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.changeIdSwitch(21, "+");
        assertEquals(142, employee.getId());
    }

    /**
     * входная операция "-"
     */
    @Test
    public void changeIdSwitch_2() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.changeIdSwitch(21, "-");
        assertEquals(100, employee.getId());
    }

    /**
     * входная операция "*"
     */
    @Test
    public void changeIdSwitch_3() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.changeIdSwitch(1, "*");
        assertEquals(121, employee.getId());
    }

    /**
     * входная операция "/"
     */
    @Test
    public void changeIdSwitch_4() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.changeIdSwitch(3, "/");
        assertEquals(40, employee.getId());
    }

    /**
     * входная операция "/" value = 0
     */
    @Test
    public void changeIdSwitch_4_valueZero() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.changeIdSwitch(0, "/");
        assertEquals(0, employee.getId());
    }

    /**
     * входная операция "%"
     */
    @Test
    public void changeIdSwitch_5() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.setId(100);
        employee.changeIdSwitch(2, "%");
        assertEquals(0, employee.getId());
    }

    /**
     * входная операция не соответствует ожидаемой
     */
    @Test (expected = UnsupportedOperationException.class)
    public void changeIdSwitch_5_UnsupportedOperation() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 36, 121);
        employee.setId(100);
        employee.changeIdSwitch(2, "r");
        assertEquals("входная операция не соответствует ожидаемой", 0, employee.getId());
    }



    /**
     * change id
     */
    @Test
    public void changId_long() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setId(45);
        employee.changeId(12);
        assertEquals("change id", 12, employee.getId());
    }


    /**
     * id less zero
     */
    @Test(expected = IllegalStateException.class)
    public void changId_zero() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setId(45);
        employee.changeId(-20);
    }

    /**
     * first
     */
    @Test
    public void changIdOverload() throws IllegalArgumentException {
        Employee employee = new Employee("Marina", 21, 45);
        employee.changeId("+", 10);
        assertEquals("id >= 0 ", 55, employee.getId());
    }


    /**
     * change String id to Long id
     */

    @Test
    public void changeIdStringToLong() {
        Employee employee = new Employee();
        String id = new String("45");
        employee.changeId(id);
        assertEquals("change String id to Long id ", 45, employee.getId());
    }


    /**
     * входная операция "+"
     */
    @Test
    public void changeId_1() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 90);
        employee.changeId(20, "+");
        assertEquals("входная операция + ", 110, employee.getId());
    }

    /**
     * входная операция "-"
     */
    @Test
    public void changeId_2() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 110);
        employee.changeId(80, "-");
        assertEquals("входная операция -", 30, employee.getId());
    }

    /**
     * входная операция "*"
     */
    @Test
    public void changeId_3() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 30);
        employee.changeId(2, "*");
        assertEquals("входная операция *", 60, employee.getId());
    }

    /**
     * входная операция "/"
     */
    @Test
    public void changeId_4() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        employee.changeId(3, "/");
        assertEquals("входная операция /", 20, employee.getId());
    }

    /**
     * входная операция "%"
     */
    @Test
    public void changeId_5() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        employee.changeId(49, "%");
        assertEquals("входная операция %", 11, employee.getId());
    }

    /**
     * искл. ситуацию UnsupportedOperationException
     *
     * @throws Exception если операция не " +,-,*,/,% "
     */
    @Test(expected = UnsupportedOperationException.class)
    public void changeId_6() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        employee.changeId(12, "22");
        assertEquals(0, employee.getId());
    }

    /**
     * входная операция может быть любым объектом
     *
     * @throws Exception если операция не " +,-,*,/,% "
     */
    @Test
    public void changeId_7() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        String function = new String("+");
        employee.changeId(21, function);
        assertEquals("входная операция может быть любым объектом", 81, employee.getId());
    }

    /**
     * деление на ноль
     *
     * @throws Exception если операция не " +,-,*,/,% "
     */
    @Test
    public void changeId_8() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        employee.changeId(0, "/");
        assertEquals("деление на ноль", 0, employee.getId());
    }

    /**
     * деление когда function = null
     *
     * @throws Exception если операция не " +,-,*,/,% "
     */
    @Test (expected = NullPointerException.class)
    public void changeId_9() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 60);
        String function = null;
        employee.changeId(0, function);
    }

    /**
     * Id не может быть отрицательным  числом
     *
     * @throws Exception если Id отрицательное число
     */
    @Test(expected = IllegalStateException.class)
    public void changeId_10() throws IllegalArgumentException {
        Employee employee = new Employee("Andrei", 45, 10);
        employee.changeId(20, "-");
    }

    /**
     * to ID set String ("abc")
     */

    @Test (expected = IllegalArgumentException.class)
    public void changeIdSetString () {
        Employee employee = new Employee ();
        String a = new String("abc");
        employee.setId(45);
        employee.changeId(a);
    }



    /**
     * id = 0
     */
    @Test
    public void changeIdZero() {
        Employee employee = new Employee();
        employee.setId(25);
        employee.changeId(0);
        assertEquals("id = 0",0,employee.getId());
    }


    /**
     * проверка id на простое число
     */
    @Test
    public void primeNumberSimple() {
        Employee employee = new Employee();
        employee.setId(719);
        assertTrue("number 719 is a simple", employee.primeNumber());
    }

    /**
     * проверка id на не простое число
     */
    @Test
    public void primeNumberNotSimple() {
        Employee employee = new Employee();
        employee.setId(22);
        assertFalse("number 22 is a not simple", employee.primeNumber());
    }

    /**
     * set id 1 - not simple number
     */
    @Test
    public void primeNumberOne() {
        Employee employee = new Employee();
        employee.setId(1);
        assertFalse("number 1 is a not simple", employee.primeNumber());
    }


    /**
     * Сравнение поля name на правильность введеного имени    +
     */
    @Test
    public void employeeKonstruktorEqualsName() throws IllegalArgumentException {
        Employee employee = new Employee("Vasia", 21, 42);
        assertEquals("Vasia", employee.getName());
    }

    /**
     * Сравнение поля age на правильность введеного имени    +
     */
    @Test
    public void employeeKonstruktorEqualsAge() throws IllegalArgumentException {
        Employee employee = new Employee("Vasia", 21, 42);
        assertEquals(21, employee.getAge());
    }

    /**
     * Сравнение поля id на правильность введеного имени    +
     */
    @Test
    public void employeeKonstruktorEqualsId() throws IllegalArgumentException {
        Employee employee = new Employee("Vasia", 21, 42);
        assertEquals(42, employee.getId());
    }


    /**
     * Тестовые случаи
     * Сравнение поля id на правильность введеного значения id
     */
    @Test
    public void setGetId() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setId(22);
        assertEquals(22, employee.getId());
    }


    /**
     * Сравнение поля name на правильность введеного имени
     */
    @Test
    public void setNameEquals() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setName("Tolik");
        assertEquals("Tolik", employee.getName());
    }




    /**
     * 1. Ссылка на объект с пустым полем name     (null) +
     */
    @Test
    public void constructorTest_1_lineNameEmpty() {
        Employee employee1 = new Employee();
        assertNull("Employee's name was set to Null", employee1.getName());
    }

    /**
     * 2. Сравнение поля name на правильность введеного имени
     *
     * @throws Exception
     */
    @Test
    public void constructorTest_2_checkLinaName() throws IllegalArgumentException {
        Employee employee2 = new Employee("Tolik");
        assertEquals("Tolik", employee2.getName());
    }



    @Test
    /**
     * 1. Ссылка null
     */
    public void setNameNull() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setName("Dima");
        employee.setName(null);
        assertNull(employee.getName());
    }

    /**
     * Ссылки на объект с незаполенеым полем Age
     */
    @Test
    public void setAge_1_linkOnObjWithEmptyLineAge() {
        Employee employee = new Employee();
        assertEquals(0, employee.getAge());
    }


    /**
     * Сравнение поля getAge на правельность введеного значения
     */
    @Test
    public void setAge_2_checkLineGetAge() {
        Employee employee = new Employee();
        employee.setAge(32);
        assertEquals(32, employee.getAge());
    }



    /**
     * 1. Ошибка на незаполненое поле setName
     */
    @Test(expected = Exception.class)
    public void setNameToEmpty() throws IllegalArgumentException {
        Employee employee = new Employee();
        employee.setName("");

    }


    /**
     * Две ссылки на один объект = 1;
     */
    @Test
    public void equals_1_twoLinksToTheSameObj() {
        Employee kolia1 = new Employee();
        Employee kolia2 = kolia1;
        assertTrue("Две ссылки на один объект = 1;", kolia1.equals(kolia2));
    }

    /**
     * 2. Вторая ссылка null = 0;
     */
    @Test
    public void equals_2_secondLinkIsNull() {
        Employee kolia1 = new Employee();
        Employee kolia2 = kolia1;
        kolia2 = null;
        assertFalse("Вторая ссылка null", kolia1.equals(kolia2));
    }

    /**
     * 3. Первая ссылка employee, а вторая string = 0;
     */
    @Test
    public void equals_3_firstLinkEmployeeAndSecondLinkString() {
        Employee kolia1 = new Employee();
        String kolia3 = "Nikolai";
        assertFalse("Первая ссылка employee, а вторая string", kolia1.equals(kolia3));
    }

    /**
     * 4. Есть два employee с одинаковыми name но разными age = 0;
     *
     * @throws Exception
     */
    @Test
    public void equals_4_twoEmployeeWithTheSameNameButDifferentAge() throws IllegalArgumentException {
        Employee kolia1 = new Employee();
        Employee kolia2 = new Employee();
        kolia1.setName("Nikolai");
        kolia2.setName("Nikolai");
        kolia1.setAge(32);
        kolia2.setAge(30);
        assertFalse(" Два employee с одинаковыми name но разными age", kolia1.equals(kolia2));
    }

    /**
     * Есть два employee с разными name но age одинаковый = 0;
     *
     * @throws Exception
     */
    @Test
    public void equals_5_twoEmployeeWithTheDifferentNameButSameAge() throws IllegalArgumentException {
        Employee kolia1 = new Employee();
        Employee kolia2 = new Employee();
        kolia1.setName("Maksim");
        kolia1.setAge(30);
        kolia2.setName("Nikolai");
        kolia2.setAge(30);
        assertFalse("Есть два employee с разными name но age одинаковый", kolia1.equals(kolia2));
    }

    /**
     * Есть два employee с одинаковыми age и name (одна и таже ссылка)
     *
     * @throws Exception
     */
    @Test
    public void equals_6_1_twoEmployeeWithTheSameAgeAndNameOneSameLink() throws IllegalArgumentException {
        Employee kolia1 = new Employee();
        Employee kolia2 = new Employee();
        String name = "Vasia";
        kolia1.setAge(30);
        kolia1.setName(name);
        kolia2.setName(name);
        kolia2.setAge(30);
        assertTrue("Есть два employee с одинаковыми age и name (одна и таже ссылка)", kolia1.equals(kolia2));
    }

    /**
     * Есть два employee с одинаковыми age и name (две ссылки на разные объекты)
     *
     * @throws Exception
     */
    @Test
    public void equals_6_2_twoEmployeeWithTheSameAgeAndNameButDifferentLinkOnObj() throws IllegalArgumentException {
        Employee kolia1 = new Employee();
        Employee kolia2 = new Employee();
        String name1 = new String("Maksim");
        String name2 = new String("Maksim");
        kolia1.setAge(30);
        kolia1.setName(name1);
        kolia2.setName(name2);
        kolia2.setAge(30);
        assertTrue("Есть два employee с одинаковыми age и name (две ссылки на разные объекты)", kolia1.equals(kolia2));
    }


    /**
     * Есть два employee с разными name и age
     *
     * @throws Exception
     */
    @Test
    public void equals_7_twoEmployeeWithDifferentNameAndAge() throws IllegalArgumentException {
        Employee kolia2 = new Employee();
        kolia2.setName("Maksim");
        kolia2.setAge(30);
        Employee marina = new Employee();
        marina.setName("Marina");
        marina.setAge(19);
        assertFalse("Есть два employee с разными name и age ", kolia2.equals(marina));
    }

    /**
     * У второго employee name равен null а у первого не равен null  = 0
     *
     * @throws Exception
     */
    @Test
    public void equals_8_1_secondEmployeeNameNullFirstNotNull() throws IllegalArgumentException {
        Employee employee21 = new Employee();
        Employee employee22 = new Employee();
        employee21.setName("Viktor");
        employee22.setName(null);
        assertFalse("У второго employee name равен null а у первого не равен null  = 0", employee21.equals(employee22));
    }

    /**
     * У первого employee name равен null а у второго не равен null
     *
     * @throws Exception
     */
    @Test
    public void equals_8_2_secondEmployeeNameNotNullFirstNull() throws IllegalArgumentException {
        Employee employee21 = new Employee();
        Employee employee22 = new Employee();
        employee21.setName(null);
        employee22.setName("Artem");
        assertFalse("У первого employee name равен null а у второго не равен null", employee21.equals(employee22));
    }

    /**
     * У обоих name равен null   = 1
     *
     * @throws Exception
     */
    @Test
    public void equals_8_3_bothEmployeeNameNull() throws IllegalArgumentException {
        Employee employee21 = new Employee(null, 21);
        Employee employee22 = new Employee(null, 21);
        assertTrue("У обоих name равен null   = 1", employee21.equals(employee22));
    }

    /**
     * Первая ссылка Employee вторая directorEmployee все общие поля одинаковые (equals employee)
     *
     * @throws Exception
     */
    @Test
    public void equals_9_firstLinkEmployeeSecondLinkDirectorEmployeeLineSame() throws IllegalArgumentException {
        DirectorEmployee director31 = new DirectorEmployee("Maksim", 39, "IT");
        Employee employee31 = new Employee("Maksim", 39);
        employee31.setId(21);
        director31.setId(21);
        assertFalse("Первая ссылка Employee вторая directorEmployee все общие поля одинаковые (equals employee)", employee31.equals(director31));
    }


    /**
     * get sum id
     * @throws Exception
     */
    @Test
    public void sum()throws IllegalArgumentException{
        Employee employee1 = new Employee("Maska",21,20);
        employee1.setId(10);
        Employee employee2 = new Employee("Vasia",31,10);
        DirectorEmployee director1 = new DirectorEmployee("Masha",34,"IT",100);
        assertEquals("sum of all",802, Employee.getSumId());
    }

}

