package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());
        double epsilon = 0.000001;
        if (numberA < numberB) {
            double numberC = numberA;
            numberA = numberB;
            numberB = numberC;
        }
        if (numberA - numberB < epsilon) {
            System.out.println("True");
        } else  {
            System.out.println("False");
        }
    }
}
