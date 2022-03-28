package OOP.lesson18Abstract;

public class Horse extends AbstractDomesticAnimals{
    public Horse(double weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\n Horse: age - " + getAge() + " weight - " + getWeight() +
                " gender - " + getGender() + " name - " + getNickName();
    }

    @Override
    public void voice() {
        System.out.println(getNickName() + " grunts");
    }



}
