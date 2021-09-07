package Testing;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int thousandsFirstNumber = firstNumber / 1000;
        int thousandsSecondNumber = secondNumber / 1000;
        int hundredsFistNumber = (firstNumber / 100) % 10;
        int hundredsSecondNumber = (secondNumber / 100) % 10;
        int dozensFirstNumber = (firstNumber / 10) % 10;
        int dozensSecondNumber = (secondNumber / 10) % 10;
        int digitFirstNumber = firstNumber % 10;
        int digitSecondNumber = secondNumber % 10 ;

        for (int i = thousandsFirstNumber; i <= thousandsSecondNumber ; i++) {
            for (int j = hundredsFistNumber; j <= hundredsSecondNumber ; j++) {
                for (int k = dozensFirstNumber; k <= dozensSecondNumber ; k++) {
                    for (int l = digitFirstNumber; l <= digitSecondNumber ; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }


    }
}
