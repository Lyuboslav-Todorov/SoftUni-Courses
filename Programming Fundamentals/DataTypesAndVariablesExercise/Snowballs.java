package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double snowballValue = Double.MIN_VALUE;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballsQuality = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {
            int currentSnowballSnow = Integer.parseInt(scanner.nextLine());
            int currentSnowballTime = Integer.parseInt(scanner.nextLine());
            int currentSnowballsQuality = Integer.parseInt(scanner.nextLine());

            double currentSnowballValue = Math.pow(1.0 * currentSnowballSnow / currentSnowballTime, currentSnowballsQuality);
            if (currentSnowballValue > snowballValue){
                snowballValue = currentSnowballValue;
                snowballSnow = currentSnowballSnow;
                snowballTime = currentSnowballTime;
                snowballsQuality = currentSnowballsQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnow, snowballTime, snowballValue, snowballsQuality);
    }
}
