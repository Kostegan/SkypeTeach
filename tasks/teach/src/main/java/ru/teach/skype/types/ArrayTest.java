package ru.teach.skype.types;

import ru.teach.skype.Employee;
import ru.teach.skype.staff.DirectorEmployee;

/**
 *
 */
public class ArrayTest {
    public static void main(String[] args) throws Exception {
        int[] arr1 = {100,200,300,400};
        System.out.println("element array: " + arr1[1]);
        System.out.println("element array: " + arr1[0]);

        long[] arr2 = null;

        System.out.println("long array: " + arr2);

        long[] arr3 = new long[5];
        arr3[0] = 100;
        arr3[1] = 200;
        arr3[2] = 300;

        System.out.println("Array element [0] = " + arr3[0]);
        Employee employee1 = new Employee();
        Employee[] employee = new Employee[3];
        System.out.println("array employee get: " + employee[1]);
        employee[1] = new Employee("Boris");
//        employee[2] = new Employee();
//        employee[2].setName("Andrey");
//        System.out.println("array [2] get : " + employee[2]);
        System.out.println("3 element = " + employee[0]);

        Employee[] arrayEmployee = new Employee [5];
        arrayEmployee[0] = new Employee();
        arrayEmployee[4] = new Employee();
        System.out.println("arrayEmployee [4]" + arrayEmployee[4]);
        System.out.println("Employee [1] " + employee[1]);
        System.out.println("Employee [4] " + employee[2]);

        int e = arrayEmployee.length;
        int o = employee.length;
        System.out.println("Length array arrayEmployee = " + e);
        System.out.println("Lenght array employee = " + o);

        int lastIndex = arrayEmployee.length - 1;
        Employee lastElement = arrayEmployee[lastIndex];
        System.out.println("Last element array arrayEmployee = " + lastElement);
        System.out.println("Last element array arrayEmployee = " + arrayEmployee[lastIndex]);

        int lastIndexEmployee  = employee.length - 1;
        System.out.println("Last element in array Employee = " + employee[lastIndexEmployee]);

        String m1 = new String();



        System.out.println("=====Print array Employee======");

        int index = employee.length - 1;

        for (int i = 0; i <= index ; i++ ){
            System.out.println(i + " :" + employee[i]);
        }



        for (int i = 0; i < employee.length; i++ ){
            System.out.println(i + " :" + employee[i]);
        }

        DirectorEmployee director = new DirectorEmployee();
        System.out.println("director set: " + director);



    }
//    @Override
//    public String toStringBuilder() {
//        return "DIRECTOR [" + getName() + "]";
//    }
}
