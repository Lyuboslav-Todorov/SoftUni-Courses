package Testing1;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkMin = Integer.parseInt(scanner.nextLine());
        int walksCount = Integer.parseInt(scanner.nextLine());
        int caloriesTaken = Integer.parseInt(scanner.nextLine());

        boolean isEnough = false;

        int burnedCalories = (walkMin * 5) * walksCount;
        if (burnedCalories >= caloriesTaken / 2){
            isEnough = true;
        }

        if (isEnough){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        }else{
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories );
        }

    }
}
