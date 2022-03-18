package OOP.lesson15Inheritance.lesson15Task;

public class Programmer extends Person{
    private String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    @Override
    public String toString () {
        return "Name: " + super.getName() +
                ", Designation - " + super.getDesignation()
                + ", Work place - " + getCompanyName();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding () {
        System.out.println(getName() + " codes at work for 2 hours.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() + " walks around the house every night with his dog Rax.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " is eating cooked fish.");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(getName() + " has been learned java programming for 6 months");
    }
}
