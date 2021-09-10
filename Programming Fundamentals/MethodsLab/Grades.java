package MethodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printGradeInWords(Double.parseDouble(scanner.nextLine()));
    }

    private static void printGradeInWords(double grade) {
        if (grade >= 5.50) {
            System.out.println("Excellent");
        } else if (grade >= 4.50) {
            System.out.println("Very good");
        } else if (grade >= 3.50) {
            System.out.println("Good");
        } else if (grade >= 2.50) {
            System.out.println("Poor");
        } else {
            System.out.println("Fail");
        }
    }

}
