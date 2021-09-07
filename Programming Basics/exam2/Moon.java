package exam2;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageSpeed = Double.parseDouble(scanner.nextLine());
        double fuelPer100Km = Double.parseDouble(scanner.nextLine());

        double totalDistance = 384400 * 2;
        double hours = Math.ceil(totalDistance / averageSpeed) + 3;
        double fuel = (fuelPer100Km /100) * totalDistance ;

        System.out.printf("%.0f%n", hours);
        System.out.printf("%.0f", fuel);
    }
}
