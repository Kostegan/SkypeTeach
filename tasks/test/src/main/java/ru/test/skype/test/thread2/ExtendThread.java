package ru.test.skype.test.thread2;

import javax.swing.*;

/**
 *
 */
public class ExtendThread {
    public static void main(String[] args) throws InterruptedException {
//
        AdditionalThread addThread = new AdditionalThread();

//
//        for(int i = 5; i>0;i--){
//            System.out.println("Main thread is go: "+ i);
//            Thread.sleep(1000);
//        }
//        addThread.start();
//        addThread.join();
//        System.out.println("The main thread is closed.");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    for (int i = 5; i > 0; i--) {

                        System.out.println("Main thread is go: " + i);
//                        Thread.sleep(1000);
                        addThread.start();
                    }

            }
        });
    }
}
