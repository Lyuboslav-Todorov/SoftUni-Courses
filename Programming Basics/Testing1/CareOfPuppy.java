package Testing1;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int purchasedFood = Integer.parseInt(scanner.nextLine()); // в кг
        String command = scanner.nextLine();
        int totalEatenFood = 0;

        while (!command.equals("Adopted")){
            int eatenFood = Integer.parseInt(command); // в гр
            totalEatenFood += eatenFood;
            command = scanner.nextLine();
        }

        if (purchasedFood * 1000 >= totalEatenFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", purchasedFood * 1000 - totalEatenFood);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.", totalEatenFood - purchasedFood * 1000);
        }
    }
}
