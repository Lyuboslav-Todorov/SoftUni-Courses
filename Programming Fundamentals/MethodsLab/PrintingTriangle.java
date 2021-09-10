package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());

        printTriangle(height);
    }

    private static void printTriangle(int height) {
        printTop(height);
        printBottom(height);
    }

    private static void printTop(int height) {
        for (int i = 1; i <= height; i++) {
            printLineTop(i);
        }
    }

    private static void printBottom(int height) {
        for (int i = height; i > 0 ; i--) {
            printLineBot(i);
        }
    }

    private static void printLineTop(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printLineBot(int length) {
        for (int i = 1; i < length ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
