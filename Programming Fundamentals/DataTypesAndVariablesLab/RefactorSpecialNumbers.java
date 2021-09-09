package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int currentNumber = i;
            while (i > 0) {
                sumOfDigits += i % 10;
                i = i / 10;
            }
            boolean isSpecialNumber = false;
            isSpecialNumber = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);
            String trueOrFalse = "";
            if (isSpecialNumber){
                trueOrFalse = "True";
            }else{
                trueOrFalse = "False";
            }
            System.out.printf("%d -> %s%n", currentNumber, trueOrFalse);
            i = currentNumber;
        }

    }
}
