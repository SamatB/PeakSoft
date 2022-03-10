package PraktikaSabak;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Scanner console = new Scanner(System.in);
        System.out.println("Регистрация учун томондогулорду толтурунуз:");
        System.out.print("Атыныз:");
        user.setName(console.nextLine());
        System.out.print("Туулган жылыныз : ");
        user.setBirthYear(console.nextInt());
        System.out.print("Телефон номеринизди жазыныз:");
        user.setPhonenum(console.nextLong());

        System.out.println("Сиз ийгиликтуу регистрациядан оттунуз!");
        System.out.println("Аты: " + user.getName());
        System.out.println("Жашы: " + (user.getBirthYear()));
        System.out.println("Телефону: " + user.getPhonenum());
    }
}
