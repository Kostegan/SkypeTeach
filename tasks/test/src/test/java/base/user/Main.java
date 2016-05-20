package base.user;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.setAge(11);
        people.getAge();

        Worker worker = new Worker();
        worker.getAge();

        People people2 = new Worker();
        people2.getAge();
        Worker worker2 = (Worker) people2;
        worker2.press();
//        Worker worker3 =(Worker) people;
//        worker3.press();
    }
}
