package MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        printVowelsCount(input);

    }

    private static void printVowelsCount(String input) {
        int vowelsCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            switch (currentLetter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelsCount++;
                    break;
            }
        }
        System.out.println(vowelsCount);
    }

}
