package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", divideFactorials(firstNumber, secondNumber));

    }

    private static double divideFactorials (int firstNumber, int secondNumber){
        return getFirstNumberFac(firstNumber) / getSecondNumberFac(secondNumber);
    }

    private static double getFirstNumberFac(double firstNumber){
        double result = 1.0;
        for (int i = 1; i <= firstNumber; i++) {
            result = result * i;
        }
        return result;
    }

    private static double getSecondNumberFac(double secondNumber){
        double result = 1.0;
        for (int i = 1; i <= secondNumber; i++) {
            result = result * i;
        }
        return result;
    }
}
