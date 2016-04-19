package ru.test.skype.test.thread;

/**
 *
 */
public class NewThread implements Runnable {
    private Thread t;

    public NewThread() {
        t = new Thread(this, "Demonstration thread");
        System.out.println("Demonstration thread is created: " + t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for (int n = 5; n > 0; n--) {
                System.out.println("Demonstration thread: "+n);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Demonstration thread is interrupted.");
        }
        System.out.println("Demonstration thread is ended in this line.");
    }
}
