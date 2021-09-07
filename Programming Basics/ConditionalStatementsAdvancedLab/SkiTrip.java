package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String evaluation = scanner.nextLine();

        double onePersonRoomPrice = 18.00 * (days - 1);
        double apartmentPrice = 25.00 * (days - 1);
        double presidentApartmentPrice = 35.00 * (days - 1);

        double price = 0;

        if (room.equals("room for one person")){
            if (evaluation.equals("positive")){
                price = onePersonRoomPrice + onePersonRoomPrice * 0.25;
            } else if (evaluation.equals("negative")){
                price = onePersonRoomPrice - onePersonRoomPrice * 0.1;
            }
        } else if (room.equals("apartment")) {
            if (days < 10) {
                price = apartmentPrice - apartmentPrice * 0.30;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            } else if (days <= 15) {
                price = apartmentPrice - apartmentPrice * 0.35;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            } else {
                price = apartmentPrice - apartmentPrice * 0.50;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            }
        } else if(room.equals("president apartment")){
            if (days < 10) {
                price = presidentApartmentPrice - presidentApartmentPrice * 0.10;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            } else if (days <= 15) {
                price = presidentApartmentPrice - presidentApartmentPrice * 0.15;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            } else {
                price = presidentApartmentPrice - presidentApartmentPrice * 0.20;
                if (evaluation.equals("positive")) {
                    price = price + price * 0.25;
                } else if (evaluation.equals("negative")) {
                    price = price - price * 0.1;
                }
            }
        }



        System.out.printf("%.2f", price);

    }
}
