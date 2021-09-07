package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int sumPrimeNumbers = 0;
        int sumNonPrimeNumbers = 0;

        while (!command.equals("stop")) {
            int number = Integer.parseInt(command);
            if (number < 0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    sumNonPrimeNumbers += number;
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sumPrimeNumbers += number;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);
    }
}
