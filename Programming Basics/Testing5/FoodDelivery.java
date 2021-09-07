package Testing5;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu =  Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double sumAllMenus = chickenMenu * 10.35 + fishMenu * 12.4 + vegetarianMenu * 8.15;
        double totalSUm = sumAllMenus + sumAllMenus * 0.2 + 2.5;

        System.out.printf("Total: %.2f", totalSUm);
    }
}
