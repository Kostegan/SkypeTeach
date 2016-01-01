package ru.test.skype.base.user;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Base implements IBase {
    private ArrayList<IUser> base = new ArrayList<>();
    private BufferedReader reader;
    private BufferedWriter writer;
    private String pathToBase = "C:\\GitHub\\SkypeTeach\\tasks\\test\\src\\main\\resources\\base";


    public Base() {

    }

    @Override
    public void addUser(IUser user) {
        base.add(user);
    }

    @Override
    public void updateBase() throws IOException {
        writer = new BufferedWriter(new FileWriter(pathToBase));
        for(int i = 0; i<base.size();i++){
            writer.write(base.get(i).printUser());
            writer.newLine();
        }
        writer.close();
    }

    @Override
    public boolean removeUser(IUser user) {
        return base.remove(user);
    }

    @Override
    public boolean changeUser(IUser user) {
        return false;
    }

    /**
     * At first this method gets the one user from base as one string,
     * then separates the string of parts
     * and then creates a user with the received data.
     * @return
     * @throws IOException
     */
    @Override
    public void getBase() throws IOException {
        String temp;
        String[] userFromBase;
        IUser tempUser;
        connectBase();
        while((temp = getOneStringFromBase())!=null){
            userFromBase = splitsString(temp);
            tempUser = createUser(userFromBase[0],userFromBase[1],userFromBase[2],userFromBase[3],userFromBase[4]);
            base.add(tempUser);
        }
        closeStream();
    }

    private boolean connectBase()throws IOException{
        reader = new BufferedReader(new FileReader(pathToBase));
        return true;
    }


    /**
     * Opens a input stream and retrieves one line from base.
     *
     * @return one line from base.
     */
    private String getOneStringFromBase() throws IOException {
        return reader.readLine();
    }

    // Creates new User
    private IUser createUser(String name, String lastName, String phone, String email, String password){
        long phoneInt = Long.parseLong(phone);
        IUser user = new User(name,lastName,phoneInt,email,password);
        return user;
    }

    // Splits string by ",".
    private String[] splitsString(String string){
        String delims = "[,]";
        String[] temp  = string.split(delims);
        return temp;
    }


    private void closeStream() throws IOException{
        reader.close();
    }

    @Override
    public void printBase() {
        for(IUser user : base){
            System.out.println(user.printUser());
        }
    }
}
