package Testing;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double taxPrice = Double.parseDouble(scanner.nextLine());

        double netKidTicketPrice = adultTicketPrice * 0.3 + taxPrice;
        double netAdultTicketPrice = adultTicketPrice + taxPrice;



        double profit = ((adultTickets * netAdultTicketPrice) + (kidTickets * netKidTicketPrice)) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);
    }
}
