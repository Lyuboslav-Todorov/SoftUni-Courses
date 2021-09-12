package ArraysMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedFibonacciNumber = Integer.parseInt(scanner.nextLine());

        int[] fibonacci = new int[wantedFibonacciNumber];
        fibonacci[0] = 1;
        if (fibonacci.length > 1) {
            fibonacci[1] = 1;
            for (int i = 2; i < fibonacci.length; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

            }
        }
        System.out.println(fibonacci[fibonacci.length - 1]);
    }
}
