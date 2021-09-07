package Testing3;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int hearthstoneCounter = 0;
        int forniteCounter = 0;
        int overwatchCounter = 0;
        int othersCounter = 0;

        for (int i = 1; i <= n ; i++) {
            String game = scanner.nextLine();
            switch (game) {
                case "Hearthstone": hearthstoneCounter++; break;
                case "Fornite" : forniteCounter++; break;
                case "Overwatch" : overwatchCounter++; break;
                default: othersCounter++; break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%%n", (1.0 * hearthstoneCounter / n) * 100);
        System.out.printf("Fornite - %.2f%%%n", (1.0 * forniteCounter / n) * 100);
        System.out.printf("Overwatch - %.2f%%%n", (1.0 * overwatchCounter / n) * 100);
        System.out.printf("Others - %.2f%%", (1.0 * othersCounter / n) * 100);

    }
}
