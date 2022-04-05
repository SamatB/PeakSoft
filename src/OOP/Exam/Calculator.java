package OOP.Exam;


import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        int num1;
        int num2;
        char symbol;
        int result;
        System.out.println("Введите числа и оператор из списка: \"+, -, *, /\".");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            num1 = scanner.nextInt();
            symbol = scanner.next().charAt(0);
            num2 = scanner.nextInt();
            boolean confition = (num1 >= 1 & num1 <= 10) && (num2 <= 10 & num2 >= 1);

            if (confition) {
                switch (symbol) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                    default:
                        System.out.print("Введите правильный оператор!");
                        return;
                }
                System.out.print("Результат следующий:\n");
                System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
            } else {
                System.out.println("Вы ввели неправильную информацию!");
            }
        }
        else {
            System.out.println("Вводите цифры!");
        }
    }
}
