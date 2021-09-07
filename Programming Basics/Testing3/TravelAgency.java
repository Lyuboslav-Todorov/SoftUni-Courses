package Testing3;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String packageKind = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double priceForOneDay = 0;


        if (days > 7){
            days -= 1;
        }
        if (days < 1){
            System.out.println("Days must be positive number!");
        } else {
            if (city.equals("Bansko") || city.equals("Borovets")){
                switch (packageKind){
                    case "noEquipment":
                        switch (vip){
                            case "yes": priceForOneDay = 80 - 80 * 0.05; break;
                            case "no": priceForOneDay = 80; break;
                        }
                        break;
                    case "withEquipment":
                        switch (vip){
                            case "yes": priceForOneDay = 100 - 100 * 0.1; break;
                            case "no": priceForOneDay = 100; break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                double price = priceForOneDay * days;
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }else if (city.equals("Varna") || city.equals("Burgas")){
                switch (packageKind) {
                    case "noBreakfast":
                        switch (vip) {
                            case "yes":
                                priceForOneDay = 100 - 100 * 0.07;
                                break;
                            case "no":
                                priceForOneDay = 100;
                                break;
                        }
                        break;
                    case "withBreakfast":
                        switch (vip) {
                            case "yes":
                                priceForOneDay = 130 - 130 * 0.12;
                                break;
                            case "no":
                                priceForOneDay = 130;
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input!");
                        break;
                }
                double price = priceForOneDay * days;
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }else{
                System.out.println("Invalid input!");
            }

        }


    }
}
