package ru.teach.skype;

/**
 *
 */
public interface IEmployee  {
    public void setName(String name) throws Exception;
    public void setAge(int age);
    public void setId(long id);
    public String getName();
    public int getAge();
    public long getId();
    public void toStringBuilder(StringBuilder sb, String linePrefix);

}
