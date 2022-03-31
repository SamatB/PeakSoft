package OOP.lesson19Interface.HomeTask;

public class Person {
    private String name;
    private String statusInFamily;
    private int age;
    private String gender;

    public Person(String name, String statusInFamily, int age, String gender) {
        this.name = name;
        this.statusInFamily = statusInFamily;
        this.age = age;
        this.gender = gender;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatusInFamily() {
        return statusInFamily;
    }

    public void setStatusInFamily(String statusInFamily) {
        this.statusInFamily = statusInFamily;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return  "\n name - " + name +
                ", statusInFamily - " + statusInFamily +
                ", age - " + age +
                ", gender - " + gender;
    }
}
