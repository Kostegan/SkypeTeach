package ru.test.skype.test.thread2;

/**
 *
 */
public class AdditionalThread extends Thread {
    public AdditionalThread() {
        super("Additional thread.");
        System.out.println("Daughter thread.");
    }

    public void run() {
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println("Daughter thread " + n);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread");
        }
        System.out.println("Daughter thread is ended.");
    }
}
