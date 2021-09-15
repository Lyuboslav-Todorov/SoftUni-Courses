package MapsLambdaAndStreamAPIExercises;

import java.util.*;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();


        while (!input.equals("buy")){
            String product = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            productsPrice.put(product, price);

            if (!productsQuantity.containsKey(product)){
                productsQuantity.put(product, quantity);
            } else {
                productsQuantity.put(product, productsQuantity.get(product) + quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry: productsPrice.entrySet()) {
            double totalPrice = entry.getValue() * productsQuantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), totalPrice);
        }
    }
}
