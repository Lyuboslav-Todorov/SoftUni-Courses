package FirstStepsInCodingExercise;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioners = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());

        double cakesPrice = 45;
        double wafflesPrice = 5.80;
        double pancakesPrice = 3.20;

        double moneyForCakes = numberOfCakes * cakesPrice;
        double moneyForWaffles = numberOfWaffles * wafflesPrice;
        double moneyForPancakes = numberOfPancakes * pancakesPrice;

        double totalMoneyPerDay = (moneyForCakes + moneyForWaffles + moneyForPancakes) * confectioners;

        double totalMoney = days * totalMoneyPerDay;

        double moneyForBills = totalMoney / 8;
        double sumForCharity = totalMoney - moneyForBills;

        System.out.printf("%.2f", sumForCharity);
    }
}
