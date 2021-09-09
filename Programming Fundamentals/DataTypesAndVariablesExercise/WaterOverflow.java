package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());
        short waterTankCapacity = 255;
        short filledLiters = 0;

        for (int i = 1; i <= numberOfLines; i++) {
            int pourLiters = Integer.parseInt(scanner.nextLine());
            if (pourLiters > waterTankCapacity){
                System.out.println("Insufficient capacity!");
            }else{
                waterTankCapacity-=pourLiters;
                filledLiters+=pourLiters;
            }
        }
        System.out.println(filledLiters);
    }
}
