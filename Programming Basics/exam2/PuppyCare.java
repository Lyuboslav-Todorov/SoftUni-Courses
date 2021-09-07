package exam2;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purchasedFood = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int purchasedFoodGrams = purchasedFood * 1000;


        while (!command.equals("Adopted")){
            int eatenFood = Integer.parseInt(command);
            purchasedFoodGrams -= eatenFood;

            command = scanner.nextLine();
        }
        if (purchasedFoodGrams >= 0){
            System.out.printf("Food is enough! Leftovers: %d grams.", purchasedFoodGrams);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(purchasedFoodGrams));
        }
    }
}
