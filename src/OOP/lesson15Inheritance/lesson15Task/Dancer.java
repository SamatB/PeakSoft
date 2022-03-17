package OOP.lesson15Inheritance.lesson15Task;

public class Dancer extends Person{
    private String groupName;

    public Dancer (String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString () {
        return "Dancer's name: " + super.getName()
                + ", Dancing type -  " + super.getDesignation()
                + ", Which group - " + getGroupName();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void dancing () {
        System.out.println(getName() + " is dancing to the M. Jackson's song.");
    }
}
