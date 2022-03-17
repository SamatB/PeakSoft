package OOP.lesson15Inheritance;

public class Calf extends Cow{
    public Calf (int jah, String aty, String breed) {
        super(jah, aty, breed);
    }
    @Override
    public String toString () {
        return super.getBreed() + " " + super.getAge();
    }

}
