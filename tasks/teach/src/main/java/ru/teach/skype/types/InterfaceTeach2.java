package ru.teach.skype.types;

/**
 *
 */
public class InterfaceTeach2 {
    public void move(FileManagerKos fm){
        fm.move("1","2");
    }

    public static void main(String[] args){
        InterfaceTeach2 interF = new InterfaceTeach2();
        interF.move(new StubFileManager2());
    }
}

    interface FileManagerKos{
        void move(String from, String to);
        void copy(String from, String to);
        void delete(String source);
    }

class StubFileManager2 implements FileManagerKos {
    @Override
    public void move(String from, String to){
        System.out.println("move from ["+ from + "] to [ "+ to +"]." );
    }

    @Override
    public void copy(String from, String to){
        System.out.println(from + " " + to);
    }

    @Override
    public void delete(String source){
        System.out.println(source);

    }

}

