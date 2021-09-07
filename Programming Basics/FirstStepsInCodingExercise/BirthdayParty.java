package FirstStepsInCodingExercise;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rent = Integer.parseInt(scan.nextLine());
        double cakePrice = rent * 0.20;
        double drinksPrice = cakePrice - (cakePrice * 0.45);
        double animator = rent / 3.0;
        double budget = rent + cakePrice + drinksPrice + animator;
        System.out.println(budget);
    }
}
