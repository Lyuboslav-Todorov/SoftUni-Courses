package Testing5;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalPrice = 0;
        int counter = 0;

        while (!command.equals("Stop")){
            double productPrice = Double.parseDouble(scanner.nextLine());
            counter++;
            totalPrice += productPrice;
            if (counter % 3 == 0) {
                totalPrice -= productPrice / 2;
            }
            if (budget < totalPrice) {
                break;
            }
            command = scanner.nextLine();
        }

        if (budget >= totalPrice) {
            System.out.printf("You bought %d products for %.2f leva.", counter, totalPrice);
        }else{
            System.out.printf("You don't have enough money!%nYou need %.2f leva!", totalPrice - budget);
        }
    }
}
