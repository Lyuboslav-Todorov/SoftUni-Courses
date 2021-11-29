package exerciseEncapsulation.AnimalFarm_02;

import exerciseEncapsulation.Chicken;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Chicken chicken = new Chicken(name, age);
            System.out.println(chicken.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
