package ru.teach.skype.work.tree;


import org.junit.Test;


/**
 *
 */
public class FormTest {

    @Test
    public void calculateStatistic(){
        IForm form = new Form();
        form.addNewLine("11","772423");
        form.calculateStatisticForm();
        System.out.println(form.get("11"));
    }
}
