package ru.test.skype.my.iterator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 */
public class FileLineReader implements IFileLineReader {

    private List<String> list = new ArrayList<>();

    @Override
    public Iterable<String> readFile(String filename) throws IOException {
        return null;
    }

    @Override
    public Iterator<String> iterator() {
//        if(!list.isEmpty())
        return null;
//        BufferedReader reader = new BufferedReader(new FileReader(filename));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            list.add(line);
//            if (list.size() > 10) {
//                iterator();
//                list.clear();
//            }
//        }
//        reader.close();
//        if (list.size() != 0) {
//            iterator();
//        }
    }


    //
//    public FileLineReader(String path) throws IOException {
//        readFile(path);
//    }
//
//    public void readFile(String path) throws IOException {
//        BufferedReader reader = new BufferedReader(new FileReader(path));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            list.add(line);
//            if (list.size() > 10) {
//                iterator(list);
//                list.clear();
//            }
//        }
//        reader.close();
//        if (list.size() != 0) {
//            iterator(list);
//        }
//    }
//
//
//    private void iterator(List<String> list) {
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//        }
//    }
//}
//
//class main {
//    public static void main(String[] args) throws IOException {
//        String path = "C:\\Users\\homek\\IdeaProjects\\work_java\\tasks\\teach\\src\\main\\java\\ru\\teach\\skype\\types\\Days.java";
//        FileLineReader fileReader = new FileLineReader(path);
//        fileReader.readFile(path);
//    }
}


