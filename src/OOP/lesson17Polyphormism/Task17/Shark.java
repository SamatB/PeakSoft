package OOP.lesson17Polyphormism.Task17;

public class Shark extends Animal{
    public Shark(String name) {
        super(name);
    }
    public Shark () {

    }

    @Override
    public String toString () {
        return getName();
    }


    public void attack() {
        System.out.println("Shark is attacking the other shark which is smaller him.");
    }

}
