package ru.trafficlight;

import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
//        ITrafficLight trafficLight = new TrafficLight();
//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()){
//            System.out
            SystemM.out.println("1111");
//        }


        A a = new A();
        A a2 = new B();
        B b = new B();
//        B b2 =(B) new A();

        Object obA = new A();
        A aNew =(A) obA;
        aNew.read();
        a.read();
        a2.read();

        b.read();
        ITrafficLight tr = new TrafficLight();
//        b.traff.showColorByMin(tr.showColorByMin(55));
//        b.setName("sdsad");
    }

}

class A {
    TrafficLight tr;
    public void read(){
        tr.showColorByMin(34);

    }
}

class B extends A {
    public String name;
    public final ITrafficLight traff = null;

    public void setName(String name) {
        this.name = name;
    }
}

class SystemM{
    public final static InputStream in = null;
    public final static PrintStream out = null;
}




