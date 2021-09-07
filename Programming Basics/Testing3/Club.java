package Testing3;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double income = 0;
        boolean isReached = false;

        while (!command.equals("Party!")){
            String cocktail = command;
            int count = Integer.parseInt(scanner.nextLine());
            double orderPrice = count * cocktail.length();
            if (orderPrice % 2 != 0) {
                income += orderPrice - orderPrice * 0.25;
            }else{
                income += orderPrice;
            }
            if (wantedProfit <= income){
                isReached = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isReached) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", income);
        }else{
            System.out.printf("We need %.2f leva more.%n", wantedProfit - income );
            System.out.printf("Club income - %.2f leva.", income);
        }

    }
}
