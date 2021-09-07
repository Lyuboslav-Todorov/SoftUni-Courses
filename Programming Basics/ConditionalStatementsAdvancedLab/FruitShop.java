package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {

                if (fruit.equals("banana")) {
                    price = 2.50;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("apple")) {
                    price = 1.20;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("orange")) {
                    price = 0.85;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("grapefruit")) {
                    price = 1.45;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("kiwi")) {
                    price = 2.70;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("pineapple")) {
                    price = 5.50;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                } else if (fruit.equals("grapes")) {
                    price = 3.85;
                    double totalPrice = price * quantity;
                    System.out.printf("%.2f", totalPrice);
                }else{
                    System.out.println("error");
                }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("apple")) {
                price = 1.25;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("orange")) {
                price = 0.90;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                double totalPrice = price * quantity;
                System.out.printf("%.2f", totalPrice);
            }else{
                System.out.println("error");
            }
        }else{
            System.out.println("error");
        }
    }

}
