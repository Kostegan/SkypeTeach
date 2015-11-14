package ru.teach.skype.types;

import org.junit.Test;
import ru.teach.skype.Employee;
import ru.teach.skype.staff.DirectorEmployee;
import static org.junit.Assert.*;

/**
 *
 */
public class EmployeeStatisticTest {

    /**
     * 1. Вычесление СКО четырех разных сотрудников id сотрудников заполнены
     * 2. Вычесление СКО четырех сотрудников,  одного сотрудника не заполнено поле id
     * 3. Вычесление СКО одного сотрудника
     * @throws Exception
     */

    /**
     * 1. Вычесление СКО четырех разных сотрудников id сотрудников заполнены
     *
     */
    @Test
    public void averageQuadraticDeviation() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Irina", 32, 21);
        Employee employee2 = new Employee("Lena", 30, 45);
        Employee employee3 = new Employee("Katerina", 40, 71);
        Employee employee4 = new Employee("Viktor", 40, 34);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.addSubordinate(employee3);
        director.addSubordinate(employee4);
        double result = director.calculateAverageQuadraticDeviation();
        double expected = 18.38987493160299;
        assertEquals("id сотрудников заполнены",expected,result,0);
        System.out.println(director.calculateAverageQuadraticDeviation());
    }

    /**
     * 2. Вычесление СКО четырех сотрудников,  у первого и последнего сотрудника не заполнено поле id
     * @throws IllegalArgumentException если id не заполнено
     */
    @Test (expected = IllegalArgumentException.class)
    public void averageQuadraticDeviationTwoClone() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Irina");
        Employee employee2 = new Employee("Lena",30, 45);
        Employee employee3 = new Employee("Katerina", 40, 71);
        Employee employee4 = new Employee("Viktor", 40);
        director.addSubordinate(employee1);
        director.addSubordinate(employee2);
        director.addSubordinate(employee3);
        director.addSubordinate(employee4);
        director.calculateAverageQuadraticDeviation();
    }

    /**
     * 3. Вычесление СКО одного сотрудника
     * @throws IllegalStateException сотрудников должно быть больше одного
     */
    @Test (expected = IllegalStateException.class)
    public void averageQuadraticDeviationOne() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        Employee employee1 = new Employee("Irina",32,11);
        director.addSubordinate(employee1);
        director.calculateAverageQuadraticDeviation();
    }

    /**
     * 3. Вычесление СКО нет сотрудников
     * @throws IllegalStateException сотрудников должно быть больше одного
     */
    @Test (expected = IllegalStateException.class)
    public void averageQuadraticDeviationNoSubordinates() throws Exception {
        DirectorEmployee director = new DirectorEmployee();
        director.calculateAverageQuadraticDeviation();
    }
}
