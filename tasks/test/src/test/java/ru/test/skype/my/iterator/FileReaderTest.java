package ru.test.skype.my.iterator;

import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

/**
 *
 */
public class FileReaderTest {
    private IFileLineReader createFileReader(){
        return new FileLineReader();
    }

    @Test
    public void readFile() throws IOException{
        IFileLineReader reader = null;
        Iterator<String>  it = reader.readFile("").iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void readFileForEach() throws IOException{
        IFileLineReader reader = null;
        for(String str : reader.readFile("")){
            System.out.println(str);
        }
    }
}
