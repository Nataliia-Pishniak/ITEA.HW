package hw2;

import java.util.Scanner;

public class task3 {
    static Scanner scanner = new Scanner(System.in);

//“Майже калькулятор.”
//Напишіть код програми, яка вводить 2 цілих числа та знак (символ) і віконує певну дію.

    public static void main(String[] args) {

        int number1 = getNumber();
        int number2 = getNumber();
        char operator = getOperator();
        int result = calculator(number1, number2, operator);
        System.out.println("Result: " + result);
    }

    public static int getNumber() {
        System.out.println("Input integer");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Mistake!!! Input integer");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getOperator() {
        System.out.println("Choose the operation  " +
                "\n1.Addition" +
                "\n2.Subtraction" +
                "\n3.Multiplication" +
                "\n4.Division");
        int operationNumber = 0;
        if (scanner.hasNextInt()) {
            operationNumber = scanner.nextInt();
        } else {
            System.out.printf("Incorrect operation");
            return getOperator();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Incorrect operation!");
                return getOperator();
        }
    }

    public static int add (int number1, int number2) {
        return number1+number2;
    }

    public static int sub (int number1, int number2) {
        return number1-number2;
    }
    public static int mul (int number1, int number2) {
        return number1*number2;
    }
    public static int div (int number1, int number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Forbidden operation with 0!!!");
            return 0;
        }
    }

    public static int calculator (int number1, int number2, char operator){
        switch (operator){
            case '+':
                return add(number1, number2);
            case '-':
                return sub(number1, number2);
            case '*':
                return mul(number1, number2);
            case '/':
                return div(number1, number2);
            default:
                return 0;
        }

        }

    }





