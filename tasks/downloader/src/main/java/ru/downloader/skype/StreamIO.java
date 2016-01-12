package ru.downloader.skype;

import java.io.*;

/**
 *
 */
public class StreamIO {

    public static void main(String[] args) throws IOException {
        String path = "C:\\GitHub\\SkypeTeach\\tasks\\downloader\\src\\main\\resources\\downloader";
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
       String[] array = {"23323","3sdasd","23"};
        boolean eof = false;
        int i = 0;
        while(!eof) {
            writer.write(array[i]);
            System.out.println(array[i]);
            writer.newLine();
            i++;
            if(i==array.length){
                eof = true;
            }
        }
        String str = "Welcome";
        writer.write(str);
        writer.write(str);
        writer.close();

//        String str = "Hello";
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
//        writer.write(str);
//
//        writer.close();
        System.out.println("end");
    }
}
