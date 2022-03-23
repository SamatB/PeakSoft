package OOP.lesson16FinalProt.lesson16Task;

public class Circle {
    private static double PI;
    private static double radius;

    public Circle () {

    }

    public void setPI (double PI) {
        this.PI = PI;
    }

    public double getPI() {
        return PI;
    }

    public  double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area () {
        double areaS = PI * (radius * radius);
        System.out.printf("Area of circle is " + "%.3f \n", areaS);

    }

   public static void circumference () {
        double circum = PI * 2 * radius;
       System.out.printf("Circle circumference is " + "%.3f \n", circum);
    }
}
