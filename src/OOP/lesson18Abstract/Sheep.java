package OOP.lesson18Abstract;

public class Sheep extends  AbstractDomesticAnimals{
    public Sheep(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }
    @Override
    public String toString() {
        return "\n Sheep: age - " + getAge() + " weight - " + getWeight() +
                " gender - " + getGender() + " name - " + getNickName();
    }

    @Override
    public void voice() {
        System.out.println(getNickName() + " sounds \"ba-aa-a\"");
    }
}
