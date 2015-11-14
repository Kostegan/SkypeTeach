package ru.teach.skype.types.myTests;

import java.io.File;

/**
 *
 */
public class Delete {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Формат команды: java Delete <файл из каталога>");
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
        if(!f.exists())fail("Delete: нет такого файла или каталога"+ fileName);
        if(!f.canWrite())fail("Delete: файл защищен от записи"+ fileName);
        if(f.isDirectory()){
            String[] files = f.list();
            if(files.length>0)
                fail("Delete: каталог не пуст:"+ fileName);
        }
        boolean success = f.delete();
        if(!success) fail("Delete: удаление не удалось");
    }
    protected static void fail(String msn) throws IllegalArgumentException{
        throw new IllegalArgumentException(msn);
    }
}
