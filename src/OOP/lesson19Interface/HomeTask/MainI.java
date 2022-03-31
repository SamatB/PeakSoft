package OOP.lesson19Interface.HomeTask;

import OOP.lesson19Interface.HomeTask.Place.Apartment;
import OOP.lesson19Interface.HomeTask.Place.Dormitory;
import OOP.lesson19Interface.HomeTask.Place.Hotel;
import OOP.lesson19Interface.HomeTask.Place.LivingPlace;

public class MainI {
    public static void main(String[] args) {

        Person father1 = new Person("Max Will", "father", 49, "male");
        Person mother1 = new Person("Anna Will", "mother", 43, "female");
        Person son1 = new Person("Jack Will", "son", 18, "male");

        Family family1 = new Family("Will", 3, new Person[] {father1, mother1, son1});

        Person father2 = new Person("Sam Back", "father", 55, "male");
        Person mother2 = new Person("Jasica Back", "mother", 47, "female");
        Person daughter2 = new Person("Melisa Back", "daughter", 20, "female");

        Family family2 = new Family("Back", 3, new Person[] {father2, mother2, daughter2});

        Person father3 = new Person("John Price", "father", 65, "male");
        Person mother3 = new Person("Gloria Price", "mother", 60, "female");
        Person daughter3 = new Person("Janny Price", "daughter", 39, "female");
        Person son3 = new Person("Alex Price", "son", 25, "male");

        Family family3 = new Family("Price", 3, new Person[] {father3, mother3, daughter3, son3});

        Person father4 = new Person("Max Brown", "father", 69, "male");
        Person mother4 = new Person("Alina Brown", "mother", 62, "female");
        Person daughter4 = new Person("Mishel Brown", "daughter", 40, "female");
        Person son4 = new Person("Alex Brown", "son", 37, "male");
        Person son44 = new Person("Maga Brown", "son", 31, "male");

        Family family4 = new Family("Brown", 5, new Person[] {father4, mother4, daughter4, son4, son44});

        LivingPlace apartment = new Apartment("Apartment", " New-York city, st. Wall-Street, b. 2", new Family[] {family1});
        LivingPlace dormitory = new Dormitory("Dormitory", " Moscow city, st. Polyanka, b. 1", new Family[] {family3, family2});
        LivingPlace hotel = new Hotel("Hotel", " Bishkek city, st. Ala-Too, b. 5", new Family[] {family4});

        family1.live();
        System.out.println(apartment);
        family1.publicUtilities();


        System.out.println(dormitory);
        family2.live();
        family2.rentPay();
        family3.live();
        family3.rentPay();

        family4.live();
        System.out.println(hotel);
        family4.rentPay();

    }
}
