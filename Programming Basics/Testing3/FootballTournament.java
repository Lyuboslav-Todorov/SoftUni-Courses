package Testing3;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String footballTeam = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        int winsCounter = 0;
        int drawsCounter = 0;
        int losesCounter = 0;
        int totalPoints = 0;

        for (int i = 1; i <= n ; i++) {
            String result = scanner.nextLine();
            switch (result){
                case "W" : winsCounter++; totalPoints+=3; break;
                case "D" : drawsCounter++; totalPoints++; break;
                case "L" : losesCounter++; break;
            }
        }
        if (n > 0){
            System.out.printf("%s has won %d points during this season.%n", footballTeam, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", winsCounter);
            System.out.printf("## D: %d%n", drawsCounter);
            System.out.printf("## L: %d%n", losesCounter);
            System.out.printf("Win rate: %.2f%%", (1.0 * winsCounter / n) * 100);
        }else{
            System.out.printf("%s hasn't played any games during this season.", footballTeam);
        }

    }
}
