package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultiplyOfEvensAndOdds(Math.abs(number)));
    }

    private static int getMultiplyOfEvensAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumIfOddsDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number > 0) {
            if (number % 2 == 0) {
                evenSum += number % 10;
            }
            number = number / 10;
        }
        return evenSum;
    }

    private static int getSumIfOddsDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                oddSum += number % 10;
            }
            number = number / 10;
        }
        return oddSum;
    }

}
