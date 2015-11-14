package ru.teach.skype.types;

/**
 *
 */
public class Test {
    M1[] list = new M1[4];

    public void listAddElement(M1 m1, int i){
        list[i] = m1;
    }

    public void printList(){

    }
}

class M1{
    int number;

    public M1(){

    }

    public M1(int number){
        setNumber(number);
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}

class PrintNumber{
    public static void main(String[] args){

        Test test1 = new Test();
        M1 m1 = new M1();
        m1.setNumber(5);
        M1 m2 = new M1(10);
        test1.listAddElement(m1,0);
        test1.listAddElement(m2,1);
        System.out.println(test1.list);
    }


}
