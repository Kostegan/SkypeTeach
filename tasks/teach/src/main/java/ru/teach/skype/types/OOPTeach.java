package ru.teach.skype.types;

/**
 *
 */
public class OOPTeach {
    public static void main(String[] args) {
        Person person = new Person();
        person.go();

        Worker worker = new Worker();
        worker.go();

        person = worker;

        worker = (Worker) person;




        Operation operation;

        MinusOperation minus = new MinusOperation();

        operation = minus;
        operation.calc();

        minus = (MinusOperation) operation;

        PlusOperation plus = new PlusOperation();

        operation = plus;
        operation.calc();

        minus = (MinusOperation) operation;

        ComplexMinusOperation complexMinus = new ComplexMinusOperation();

        operation = complexMinus;

        minus = complexMinus;

        AbstractOperation abstractO = new MinusOperation();

//        operation = (Operation) new Object();
    }


//    person =
}

interface Operation {
    void calc();
}

abstract class AbstractOperation implements Operation {
    void print() {

    }
}

class MinusOperation extends AbstractOperation {
    public void calc() {
        System.out.println("minus");
    }
}

class ComplexMinusOperation extends MinusOperation {
    public void calc() {
        System.out.println("complex minus");
    }
}

class PlusOperation implements Operation {
    public void calc() {
        System.out.println("plus");
    }
}




class Person {
    public void go() {
        System.out.println("Go [" + getClass().getSimpleName() + "]");
    }
}

class Worker extends Person {
    public void work() {
        System.out.println("Work [" + getClass().getSimpleName() + "]");
    }
}
