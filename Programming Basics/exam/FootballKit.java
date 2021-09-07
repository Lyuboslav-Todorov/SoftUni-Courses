package exam;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tShirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForGift = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tShirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double footballShoesPrice = (tShirtPrice + shortsPrice) * 2;

        double totalPrice = tShirtPrice + shortsPrice + socksPrice + footballShoesPrice;
        totalPrice -= totalPrice * 0.15;

        if (totalPrice >= sumForGift){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalPrice);
        }else{
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", sumForGift - totalPrice);
        }

    }
}
