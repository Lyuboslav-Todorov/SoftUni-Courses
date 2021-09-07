package exam2;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationCount; i++) {
            double expectedAverageYield = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            double totalGoldPerLoc = 0;
            for (int j = 1; j <= days; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                totalGoldPerLoc += goldPerDay;
            }
            double averageGoldPerLoc = totalGoldPerLoc / days;
            if (averageGoldPerLoc >= expectedAverageYield){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGoldPerLoc);
            }else{
                System.out.printf("You need %.2f gold.%n", expectedAverageYield - averageGoldPerLoc);
            }
        }
    }
}
