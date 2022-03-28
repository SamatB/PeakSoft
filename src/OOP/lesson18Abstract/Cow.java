package OOP.lesson18Abstract;

public class Cow extends AbstractDomesticAnimals{
    public Cow(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    @Override
    public String toString() {
        return "\n Cow: age - " + getAge() + " weight - " + getWeight() +
                " gender - " + getGender() + " name - " + getNickName();
    }

    @Override
    public void voice() {
        System.out.println(getNickName() + " does a sound lika \"Muuu-uu\"");
    }
}
