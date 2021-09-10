package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (!checkPasswordLength(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!checkPasswordForForbiddenSymbols(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!checkPasswordDigitsCount(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if (checkPasswordDigitsCount(password) && checkPasswordLength(password) && checkPasswordForForbiddenSymbols(password)){
            System.out.println("Password is valid");
        }
    }


    private static boolean checkPasswordLength(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean checkPasswordForForbiddenSymbols(String password) {
        int forbiddenSymbolsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < 48 || password.charAt(i) > 122 ||
                    (password.charAt(i) >  57 && password.charAt(i) <  65) ||
                    (password.charAt(i) >  90 && password.charAt(i) <  97)) {
                forbiddenSymbolsCount++;
            }
            if (forbiddenSymbolsCount == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkPasswordDigitsCount(String password) {
        int digitsCount = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= (char) 48 && password.charAt(i) <= 57) {
                digitsCount++;
            }
            if (digitsCount >= 2) {
                return true;
            }
        }
        return false;
    }


}
