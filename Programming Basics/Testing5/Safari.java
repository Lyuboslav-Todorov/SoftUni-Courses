package Testing5;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();

        double totalPrice = fuelNeeded * 2.1 + 100;

        if (dayOfTheWeek.equals("Saturday")){
            totalPrice *= 0.9;
        }else if (dayOfTheWeek.equals("Sunday")){
            totalPrice *= 0.8;
        }

        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice) {
            System.out.printf("Safari time! Money left: %.2f lv. ", diff);
        }else{
            System.out.printf("Not enough money! Money needed: %.2f lv.", diff);
        }


    }
}
