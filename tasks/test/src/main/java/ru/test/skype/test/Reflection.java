package ru.test.skype.test;

import com.google.common.io.Files;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

/**
 *
 */
public class Reflection {
    public static void main(String[] args)throws Exception{
        String clsName = Files.readLines(new File("C:\\GitHub\\SkypeTeach\\tasks\\test\\src\\main\\resources\\date.txt"), Charset.defaultCharset()).get(0);

        //----- create instance object to Class, writes data from file.
        Class cls = Class.forName(clsName);

        System.out.println(cls); // received a complete class-name
        System.out.println(cls.getSimpleName()); // received a brief class-name

        //----------------------------------
        Field[] fields = cls.getDeclaredFields(); // recorded all fields to array
        for(Field f : fields){
            System.out.println(f.getName());
        }

        //----------------------------------
        Object person = cls.newInstance(); // created a new instance object without parameters
        Object person2 = cls.getConstructor(String.class,int.class).newInstance("Oleg",28);// created a new instance object with parameters.

        //----------------------------------

        String fieldName = "age";
        String getMethodName = "get" + Character.toUpperCase(fieldName.charAt(0))+fieldName.substring(1);// created string: getAge
        Method method = cls.getMethod(getMethodName); // created a reference to class Method and recorded a method "getAge" to the link.
        Object result = method.invoke(person2); //
        System.out.println(getMethodName+" : "+result);




//
//        Object obj = cls.newInstance();
//        Method method = cls.getMethod("setAge").invoke(obj);
//        System.out.println(cls.getMethod("getAge").invoke(obj));
//        Object person = new Person("Fedor",22);
//        System.out.println(cls.getDeclaredField("age").getInt(person));
//        Method[] temp = cls.getDeclaredMethods();
//        System.out.println(temp[0]);
    }
}

class Person{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
