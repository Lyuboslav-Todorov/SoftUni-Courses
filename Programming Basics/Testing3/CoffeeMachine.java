package Testing3;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int drinksCount = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (drink.equals("Espresso")){
            if (sugar.equals("Without")){
                totalPrice = (0.9 * drinksCount) * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = 1.0 * drinksCount;
            }else if (sugar.equals("Extra")){
                totalPrice = 1.2 * drinksCount;
            }
        }else if (drink.equals("Cappuccino")){
            if (sugar.equals("Without")){
                totalPrice = (1.0 * drinksCount) * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = 1.2 * drinksCount;
            }else if (sugar.equals("Extra")){
                totalPrice = 1.6 * drinksCount;
            }
        }else if (drink.equals("Tea")){
            if (sugar.equals("Without")){
                totalPrice = (0.5 * drinksCount) * 0.65;
            } else if (sugar.equals("Normal")) {
                totalPrice = 0.6 * drinksCount;
            }else if (sugar.equals("Extra")){
                totalPrice = 0.7 * drinksCount;
            }
        }

        if (drink.equals("Espresso") && drinksCount >= 5){
            totalPrice *= 0.75;
        }

        if (totalPrice > 15){
            totalPrice *= 0.8;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", drinksCount, drink, totalPrice);

    }
}
