package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double slowDown = Math.floor(distanceInMeter / 15) * 12.5;
        double totalTime = timePerMeter * distanceInMeter + slowDown;

        if (recordInSec > totalTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            double lackingSec = Math.abs(recordInSec - totalTime);
            System.out.printf("No, he failed! He was %.2f seconds slower.", lackingSec);
        }

    }
}
