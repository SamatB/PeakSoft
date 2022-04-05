package OOP.Exam;

import java.util.Scanner;

public class Calculating extends Data{
    private int result;

    public Calculating() {

    }


    @Override
    public void calculate() {
        System.out.println("Введите числа и оператор из списка: \"+, -, *, /\".");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            setNum1(scanner.nextInt());
            setSymbol(scanner.next().charAt(0));
            setNum2(scanner.nextInt());
            boolean confition = (getNum1() >= 1 & getNum1() <= 10) && (getNum2() <= 10 & getNum2() >= 1);

            if (confition) {
                switch (getSymbol()) {
                    case '+':
                        result = getNum1() + getNum2();
                        break;
                    case '-':
                        result = getNum1() - getNum2();
                        break;
                    case '*':
                        result = getNum1() * getNum2();
                        break;
                    case '/':
                        result = getNum1() / getNum2();
                    default:
                        System.out.print("Введите правильный оператор!");
                        return;
                }
                System.out.print("Результат следующий:\n");
                System.out.println(getNum1() + " " + getSymbol() + " " + getNum2() + " = " + result);
            } else {
                System.out.println("Вы ввели неправильную информацию!");
            }
        }
        else {
            System.out.println("Вводите цифры!");
        }
    }
}
