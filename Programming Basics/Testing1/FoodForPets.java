package Testing1;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        int totalEatenFood = 0;
        int totalEatenDogFood = 0;
        int totalEatenCatFood = 0;
        double totalBiscuits = 0;

        for (int i = 1; i <= days ; i++) {
            int eatenDogFood = Integer.parseInt(scanner.nextLine());
            int eatenCatFood = Integer.parseInt(scanner.nextLine());

            totalEatenFood += eatenDogFood + eatenCatFood;
            totalEatenDogFood += eatenDogFood;
            totalEatenCatFood += eatenCatFood;
            if (i % 3 == 0){
                totalBiscuits += (eatenCatFood + eatenDogFood) * 0.1;
            }
        }
        double percentEatenFood = (totalEatenFood / totalFood) * 100;
        double percentEatenDogFood = ( 1.0 * totalEatenDogFood/ totalEatenFood) * 100;


        System.out.printf("Total eaten biscuits: %.0fgr.%n", totalBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenDogFood );
        System.out.printf("%.2f%% eaten from the cat.", (1.0 * totalEatenCatFood / totalEatenFood) * 100);

    }
}
