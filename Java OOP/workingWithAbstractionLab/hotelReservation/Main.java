package workingWithAbstractionLab.hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double pricePerDay = Double.parseDouble(input.split("\\s+")[0]);
        int days = Integer.parseInt(input.split("\\s+")[1]);
        String season = input.split("\\s+")[2];
        String discountType = input.split("\\s+")[3];


        PriceCalculator calculator = new PriceCalculator(pricePerDay, days, season.toUpperCase(), discountType.toUpperCase());


        System.out.println(String.format("%.2f", calculator.calculate()));
    }
}
