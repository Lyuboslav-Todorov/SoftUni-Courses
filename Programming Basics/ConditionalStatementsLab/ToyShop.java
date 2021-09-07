package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        double sumPuzzle = puzzleCount * 2.60;
        double sumDolls = dollsCount * 3.00;
        double sumBears = bearsCount * 4.10;
        double sumMinions = minionsCount * 8.20;
        double sumTruck = trucksCount * 2.00;

        double allSum = sumPuzzle + sumDolls + sumBears + sumMinions + sumTruck;

        double totalToys = puzzleCount + dollsCount + bearsCount + minionsCount +trucksCount;

        if (totalToys >= 50) {
            allSum = allSum - (allSum * 0.25);
        }
        allSum = allSum - (allSum * 0.10);

        if (allSum >= price) {
            System.out.printf("Yes! %.2f lv left.", allSum - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - allSum);
        }

    }
}
