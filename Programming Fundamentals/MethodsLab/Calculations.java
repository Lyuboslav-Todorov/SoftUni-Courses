package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }

    }

    private static void add(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    private static void multiply(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    private static void subtract(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    private static void divide(int number1, int number2) {
        System.out.println(number1 / number2);
    }


}
