package ru.teach.skype.types.reflection;

import com.google.common.io.Files;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/**
 *
 */
public class ReflectionTeach {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Masha", 40);
        String scheme = "ru.teach.skype.types.reflection.Person=users [name=NAME, age=PERSON_AGE]";
        ObjectDao dao = new ObjectDao();
        dao.save(p, scheme);

//        String info = "...."; // info from mapping.xml
//        String infoClassname = "";
//        Map<String, Object> fields = null;//
//        String methodNameToCall = "..";

//        String clsName = Files.readLines(new File("tasks\\teach\\src\\main\\resources\\Ref.txt"), Charset.defaultCharset()).get(0);
        String clsName = "ru.teach.skype.types.reflection.Person";
        Class cls = Class.forName(clsName);
        System.out.println(cls);
        Field[] fields = cls.getDeclaredFields();


//        Object person = cls.newInstance();
          String[] constructorTypes = {"java.lang.String", "java.lang.Integer"};
          Class[] constructorTypesClasses = new Class[constructorTypes.length];
          for (int i=0; i<constructorTypes.length; i++) {
              constructorTypesClasses[i] = Class.forName(constructorTypes[i]);
          }
          Object person = cls.getConstructor(constructorTypesClasses).newInstance("Oleg", 25);
//        Object person = new Person("oleg", 25);
//        System.out.println(person.age);

//        System.out.println(person.getAge());
        System.out.println(cls.getDeclaredField("age").getInt(person));

        String fieldName = "age";
        String getMethodName = "get" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1); //getAge
        Method method = cls.getMethod(getMethodName);
        Object result = method.invoke(person);
        System.out.println(getMethodName + ": " + result);
    }
};

class Person {
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, Integer age) {
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
