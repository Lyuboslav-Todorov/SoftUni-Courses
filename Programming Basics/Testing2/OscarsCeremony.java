package Testing2;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

       // • Статуетки – цената им е 30% по-малка от наема на залата

        double figurinesPrice = rent - rent * 0.30;
       //• Кетъринг – цената му е 15% по-малка от тази на статуетките
        double cateringPrice = figurinesPrice - figurinesPrice * 0.15;
        // • Озвучаване – цената му е 1 / 2 от цената за кетъринг
        double soundSystemPrice = cateringPrice / 2;

        double totalPrice = rent + figurinesPrice + cateringPrice + soundSystemPrice;
        System.out.printf("%.2f", totalPrice);

    }
}
