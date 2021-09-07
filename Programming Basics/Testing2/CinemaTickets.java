package Testing2;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int totalTickets = 0;
        int totalStudentTickets = 0;
        int totalStandardTickets = 0;
        int totalKidTickets = 0;

        while (!command.equals("Finish")){
            String movie = command;
            int freeSeats = Integer.parseInt(scanner.nextLine());
            int seatsTaken = 0;
            String command2 = scanner.nextLine();
            while (!command2.equals("End")){
                String ticketKind = command2;
                totalTickets++;
                seatsTaken++;
                switch (ticketKind){
                    case "student":totalStudentTickets++;break;
                    case "standard":totalStandardTickets++;break;
                    case "kid": totalKidTickets++; break;
                }
                if (freeSeats == seatsTaken){
                    break;
                }
                command2 = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, (1.0 * seatsTaken / freeSeats) * 100);
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", (1.0 * totalStudentTickets / totalTickets) * 100);
        System.out.printf("%.2f%% standard tickets.%n", (1.0 * totalStandardTickets / totalTickets) * 100);
        System.out.printf("%.2f%% kids tickets.%n", (1.0 * totalKidTickets / totalTickets) * 100);
    }
}
