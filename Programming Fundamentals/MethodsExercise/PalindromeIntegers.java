package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(printPalindrome(input));
            input = scanner.nextLine();
        }

    }

    private static boolean printPalindrome(String input) {
        boolean isPalindrome = false;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - i - 1)) {
                isPalindrome = true;
            }
        }
        if (input.length() == 1) {
            isPalindrome = true;
        }
        return isPalindrome;
    }

}
