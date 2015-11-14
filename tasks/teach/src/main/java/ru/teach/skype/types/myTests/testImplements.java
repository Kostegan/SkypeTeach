package ru.teach.skype.types.myTests;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class testImplements {
    public static void main(String[] args)throws IOException {
        String path = "C:\\Users\\home\\IdeaProjects\\work_java\\src\\main\\java\\ru\\teach\\ru.comparables.ru.comparable.skype\\Statistic.java";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        String line;
        while((line = reader.readLine())!=null){
            System.out.println(line);
        }


//        InputStream is = new FileInputStream(path);
//        int c;
//        while((c = is.read())!=-1){
//            System.out.print((char)c);
//        }
    }
}




