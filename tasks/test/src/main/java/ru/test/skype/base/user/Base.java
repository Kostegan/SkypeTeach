package ru.test.skype.base.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Base implements IBase {
    private ArrayList<String> base;
    private BufferedReader reader;

    public Base() {

    }

    @Override
    public void addUser(IUser user) {

    }

    @Override
    public boolean removeUser(IUser user) {
        return false;
    }

    @Override
    public boolean changeUser(IUser user) {
        return false;
    }

    @Override
    public List<String> getBase() {
        return null;
    }

    /**
     * Opens a input stream and retrieves one line from base.
     *
     * @return one line from base.
     */
    private String getOneStringFromBase() throws IOException {
        String pathToBase = "C:\\GitHub\\SkypeTeach\\tasks\\test\\src\\main\\resources\\base";
        reader = new BufferedReader(new FileReader(pathToBase));
        return reader.readLine();
    }

    // Splits string by ",".
    private String splitsString(String string){
        return "";
    }


    private void closeStream() throws IOException{
        reader.close();
    }
}
