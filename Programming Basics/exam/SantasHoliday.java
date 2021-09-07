package exam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String evaluation = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        if (typeOfRoom.equals("room for one person")){
            price = 18 * nights;
        }else if (typeOfRoom.equals("apartment")){
            price = 25 * nights;
            if (days < 10) {
                price -= price * 0.3;
            }else if (days <= 15) {
                price -= price * 0.35;
            }else{
                price -= price * 0.5;
            }
        }else if (typeOfRoom.equals("president apartment")){
            price = 35 * nights;
            if (days < 10) {
                price -= price * 0.1;
            }else if (days <= 15) {
                price -= price * 0.15;
            }else{
                price -= price * 0.2;
            }
        }

        if (evaluation.equals("positive")){
            price += price * 0.25;
        }else if (evaluation.equals("negative")){
            price -= price * 0.1;
        }

        System.out.printf("%.2f", price);

    }
}
