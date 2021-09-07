package ConditionalStatementsExercise;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;

        if (statist > 150) {
            clothesPrice = clothesPrice - (clothesPrice * 0.1);
        }
        double totalMoneyNeed = statist * clothesPrice + decorPrice;
        double moneyNeed = totalMoneyNeed - budget;
        double moneyLeft = budget - totalMoneyNeed;

        if (totalMoneyNeed <= budget){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",moneyLeft);
        } else{
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeed);
        }

    }
}
