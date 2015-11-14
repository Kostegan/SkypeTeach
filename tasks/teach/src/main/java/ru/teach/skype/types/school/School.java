package ru.teach.skype.types.school;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class School implements ISchool {
    private int number;
    private List<IWorker> workers = new ArrayList<>();

    public void addWorker(IWorker worker){
        workers.add(worker);
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public int schoolSize(){
      return workers.size();
    }


}
