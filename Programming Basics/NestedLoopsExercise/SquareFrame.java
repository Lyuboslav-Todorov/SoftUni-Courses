package NestedLoopsExercise;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char plus = '+';
        char minus = '-';
        char verticalLine = '|';

        System.out.printf("%c ", plus );
        for (int i = 2; i < n; i++) {
            System.out.printf("%c ", minus);
        }
        System.out.println(plus);
        for (int i = 2; i < n; i++) {
            System.out.printf("%c ", verticalLine);
            for (int j = 2; j < n; j++) {
                System.out.printf("%c ", minus);
            }
            System.out.println(verticalLine);
        }
        System.out.printf("%c ", plus );
        for (int i = 2; i < n; i++) {
            System.out.printf("%c ", minus);
        }
        System.out.printf("%c ", plus);

    }
}
