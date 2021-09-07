package ConditionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int points = Integer.parseInt(scanner.nextLine());
        double bonus = 0;


        if (points <= 100) {
            bonus = 5;
        } else if (points <= 1000) {
            bonus = points * 0.20;
        } else {
            bonus = points * 0.10;
        }
        if (points % 2 == 0){
            bonus = bonus +1;
        } else if (points % 10 == 5){
            bonus = bonus + 2;
        }

        double totalPoints = points + bonus;
        System.out.println(bonus);
        System.out.println(totalPoints);
    }
}
