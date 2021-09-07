package Testing3;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nightCount = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int percentForMoreCosts = Integer.parseInt(scanner.nextLine());

        double totalNightsPrice = nightPrice * nightCount;

        if (nightCount > 7){
          totalNightsPrice = nightPrice * 0.95 * nightCount;
        }
        double neededMoney = (budget * percentForMoreCosts * 0.01) + totalNightsPrice;

        double diff = Math.abs(neededMoney - budget);

        if (budget >= neededMoney){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        }else{
            System.out.printf("%.2f leva needed.", diff);
        }

    }
}
