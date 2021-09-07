package Testing1;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecPerMeter = Double.parseDouble(scanner.nextLine());

        double climTime = distanceInMeters * timeInSecPerMeter + Math.floor(distanceInMeters / 50) * 30;

        double diff = Math.abs(climTime - recordInSeconds);


        if (recordInSeconds > climTime){
            System.out.printf("Yes! The new record is %.2f seconds.", climTime);
        }else{
            System.out.printf("No! He was %.2f seconds slower.", diff);
        }

    }
}
