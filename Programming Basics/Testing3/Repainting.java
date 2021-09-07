package Testing3;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededThinner = Integer.parseInt(scanner.nextLine());
        int hourWork = Integer.parseInt(scanner.nextLine());


        double totalNylonPrice = (neededNylon + 2) * 1.5;
        double totalPaintPrice = (neededPaint * 1.10) * 14.50;
        double totalThinnerPRice = neededThinner * 5;
        double totalMaterialsPrice = totalNylonPrice + totalPaintPrice + totalThinnerPRice + 0.40;
        double priceForWork = (totalMaterialsPrice * 0.3) * hourWork;

        double totalPrice = priceForWork + totalMaterialsPrice;

        System.out.printf("Total expenses: %.2f lv.", totalPrice);
    }
}
