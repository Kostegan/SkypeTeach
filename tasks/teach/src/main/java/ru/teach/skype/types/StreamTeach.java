package ru.teach.skype.types;

import java.io.*;

/**
 *
 */
public class StreamTeach {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        OutputStream os = null;

        is = new FileInputStream("path");
//        DataInputStream dis = new DataInputStream(is);
//        dis.readUTF();

        String path = "C:\\Users\\homek\\IdeaProjects\\work_java\\src\\main\\java\\ru\\teach\\ru.comparables.ru.comparable.skype\\types\\TypesTeach.java";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        System.out.println("File:");
        System.out.println("==============================");
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println("\n==============================");
    }

    private static void writeDataToFile(String data, String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write(data);
        }

//        OutputStream os = null;
//        try {
//            os = new FileOutputStream(filePath) ;
//        } finally {
//            if (os != null) {
//                os.close();
//            }
//        }

    }

    private static  void  readFileFromStream() throws IOException {
        String path = "C:\\Users\\homek\\IdeaProjects\\work_java\\src\\main\\java\\ru\\teach\\ru.comparables.ru.comparable.skype\\types\\TypesTeach.java";
        InputStream is = new FileInputStream(path);

        System.out.println("File:");
        System.out.println("==============================");
        int c;
        while ((c = is.read()) != -1) {
            char ch = (char) c;
            System.out.print(ch);
        }
        System.out.println("\n==============================");
    }

    private static  void  streams() throws IOException {
        InputStream is = null;
        int c = is.read();
        byte[] batch = new byte[100];
        int count = is.read(batch);
        is.available();
        is.close();


        OutputStream os = null;
        int c1 = ' ';
        os.write(c1);
        os.write(batch);
        os.write(batch, 10, 20);
        os.flush();
        os.close();
    }
}
