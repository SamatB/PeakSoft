package OOP.lesson15Inheritance;

public abstract class Cow extends Animal{
    private String breed;

    public Cow (int jah, String aty, String breed) {
        super(jah, aty);
        this.breed = breed;
    }
    public void setBreed (String breed) {
        this.breed = breed;
    }
    public String getBreed () {
        return breed;
    }
}
