package ru.teach.skype.types.school;

/**
 *
 */
public interface ISchool {
    public void setNumber(int number);
    public int getNumber();
    public void addWorker(IWorker worker);
    public int schoolSize();
}
