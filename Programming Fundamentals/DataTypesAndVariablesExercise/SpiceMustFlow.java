package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int totalCollectedSpice = 0;
        int dayCounter = 0;

        while (yield >= 100){
            dayCounter++;
            totalCollectedSpice+=yield;
            totalCollectedSpice-=26;
            yield-=10;
        }
        if (totalCollectedSpice > 26) {
            totalCollectedSpice -= 26;
        }
        System.out.println(dayCounter);
        System.out.println(totalCollectedSpice);

    }
}
