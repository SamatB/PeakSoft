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

    @Override
    public void learn() {
        super.learn();
        System.out.println(getName() + " learned to dance in 3 months.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " loves eating fried chicken.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() + " at the dancefloor makes bodymoves so cool.");
    }
}
