package OOP.lesson15Inheritance.PracticTask;

import java.util.Scanner;

public class Calculator {

    public Calculator (){

    }
    private int number;
    private int number2;


    public int add (int number, int number2) {
        return number + number2;
    }

    public int subtract (int number, int number2) {
        return number - number2;
    }

    public int multiply (int number, int number2) {
        return number * number2;
    }

    public int divide (int number, int number2) {
        int res = number / number2;
        if (number2 == 0) {
            return res;
        } else {
            return Math.round(res);
        }
    }
    public void calculate () {
        System.out.println("Enter the numbers: ");
        Scanner console = new Scanner(System.in);
        number = console.nextInt();
        number2 = console.nextInt();


        System.out.println("Enter the one operator from: +, -, *, / ");
        Scanner op = new Scanner(System.in);

        String operators = op.next();

        if (operators == "+") {
            System.out.println(add(number, number2));
        } else if (operators == "-") {
            System.out.println(subtract(number,number2));
        } else if (operators == "*") {
            System.out.println(multiply(number, number2));
        } else if (operators == "/") {
            System.out.println(divide(number, number2));
        } else {
            //System.out.println("You entered not true value!");
            }
        }
}

