package Practice;

public class Main {
    public static void main(String[] args) {
    Rectangle rec = new Rectangle();
    rec.setTuurasy(6);
    rec.setUzun(5);
        System.out.println("Tuurasy: " + rec.getTuurasy() + " metr");
        System.out.println("Uzunu: " + rec.getUzun() + " metr");
        System.out.println("Rectangle ayanty: " + rec.recArea() + " m.kv");

    }
}
