package exerciseEncapsulation.ShoppingSpree_03;

import exerciseEncapsulation.Person;
import exerciseEncapsulation.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> peopleInfo = new LinkedHashMap<>();

        Map<String, Product> productInfo = new HashMap<>();

        String[] people = scanner.nextLine().split(";");

        for (String element : people) {
            String name = element.split("=")[0];
            double money = Double.parseDouble(element.split("=")[1]);
            try {
                Person person = new Person(name, money);
                peopleInfo.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] products = scanner.nextLine().split(";");

        for (String element : products) {
            String productName = element.split("=")[0];
            double cost = Double.parseDouble(element.split("=")[1]);
            try {
                Product product = new Product(productName, cost);
                productInfo.put(productName, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] commandParts = command.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];

            try {
                Person person = peopleInfo.get(personName);
                Product product = productInfo.get(productName);
                person.buyProduct(product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Person person : peopleInfo.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }
    }
}
