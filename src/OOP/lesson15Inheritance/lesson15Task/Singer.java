package OOP.lesson15Inheritance.lesson15Task;

public class Singer extends Person{
    private String bandName;

    public Singer (String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString (){
        return "Singer's name: " + super.getName()
                + ", Genre - " + super.getDesignation()
                + ", In which groupe - " + getBandName();
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing () {
        System.out.print(getName() + " sings very well");
    }
    public void playGitar() {
        System.out.println(" and can play any songs on guitar.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " today is going to eat with his band "  + getBandName());
    }
    @Override
    public void learn () {
        super.learn();
        System.out.println(getName() + " is learning new song for the concert.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(getName() + " every morning walks on the 1st street.");
    }
}
