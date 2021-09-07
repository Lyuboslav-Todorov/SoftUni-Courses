package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double result = 0.0;

        if (season.equals("Spring")){
            price = 3000;
            if (num <= 6){
                price = price - price * 0.1;
            }else if (num <= 11){
                price = price - price * 0.15;
            }else{
                price = price - price * 0.25;
            }
        }else if (season.equals("Summer") || season.equals("Autumn")){
            price = 4200;
            if (num <= 6){
                price = price - price * 0.1;
            }else if (num <= 11){
                price = price - price * 0.15;
            }else{
                price = price - price * 0.25;
            }
        }else if (season.equals("Winter")){
            price = 2600;
            if (num <= 6){
                price = price - price * 0.1;
            }else if (num <= 11){
                price = price - price * 0.15;
            }else{
                price = price - price * 0.25;
            }
        }
        if (season.equals("Summer") || season.equals("Winter") || season.equals("Spring")){
            if (num % 2 == 0){
                price = price - price * 0.05;
            }
        }
        result = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", result);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", result);
        }
    }
}
