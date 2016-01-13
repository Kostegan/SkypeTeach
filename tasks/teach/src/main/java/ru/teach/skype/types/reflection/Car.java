package ru.teach.skype.types.reflection;

/**
 *
 */
public class Car {
    private String name;
    private String country;

    public Car() {
    }

    public Car(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car("Ford","USA");
        ObjectDao dao = new ObjectDao();
        String scheme = "ru.teach.skype.types.reflection.Person=users [name=NAME, country=COUNTRY]";
        dao.save(car,scheme);
    }
}
