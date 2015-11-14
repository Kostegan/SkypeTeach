package ru.teach.skype.work.tree;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 */
public class Form implements IForm {
    private Map map = new TreeMap<>();

    @Override
    public void addNewLine(String key, String value) {
        map.put(key, value);
    }

    public void calculateStatisticForm() {
        this.map = new TreeMapWrapper(map);
        WorkForm workForm = new WorkForm();
        workForm.calculateStatistic(map);
    }

    public String get(String key){
        return ""+map.get(key);
    }

}
