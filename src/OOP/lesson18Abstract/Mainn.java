package OOP.lesson18Abstract;

public class Mainn {
    public static void main(String[] args) {

        Cow[] cows = {new Cow(80, 2, "Female", "Blacky"),
                new Cow(84, 3, "Female", "Whity"),
                new Cow(86, 1, "Female", "White"),
                        new Cow(80, 3, "Female", "Beauty"),
                        new Cow(75, 1, "Female", "Browny")};


        Cow [] cows2 = {new Cow(70, 2, "Female", "Yelly")};


        Horse [] horses = {new Horse(100, 2, "Female", "Fast"),
                new Horse(110, 3, "Male", "Faster")};

        Horse [] horses2 = {new Horse(100, 2, "Male", "Slow")};

        Sheep [] sheep = {new Sheep(30, 2, "Female", "Big girl"),
                new Sheep(28, 1, "Female", "Nice girl"),
                new Sheep(34, 2, "Female", "Mommy sheep")};

        Sheep [] sheep2 = {new Sheep(40, 3, "Male", "Puppy")};

        Farm farm1 = new Farm("Kyrgyzstan, Osh dist., Alay reg., Jayloo-1 vill.",
                cows, horses, sheep, "Sultan koychu");
        Farm farm2 = new Farm("Kyrgyzstan, Talas dist., Ak-Too reg., Jayloo-2 vill.",
                cows2, horses2, sheep2, "Ahmad koychu");

        System.out.println(farm1);
        System.out.println("\n" + farm2);

    }
}
