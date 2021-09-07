package exam2;

import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String stock = scanner.nextLine();
        int stockCount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (team){
            case "Argentina":
                switch (stock) {
                    case  "flags": price = 3.25; break;
                    case "caps": price = 7.20; break;
                    case "posters": price = 5.10; break;
                    case "stickers": price =  1.25; break;
                    default:
                        System.out.println("Invalid stock!"); break;
                }
                break;
            case "Brazil":
                switch (stock) {
                    case  "flags": price = 4.20; break;
                    case "caps": price = 8.50; break;
                    case "posters": price = 5.35; break;
                    case "stickers": price =  1.20; break;
                    default:
                        System.out.println("Invalid stock!"); break;
                }
                break;
            case "Croatia":
                switch (stock) {
                    case  "flags": price = 2.75; break;
                    case "caps": price = 6.90; break;
                    case "posters": price = 4.95; break;
                    case "stickers": price =  1.10; break;
                    default:
                        System.out.println("Invalid stock!"); break;
                }
                break;
            case "Denmark":
                switch (stock){
                    case  "flags": price = 3.10; break;
                    case "caps": price = 6.50; break;
                    case "posters": price = 4.80; break;
                    case "stickers": price =  0.90; break;
                    default:
                        System.out.println("Invalid stock!"); break;
                }
                break;
            default:
                System.out.println("Invalid country!");break;
        }
        if ((team.equals("Argentina") || team.equals("Brazil") || team.equals("Croatia") || team.equals("Denmark"))
                && (stock.equals("flags") || stock.equals("caps") || stock.equals("posters") || stock.equals("stickers"))){
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                    stockCount, stock, team, price * stockCount);
        }
    }
}
