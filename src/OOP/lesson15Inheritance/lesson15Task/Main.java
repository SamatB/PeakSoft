package OOP.lesson15Inheritance.lesson15Task;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("John", "Java developer", "PeakSoft");

        Dancer dancer = new Dancer("Jackson", "Rock dancing", "Rock and Rock");

        Singer singer = new Singer("B. Mars", "Classic", "All stars");

        System.out.println(programmer);
        programmer.coding();
        programmer.eat();
        programmer.walk();
        programmer.learn();

        System.out.println("\n");

        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();

        System.out.println("\n");

        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.eat();
        singer.learn();
        singer.walk();
    }
}
