package Testing2;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String typeHall = scanner.nextLine();
        int ticketCount = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        switch (movieName){
            case "A Star Is Born" :
                switch(typeHall){
                    case "normal": ticketPrice = 7.50; break;
                    case "luxury": ticketPrice = 10.50; break;
                    case "ultra luxury": ticketPrice = 13.50; break;
                }
                break;
            case "Bohemian Rhapsody":
                switch(typeHall) {
                    case "normal": ticketPrice = 7.35; break;
                    case "luxury": ticketPrice = 9.45; break;
                    case "ultra luxury": ticketPrice = 12.75; break;
                }
                break;
            case "Green Book":
                switch(typeHall) {
                    case "normal": ticketPrice = 8.15; break;
                    case "luxury": ticketPrice = 10.25; break;
                    case "ultra luxury": ticketPrice = 13.25; break;
                }
                break;
            case "The Favourite" :
                switch(typeHall) {
                    case "normal": ticketPrice = 8.75; break;
                    case "luxury": ticketPrice = 11.55; break;
                    case "ultra luxury": ticketPrice = 13.95; break;
                }
                break;
        }

        double income = ticketCount * ticketPrice;
        System.out.printf("%s -> %.2f lv.", movieName, income);
    }
}
