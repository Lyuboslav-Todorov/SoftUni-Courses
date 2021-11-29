package exerciseEncapsulation.pizzaCalories_04;

import exerciseEncapsulation.Dough;
import exerciseEncapsulation.Pizza;
import exerciseEncapsulation.Topping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaData = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaData[1];
        int numberOfTopics = Integer.parseInt(pizzaData[2]);

        Pizza pizza;

        try {
            pizza = new Pizza(pizzaName, numberOfTopics);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }


        String[] doughData = scanner.nextLine().split("\\s+");
        String flourType = doughData[1];
        String bakingTechnique = doughData[2];
        double doughWeightInGrams = Double.parseDouble(doughData[3]);

        try {
            Dough dough = new Dough(flourType, bakingTechnique, doughWeightInGrams);
            pizza.setDough(dough);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }


        String command = scanner.nextLine();

        while (!command.equals("END")) {
            String[] toppingData = command.split("\\s+");
            String toppingType = toppingData[1];
            double toppingWeightInGrams = Double.parseDouble(toppingData[2]);

            try {
                Topping topping = new Topping(toppingType, toppingWeightInGrams);
                pizza.addTopping(topping);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
            command = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

    }
}
