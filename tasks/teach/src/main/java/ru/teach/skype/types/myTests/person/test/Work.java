package ru.teach.skype.types.myTests.person.test;

/**
 *
 */
public class Work {
    public static void main(String[] args){
        IPerson accountant = new AccountantWorker();
        accountant.goWork();

        Person person = new Person();
        person.setName("Marina");
        RootWorker rootWorker = new RootWorker();
        rootWorker.setAge();
        rootWorker.setName("Pavel");
        Person rootWorker2 = new RootWorker();
        rootWorker2.setName("Max");
        EngineerWorker engineerWorker = new EngineerWorker();
    }
}
