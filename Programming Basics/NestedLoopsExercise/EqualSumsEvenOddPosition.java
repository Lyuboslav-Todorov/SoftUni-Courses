package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        for (int i = number1; i <= number2 ; i++) {
            String currentNumber = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNumber.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNumber.charAt(j));
                if (j % 2 == 0){
                    evenSum += currentDigit;
                }else{
                    oddSum += currentDigit;
                }
            }
            if (evenSum == oddSum){
                System.out.printf("%s ",currentNumber);
            }
        }

    }
}
