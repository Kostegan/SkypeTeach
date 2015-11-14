package ru.teach.skype.staff;

import ru.teach.skype.IEmployee;

/**
 *
 */
public interface IDirectorEmployee {

    public void addSubordinate(IEmployee subordinate)throws Exception;
    public void deleteSubordinate(IEmployee employee) throws IllegalStateException;
    public void replaceSubordinate(IEmployee oldSubordinate, IEmployee newSubordinate) throws Exception;
    public void setSubordinate(IEmployee subordinate, int index) throws Exception;
    public IEmployee getSubordinates(int index);
}
