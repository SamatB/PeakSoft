package OOP.lesson16FinalProt.Task;

import java.util.Arrays;

public class Course {
    private String name;
    private int number;
    private Group [] groups;

    public Course () {

    }

    public Course (String name, int number, Group [] groups) {
        this.name = name;
        this.number = number;
        this.groups = groups;
    }

    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return name;
    }
    public void setNumber (int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setGroups (Group [] groups) {
        this.groups = groups;
    }

    public Group[] getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return "Course: " +
                "name = " + name +
                ", number = " + number +
                ", groups = " + Arrays.toString(groups);
    }
}
