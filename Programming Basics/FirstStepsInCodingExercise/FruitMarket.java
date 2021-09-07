package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double berryPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangesKg = Double.parseDouble(scanner.nextLine());
        double raspberriesKg = Double.parseDouble(scanner.nextLine());
        double berriesKg = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = berryPrice - (0.50 * berryPrice);
        double orangesPrice = raspberriesPrice - (0.40 * raspberriesPrice);
        double bananasPrice = raspberriesPrice - (0.80 * raspberriesPrice);

        double berriesTotalPrice = berryPrice * berriesKg;
        double bananasTotalPrice = bananasPrice * bananasKg;
        double orangesTotalPrice = orangesPrice * orangesKg;
        double raspberriesTotalPrice = raspberriesPrice * raspberriesKg;

        double totalPrice = berriesTotalPrice + bananasTotalPrice + orangesTotalPrice + raspberriesTotalPrice;
        System.out.printf("%.2f", totalPrice);

    }
}
