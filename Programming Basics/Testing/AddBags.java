package Testing;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bagsPriceOver20 = Double.parseDouble(scanner.nextLine());
        double bagsKilos = Double.parseDouble(scanner.nextLine());
        int dayTillTheTrip = Integer.parseInt(scanner.nextLine());
        int bagsCount = Integer.parseInt(scanner.nextLine());

        double bagPrice = 0;

        if (bagsKilos < 10) {
            bagPrice += bagsPriceOver20 * 0.2;
        } else if (bagsKilos <= 20) {
            bagPrice += bagsPriceOver20 * 0.5;
        } else {
            bagPrice = bagsPriceOver20;
        }

        if (dayTillTheTrip > 30) {
            bagPrice += bagPrice * 0.1;
        } else if (dayTillTheTrip < 7) {
            bagPrice += bagPrice * 0.4;
        } else {
            bagPrice += bagPrice * 0.15;
        }
        double totalPrice = bagPrice * bagsCount;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice);
    }
}