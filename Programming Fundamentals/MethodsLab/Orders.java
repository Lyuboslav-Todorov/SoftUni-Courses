package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double result = getPrice(product, count);
        System.out.printf("%.2f", result);
    }

    private static double getPrice(String product, int count) {
        double price = 0;
        if (product.equals("coffee")){
            price = 1.50;
        } else if (product.equals("water")) {
            price = 1.00;
        } else if (product.equals("coke")){
            price = 1.40;
        } else if (product.equals("snacks")){
            price = 2.00;
        }
        return count * price;
    }

}
