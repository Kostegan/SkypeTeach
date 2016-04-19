package ru.test.skype.test.thread;

/**
 *
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        new NewThread();


//
//        Thread t = Thread.currentThread();
//        System.out.println("Currently a current thread has the name: " + t);
//        t.setName("CurrentThread");
//        System.out.println("Now the current thread has the name: " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Main thread: "+n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("The main thread is interrupted.");
        }

    }
}
