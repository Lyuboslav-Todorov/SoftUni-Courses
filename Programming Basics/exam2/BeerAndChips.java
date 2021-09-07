package exam2;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beersCount = Integer.parseInt(scanner.nextLine());
        int chipsCount = Integer.parseInt(scanner.nextLine());

        double totalBeerPrice = beersCount * 1.2;
        double totalChipsPrice = Math.ceil(chipsCount * (totalBeerPrice * 0.45));
        double totalPrice = totalBeerPrice + totalChipsPrice;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, diff);
        }else {
            System.out.printf("%s needs %.2f more leva!", name, diff);
        }

    }
}
