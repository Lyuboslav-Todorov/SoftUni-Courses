package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double result = getResultOfRaisedNumber(number, power);
        System.out.println(new DecimalFormat("0.####").format(result));

    }

    private static double getResultOfRaisedNumber(double number, int power) {
        double result = 1;
        return Math.pow(number, power) ;
    }

}
