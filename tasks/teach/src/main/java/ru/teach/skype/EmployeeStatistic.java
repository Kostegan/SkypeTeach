package ru.teach.skype;

import org.junit.Test;
import ru.teach.skype.staff.DirectorEmployee;

/**
 *
 */
public class EmployeeStatistic {


    /**
     * 1. Вычесление СКО четырех разных сотрудников id сотрудников заполнены
     * 1. Вычесление СКО четырех сотрудников, два сотрудника повторяются, id сотрудников заполнены
     * 2.
     * @throws Exception
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
        System.out.println(director.calculateAverageQuadraticDeviation());
    }
}

