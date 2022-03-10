package OOP.lesson13;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Balyk garbusha = new Balyk();
        garbusha.setAty("Гарбуша");
        System.out.println("Балыктын аты - " + garbusha.getAty());
        garbusha.setTuru("кичи лосось");
        garbusha.setJashy(1);
        System.out.println("Балыктын туру - " + garbusha.getTuru() + ", ал " + garbusha.getJashy() + " жашта.\n");
        garbusha.setSalmagy(3);

        Myshyk cat = new Myshyk();
        cat.setAty("Киса");
        cat.setSalmagy(4);
        cat.setTusu("Кара");
        System.out.println("Мышыктын аты: " + cat.getAty() + " жана ал " + cat.getTusu().toLowerCase(Locale.ROOT) + " тусто.\n");

        It dog = new It();
        dog.setAty("Джэк");
        dog.setJashy(4);
        System.out.println(dog.getAty() + " атту ит " + dog.getJashy() + " жашта.");
        dog.setSalmagy(37);
        System.out.println(dog.getAty() + "тин салмагы " + dog.getSalmagy() + " килограмм.\n");


        Popugay popugay = new Popugay();
        popugay.setAty("Воробей");
        popugay.setTusu("Ала - була");
        popugay.setYldamdygy(50);
        System.out.println(popugay.getAty() + " аттуу попугайдын ылдамдыгы саатына " + popugay.getYldamdygy() + " километр");
    }
}
