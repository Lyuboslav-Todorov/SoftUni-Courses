package Testing3;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double loungePrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalTax = people * tax;
        double totalUmbrellaPrice = umbrellaPrice * (Math.ceil(1.0 * people / 2));
        double totalLoungePrice = loungePrice * Math.ceil(people * 0.75);


        double totalSum = totalLoungePrice + totalUmbrellaPrice + totalTax;
        System.out.printf("%.2f lv.", totalSum);

    }
}
