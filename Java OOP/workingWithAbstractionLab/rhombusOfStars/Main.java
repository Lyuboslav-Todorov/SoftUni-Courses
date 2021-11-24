package workingWithAbstractionLab.rhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        printTop(n);
        printLineOfStars(n);
        printBottom(n);
    }

    private static void printBottom(int n) {
        for (int row = n - 1; row > 0; row--) {
            printLineSpaces(n - row);
            printLineOfStars(row);
        }
    }

    private static void printTop(int n) {
        for (int row = 0; row < n ; row++) {

            printLineSpaces(n - row);
            printLineOfStars(row);
        }
    }

    public static void printLineOfStars(int count){
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void printLineSpaces(int count){
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }
}
