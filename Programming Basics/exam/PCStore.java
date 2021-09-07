package exam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cpuPriceDollars = Double.parseDouble(scanner.nextLine());
        double videoPriceDollars = Double.parseDouble(scanner.nextLine());
        double ramPriceDollars = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double cpuPriceLv = cpuPriceDollars * 1.57;
        double videoPriceLv = videoPriceDollars * 1.57;
        double ramPriceLv = (ramPriceDollars * 1.57) * ramCount;

        cpuPriceLv -= cpuPriceLv * discount;
        videoPriceLv -= videoPriceLv * discount;

        double totalPrice = cpuPriceLv + videoPriceLv + ramPriceLv;

        System.out.printf("Money needed - %.2f leva.", totalPrice);

    }
}
