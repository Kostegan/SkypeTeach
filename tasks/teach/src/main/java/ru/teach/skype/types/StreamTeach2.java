package ru.teach.skype.types;

import java.io.*;

/**
 *
 */
public class StreamTeach2 {
    public static void main(String[] args) throws IOException {
////        String s = "C:\\Users\\homek\\IdeaProjects\\work_java\\src\\main\\java\\ru\\teach\\ru.comparables.ru.comparable.skype\\types\\Car.java";
////        InputStream is = new FileInputStream(s);
////        BufferedReader reader = new BufferedReader(new FileReader(s));
////        int c;
////        while((c = is.read())!= -1){
////            char ch = (char) c;
////            System.out.print(ch);
////        }
//
//        File f = new File("C:\\distr\\testDirectory\\testDoc.txt");
////        if (f.exists()) {
////            f.delete();
////        } else {
////            f.createNewFile();
////        }
//        File dir = new File("C:\\distr\\");
//        File[] files = dir.listFiles();
//        for (File file : files) {
//            if (file.isDirectory()) {
//                System.out.println(file.getAbsolutePath());
//            }
//        }
        InputStream in = new FileInputStream("C:\\distr\\testDirectory\\testDoc1.txt");
        OutputStream os = new FileOutputStream("C:\\distr\\testDirectory\\testDoc2.txt");
        int b;
        while((b = in.read())!=-1){
            os.write(b);
        }
        in.close();
        os.close();

    }

}
