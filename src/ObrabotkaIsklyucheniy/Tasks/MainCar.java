package ObrabotkaIsklyucheniy.Tasks;

import java.io.IOException;

public class MainCar {
    public static void main(String[] args) throws IOException {
       method();
    }

    public static void method () throws RuntimeException {
        try (Car car = new Car("Black", (short) 2015, "15000$")) {
            car.drive();
        }catch (RuntimeException e) {
           e.getMessage();
       }
    }
}
