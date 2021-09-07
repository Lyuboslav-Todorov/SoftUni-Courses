package NestedLoopsLab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        String text = scanner.nextLine();

        while (!text.equals("Finish")){
            String movie = text;
            int freeSpace = Integer.parseInt(scanner.nextLine());
            String ticketKind = scanner.nextLine();
            int counter = 0;
            while (!ticketKind.equals("End") ){
                totalTickets++;

                switch (ticketKind) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                counter++;
                if (freeSpace == counter){
                    break;
                }
                ticketKind = scanner.nextLine();
            }
            double percentSeatsTaken = (double) 100 * counter / freeSpace ;
            System.out.printf("%s - %.2f%% full.%n", movie, percentSeatsTaken );

            text = scanner.nextLine();
        }

        double percentStudentTickers = (double) studentTickets / totalTickets * 100 ;
        double percentStandardTickets = (double) standardTickets / totalTickets * 100;
        double percentKidTickets = (double) kidTickets / totalTickets * 100;

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentStudentTickers);
        System.out.printf("%.2f%% standard tickets.%n", percentStandardTickets);
        System.out.printf("%.2f%% kids tickets.%n", percentKidTickets);

    }
}
