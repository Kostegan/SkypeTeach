package ru.teach.skype.types.school;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 */
public class schoolTest {

    @Test (expected = IllegalArgumentException.class)
    public void addTwoDirectorsToConstructor(){
        ISchool school = new School();
        IWorker director1 = new WorkerDirector();
        IWorker director2 = new WorkerDirector();
    }

    @Test
    public void addOneDirectorsToConstructor(){
        ISchool school = new School();
        IWorker director1 = new WorkerDirector();
        school.addWorker(director1);
        assertEquals("Added one director",1,school.schoolSize());
    }

    @Test (expected = IllegalArgumentException.class)
    public void addWorkersToConstructor(){
        ISchool school = new School();
        IWorker worker1 = Worker.createWorker();
        IWorker worker2 = Worker.createWorker();
        IWorker worker3 = Worker.createWorker();
        IWorker worker4 = Worker.createWorker();
        IWorker worker5 = Worker.createWorker();
        IWorker worker6 = Worker.createWorker();
        school.addWorker(worker1);
        school.addWorker(worker2);
        school.addWorker(worker3);
        school.addWorker(worker4);
        school.addWorker(worker5);
        school.addWorker(worker6);
    }

    @Test
    public void addWorkersToConstructorLessFive(){
        ISchool school = new School();
        IWorker worker1 = Worker.createWorker();
        IWorker worker2 = Worker.createWorker();
        IWorker worker3 = Worker.createWorker();
        IWorker worker4 = Worker.createWorker();
        IWorker worker5 = Worker.createWorker();
        school.addWorker(worker1);
        school.addWorker(worker2);
        school.addWorker(worker3);
        school.addWorker(worker4);
        school.addWorker(worker5);
        assertEquals("Number workers is five.",5,school.schoolSize());
    }
}
