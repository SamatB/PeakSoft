package OOP.lesson17Polyphormism.Task17;

public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    public Turtle() {

    }

    @Override
    public void action () {}

    public void swim () {
        System.out.println("Turtle swims faster then he moves on the land");
    }
}
