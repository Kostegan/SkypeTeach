package ru.teach.skype.types;

import ru.teach.skype.Employee;

/**
 *
 */
public class ArrayTeach {

    public static void main(String[] args) {

        // array. size = 4 elements
        // element - int - 4 bytes
        // array - 4 bytes * 4 elements = 16 bytes
        // [100, 200, 300, 400]

        int[] array = {100, 200, 300, 400};

        // index = 1, 4 byte => index*4 - memory address
        System.out.println(array[1]);


        long[] longArray;

        Employee[] employees = null;
        System.out.println(employees);


        long[] arr2 = new long[5]; // array with 5 elements
        arr2[0] = 100;
        int index = 0;
        arr2[index] = 100;
        arr2[1] = 200;

        System.out.println("arr2[0]: " + arr2[0]);
        System.out.println("arr2[1]: " + arr2[1]);
        System.out.println("arr2[2]: " + arr2[2]);

        Employee[] employeeArray = new Employee[5];
        System.out.println("employeeArray[0]: " + employeeArray[0]);
        employeeArray[0] = new Employee();
        System.out.println("employeeArray[0]: " + employeeArray[0]);

        int arr2Length = arr2.length;
        System.out.println("Size of array arr2: " + arr2Length);

        arr2[2] = 300;
        arr2[3] = 400;
        arr2[4] = 500;
        int lastIndex = arr2.length - 1;
        long lastArr2Element = arr2[lastIndex];
        System.out.println("Last element in arr2: " + lastArr2Element);




        // length = 5:
        // i <= length-1: i <= 4
        //         i <= 4 ??? i < 5
        // i =0 : true , true
        // i=1: true, true
        // i=2: true, true
        // i=3: true, true
        // i=4: true, true
        // i=5: false, false

        System.out.println("=====Print array arr2:=====");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(i + ": " + arr2[i]);
        }

        //
        int[] ar1 = new int[3]; // 3 elements, each = 0
        int[] ar1Copy = ar1;
        ar1 = new int[10];

        int[] ar2 = new int[]{100, 200, 300}; // 3 elements, [0]=100, [2]=200, [3]=300
        ar2 = new int[]{1,2,3,4,5,6,7,8,9};

        int[] ar3 = {100, 200, 300}; // 3 elements, [0]=100, [2]=200, [3]=300
//        ar3 = {1,2,3,4}; - wrong


    }
}
