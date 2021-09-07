package Testing3;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String winner = "";
        int winnerPoints = 0;

        while (!command.equals("Stop")){
            String name = command;
            int currentPoints = 0;
            for (int i = 0; i < name.length(); i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (number == name.charAt(i)){
                    currentPoints += 10;
                }else{
                    currentPoints += 2;
                }
            }
            if (currentPoints >= winnerPoints){
                winnerPoints = currentPoints;
                winner = name;
            }

            command = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!", winner, winnerPoints);
    }
}
