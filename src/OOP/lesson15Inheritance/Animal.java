package OOP.lesson15Inheritance;

public class Animal {
    private int age;
    private String name;

    public Animal(int jah, String aty) {
        this.age = jah;
        this.name = aty;
    }

    public void setAge(){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName () {
        return name;
    }
}
