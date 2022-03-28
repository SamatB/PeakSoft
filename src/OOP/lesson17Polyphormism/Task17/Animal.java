package OOP.lesson17Polyphormism.Task17;

public class Animal {
    private String name;

    public Animal(String name) {
       this.name = name;
    }
    public Animal() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action () {
        System.out.println("Animal is acting");
    }
}
