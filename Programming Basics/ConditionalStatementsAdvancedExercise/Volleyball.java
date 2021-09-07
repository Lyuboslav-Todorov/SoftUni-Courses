package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.next());

        double gamesInSofia = (48 - h) * 3.0 / 4;
        double pGameDays = p * 2.0 / 3;
        double totalGameDays = gamesInSofia + pGameDays + h;

        if (year.equals("leap")){
            totalGameDays = totalGameDays + totalGameDays * 0.15;
        }
        totalGameDays = Math.floor(totalGameDays);
        System.out.printf("%.0f", totalGameDays);
    }
}
