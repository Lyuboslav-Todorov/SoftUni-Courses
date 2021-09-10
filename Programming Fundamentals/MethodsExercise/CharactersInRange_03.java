package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printCharactersInRange(firstSymbol, secondSymbol);
    }

    private static void printCharactersInRange(char firstSymbol, char secondSymbol) {
        if (secondSymbol < firstSymbol) {
            for (int i = secondSymbol + 1; i < firstSymbol; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = firstSymbol + 1; i < secondSymbol; i++) {
                System.out.print((char) i + " ");
            }
        }


    }

}
