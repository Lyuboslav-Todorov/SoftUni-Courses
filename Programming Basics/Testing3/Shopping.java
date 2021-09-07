package Testing3;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int cpuCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCardCount * 250;
        double cpuPrice = (videoCardPrice * 0.35) * cpuCount;
        double ramPrice = (videoCardPrice * 0.1) * ramCount;

        double totalPrice = videoCardPrice + cpuPrice + ramPrice;

        if (videoCardCount > cpuCount){
            totalPrice -= totalPrice * 0.15;
        }

        double diff = Math.abs(totalPrice - budget);

        if (budget >= totalPrice){
            System.out.printf("You have %.2f leva left!", diff);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
