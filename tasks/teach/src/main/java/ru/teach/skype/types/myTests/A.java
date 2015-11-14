package ru.teach.skype.types.myTests;

/**
 *
 */
public class A {
    private int id;
    private String name;
    private String[] idStop = null;
    public void goToCity (String a){
        System.out.println("1" +" " + a);
    }

    public A() {

    }

    public A(int index){
        idStop = new String[index];
    }

    public void setIdList(String name){
        for (int i = 0; i < idStop.length; i++){
            if (idStop[i] == null){
                idStop[i] = name;
                return;
            }
        }
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId () {
        return id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void print (){
        for (int i = 0; i < idStop.length; i++) {
            System.out.println(idStop[i]);
        }
    }
}
