package Testing2;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double totalClothesPrice = 0;

        double decor = budget * 0.1;
        if (countOfPeople > 150){
            totalClothesPrice = (countOfPeople * clothesPrice) * 0.90;
        }else{
            totalClothesPrice = countOfPeople * clothesPrice;
        }

        double totalPrice = decor + totalClothesPrice;
        double diff = Math.abs(budget - totalPrice);
        if (budget >= totalPrice){
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", diff);
        }else{
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", diff);
        }
    }
}
