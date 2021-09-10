package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopNumber(n);

    }

    private static void printTopNumber(int n){
        for (int i = 1; i <= n; i++) {
            sumDivisibleBy8(i);
            hasOddDigit(i);
            if (sumDivisibleBy8(i) && hasOddDigit(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean sumDivisibleBy8 (int i){
        int currentSum = 0;
        while (i > 0){
            currentSum += i % 10;
            i = i / 10;
        }
        if (currentSum % 8 == 0){
            return true;
        }
        return false;
    }

    private static boolean hasOddDigit(int i){
        while (i > 0){
            int currentDigit = i % 10;
            if (currentDigit % 2 == 1)
                return true;
            i = i / 10;
        }
        return false;
    }

}
