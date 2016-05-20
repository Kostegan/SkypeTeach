package ru.test.skype.my.iterator;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Iterator;

/**
 *
 */
public class FileReaderTest {

    @Test
    public void finedNext()throws IOException{
        FileLineReader fileLineReader = new FileLineReader("C:\\GitHub\\SkypeTeach\\tasks\\teach\\src\\main\\resources\\Subordinates");
        fileLineReader.reader();
        String compareString = "Irina,DirectorEmployee,52,1500,0";
        assertEquals("Current line has the string: Irina,DirectorEmployee,52,1500,0",compareString,fileLineReader.getCurrentLine());
        fileLineReader.reader();
        fileLineReader.reader();
        fileLineReader.reader();
        String compareString2 = "Irina,DirectorEmployee,52,1500,0";
        assertEquals("Current line has the string: Irina,DirectorEmployee,52,1500,0", compareString2, fileLineReader.getCurrentLine());

    }




    @Test
    public void readFile() throws IOException{
        IFileLineReader reader = new FileLineReader();
        Iterator<String>  it = reader.readFile("C:\\GitHub\\SkypeTeach\\tasks\\teach\\src\\main\\resources\\Subordinates").iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void readFileForEach() throws IOException{
        IFileLineReader reader = new FileLineReader();
        for(String str : reader.readFile("C:\\GitHub\\SkypeTeach\\tasks\\teach\\src\\main\\resources\\Subordinates")){
            System.out.println(str);
        }
    }
}
