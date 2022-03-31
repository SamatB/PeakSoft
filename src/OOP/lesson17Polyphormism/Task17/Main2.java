//package OOP.lesson17Polyphormism.Task17;
//
//import java.util.Arrays;
//import java.util.Locale;
//
//public class Main2 {
//    public static void main(String[] args) {
//        Animal [] animals = {new Shark("Shark"), new Turtle("Turtle"), new Eagle("Eagle")};
//
//        for (Animal allAnimal: animals) {
//            if (allAnimal.getClass().getName().equals("OOP.lesson17Polyphormism.Task17.Shark")) {
//                ((Shark)allAnimal).attack();
//            } else if
//            (allAnimal.getClass().getName().equals("OOP.lesson17Polyphormism.Task17.Turtle")) {
//                ((Turtle)allAnimal).swim();
//            }else {
//                allAnimal.getClass().getName().equals("OOP.lesson17Polyphormism.Task17.Eagle");
//                ((Eagle)allAnimal).fly();
//            }
//        }
//
//        System.out.println("\n");
//
//        for (Animal allAnimal2: animals) {
//            if (allAnimal2 instanceof Shark) {
//                ((Shark)allAnimal2).attack();
//            } else if
//            (allAnimal2 instanceof Turtle) {
//                ((Turtle)allAnimal2).swim();
//            } else if
//            (allAnimal2 instanceof Eagle) {
//                ((Eagle)allAnimal2).fly();
//            } else {
//                System.exit(0);
//            }
//
//        }
//        System.out.println("\n");
//
//        Shark [] sharks;
//        for(int i = 0; i < animals.length; i++) {
//            animals[i] = new Shark();
//        }
//
//        Turtle [] turtles;
//        for(int i = 0; i < animals.length; i++) {
//            animals[i] = new Turtle();
//        }
//
//        Eagle [] eagles = new Eagle[5];
//        for(int i = 0; i < animals.length; i++) {
//            animals[i] = new Eagle();
//        }
//    }
//}
//
//
