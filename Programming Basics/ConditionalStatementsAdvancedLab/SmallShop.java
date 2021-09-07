package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (product.equals("coffee")){
            if (city.equals("Sofia")){
                price = 0.50;
            } else if (city.equals("Plovdiv")){
                price = 0.40;
            } else if (city.equals("Varna")){
                price = 0.45;
            }
        } else if (product.equals("water")){
            if (city.equals("Sofia")){
                price = 0.80;
            } else if (city.equals("Plovdiv")){
                price = 0.70;
            } else if (city.equals("Varna")){
                price = 0.70;
            }
        } else if (product.equals("beer")){
            if (city.equals("Sofia")){
                price = 1.20;
            } else if (city.equals("Plovdiv")){
                price = 1.15;
            } else if (city.equals("Varna")){
                price = 1.10;
            }
        } else if (product.equals("sweets")){
            if (city.equals("Sofia")){
                price = 1.45;
            } else if (city.equals("Plovdiv")){
                price = 1.30;
            } else if (city.equals("Varna")){
                price = 1.35;
            }
        } else if (product.equals("peanuts")){
            if (city.equals("Sofia")){
                price = 1.60;
            } else if (city.equals("Plovdiv")){
                price = 1.50;
            } else if (city.equals("Varna")){
                price = 1.55;
            }
        }
        System.out.println(price * quantity);
    }
}
