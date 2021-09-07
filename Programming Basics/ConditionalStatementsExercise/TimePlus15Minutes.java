package ConditionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputHour = Integer.parseInt(scanner.nextLine());
        int inputMin = Integer.parseInt(scanner.nextLine());

        int totalMinutes = inputHour * 60 + inputMin;
        int timePlus15 = totalMinutes + 15;

        int outputHour = timePlus15 / 60;
        int outputMin = timePlus15 % 60;

        if (outputHour > 23) {
            outputHour = 0;
        }


        System.out.printf("%d:%02d", outputHour, outputMin);
    }
}
