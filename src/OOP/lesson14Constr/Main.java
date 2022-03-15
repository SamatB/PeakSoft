package OOP.lesson14Constr;

public class Main {
    public static void main(String[] args) {
        It dog = new It("Rax", "RRR", 2);
        It dog2 = new It("Jack", "SSS", 3);
        System.out.println(dog.getAty());
        dog2.setAty("Oroz");

        Myshyk cat = new Myshyk("john", 3, "Black");
        Myshyk cat2 = new Myshyk("Mag", 4, "White");

        Balyk fish = new Balyk("Sam", 1);
        Balyk fish2 = new Balyk("J", 3);


    }
}
