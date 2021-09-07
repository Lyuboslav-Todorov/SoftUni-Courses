package Testing1;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int winDays = 0;
        int lostDays = 0;
        double totalMoney = 0;

        for (int i = 1; i <= days; i++) {
            String command = scanner.nextLine();
            double moneyWonPerDay = 0;
            int gamesWon = 0;
            int gamesLost = 0;

            while (!command.equals("Finish")){
                String result = scanner.nextLine();
                if (result.equals("win")){
                    moneyWonPerDay += 20;
                    gamesWon++;
                }else if (result.equals("lose")){
                    gamesLost++;
                }

                command = scanner.nextLine();
            }
            if (gamesWon > gamesLost){
                moneyWonPerDay = moneyWonPerDay + moneyWonPerDay * 0.1;
                winDays++;
            }else{
                lostDays++;
            }
            totalMoney += moneyWonPerDay;
        }

        if (winDays > lostDays){
            totalMoney = totalMoney + totalMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }else{
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
