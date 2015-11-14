package ru.teach.skype.types.myTests;

import java.io.File;

/**
 *
 */
public class Delete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("������ �������: java Delete <���� �� ��������>");
            System.exit(0);
        }
        try {
            delete(args[0]);
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    public static void delete(String fileName){
        File f = new File(fileName);
        if(!f.exists())fail("Delete: ��� ������ ����� ��� ��������"+ fileName);
        if(!f.canWrite())fail("Delete: ���� ������� �� ������"+ fileName);
        if(f.isDirectory()){
            String[] files = f.list();
            if(files.length>0)
                fail("Delete: ������� �� ����:"+ fileName);
        }
        boolean success = f.delete();
        if(!success) fail("Delete: �������� �� �������");
    }
    protected static void fail(String msn) throws IllegalArgumentException{
        throw new IllegalArgumentException(msn);
    }
}
